package com.sanbhu.api.clicktime.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.sanbhu.api.clicktime.bo.CompanyDetail;
import com.sanbhu.api.clicktime.bo.CustomFields;
import com.sanbhu.api.clicktime.bo.DateTimeEntriesList;
import com.sanbhu.api.clicktime.bo.DayTimeEntriesResponse;
import com.sanbhu.api.clicktime.bo.JobDetail;
import com.sanbhu.api.clicktime.bo.REGULARTIME;
import com.sanbhu.api.clicktime.bo.RequestParams;
import com.sanbhu.api.clicktime.bo.TaskDetail;
import com.sanbhu.api.clicktime.bo.TimeEntryRequest;
import com.sanbhu.api.clicktime.bo.TimeEntryResponse;
import com.sanbhu.api.clicktime.bo.Timedata;
import com.sanbhu.api.clicktime.service.ClicktimePortalService;

@Service("clicktimePortalService")
public class ClicktimePortalServiceImpl implements ClicktimePortalService {
	private HttpClient httpClient = HttpClientBuilder.create().build();
	
	@Autowired
	CompanyDetail companyDetail;
	
	@Autowired
	List<JobDetail> jobDetails;
	
	@Autowired
	List<TaskDetail> taskDetails;

	@Override
	public void performLogin(String username, String password) {
		try {
			HttpPost httpPostRequest = new HttpPost("https://app.clicktime.com/Login/");
			setLoginHeader(httpPostRequest);
			setLoginParameter(username, password, httpPostRequest);
			HttpResponse response = httpClient.execute(httpPostRequest);
			int responseCode = response.getStatusLine().getStatusCode();
			if (responseCode == 302 || responseCode == 200) {
				System.out.println("Login Response Code - " + responseCode);
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}	
	}	
	
	@Override
	public List<TimeEntryResponse> getTimeEntries(String userId, String date) {
		List<TimeEntryResponse> dayTimeEntries = new ArrayList<TimeEntryResponse>();
		try {
			String dayViewURL = "https://app.clicktime.com/App/DayView/DayViewService.ashx";
			HttpResponse response = getTimeEntriesForDay(dayViewURL, userId, date);
			if (response.getStatusLine().getStatusCode() == 200) {
				final String responseStatus = readResponse(response.getEntity().getContent());
				dayTimeEntries = processDayTimeEntries(responseStatus);
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return dayTimeEntries;
	}

	@Override
	public void performLogout() {
		httpClient = HttpClientBuilder.create().build();
	}
	
	private void setLoginHeader(HttpPost httpPostRequest) throws IOException {
		httpPostRequest.addHeader("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");
	}

	private void setLoginParameter(String username, String password, HttpPost httpPostRequest) throws IOException {
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("username", username));
		urlParameters.add(new BasicNameValuePair("password", password));
		urlParameters.add(new BasicNameValuePair("SSLstatus", "on"));
		urlParameters.add(new BasicNameValuePair("provider", "EmailPass"));
		urlParameters.add(new BasicNameValuePair("CDNBlocked", "false"));
		urlParameters.add(new BasicNameValuePair("TimeZoneDiff", "5.5"));
		urlParameters.add(new BasicNameValuePair("IsTablet", "false"));
		httpPostRequest.setEntity(new UrlEncodedFormEntity(urlParameters));
	}

	private List<TimeEntryResponse> processDayTimeEntries(String responseStatus) {
		List<TimeEntryResponse> dayTimeEntries = new ArrayList<TimeEntryResponse>();
		DayTimeEntriesResponse dayTimeEntriesResponse = new Gson().fromJson(responseStatus,
				DayTimeEntriesResponse.class);
		if (dayTimeEntriesResponse.getDayTimeEntries() != null) {
			Timedata timedata = dayTimeEntriesResponse.getDayTimeEntries().getTimedata();
			if (timedata != null) {
				REGULARTIME regulartime = timedata.getREGULARTIME();
				if (regulartime != null) {
					List<DateTimeEntriesList> dateTimeEntriesList = regulartime.getDateTimeEntriesList();
					dayTimeEntries = processDateTimeEntries(dateTimeEntriesList);
				}
			}
		}
		return dayTimeEntries;
	}

	private List<TimeEntryResponse> processDateTimeEntries(List<DateTimeEntriesList> dateTimeEntriesList) {
		List<TimeEntryResponse> dayTimeEntries = new ArrayList<TimeEntryResponse>();
		for (DateTimeEntriesList dateTimeEntries : dateTimeEntriesList) {
			if (dateTimeEntries != null) {
				final TimeEntryResponse timeEntryResponse = new TimeEntryResponse();
				timeEntryResponse.setComment(dateTimeEntries.getComment());
				timeEntryResponse.setHours(dateTimeEntries.getHours().toString());
				timeEntryResponse.setDate(dateTimeEntries.getEntryDate());
				timeEntryResponse.setJobID(dateTimeEntries.getJobID());
				for(JobDetail jobDetail : jobDetails) {
					if (jobDetail.getJobID().trim().equalsIgnoreCase(dateTimeEntries.getJobID().trim())) {
						timeEntryResponse.setJobName(jobDetail.getName());
						break;
					}
				}
				timeEntryResponse.setTaskID(dateTimeEntries.getTaskID());
				for(TaskDetail taskDetail : taskDetails) {
					if (taskDetail.getTaskID().trim().equalsIgnoreCase(dateTimeEntries.getTaskID().trim())) {
						timeEntryResponse.setTaskName(taskDetail.getName());
						break;
					}
				}
				
				CustomFields customFields = dateTimeEntries.getCustomFields();
				if (customFields != null) {
					timeEntryResponse.setRallyIteration(customFields.get22YG1anNd6X0());
					timeEntryResponse.setTrackTicketID(customFields.get23SIXHeVoNOM());
				}
				dayTimeEntries.add(timeEntryResponse);
			}
		}
		return dayTimeEntries;
	}

	private HttpResponse getTimeEntriesForDay(String timeEntriesURL, String userId, String date) {
		try {
			HttpPost httpPostRequest = new HttpPost(timeEntriesURL);
			httpPostRequest.setHeader("Accept", "*/*");
			httpPostRequest.setHeader("Accept-Encoding", "gzip, deflate, br");
			httpPostRequest.setHeader("Accept-Language", "en-US,en;q=0.9,mr;q=0.8");
			httpPostRequest.setHeader("Cache-Control", "no-cache");
			httpPostRequest.setHeader("Connection", "keep-alive");
			httpPostRequest.setHeader("Content-Type", "text/plain; charset=UTF-8");
			httpPostRequest.setHeader("Host", "app.clicktime.com");
			httpPostRequest.setHeader("Origin", "https://app.clicktime.com");
			httpPostRequest.setHeader("Pragma", "no-cache");
			httpPostRequest.setHeader("Referer", "https://app.clicktime.com/App/DayView/DayViewService.ashx?test");
			httpPostRequest.setHeader("X-JSON-RPC", "RetrieveAllDataForDate");

			TimeEntryRequest timeEntryRequest = new TimeEntryRequest();
			timeEntryRequest.setMethod("RetrieveAllDataForDate");
			timeEntryRequest.setId(4);
			RequestParams requestParams = new RequestParams();
			requestParams.setAutoFill(true);
			requestParams.setIsOverride(false);
			requestParams.setTeID(userId);
			requestParams.setTzDiff("12.5");
			requestParams.setSelectedDate(date);
			requestParams.setOverrideRestrictions(false);
			timeEntryRequest.setRequestParams(requestParams);

			StringEntity stringEntity = new StringEntity(new Gson().toJson(timeEntryRequest));
			httpPostRequest.setEntity(stringEntity);
			return httpClient.execute(httpPostRequest);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return null;
	}

	private String readResponse(InputStream inputStream) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		while (true) {
			String temp = bufferedReader.readLine();
			if (temp == null) {
				break;
			}
			stringBuilder.append(temp + "\n");
		}
		return stringBuilder.toString();
	}

}

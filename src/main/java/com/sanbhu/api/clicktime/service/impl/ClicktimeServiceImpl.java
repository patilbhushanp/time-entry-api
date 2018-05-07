package com.sanbhu.api.clicktime.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sanbhu.api.clicktime.bo.CompanyDetail;
import com.sanbhu.api.clicktime.bo.JobDetail;
import com.sanbhu.api.clicktime.bo.TaskDetail;
import com.sanbhu.api.clicktime.bo.UserSession;
import com.sanbhu.api.clicktime.service.ClicktimeService;
import com.sanbhu.api.constants.ApplicationConstants;

@Service("clicktimeService")
public class ClicktimeServiceImpl implements ClicktimeService {
	private final HttpClient httpClient = HttpClientBuilder.create().build();

	public UserSession createSession(String username, String password, Map<String, String> headerParametersMap) {
		UserSession userSession = new UserSession();
		try {
			HttpGet httpGet = new HttpGet(ApplicationConstants.CLICKTIME_URL + ApplicationConstants.SESSION_URI);
			Iterator<String> headerKeyIterator = headerParametersMap.keySet().iterator();
			while (headerKeyIterator.hasNext()) {
				String headerKey = headerKeyIterator.next();
				String headerValue = headerParametersMap.get(headerKey);
				httpGet.setHeader(headerKey, headerValue);
			}
			HttpResponse response = httpClient.execute(httpGet);
			int responseCode = response.getStatusLine().getStatusCode();
			System.out.println("Sending request to URL : " + ApplicationConstants.CLICKTIME_URL
					+ ApplicationConstants.SESSION_URI);
			System.out.println("Response Code : " + responseCode);

			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			StringBuffer jsonStringBuilder = new StringBuffer();
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				jsonStringBuilder.append(line);
			}
			userSession = new Gson().fromJson(jsonStringBuilder.toString(), UserSession.class);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return userSession;
	}

	public CompanyDetail getCompanyDetail(final String companyID, final Map<String, String> headerParametersMap) {
		CompanyDetail companyDetail = new CompanyDetail();
		try {
			HttpGet httpGet = new HttpGet(
					ApplicationConstants.CLICKTIME_URL + ApplicationConstants.COMPANY_URI + companyID);
			Iterator<String> headerKeyIterator = headerParametersMap.keySet().iterator();
			while (headerKeyIterator.hasNext()) {
				String headerKey = headerKeyIterator.next();
				String headerValue = headerParametersMap.get(headerKey);
				httpGet.setHeader(headerKey, headerValue);
			}
			HttpResponse response = httpClient.execute(httpGet);
			int responseCode = response.getStatusLine().getStatusCode();
			System.out.println("Sending request to URL : " + ApplicationConstants.CLICKTIME_URL
					+ ApplicationConstants.COMPANY_URI + companyID);
			System.out.println("Response Code : " + responseCode);

			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			StringBuffer jsonStringBuilder = new StringBuffer();
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				jsonStringBuilder.append(line);
			}
			companyDetail = new Gson().fromJson(jsonStringBuilder.toString(), CompanyDetail.class);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return companyDetail;
	}

	public List<JobDetail> getJobDetails(final String companyID, final String userID,
			final Map<String, String> headerParametersMap) {
		List<JobDetail> jobDetailList = new ArrayList<JobDetail>();
		try {
			HttpGet httpGet = new HttpGet(ApplicationConstants.CLICKTIME_URL + ApplicationConstants.COMPANY_URI
					+ companyID + ApplicationConstants.USER_URI + userID + ApplicationConstants.JOB_URI);
			Iterator<String> headerKeyIterator = headerParametersMap.keySet().iterator();
			while (headerKeyIterator.hasNext()) {
				String headerKey = headerKeyIterator.next();
				String headerValue = headerParametersMap.get(headerKey);
				httpGet.setHeader(headerKey, headerValue);
			}
			HttpResponse response = httpClient.execute(httpGet);
			int responseCode = response.getStatusLine().getStatusCode();
			System.out.println(
					"Sending request to URL : " + ApplicationConstants.CLICKTIME_URL + ApplicationConstants.COMPANY_URI
							+ companyID + ApplicationConstants.USER_URI + userID + ApplicationConstants.JOB_URI);
			System.out.println("Response Code : " + responseCode);

			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			StringBuffer jsonStringBuilder = new StringBuffer();
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				jsonStringBuilder.append(line);
			}
			Type listType = new TypeToken<ArrayList<JobDetail>>() {
			}.getType();
			jobDetailList = new Gson().fromJson(jsonStringBuilder.toString(), listType);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return jobDetailList;
	}

	public List<TaskDetail> getTaskDetails(final String companyID, final String userID,
			final Map<String, String> headerParametersMap) {
		List<TaskDetail> taskDetailList = new ArrayList<TaskDetail>();
		try {
			HttpGet httpGet = new HttpGet(ApplicationConstants.CLICKTIME_URL + ApplicationConstants.COMPANY_URI
					+ companyID + ApplicationConstants.USER_URI + userID + ApplicationConstants.TASK_URI);
			Iterator<String> headerKeyIterator = headerParametersMap.keySet().iterator();
			while (headerKeyIterator.hasNext()) {
				String headerKey = headerKeyIterator.next();
				String headerValue = headerParametersMap.get(headerKey);
				httpGet.setHeader(headerKey, headerValue);
			}
			HttpResponse response = httpClient.execute(httpGet);
			int responseCode = response.getStatusLine().getStatusCode();
			System.out.println(
					"Sending request to URL : " + ApplicationConstants.CLICKTIME_URL + ApplicationConstants.COMPANY_URI
							+ companyID + ApplicationConstants.USER_URI + userID + ApplicationConstants.TASK_URI);
			System.out.println("Response Code : " + responseCode);

			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			StringBuffer jsonStringBuilder = new StringBuffer();
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				jsonStringBuilder.append(line);
			}
			Type listType = new TypeToken<ArrayList<TaskDetail>>() {
			}.getType();
			taskDetailList = new Gson().fromJson(jsonStringBuilder.toString(), listType);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return taskDetailList;
	}
}

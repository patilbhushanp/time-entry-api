package com.sanbhu.api.controller.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanbhu.api.clicktime.bo.TimeEntryResponse;
import com.sanbhu.api.clicktime.bo.UserSession;
import com.sanbhu.api.clicktime.service.ClicktimePortalService;
import com.sanbhu.api.clicktime.service.ClicktimeService;
import com.sanbhu.api.controller.BaseRestController;
import com.sanbhu.api.rally.service.RallyService;
import com.sanbhu.api.utility.ApplicationUtility;

@RestController
public class IntegrationAPIController extends BaseRestController {

	private String clicktimeUsername = "bhushanp@xpanxion.co.in";
	private String clicktimePassword = "Xpanxion2013";
	private String clicktimeHeaderParameters = "accept-encoding: gzip, deflate;"
			+ "accept-language: en-US,en, q=0.8;\r\n"
			+ "user-agent: Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36;\r\n"
			+ "accept: application/json;";
	private String clicktimeStartDateTimeEntry = "2018/04/23";

	private String rallyProjectReferenceURL = "/project/13550831421";
	private String rallyOwnerReferenceURL = "/user/116359175628";
	private String rallyIterationReferenceURL = "/iteration/214670110876";
	final String rallyWorkProductRefernceURL = "/hierarchicalrequirement/217357884236";

	@Autowired
	ClicktimePortalService clicktimePortalService;

	@Autowired
	ClicktimeService clicktimeService;

	@Autowired
	RallyService rallyService;

	@RequestMapping("/integration/autoCreateRallyTasks")
	public Map<String, String> autoCreateRallyTasks(final HttpServletRequest request,
			final HttpServletResponse response) {
		final Map<String, String> responseMap = new HashMap<String, String>();

		final UserSession userSession = performClicktimeLogin(clicktimeUsername, clicktimePassword,
				clicktimeHeaderParameters);
		final List<TimeEntryResponse> timeEntryResponseList = getWeeklyTimeEntry(clicktimeUsername, clicktimePassword,
				userSession, clicktimeStartDateTimeEntry);
		final Map<String, Map<String, Double>> timeEntryMap = populateTimeEntry(timeEntryResponseList);
		if (!timeEntryMap.isEmpty()) {
			Iterator<String> timeEntryIterator = timeEntryMap.keySet().iterator();
			while (timeEntryIterator.hasNext()) {
				String timeEntry = timeEntryIterator.next();
				Map<String, Double> timeEntryValueMap = timeEntryMap.get(timeEntry);
				String taskReferenceURL = rallyService.createTask(timeEntry, rallyProjectReferenceURL,
						rallyOwnerReferenceURL, rallyIterationReferenceURL);
				String newTaskReferenceURL = "";
				if (taskReferenceURL.lastIndexOf('/') >= 0) {
					newTaskReferenceURL = "/detail/userstory_1/"
							+ taskReferenceURL.substring(taskReferenceURL.lastIndexOf('/') + 1) + "/tasks";
				}
				System.out.println(taskReferenceURL);
				if (!timeEntryValueMap.isEmpty()) {
					Iterator<String> timeEntryValueIterator = timeEntryValueMap.keySet().iterator();
					while (timeEntryValueIterator.hasNext()) {
						String timeEntryValueKey = timeEntryValueIterator.next();
						Double timeEntryValue = timeEntryValueMap.get(timeEntryValueKey);
						// parameters - "Auto SubTask Created 1", "/project/13550831421",
						// "/hierarchicalrequirement/217357884236",
						// "/detail/userstory_1/217357884236/tasks", "/user/116359175628",
						// 10D, 8D
						String subTaskReferenceURL = rallyService.createSubTask(timeEntry + " : " + timeEntryValueKey,
								rallyProjectReferenceURL, taskReferenceURL, newTaskReferenceURL, rallyOwnerReferenceURL,
								timeEntryValue, 0.0D);
						System.out.println("subTaskReferenceURL : " + subTaskReferenceURL);
					}
				}
			}
		}
		return responseMap;
	}

	private UserSession performClicktimeLogin(String username, String password, String headerParameters) {
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		headerParametersMap.put("authorization",
				"Baisc " + ApplicationUtility.getBasicAuthorizationValue(username, password));
		return clicktimeService.createSession(username, password, headerParametersMap);
	}

	private List<TimeEntryResponse> getWeeklyTimeEntry(String username, String password, UserSession userSession,
			String startDate) {
		List<TimeEntryResponse> timeEntryResponseList = new ArrayList<TimeEntryResponse>();
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		try {
			if (StringUtils.isNotBlank(startDate)) {
				calendar.setTime(simpleDateFormat.parse(startDate));
			}
		} catch (ParseException exception) {
			exception.printStackTrace();
		}
		for (int i = 0; i < 7; i++) {
			clicktimePortalService.performLogin(username, password);
			System.out.println(
					"simpleDateFormat.format(calendar.getTime()) : " + simpleDateFormat.format(calendar.getTime()));
			timeEntryResponseList.addAll(clicktimePortalService.getTimeEntries(userSession.getUserID(),
					simpleDateFormat.format(calendar.getTime())));
			clicktimePortalService.performLogout();
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
		return timeEntryResponseList;
	}

	private Map<String, Map<String, Double>> populateTimeEntry(final List<TimeEntryResponse> timeEntryResponseList) {
		final Map<String, Map<String, Double>> timeEntryMap = new HashMap<String, Map<String, Double>>();
		for (TimeEntryResponse timeEntryResponse : timeEntryResponseList) {
			String trackID = timeEntryResponse.getTrackTicketID();
			if (StringUtils.isBlank(trackID)) {
				trackID = "General";
			}
			if (timeEntryMap.containsKey(trackID)) {
				Map<String, Double> timeEntryValueMap = timeEntryMap.get(trackID);
				if (timeEntryValueMap.containsKey(timeEntryResponse.getTaskName())) {
					Double taskHours = timeEntryValueMap.get(timeEntryResponse.getTaskName());
					try {
						timeEntryValueMap.put(timeEntryResponse.getTaskName(),
								Double.valueOf(timeEntryResponse.getHours()) + taskHours);
					} catch (NumberFormatException exception) {
						System.err.println("exception to get Hours : " + exception.getLocalizedMessage());
						timeEntryValueMap.put(timeEntryResponse.getTaskName(), taskHours);
					}
				} else {
					try {
						timeEntryValueMap.put(timeEntryResponse.getTaskName(),
								Double.valueOf(timeEntryResponse.getHours()));
					} catch (NumberFormatException exception) {
						System.err.println("exception to get Hours : " + exception.getLocalizedMessage());
						timeEntryValueMap.put(timeEntryResponse.getTaskName(), 0.0D);
					}
				}
			} else {
				Map<String, Double> timeEntryValueMap = new HashMap<String, Double>();
				try {
					timeEntryValueMap.put(timeEntryResponse.getTaskName(),
							Double.valueOf(timeEntryResponse.getHours()));
				} catch (NumberFormatException exception) {
					System.err.println("exception to get Hours : " + exception.getLocalizedMessage());
					timeEntryValueMap.put(timeEntryResponse.getTaskName(), 0.0D);
				}
				timeEntryMap.put(trackID, timeEntryValueMap);
			}
		}
		return timeEntryMap;
	}
}

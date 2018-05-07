package com.sanbhu.api.controller.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanbhu.api.clicktime.bo.TimeEntryResponse;
import com.sanbhu.api.clicktime.bo.UserSession;
import com.sanbhu.api.clicktime.service.ClicktimePortalService;
import com.sanbhu.api.clicktime.service.ClicktimeService;
import com.sanbhu.api.controller.BaseRestController;
import com.sanbhu.api.utility.ApplicationUtility;

@RestController
public class ClicktimePortalController extends BaseRestController {

	@Autowired
	ClicktimePortalService clicktimePortalService;
	
	@Autowired
	ClicktimeService clicktimeService;

	@RequestMapping("/clicktime/getSingleDayTimeEntries")
	public List<TimeEntryResponse> getSingleDayTimeEntries(final HttpServletRequest request) {
		List<TimeEntryResponse> timeEntryResponseList = new ArrayList<TimeEntryResponse>();
		final String username = request.getParameter("username");
		final String password = request.getParameter("password");
		final String startDate = request.getParameter("startDate");
		final UserSession userSession = getUserSession(username, password);
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		try {
			if(StringUtils.isNotBlank(startDate)) {
				calendar.setTime(simpleDateFormat.parse(startDate));
			}
		} catch (ParseException exception) {
			exception.printStackTrace();
		}
		clicktimePortalService.performLogin(username, password);
		System.out.println("simpleDateFormat.format(calendar.getTime()) : " + simpleDateFormat.format(calendar.getTime()));
		timeEntryResponseList.addAll(clicktimePortalService.getTimeEntries(userSession.getUserID(), simpleDateFormat.format(calendar.getTime())));
		clicktimePortalService.performLogout();
		return timeEntryResponseList;
	}
	
	@RequestMapping("/clicktime/getWeeklyTimeEntries")
	public List<TimeEntryResponse> getWeeklyTimeEntries(final HttpServletRequest request) {
		List<TimeEntryResponse> timeEntryResponseList = new ArrayList<TimeEntryResponse>();
		final String username = request.getParameter("username");
		final String password = request.getParameter("password");
		final String startDate = request.getParameter("startDate");
		final UserSession userSession = getUserSession(username, password);
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		try {
			if(StringUtils.isNotBlank(startDate)) {
				calendar.setTime(simpleDateFormat.parse(startDate));
			}
		} catch (ParseException exception) {
			exception.printStackTrace();
		}
		for (int i = 0; i < 15; i++) {
			clicktimePortalService.performLogin(username, password);
			System.out.println("simpleDateFormat.format(calendar.getTime()) : " + simpleDateFormat.format(calendar.getTime()));
			timeEntryResponseList.addAll(clicktimePortalService.getTimeEntries(userSession.getUserID(), simpleDateFormat.format(calendar.getTime())));
			clicktimePortalService.performLogout();
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
		return timeEntryResponseList;
	}
	
	private UserSession getUserSession(final String username, final String password) {
		final String headerParameters = "accept-encoding: gzip, deflate;" + 
				"accept-language: en-US,en, q=0.8;" + 
				"user-agent: Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36;" + 
				"accept: application/json;";
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		headerParametersMap.put("authorization", "Baisc " + ApplicationUtility.getBasicAuthorizationValue(username, password));
		return clicktimeService.createSession(username, password, headerParametersMap);
	}
}

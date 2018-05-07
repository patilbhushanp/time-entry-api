package com.sanbhu.api.controller.rest;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanbhu.api.clicktime.bo.CompanyDetail;
import com.sanbhu.api.clicktime.bo.JobDetail;
import com.sanbhu.api.clicktime.bo.TaskDetail;
import com.sanbhu.api.clicktime.bo.UserSession;
import com.sanbhu.api.clicktime.service.ClicktimeService;
import com.sanbhu.api.controller.BaseRestController;
import com.sanbhu.api.utility.ApplicationUtility;

@RestController
public class ClicktimeAPIController extends BaseRestController {

	@Autowired
	ClicktimeService clicktimeService;

	@RequestMapping("/clicktime/createSession")
	public UserSession createSession(final HttpServletRequest request) {
		final String username = request.getParameter("username");
		final String password = request.getParameter("password");
		final String headerParameters = request.getParameter("headerParameters");
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		headerParametersMap.put("authorization", "Baisc " + ApplicationUtility.getBasicAuthorizationValue(username, password));
		final UserSession userSession = clicktimeService.createSession(username, password, headerParametersMap);
		request.getSession(true);
		request.getSession().setAttribute("userSession", userSession);
		request.getSession().setAttribute("username", username);
		request.getSession().setAttribute("password", password);
		return userSession;
	}

	@RequestMapping("/clicktime/destroySession")
	public void destroySession(final HttpServletRequest request) {
		request.getSession().invalidate();
	}
	
	@RequestMapping("/clicktime/companyDetail")
	public CompanyDetail companyDetail(final HttpServletRequest request) {
		CompanyDetail companyDetail = null;
		Object userSessionObject = request.getSession().getAttribute("userSession");
		final String headerParameters = request.getParameter("headerParameters");
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		Object usernameObject = request.getSession().getAttribute("username");
		Object passwordObject = request.getSession().getAttribute("password");
		if(usernameObject instanceof String && passwordObject instanceof String) {
			headerParametersMap.put("authorization", "Baisc " + ApplicationUtility.getBasicAuthorizationValue(usernameObject.toString(), passwordObject.toString()));	
		}
		if(userSessionObject instanceof UserSession) {
			final UserSession userSession = (UserSession)userSessionObject;
			companyDetail = clicktimeService.getCompanyDetail(userSession.getCompanyID(), headerParametersMap);
		}
		return companyDetail;
	}
	
	@RequestMapping("/clicktime/clientProjects")
	public List<JobDetail> clientProjects(final HttpServletRequest request) {
		List<JobDetail> jobDetailList = null;
		Object userSessionObject = request.getSession().getAttribute("userSession");
		final String headerParameters = request.getParameter("headerParameters");
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		Object usernameObject = request.getSession().getAttribute("username");
		Object passwordObject = request.getSession().getAttribute("password");
		if(usernameObject instanceof String && passwordObject instanceof String) {
			headerParametersMap.put("authorization", "Baisc " + ApplicationUtility.getBasicAuthorizationValue(usernameObject.toString(), passwordObject.toString()));	
		}
		if(userSessionObject instanceof UserSession) {
			final UserSession userSession = (UserSession)userSessionObject;
			jobDetailList = clicktimeService.getJobDetails(userSession.getCompanyID(), userSession.getUserID(), headerParametersMap);
		}
		return jobDetailList;
	}
	
	@RequestMapping("/clicktime/taskList")
	public List<TaskDetail> taskList(final HttpServletRequest request) {
		List<TaskDetail> taskDetailList = null;
		Object userSessionObject = request.getSession().getAttribute("userSession");
		final String headerParameters = request.getParameter("headerParameters");
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		Object usernameObject = request.getSession().getAttribute("username");
		Object passwordObject = request.getSession().getAttribute("password");
		if(usernameObject instanceof String && passwordObject instanceof String) {
			headerParametersMap.put("authorization", "Baisc " + ApplicationUtility.getBasicAuthorizationValue(usernameObject.toString(), passwordObject.toString()));	
		}
		if(userSessionObject instanceof UserSession) {
			final UserSession userSession = (UserSession)userSessionObject;
			taskDetailList = clicktimeService.getTaskDetails(userSession.getCompanyID(), userSession.getUserID(), headerParametersMap);
		}
		return taskDetailList;
	}
}

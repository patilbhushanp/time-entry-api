package com.sanbhu.api.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sanbhu.api.clicktime.bo.CompanyDetail;
import com.sanbhu.api.clicktime.bo.JobDetail;
import com.sanbhu.api.clicktime.bo.TaskDetail;
import com.sanbhu.api.clicktime.bo.UserSession;
import com.sanbhu.api.clicktime.service.ClicktimeService;
import com.sanbhu.api.utility.ApplicationUtility;

@Configuration
public class ClicktimeApplicationCofiguration {

	@Autowired
	ClicktimeService clicktimeService;
	
	@Bean
	public UserSession getUserSession() {
		final String username = "bhushanp@xpanxion.co.in";
		final String password = "Xpanxion2013";
		final String headerParameters = "accept-encoding: gzip, deflate;" + 
										"accept-language: en-US,en, q=0.8;" + 
										"user-agent: Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36;" + 
										"accept: application/json;";
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		headerParametersMap.put("authorization", "Baisc " + ApplicationUtility.getBasicAuthorizationValue(username, password));
		final UserSession userSession = clicktimeService.createSession(username, password, headerParametersMap);
		return userSession;
	}
	
	@Bean
	public CompanyDetail getCompanyDetail() {
		final String username = "bhushanp@xpanxion.co.in";
		final String password = "Xpanxion2013";
		final String headerParameters = "accept-encoding: gzip, deflate;" + 
				"accept-language: en-US,en, q=0.8;" + 
				"user-agent: Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36;" + 
				"accept: application/json;";
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		headerParametersMap.put("authorization", "Baisc " + ApplicationUtility.getBasicAuthorizationValue(username, password));
		return clicktimeService.getCompanyDetail(getUserSession().getCompanyID(), headerParametersMap);
	}
	
	@Bean
	public List<JobDetail> getJobDetails(){
		final String username = "bhushanp@xpanxion.co.in";
		final String password = "Xpanxion2013";
		final String headerParameters = "accept-encoding: gzip, deflate;" + 
				"accept-language: en-US,en, q=0.8;" + 
				"user-agent: Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36;" + 
				"accept: application/json;";
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		headerParametersMap.put("authorization", "Baisc " + ApplicationUtility.getBasicAuthorizationValue(username, password));		
		return clicktimeService.getJobDetails(getUserSession().getCompanyID(), getUserSession().getUserID(), headerParametersMap);
	}
	
	@Bean
	public List<TaskDetail> getTaskDetails(){
		final String username = "bhushanp@xpanxion.co.in";
		final String password = "Xpanxion2013";
		final String headerParameters = "accept-encoding: gzip, deflate;" + 
				"accept-language: en-US,en, q=0.8;" + 
				"user-agent: Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36;" + 
				"accept: application/json;";
		final Map<String, String> headerParametersMap = ApplicationUtility.createHeaderParametersMap(headerParameters);
		headerParametersMap.put("authorization", "Baisc " + ApplicationUtility.getBasicAuthorizationValue(username, password));		
		return clicktimeService.getTaskDetails(getUserSession().getCompanyID(), getUserSession().getUserID(), headerParametersMap);
	}
}

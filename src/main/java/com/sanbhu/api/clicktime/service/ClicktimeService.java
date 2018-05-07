package com.sanbhu.api.clicktime.service;

import java.util.List;
import java.util.Map;

import com.sanbhu.api.clicktime.bo.CompanyDetail;
import com.sanbhu.api.clicktime.bo.JobDetail;
import com.sanbhu.api.clicktime.bo.TaskDetail;
import com.sanbhu.api.clicktime.bo.UserSession;

public interface ClicktimeService {
	
	public UserSession createSession(final String username, final String password,
			final Map<String, String> headerParametersMap);
	
	public CompanyDetail getCompanyDetail(final String companyID, final Map<String, String> headerParametersMap);
	
	public List<JobDetail> getJobDetails(final String companyID, final String userID, final Map<String, String> headerParametersMap);
	
	public List<TaskDetail> getTaskDetails(final String companyID, final String userID, final Map<String, String> headerParametersMap);
}

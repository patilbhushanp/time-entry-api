package com.sanbhu.api.clicktime.service;

import java.util.List;

import com.sanbhu.api.clicktime.bo.TimeEntryResponse;

public interface ClicktimePortalService {
	void performLogin(String username, String password);

	List<TimeEntryResponse> getTimeEntries(String userId, String date);
	
	void performLogout();
}

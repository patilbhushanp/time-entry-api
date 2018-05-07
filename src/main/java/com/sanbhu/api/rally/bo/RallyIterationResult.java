package com.sanbhu.api.rally.bo;

public class RallyIterationResult {
	private String StartDate;

	private String EndDate;

	private String IterationName;

	private String WebserviceURL;

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public String getIterationName() {
		return IterationName;
	}

	public void setIterationName(String iterationName) {
		IterationName = iterationName;
	}

	public String getWebserviceURL() {
		return WebserviceURL;
	}

	public void setWebserviceURL(String webserviceURL) {
		WebserviceURL = webserviceURL;
	}
}

package com.sanbhu.api.rally.bo;

import java.util.ArrayList;
import java.util.List;

public class RallyIterationDetailResult {
	private String IterationName;
	private String IterationStartDate;
	private String IterationEndDate;
	private final List<RallyTaskDetail> RallyTaskDetails = new ArrayList<RallyTaskDetail>();
	
	public String getIterationName() {
		return IterationName;
	}
	
	public void setIterationName(String iterationName) {
		IterationName = iterationName;
	}
	
	public String getIterationStartDate() {
		return IterationStartDate;
	}
	
	public void setIterationStartDate(String iterationStartDate) {
		IterationStartDate = iterationStartDate;
	}
	
	public String getIterationEndDate() {
		return IterationEndDate;
	}
	
	public void setIterationEndDate(String iterationEndDate) {
		IterationEndDate = iterationEndDate;
	}
	
	public List<RallyTaskDetail> getRallyTaskDetails() {
		return RallyTaskDetails;
	}
}

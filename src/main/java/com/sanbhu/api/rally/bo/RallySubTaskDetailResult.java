package com.sanbhu.api.rally.bo;

import java.util.ArrayList;
import java.util.List;

public class RallySubTaskDetailResult {
	private Integer TotalResultCount;
	private Integer PageSize;
	private Integer StartIndex;
	private final List<RallySubTaskDetail> RallySubTaskDetails = new ArrayList<RallySubTaskDetail>();
	
	public Integer getTotalResultCount() {
		return TotalResultCount;
	}
	
	public void setTotalResultCount(Integer totalResultCount) {
		TotalResultCount = totalResultCount;
	}
	
	public Integer getPageSize() {
		return PageSize;
	}
	
	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}
	
	public Integer getStartIndex() {
		return StartIndex;
	}
	
	public void setStartIndex(Integer startIndex) {
		StartIndex = startIndex;
	}
	
	public List<RallySubTaskDetail> getRallySubTaskDetails() {
		return RallySubTaskDetails;
	}
	
}

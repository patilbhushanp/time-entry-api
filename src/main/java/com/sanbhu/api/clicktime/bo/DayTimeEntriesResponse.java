package com.sanbhu.api.clicktime.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DayTimeEntriesResponse {
	@SerializedName("result")
	@Expose
	private DayTimeEntries dayTimeEntries;

	public DayTimeEntries getDayTimeEntries() {
		return dayTimeEntries;
	}

	public void setDayTimeEntries(DayTimeEntries dayTimeEntries) {
		this.dayTimeEntries = dayTimeEntries;
	}

}

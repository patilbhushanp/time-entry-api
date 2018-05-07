package com.sanbhu.api.clicktime.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestParams {

	@SerializedName("selectedDate")
	@Expose
	private String selectedDate;
	@SerializedName("autoFill")
	@Expose
	private Boolean autoFill;
	@SerializedName("tzDiff")
	@Expose
	private String tzDiff;
	@SerializedName("teID")
	@Expose
	private String teID;
	@SerializedName("isOverride")
	@Expose
	private Boolean isOverride;
	@SerializedName("overrideRestrictions")
	@Expose
	private Boolean overrideRestrictions;

	public String getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(String selectedDate) {
		this.selectedDate = selectedDate;
	}

	public Boolean getAutoFill() {
		return autoFill;
	}

	public void setAutoFill(Boolean autoFill) {
		this.autoFill = autoFill;
	}

	public String getTzDiff() {
		return tzDiff;
	}

	public void setTzDiff(String tzDiff) {
		this.tzDiff = tzDiff;
	}

	public String getTeID() {
		return teID;
	}

	public void setTeID(String teID) {
		this.teID = teID;
	}

	public Boolean getIsOverride() {
		return isOverride;
	}

	public void setIsOverride(Boolean isOverride) {
		this.isOverride = isOverride;
	}

	public Boolean getOverrideRestrictions() {
		return overrideRestrictions;
	}

	public void setOverrideRestrictions(Boolean overrideRestrictions) {
		this.overrideRestrictions = overrideRestrictions;
	}

}

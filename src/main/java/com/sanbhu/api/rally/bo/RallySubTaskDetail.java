package com.sanbhu.api.rally.bo;

public class RallySubTaskDetail {
	private String Name;
	private String FormattedID;
	private String ReferenceURL;
	private Double Estimate;
	private Double ToDo;
	private String State;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getFormattedID() {
		return FormattedID;
	}
	
	public void setFormattedID(String formattedID) {
		FormattedID = formattedID;
	}
	
	public String getReferenceURL() {
		return ReferenceURL;
	}
	
	public void setReferenceURL(String referenceURL) {
		ReferenceURL = referenceURL;
	}
	
	public Double getEstimate() {
		return Estimate;
	}
	
	public void setEstimate(Double estimate) {
		Estimate = estimate;
	}
	
	public Double getToDo() {
		return ToDo;
	}
	
	public void setToDo(Double toDo) {
		ToDo = toDo;
	}
	
	public String getState() {
		return State;
	}
	
	public void setState(String state) {
		State = state;
	}
}

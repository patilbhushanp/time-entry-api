package com.sanbhu.api.rally.bo;

public class RallyTaskDetail {
	private String Name;
	private Double TaskEstimateTotal;
	private Double TaskRemainingTotal;
	private Double PlanEstimate;
	private String TaskStatus;
	private String ReferenceURL;
	private String FormattedID;
	private RallySubTaskSummary SubTaskSummary;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getTaskEstimateTotal() {
		return TaskEstimateTotal;
	}

	public void setTaskEstimateTotal(Double taskEstimateTotal) {
		TaskEstimateTotal = taskEstimateTotal;
	}

	public Double getTaskRemainingTotal() {
		return TaskRemainingTotal;
	}

	public void setTaskRemainingTotal(Double taskRemainingTotal) {
		TaskRemainingTotal = taskRemainingTotal;
	}

	public RallySubTaskSummary getSubTaskSummary() {
		return SubTaskSummary;
	}

	public void setSubTaskSummary(RallySubTaskSummary subTaskSummary) {
		SubTaskSummary = subTaskSummary;
	}

	public Double getPlanEstimate() {
		return PlanEstimate;
	}

	public void setPlanEstimate(Double planEstimate) {
		PlanEstimate = planEstimate;
	}

	public String getTaskStatus() {
		return TaskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		TaskStatus = taskStatus;
	}

	public String getReferenceURL() {
		return ReferenceURL;
	}

	public void setReferenceURL(String ReferenceURL) {
		this.ReferenceURL = ReferenceURL;
	}

	public String getFormattedID() {
		return FormattedID;
	}

	public void setFormattedID(String formattedID) {
		FormattedID = formattedID;
	}
}

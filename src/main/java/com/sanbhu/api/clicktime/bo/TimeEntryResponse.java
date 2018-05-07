package com.sanbhu.api.clicktime.bo;

public class TimeEntryResponse {
	private String Comment;
	private String Date;
	private String Hours;
	private String JobID;
	private String JobName;
	private String TaskID;
	private String TaskName;
	private String TimeEntryID;
	private String RallyIteration;
	private String TrackTicketID;

	public String getComment() {
		return Comment;
	}
	
	public void setComment(String comment) {
		Comment = comment;
	}
	
	public String getDate() {
		return Date;
	}
	
	public void setDate(String date) {
		Date = date;
	}
	
	public String getHours() {
		return Hours;
	}
	
	public void setHours(String hours) {
		Hours = hours;
	}

	public String getJobID() {
		return JobID;
	}
	
	public void setJobID(String jobID) {
		JobID = jobID;
	}
		
	public String getTaskID() {
		return TaskID;
	}
	
	public void setTaskID(String taskID) {
		TaskID = taskID;
	}
	
	public String getTimeEntryID() {
		return TimeEntryID;
	}
	
	public void setTimeEntryID(String timeEntryID) {
		TimeEntryID = timeEntryID;
	}

	public String getRallyIteration() {
		return RallyIteration;
	}

	public void setRallyIteration(String rallyIteration) {
		RallyIteration = rallyIteration;
	}

	public String getTrackTicketID() {
		return TrackTicketID;
	}

	public void setTrackTicketID(String trackTicketID) {
		TrackTicketID = trackTicketID;
	}

	public String getJobName() {
		return JobName;
	}

	public void setJobName(String jobName) {
		JobName = jobName;
	}

	public String getTaskName() {
		return TaskName;
	}

	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
}

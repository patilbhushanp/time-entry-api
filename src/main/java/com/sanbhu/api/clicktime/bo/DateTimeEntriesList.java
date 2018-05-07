
package com.sanbhu.api.clicktime.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DateTimeEntriesList {

    @SerializedName("clientRowNumber")
    @Expose
    private Integer clientRowNumber;
    @SerializedName("hours")
    @Expose
    private Double hours;
    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("endTime")
    @Expose
    private String endTime;
    @SerializedName("breakTime")
    @Expose
    private String breakTime;
    @SerializedName("clientID")
    @Expose
    private String clientID;
    @SerializedName("jobID")
    @Expose
    private String jobID;
    @SerializedName("taskID")
    @Expose
    private String taskID;
    @SerializedName("isTimeOff")
    @Expose
    private Boolean isTimeOff;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("entryDate")
    @Expose
    private String entryDate;
    @SerializedName("isNew")
    @Expose
    private Boolean isNew;
    @SerializedName("isFromAutoFill")
    @Expose
    private Boolean isFromAutoFill;
    @SerializedName("timeEntryID")
    @Expose
    private String timeEntryID;
    @SerializedName("isDirty")
    @Expose
    private Boolean isDirty;
    @SerializedName("isDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("isLocked")
    @Expose
    private Boolean isLocked;
    @SerializedName("isHoliday")
    @Expose
    private Boolean isHoliday;
    @SerializedName("whyLocked")
    @Expose
    private String whyLocked;
    @SerializedName("timeEntryLockingMessage")
    @Expose
    private String timeEntryLockingMessage;
    @SerializedName("timerID")
    @Expose
    private String timerID;
    @SerializedName("isDeletable")
    @Expose
    private Boolean isDeletable;
    @SerializedName("isStopwatchRunning")
    @Expose
    private Boolean isStopwatchRunning;
    @SerializedName("isStopwatchAbandoned")
    @Expose
    private Boolean isStopwatchAbandoned;
    @SerializedName("lastStarted")
    @Expose
    private String lastStarted;
    @SerializedName("isStopwatchDisabled")
    @Expose
    private Boolean isStopwatchDisabled;
    @SerializedName("reasonsForLockedStatus")
    @Expose
    private ReasonsForLockedStatus reasonsForLockedStatus;
    @SerializedName("missingClientDisplayText")
    @Expose
    private String missingClientDisplayText;
    @SerializedName("missingJobDisplayText")
    @Expose
    private String missingJobDisplayText;
    @SerializedName("missingTaskDisplayText")
    @Expose
    private String missingTaskDisplayText;
    @SerializedName("missingLeaveTypeDisplayText")
    @Expose
    private String missingLeaveTypeDisplayText;
    @SerializedName("missingPhaseDisplayText")
    @Expose
    private String missingPhaseDisplayText;
    @SerializedName("missingSubPhaseDisplayText")
    @Expose
    private String missingSubPhaseDisplayText;
    @SerializedName("overLimitClientDisplayText")
    @Expose
    private String overLimitClientDisplayText;
    @SerializedName("overLimitJobDisplayText")
    @Expose
    private String overLimitJobDisplayText;
    @SerializedName("overLimitTaskDisplayText")
    @Expose
    private String overLimitTaskDisplayText;
    @SerializedName("overLimitLeaveTypeDisplayText")
    @Expose
    private String overLimitLeaveTypeDisplayText;
    @SerializedName("overLimitPhaseDisplayText")
    @Expose
    private String overLimitPhaseDisplayText;
    @SerializedName("overLimitSubPhaseDisplayText")
    @Expose
    private String overLimitSubPhaseDisplayText;
    @SerializedName("customFields")
    @Expose
    private CustomFields customFields;
    @SerializedName("dateStamp")
    @Expose
    private String dateStamp;

    public Integer getClientRowNumber() {
        return clientRowNumber;
    }

    public void setClientRowNumber(Integer clientRowNumber) {
        this.clientRowNumber = clientRowNumber;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getBreakTime() {
        return breakTime;
    }

    public void setBreakTime(String breakTime) {
        this.breakTime = breakTime;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public Boolean getIsTimeOff() {
        return isTimeOff;
    }

    public void setIsTimeOff(Boolean isTimeOff) {
        this.isTimeOff = isTimeOff;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsFromAutoFill() {
        return isFromAutoFill;
    }

    public void setIsFromAutoFill(Boolean isFromAutoFill) {
        this.isFromAutoFill = isFromAutoFill;
    }

    public String getTimeEntryID() {
        return timeEntryID;
    }

    public void setTimeEntryID(String timeEntryID) {
        this.timeEntryID = timeEntryID;
    }

    public Boolean getIsDirty() {
        return isDirty;
    }

    public void setIsDirty(Boolean isDirty) {
        this.isDirty = isDirty;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Boolean getIsHoliday() {
        return isHoliday;
    }

    public void setIsHoliday(Boolean isHoliday) {
        this.isHoliday = isHoliday;
    }

    public String getWhyLocked() {
        return whyLocked;
    }

    public void setWhyLocked(String whyLocked) {
        this.whyLocked = whyLocked;
    }

    public String getTimeEntryLockingMessage() {
        return timeEntryLockingMessage;
    }

    public void setTimeEntryLockingMessage(String timeEntryLockingMessage) {
        this.timeEntryLockingMessage = timeEntryLockingMessage;
    }

    public String getTimerID() {
        return timerID;
    }

    public void setTimerID(String timerID) {
        this.timerID = timerID;
    }

    public Boolean getIsDeletable() {
        return isDeletable;
    }

    public void setIsDeletable(Boolean isDeletable) {
        this.isDeletable = isDeletable;
    }

    public Boolean getIsStopwatchRunning() {
        return isStopwatchRunning;
    }

    public void setIsStopwatchRunning(Boolean isStopwatchRunning) {
        this.isStopwatchRunning = isStopwatchRunning;
    }

    public Boolean getIsStopwatchAbandoned() {
        return isStopwatchAbandoned;
    }

    public void setIsStopwatchAbandoned(Boolean isStopwatchAbandoned) {
        this.isStopwatchAbandoned = isStopwatchAbandoned;
    }

    public String getLastStarted() {
        return lastStarted;
    }

    public void setLastStarted(String lastStarted) {
        this.lastStarted = lastStarted;
    }

    public Boolean getIsStopwatchDisabled() {
        return isStopwatchDisabled;
    }

    public void setIsStopwatchDisabled(Boolean isStopwatchDisabled) {
        this.isStopwatchDisabled = isStopwatchDisabled;
    }

    public ReasonsForLockedStatus getReasonsForLockedStatus() {
        return reasonsForLockedStatus;
    }

    public void setReasonsForLockedStatus(ReasonsForLockedStatus reasonsForLockedStatus) {
        this.reasonsForLockedStatus = reasonsForLockedStatus;
    }

    public String getMissingClientDisplayText() {
        return missingClientDisplayText;
    }

    public void setMissingClientDisplayText(String missingClientDisplayText) {
        this.missingClientDisplayText = missingClientDisplayText;
    }

    public String getMissingJobDisplayText() {
        return missingJobDisplayText;
    }

    public void setMissingJobDisplayText(String missingJobDisplayText) {
        this.missingJobDisplayText = missingJobDisplayText;
    }

    public String getMissingTaskDisplayText() {
        return missingTaskDisplayText;
    }

    public void setMissingTaskDisplayText(String missingTaskDisplayText) {
        this.missingTaskDisplayText = missingTaskDisplayText;
    }

    public String getMissingLeaveTypeDisplayText() {
        return missingLeaveTypeDisplayText;
    }

    public void setMissingLeaveTypeDisplayText(String missingLeaveTypeDisplayText) {
        this.missingLeaveTypeDisplayText = missingLeaveTypeDisplayText;
    }

    public String getMissingPhaseDisplayText() {
        return missingPhaseDisplayText;
    }

    public void setMissingPhaseDisplayText(String missingPhaseDisplayText) {
        this.missingPhaseDisplayText = missingPhaseDisplayText;
    }

    public String getMissingSubPhaseDisplayText() {
        return missingSubPhaseDisplayText;
    }

    public void setMissingSubPhaseDisplayText(String missingSubPhaseDisplayText) {
        this.missingSubPhaseDisplayText = missingSubPhaseDisplayText;
    }

    public String getOverLimitClientDisplayText() {
        return overLimitClientDisplayText;
    }

    public void setOverLimitClientDisplayText(String overLimitClientDisplayText) {
        this.overLimitClientDisplayText = overLimitClientDisplayText;
    }

    public String getOverLimitJobDisplayText() {
        return overLimitJobDisplayText;
    }

    public void setOverLimitJobDisplayText(String overLimitJobDisplayText) {
        this.overLimitJobDisplayText = overLimitJobDisplayText;
    }

    public String getOverLimitTaskDisplayText() {
        return overLimitTaskDisplayText;
    }

    public void setOverLimitTaskDisplayText(String overLimitTaskDisplayText) {
        this.overLimitTaskDisplayText = overLimitTaskDisplayText;
    }

    public String getOverLimitLeaveTypeDisplayText() {
        return overLimitLeaveTypeDisplayText;
    }

    public void setOverLimitLeaveTypeDisplayText(String overLimitLeaveTypeDisplayText) {
        this.overLimitLeaveTypeDisplayText = overLimitLeaveTypeDisplayText;
    }

    public String getOverLimitPhaseDisplayText() {
        return overLimitPhaseDisplayText;
    }

    public void setOverLimitPhaseDisplayText(String overLimitPhaseDisplayText) {
        this.overLimitPhaseDisplayText = overLimitPhaseDisplayText;
    }

    public String getOverLimitSubPhaseDisplayText() {
        return overLimitSubPhaseDisplayText;
    }

    public void setOverLimitSubPhaseDisplayText(String overLimitSubPhaseDisplayText) {
        this.overLimitSubPhaseDisplayText = overLimitSubPhaseDisplayText;
    }

    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public String getDateStamp() {
        return dateStamp;
    }

    public void setDateStamp(String dateStamp) {
        this.dateStamp = dateStamp;
    }

}

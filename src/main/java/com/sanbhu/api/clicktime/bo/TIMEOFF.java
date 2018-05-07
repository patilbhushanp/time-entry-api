
package com.sanbhu.api.clicktime.bo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TIMEOFF {

    @SerializedName("isLocked")
    @Expose
    private Boolean isLocked;
    @SerializedName("timeEntryLocked")
    @Expose
    private Boolean timeEntryLocked;
    @SerializedName("timeOffLocked")
    @Expose
    private Boolean timeOffLocked;
    @SerializedName("hasBeenSubmitted")
    @Expose
    private Boolean hasBeenSubmitted;
    @SerializedName("whyLocked")
    @Expose
    private String whyLocked;
    @SerializedName("timeEntryLockingMessage")
    @Expose
    private String timeEntryLockingMessage;
    @SerializedName("dateTimeEntriesList")
    @Expose
    private List<Object> dateTimeEntriesList = null;
    @SerializedName("totalHours")
    @Expose
    private String totalHours;

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Boolean getTimeEntryLocked() {
        return timeEntryLocked;
    }

    public void setTimeEntryLocked(Boolean timeEntryLocked) {
        this.timeEntryLocked = timeEntryLocked;
    }

    public Boolean getTimeOffLocked() {
        return timeOffLocked;
    }

    public void setTimeOffLocked(Boolean timeOffLocked) {
        this.timeOffLocked = timeOffLocked;
    }

    public Boolean getHasBeenSubmitted() {
        return hasBeenSubmitted;
    }

    public void setHasBeenSubmitted(Boolean hasBeenSubmitted) {
        this.hasBeenSubmitted = hasBeenSubmitted;
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

    public List<Object> getDateTimeEntriesList() {
        return dateTimeEntriesList;
    }

    public void setDateTimeEntriesList(List<Object> dateTimeEntriesList) {
        this.dateTimeEntriesList = dateTimeEntriesList;
    }

    public String getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(String totalHours) {
        this.totalHours = totalHours;
    }

}

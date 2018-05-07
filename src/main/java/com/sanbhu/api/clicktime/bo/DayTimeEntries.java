
package com.sanbhu.api.clicktime.bo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DayTimeEntries {

    @SerializedName("invalidTimerIDs")
    @Expose
    private List<Object> invalidTimerIDs = null;
    @SerializedName("timedata")
    @Expose
    private Timedata timedata;
    @SerializedName("storehashdata")
    @Expose
    private Storehashdata storehashdata;
    @SerializedName("MaskTimeEntry")
    @Expose
    private Boolean maskTimeEntry;
    @SerializedName("currentTimesheetHasBeenSubmitted")
    @Expose
    private Boolean currentTimesheetHasBeenSubmitted;
    @SerializedName("currentTimesheetStatus")
    @Expose
    private String currentTimesheetStatus;

    public List<Object> getInvalidTimerIDs() {
        return invalidTimerIDs;
    }

    public void setInvalidTimerIDs(List<Object> invalidTimerIDs) {
        this.invalidTimerIDs = invalidTimerIDs;
    }

    public Timedata getTimedata() {
        return timedata;
    }

    public void setTimedata(Timedata timedata) {
        this.timedata = timedata;
    }

    public Storehashdata getStorehashdata() {
        return storehashdata;
    }

    public void setStorehashdata(Storehashdata storehashdata) {
        this.storehashdata = storehashdata;
    }

    public Boolean getMaskTimeEntry() {
        return maskTimeEntry;
    }

    public void setMaskTimeEntry(Boolean maskTimeEntry) {
        this.maskTimeEntry = maskTimeEntry;
    }

    public Boolean getCurrentTimesheetHasBeenSubmitted() {
        return currentTimesheetHasBeenSubmitted;
    }

    public void setCurrentTimesheetHasBeenSubmitted(Boolean currentTimesheetHasBeenSubmitted) {
        this.currentTimesheetHasBeenSubmitted = currentTimesheetHasBeenSubmitted;
    }

    public String getCurrentTimesheetStatus() {
        return currentTimesheetStatus;
    }

    public void setCurrentTimesheetStatus(String currentTimesheetStatus) {
        this.currentTimesheetStatus = currentTimesheetStatus;
    }

}

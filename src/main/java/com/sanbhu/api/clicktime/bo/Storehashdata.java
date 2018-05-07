
package com.sanbhu.api.clicktime.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Storehashdata {

    @SerializedName("leaveTypeStoresHashData")
    @Expose
    private LeaveTypeStoresHashData leaveTypeStoresHashData;
    @SerializedName("clientStoresHashData")
    @Expose
    private ClientStoresHashData clientStoresHashData;
    @SerializedName("jobStoresHashData")
    @Expose
    private JobStoresHashData jobStoresHashData;
    @SerializedName("phaseStoresHashData")
    @Expose
    private PhaseStoresHashData phaseStoresHashData;
    @SerializedName("subPhaseStoresHashData")
    @Expose
    private SubPhaseStoresHashData subPhaseStoresHashData;
    @SerializedName("taskStoresHashData")
    @Expose
    private TaskStoresHashData taskStoresHashData;

    public LeaveTypeStoresHashData getLeaveTypeStoresHashData() {
        return leaveTypeStoresHashData;
    }

    public void setLeaveTypeStoresHashData(LeaveTypeStoresHashData leaveTypeStoresHashData) {
        this.leaveTypeStoresHashData = leaveTypeStoresHashData;
    }

    public ClientStoresHashData getClientStoresHashData() {
        return clientStoresHashData;
    }

    public void setClientStoresHashData(ClientStoresHashData clientStoresHashData) {
        this.clientStoresHashData = clientStoresHashData;
    }

    public JobStoresHashData getJobStoresHashData() {
        return jobStoresHashData;
    }

    public void setJobStoresHashData(JobStoresHashData jobStoresHashData) {
        this.jobStoresHashData = jobStoresHashData;
    }

    public PhaseStoresHashData getPhaseStoresHashData() {
        return phaseStoresHashData;
    }

    public void setPhaseStoresHashData(PhaseStoresHashData phaseStoresHashData) {
        this.phaseStoresHashData = phaseStoresHashData;
    }

    public SubPhaseStoresHashData getSubPhaseStoresHashData() {
        return subPhaseStoresHashData;
    }

    public void setSubPhaseStoresHashData(SubPhaseStoresHashData subPhaseStoresHashData) {
        this.subPhaseStoresHashData = subPhaseStoresHashData;
    }

    public TaskStoresHashData getTaskStoresHashData() {
        return taskStoresHashData;
    }

    public void setTaskStoresHashData(TaskStoresHashData taskStoresHashData) {
        this.taskStoresHashData = taskStoresHashData;
    }

}

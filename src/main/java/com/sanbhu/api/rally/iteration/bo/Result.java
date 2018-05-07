
package com.sanbhu.api.rally.iteration.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("_rallyAPIMajor")
    @Expose
    private String rallyAPIMajor;
    @SerializedName("_rallyAPIMinor")
    @Expose
    private String rallyAPIMinor;
    @SerializedName("_ref")
    @Expose
    private String ref;
    @SerializedName("_refObjectUUID")
    @Expose
    private String refObjectUUID;
    @SerializedName("_objectVersion")
    @Expose
    private String objectVersion;
    @SerializedName("_refObjectName")
    @Expose
    private String refObjectName;
    @SerializedName("AcceptedAmount")
    @Expose
    private Double acceptedAmount;
    @SerializedName("ActiveDefectCount")
    @Expose
    private Integer activeDefectCount;
    @SerializedName("ActiveTaskCount")
    @Expose
    private Integer activeTaskCount;
    @SerializedName("ActualPlannedAmount")
    @Expose
    private Double actualPlannedAmount;
    @SerializedName("BlockedAcceptedAmount")
    @Expose
    private Double blockedAcceptedAmount;
    @SerializedName("BlockedCompletedAmount")
    @Expose
    private Double blockedCompletedAmount;
    @SerializedName("BlockedDefinedAmount")
    @Expose
    private Double blockedDefinedAmount;
    @SerializedName("BlockedInProgressAmount")
    @Expose
    private Double blockedInProgressAmount;
    @SerializedName("CompletedAmount")
    @Expose
    private Double completedAmount;
    @SerializedName("DefinedAmount")
    @Expose
    private Double definedAmount;
    @SerializedName("EndDate")
    @Expose
    private String endDate;
    @SerializedName("InProgressAmount")
    @Expose
    private Double inProgressAmount;
    @SerializedName("Iteration")
    @Expose
    private Iteration iteration;
    @SerializedName("IterationPlannedVelocity")
    @Expose
    private Double iterationPlannedVelocity;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ObjectID")
    @Expose
    private Integer objectID;
    @SerializedName("StartDate")
    @Expose
    private String startDate;
    @SerializedName("_type")
    @Expose
    private String type;

    public String getRallyAPIMajor() {
        return rallyAPIMajor;
    }

    public void setRallyAPIMajor(String rallyAPIMajor) {
        this.rallyAPIMajor = rallyAPIMajor;
    }

    public String getRallyAPIMinor() {
        return rallyAPIMinor;
    }

    public void setRallyAPIMinor(String rallyAPIMinor) {
        this.rallyAPIMinor = rallyAPIMinor;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRefObjectUUID() {
        return refObjectUUID;
    }

    public void setRefObjectUUID(String refObjectUUID) {
        this.refObjectUUID = refObjectUUID;
    }

    public String getObjectVersion() {
        return objectVersion;
    }

    public void setObjectVersion(String objectVersion) {
        this.objectVersion = objectVersion;
    }

    public String getRefObjectName() {
        return refObjectName;
    }

    public void setRefObjectName(String refObjectName) {
        this.refObjectName = refObjectName;
    }

    public Double getAcceptedAmount() {
        return acceptedAmount;
    }

    public void setAcceptedAmount(Double acceptedAmount) {
        this.acceptedAmount = acceptedAmount;
    }

    public Integer getActiveDefectCount() {
        return activeDefectCount;
    }

    public void setActiveDefectCount(Integer activeDefectCount) {
        this.activeDefectCount = activeDefectCount;
    }

    public Integer getActiveTaskCount() {
        return activeTaskCount;
    }

    public void setActiveTaskCount(Integer activeTaskCount) {
        this.activeTaskCount = activeTaskCount;
    }

    public Double getActualPlannedAmount() {
        return actualPlannedAmount;
    }

    public void setActualPlannedAmount(Double actualPlannedAmount) {
        this.actualPlannedAmount = actualPlannedAmount;
    }

    public Double getBlockedAcceptedAmount() {
        return blockedAcceptedAmount;
    }

    public void setBlockedAcceptedAmount(Double blockedAcceptedAmount) {
        this.blockedAcceptedAmount = blockedAcceptedAmount;
    }

    public Double getBlockedCompletedAmount() {
        return blockedCompletedAmount;
    }

    public void setBlockedCompletedAmount(Double blockedCompletedAmount) {
        this.blockedCompletedAmount = blockedCompletedAmount;
    }

    public Double getBlockedDefinedAmount() {
        return blockedDefinedAmount;
    }

    public void setBlockedDefinedAmount(Double blockedDefinedAmount) {
        this.blockedDefinedAmount = blockedDefinedAmount;
    }

    public Double getBlockedInProgressAmount() {
        return blockedInProgressAmount;
    }

    public void setBlockedInProgressAmount(Double blockedInProgressAmount) {
        this.blockedInProgressAmount = blockedInProgressAmount;
    }

    public Double getCompletedAmount() {
        return completedAmount;
    }

    public void setCompletedAmount(Double completedAmount) {
        this.completedAmount = completedAmount;
    }

    public Double getDefinedAmount() {
        return definedAmount;
    }

    public void setDefinedAmount(Double definedAmount) {
        this.definedAmount = definedAmount;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getInProgressAmount() {
        return inProgressAmount;
    }

    public void setInProgressAmount(Double inProgressAmount) {
        this.inProgressAmount = inProgressAmount;
    }

    public Iteration getIteration() {
        return iteration;
    }

    public void setIteration(Iteration iteration) {
        this.iteration = iteration;
    }

    public Double getIterationPlannedVelocity() {
        return iterationPlannedVelocity;
    }

    public void setIterationPlannedVelocity(Double iterationPlannedVelocity) {
        this.iterationPlannedVelocity = iterationPlannedVelocity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getObjectID() {
        return objectID;
    }

    public void setObjectID(Integer objectID) {
        this.objectID = objectID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

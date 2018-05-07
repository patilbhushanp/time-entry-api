
package com.sanbhu.api.rally.iteration.task.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Iteration {

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
    @SerializedName("_p")
    @Expose
    private String p;
    @SerializedName("ObjectID")
    @Expose
    private Integer objectID;
    @SerializedName("VersionId")
    @Expose
    private String versionId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("PlanEstimate")
    @Expose
    private Double planEstimate;
    @SerializedName("Project")
    @Expose
    private Project project;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("TaskEstimateTotal")
    @Expose
    private Double taskEstimateTotal;
    @SerializedName("TaskRemainingTotal")
    @Expose
    private Double taskRemainingTotal;
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

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public Integer getObjectID() {
        return objectID;
    }

    public void setObjectID(Integer objectID) {
        this.objectID = objectID;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPlanEstimate() {
        return planEstimate;
    }

    public void setPlanEstimate(Double planEstimate) {
        this.planEstimate = planEstimate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getTaskEstimateTotal() {
        return taskEstimateTotal;
    }

    public void setTaskEstimateTotal(Double taskEstimateTotal) {
        this.taskEstimateTotal = taskEstimateTotal;
    }

    public Double getTaskRemainingTotal() {
        return taskRemainingTotal;
    }

    public void setTaskRemainingTotal(Double taskRemainingTotal) {
        this.taskRemainingTotal = taskRemainingTotal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

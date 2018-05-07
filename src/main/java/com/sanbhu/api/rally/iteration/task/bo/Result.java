
package com.sanbhu.api.rally.iteration.task.bo;

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
    @SerializedName("_p")
    @Expose
    private String p;
    @SerializedName("ObjectID")
    @Expose
    private Integer objectID;
    @SerializedName("VersionId")
    @Expose
    private String versionId;
    @SerializedName("Discussion")
    @Expose
    private Discussion discussion;
    @SerializedName("DisplayColor")
    @Expose
    private String displayColor;
    @SerializedName("FormattedID")
    @Expose
    private String formattedID;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Ready")
    @Expose
    private Boolean ready;
    @SerializedName("Tags")
    @Expose
    private Tags tags;
    @SerializedName("Blocked")
    @Expose
    private Boolean blocked;
    @SerializedName("DragAndDropRank")
    @Expose
    private String dragAndDropRank;
    @SerializedName("Iteration")
    @Expose
    private Iteration iteration;
    @SerializedName("Project")
    @Expose
    private Project_ project;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("TaskIndex")
    @Expose
    private Integer taskIndex;
    @SerializedName("WorkProduct")
    @Expose
    private WorkProduct workProduct;
    @SerializedName("Summary")
    @Expose
    private Summary summary;
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

    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    public String getDisplayColor() {
        return displayColor;
    }

    public void setDisplayColor(String displayColor) {
        this.displayColor = displayColor;
    }

    public String getFormattedID() {
        return formattedID;
    }

    public void setFormattedID(String formattedID) {
        this.formattedID = formattedID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public String getDragAndDropRank() {
        return dragAndDropRank;
    }

    public void setDragAndDropRank(String dragAndDropRank) {
        this.dragAndDropRank = dragAndDropRank;
    }

    public Iteration getIteration() {
        return iteration;
    }

    public void setIteration(Iteration iteration) {
        this.iteration = iteration;
    }

    public Project_ getProject() {
        return project;
    }

    public void setProject(Project_ project) {
        this.project = project;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getTaskIndex() {
        return taskIndex;
    }

    public void setTaskIndex(Integer taskIndex) {
        this.taskIndex = taskIndex;
    }

    public WorkProduct getWorkProduct() {
        return workProduct;
    }

    public void setWorkProduct(WorkProduct workProduct) {
        this.workProduct = workProduct;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

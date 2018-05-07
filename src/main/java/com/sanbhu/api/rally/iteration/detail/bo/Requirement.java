
package com.sanbhu.api.rally.iteration.detail.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Requirement {

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
    @SerializedName("ObjectID")
    @Expose
    private Integer objectID;
    @SerializedName("VersionId")
    @Expose
    private String versionId;
    @SerializedName("Discussion")
    @Expose
    private Discussion__ discussion;
    @SerializedName("DisplayColor")
    @Expose
    private String displayColor;
    @SerializedName("FormattedID")
    @Expose
    private String formattedID;
    @SerializedName("DirectChildrenCount")
    @Expose
    private Integer directChildrenCount;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Owner")
    @Expose
    private Owner___ owner;
    @SerializedName("Project")
    @Expose
    private Project__ project;
    @SerializedName("Ready")
    @Expose
    private Boolean ready;
    @SerializedName("Tags")
    @Expose
    private Tags_ tags;
    @SerializedName("ScheduleState")
    @Expose
    private String scheduleState;
    @SerializedName("ScheduleStatePrefix")
    @Expose
    private String scheduleStatePrefix;
    @SerializedName("Blocked")
    @Expose
    private Boolean blocked;
    @SerializedName("Children")
    @Expose
    private Children___ children;
    @SerializedName("DefectStatus")
    @Expose
    private String defectStatus;
    @SerializedName("DragAndDropRank")
    @Expose
    private String dragAndDropRank;
    @SerializedName("Iteration")
    @Expose
    private Iteration_ iteration;
    @SerializedName("TaskEstimateTotal")
    @Expose
    private Double taskEstimateTotal;
    @SerializedName("TaskRemainingTotal")
    @Expose
    private Double taskRemainingTotal;
    @SerializedName("TaskStatus")
    @Expose
    private String taskStatus;
    @SerializedName("Tasks")
    @Expose
    private Tasks_ tasks;
    @SerializedName("TestCases")
    @Expose
    private TestCases_ testCases;
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

    public Discussion__ getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion__ discussion) {
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

    public Integer getDirectChildrenCount() {
        return directChildrenCount;
    }

    public void setDirectChildrenCount(Integer directChildrenCount) {
        this.directChildrenCount = directChildrenCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner___ getOwner() {
        return owner;
    }

    public void setOwner(Owner___ owner) {
        this.owner = owner;
    }

    public Project__ getProject() {
        return project;
    }

    public void setProject(Project__ project) {
        this.project = project;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public Tags_ getTags() {
        return tags;
    }

    public void setTags(Tags_ tags) {
        this.tags = tags;
    }

    public String getScheduleState() {
        return scheduleState;
    }

    public void setScheduleState(String scheduleState) {
        this.scheduleState = scheduleState;
    }

    public String getScheduleStatePrefix() {
        return scheduleStatePrefix;
    }

    public void setScheduleStatePrefix(String scheduleStatePrefix) {
        this.scheduleStatePrefix = scheduleStatePrefix;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public Children___ getChildren() {
        return children;
    }

    public void setChildren(Children___ children) {
        this.children = children;
    }

    public String getDefectStatus() {
        return defectStatus;
    }

    public void setDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
    }

    public String getDragAndDropRank() {
        return dragAndDropRank;
    }

    public void setDragAndDropRank(String dragAndDropRank) {
        this.dragAndDropRank = dragAndDropRank;
    }

    public Iteration_ getIteration() {
        return iteration;
    }

    public void setIteration(Iteration_ iteration) {
        this.iteration = iteration;
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

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Tasks_ getTasks() {
        return tasks;
    }

    public void setTasks(Tasks_ tasks) {
        this.tasks = tasks;
    }

    public TestCases_ getTestCases() {
        return testCases;
    }

    public void setTestCases(TestCases_ testCases) {
        this.testCases = testCases;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

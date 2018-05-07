
package com.sanbhu.api.rally.iteration.detail.bo;

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
    @SerializedName("Owner")
    @Expose
    private Owner owner;
    @SerializedName("Project")
    @Expose
    private Project project;
    @SerializedName("Ready")
    @Expose
    private Boolean ready;
    @SerializedName("Tags")
    @Expose
    private Tags tags;
    @SerializedName("ScheduleState")
    @Expose
    private String scheduleState;
    @SerializedName("ScheduleStatePrefix")
    @Expose
    private String scheduleStatePrefix;
    @SerializedName("Blocked")
    @Expose
    private Boolean blocked;
    @SerializedName("DefectSuites")
    @Expose
    private DefectSuites defectSuites;
    @SerializedName("DragAndDropRank")
    @Expose
    private String dragAndDropRank;
    @SerializedName("Iteration")
    @Expose
    private Iteration iteration;
    @SerializedName("PlanEstimate")
    @Expose
    private Double planEstimate;
    @SerializedName("State")
    @Expose
    private String state;
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
    private Tasks tasks;
    @SerializedName("TestCases")
    @Expose
    private TestCases testCases;
    @SerializedName("Summary")
    @Expose
    private Summary summary;
    @SerializedName("_type")
    @Expose
    private String type;
    @SerializedName("Requirement")
    @Expose
    private Requirement requirement;
    @SerializedName("DirectChildrenCount")
    @Expose
    private Integer directChildrenCount;
    @SerializedName("Children")
    @Expose
    private Children_____ children;
    @SerializedName("DefectStatus")
    @Expose
    private String defectStatus;
    @SerializedName("Defects")
    @Expose
    private Defects defects;

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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
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

    public DefectSuites getDefectSuites() {
        return defectSuites;
    }

    public void setDefectSuites(DefectSuites defectSuites) {
        this.defectSuites = defectSuites;
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

    public Double getPlanEstimate() {
        return planEstimate;
    }

    public void setPlanEstimate(Double planEstimate) {
        this.planEstimate = planEstimate;
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

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    public TestCases getTestCases() {
        return testCases;
    }

    public void setTestCases(TestCases testCases) {
        this.testCases = testCases;
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

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    public Integer getDirectChildrenCount() {
        return directChildrenCount;
    }

    public void setDirectChildrenCount(Integer directChildrenCount) {
        this.directChildrenCount = directChildrenCount;
    }

    public Children_____ getChildren() {
        return children;
    }

    public void setChildren(Children_____ children) {
        this.children = children;
    }

    public String getDefectStatus() {
        return defectStatus;
    }

    public void setDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
    }

    public Defects getDefects() {
        return defects;
    }

    public void setDefects(Defects defects) {
        this.defects = defects;
    }

}

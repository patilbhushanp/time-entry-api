
package com.sanbhu.api.rally.iteration.detail.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sums {

    @SerializedName("PlanEstimate")
    @Expose
    private Double planEstimate;
    @SerializedName("TaskRemainingTotal")
    @Expose
    private Double taskRemainingTotal;
    @SerializedName("TaskEstimateTotal")
    @Expose
    private Double taskEstimateTotal;

    public Double getPlanEstimate() {
        return planEstimate;
    }

    public void setPlanEstimate(Double planEstimate) {
        this.planEstimate = planEstimate;
    }

    public Double getTaskRemainingTotal() {
        return taskRemainingTotal;
    }

    public void setTaskRemainingTotal(Double taskRemainingTotal) {
        this.taskRemainingTotal = taskRemainingTotal;
    }

    public Double getTaskEstimateTotal() {
        return taskEstimateTotal;
    }

    public void setTaskEstimateTotal(Double taskEstimateTotal) {
        this.taskEstimateTotal = taskEstimateTotal;
    }

}

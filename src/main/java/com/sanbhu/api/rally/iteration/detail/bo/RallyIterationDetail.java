
package com.sanbhu.api.rally.iteration.detail.bo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RallyIterationDetail {

    @SerializedName("_rallyAPIMajor")
    @Expose
    private String rallyAPIMajor;
    @SerializedName("_rallyAPIMinor")
    @Expose
    private String rallyAPIMinor;
    @SerializedName("Errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("Warnings")
    @Expose
    private List<String> warnings = null;
    @SerializedName("TotalResultCount")
    @Expose
    private Integer totalResultCount;
    @SerializedName("StartIndex")
    @Expose
    private Integer startIndex;
    @SerializedName("PageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("Results")
    @Expose
    private List<Result> results = null;
    @SerializedName("Sums")
    @Expose
    private Sums sums;

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

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    public Integer getTotalResultCount() {
        return totalResultCount;
    }

    public void setTotalResultCount(Integer totalResultCount) {
        this.totalResultCount = totalResultCount;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Sums getSums() {
        return sums;
    }

    public void setSums(Sums sums) {
        this.sums = sums;
    }

}

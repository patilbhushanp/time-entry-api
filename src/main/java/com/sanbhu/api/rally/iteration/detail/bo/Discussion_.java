
package com.sanbhu.api.rally.iteration.detail.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Discussion_ {

    @SerializedName("Count")
    @Expose
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}

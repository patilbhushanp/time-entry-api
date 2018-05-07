
package com.sanbhu.api.rally.iteration.detail.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Summary {

    @SerializedName("Discussion")
    @Expose
    private Discussion_ discussion;

    public Discussion_ getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion_ discussion) {
        this.discussion = discussion;
    }

}

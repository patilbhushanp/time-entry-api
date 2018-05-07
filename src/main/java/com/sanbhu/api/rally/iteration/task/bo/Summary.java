
package com.sanbhu.api.rally.iteration.task.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Summary {

    @SerializedName("Discussion")
    @Expose
    private Discussion__ discussion;

    public Discussion__ getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion__ discussion) {
        this.discussion = discussion;
    }

}

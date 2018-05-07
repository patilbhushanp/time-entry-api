
package com.sanbhu.api.clicktime.bo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TaskStoresHashData {

    @SerializedName("default")
    @Expose
    private List<List<String>> _default = null;
    @SerializedName("2gI7uJB7Uvzw")
    @Expose
    private List<List<String>> _2gI7uJB7Uvzw = null;

    public List<List<String>> getDefault() {
        return _default;
    }

    public void setDefault(List<List<String>> _default) {
        this._default = _default;
    }

    public List<List<String>> get2gI7uJB7Uvzw() {
        return _2gI7uJB7Uvzw;
    }

    public void set2gI7uJB7Uvzw(List<List<String>> _2gI7uJB7Uvzw) {
        this._2gI7uJB7Uvzw = _2gI7uJB7Uvzw;
    }

}

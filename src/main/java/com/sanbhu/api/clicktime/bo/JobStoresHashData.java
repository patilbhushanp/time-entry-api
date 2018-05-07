
package com.sanbhu.api.clicktime.bo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobStoresHashData {

    @SerializedName("default")
    @Expose
    private List<List<String>> _default = null;
    @SerializedName("2wrgkNE9hJ5k")
    @Expose
    private List<List<String>> _2wrgkNE9hJ5k = null;

    public List<List<String>> getDefault() {
        return _default;
    }

    public void setDefault(List<List<String>> _default) {
        this._default = _default;
    }

    public List<List<String>> get2wrgkNE9hJ5k() {
        return _2wrgkNE9hJ5k;
    }

    public void set2wrgkNE9hJ5k(List<List<String>> _2wrgkNE9hJ5k) {
        this._2wrgkNE9hJ5k = _2wrgkNE9hJ5k;
    }

}


package com.sanbhu.api.clicktime.bo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientStoresHashData {

    @SerializedName("default")
    @Expose
    private List<List<String>> _default = null;

    public List<List<String>> getDefault() {
        return _default;
    }

    public void setDefault(List<List<String>> _default) {
        this._default = _default;
    }

}

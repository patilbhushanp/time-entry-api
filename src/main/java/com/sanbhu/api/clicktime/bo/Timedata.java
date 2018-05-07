
package com.sanbhu.api.clicktime.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timedata {

    @SerializedName("REGULARTIME")
    @Expose
    private REGULARTIME rEGULARTIME;
    @SerializedName("TIMEOFF")
    @Expose
    private TIMEOFF tIMEOFF;

    public REGULARTIME getREGULARTIME() {
        return rEGULARTIME;
    }

    public void setREGULARTIME(REGULARTIME rEGULARTIME) {
        this.rEGULARTIME = rEGULARTIME;
    }

    public TIMEOFF getTIMEOFF() {
        return tIMEOFF;
    }

    public void setTIMEOFF(TIMEOFF tIMEOFF) {
        this.tIMEOFF = tIMEOFF;
    }

}

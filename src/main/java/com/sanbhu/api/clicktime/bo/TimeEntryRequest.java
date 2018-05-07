package com.sanbhu.api.clicktime.bo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeEntryRequest {

	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("method")
	@Expose
	private String method;
	@SerializedName("params")
	@Expose
	private RequestParams requestParams;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public RequestParams getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(RequestParams requestParams) {
		this.requestParams = requestParams;
	}
}

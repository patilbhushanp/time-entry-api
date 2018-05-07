package com.sanbhu.api.rally.service;

import java.util.List;

import com.sanbhu.api.rally.bo.RallyIterationDetailResult;
import com.sanbhu.api.rally.bo.RallyIterationResult;
import com.sanbhu.api.rally.bo.RallySubTaskDetailResult;

public interface RallyService {
	public static final String RALLY_URL = "https://rally1.rallydev.com";
	public static final String RALLY_API_KEY = "_CP9nuXXXXXXxTxLZXXXXXXXXJohCCCCCCCEU";

	List<RallyIterationResult> getAllIteration();

	RallyIterationDetailResult getAllTaskFromIteration(String iterationName, String projectRefernceURL,
			String startDate, String endDate);

	RallySubTaskDetailResult getAllSubTaskFromParentTask(String referenceURL);

	String createTask(String taskName, String projectReferenceURL, String ownerReferenceURL,
			String iterationReferenceURL);

	String createSubTask(String subTaskName, String projectRefernceURL, String workProductRefernceURL,
			String parentTaskRefernceURL, String ownerReferenceURL, Double estimated, Double todo);
}

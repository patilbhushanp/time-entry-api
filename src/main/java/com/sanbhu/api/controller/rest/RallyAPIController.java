package com.sanbhu.api.controller.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanbhu.api.controller.BaseRestController;
import com.sanbhu.api.rally.bo.RallyIterationDetailResult;
import com.sanbhu.api.rally.bo.RallyIterationResult;
import com.sanbhu.api.rally.bo.RallySubTaskDetailResult;
import com.sanbhu.api.rally.service.RallyService;

@RestController
public class RallyAPIController extends BaseRestController {

	@Autowired
	RallyService rallyService;

	@RequestMapping("/rally/iteration/list")
	public List<RallyIterationResult> getRallyIteration(final HttpServletRequest request) {
		final List<RallyIterationResult> rallyIterationResults = rallyService.getAllIteration();
		return rallyIterationResults;
	}

	// parameters - "PORI8", "/project/13550831421", "2018-04-15T18:30:00.000Z",
	// "2018-05-05T18:29:59.000Z"
	@RequestMapping("/rally/iteration/detail")
	public RallyIterationDetailResult getRallyIterationDetails(final HttpServletRequest request) {
		RallyIterationDetailResult rallyIterationDetailResult = null;
		final String iterationName = request.getParameter("iterationName");
		final String startDateTime = request.getParameter("startDateTime");
		final String endDateTime = request.getParameter("endDateTime");
		if (StringUtils.isNotBlank(iterationName) && StringUtils.isNotBlank(startDateTime)
				&& StringUtils.isNotBlank(endDateTime)) {
			rallyIterationDetailResult = rallyService.getAllTaskFromIteration(iterationName, "/project/13550831421",
					startDateTime, endDateTime);
		}
		return rallyIterationDetailResult;
	}

	// parameters - "/hierarchicalrequirement/213669583020"
	@RequestMapping("/rally/iteration/task")
	public RallySubTaskDetailResult getRallyTaskDetails(final HttpServletRequest request) {
		final String referenceURL = request.getParameter("referenceURL");
		RallySubTaskDetailResult rallySubTaskDetailResult = null;
		if (StringUtils.isNotBlank(referenceURL)) {
			rallySubTaskDetailResult = rallyService.getAllSubTaskFromParentTask(referenceURL);
		}
		return rallySubTaskDetailResult;
	}

	// parameters - "Auto Task Created 1", "/project/13550831421",
	// "/user/116359175628", "/iteration/214670110876"
	@RequestMapping("/rally/iteration/createTask")
	public String createRallyTask(final HttpServletRequest request) {
		final String taskName = request.getParameter("taskName");
		final String projectReferenceURL = request.getParameter("projectReferenceURL");
		final String ownerReferenceURL = request.getParameter("ownerReferenceURL");
		final String iterationReferenceURL = request.getParameter("iterationReferenceURL");
		String taskReferenceURL = "";
		if (StringUtils.isNotBlank(taskName) && StringUtils.isNotBlank(projectReferenceURL)
				&& StringUtils.isNotBlank(ownerReferenceURL) && StringUtils.isNotBlank(iterationReferenceURL)) {
			taskReferenceURL = rallyService.createTask(taskName, projectReferenceURL, ownerReferenceURL, iterationReferenceURL);
		}
		return taskReferenceURL;
	}

	// parameters - "Auto SubTask Created 1", "/project/13550831421",
	// "/hierarchicalrequirement/217357884236", "/detail/userstory_1/217357884236/tasks", "/user/116359175628",
	// 10D, 8D
	@RequestMapping("/rally/iteration/createSubTask")
	public String createRallySubTask(final HttpServletRequest request) {
		final String subTaskName = request.getParameter("subTaskName");
		final String projectRefernceURL = request.getParameter("projectRefernceURL");
		final String workProductRefernceURL = request.getParameter("workProductRefernceURL");
		final String parentTaskRefernceURL = request.getParameter("parentTaskRefernceURL");
		final String ownerReferenceURL = request.getParameter("ownerReferenceURL");
		final String estimatedStr = request.getParameter("estimated");
		Double estimated = 0d;
		try {
			estimated = Double.valueOf(estimatedStr);
		} catch (NumberFormatException exception) {
		}
		final String todoStr = request.getParameter("todo");
		Double todo = 0d;
		try {
			todo = Double.valueOf(todoStr);
		} catch (NumberFormatException exception) {
		}
		String subTaskReferenceURL = "";
		if (StringUtils.isNotBlank(subTaskName) && StringUtils.isNotBlank(parentTaskRefernceURL)
				&& StringUtils.isNotBlank(ownerReferenceURL)) {
			subTaskReferenceURL = rallyService.createSubTask(subTaskName, projectRefernceURL, workProductRefernceURL,
					parentTaskRefernceURL, ownerReferenceURL, estimated, todo);
		}
		return subTaskReferenceURL;
	}
}

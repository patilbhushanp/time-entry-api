package com.sanbhu.api.rally.service.impl;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.CreateRequest;
import com.rallydev.rest.request.GetRequest;
import com.rallydev.rest.response.CreateResponse;
import com.rallydev.rest.response.GetResponse;
import com.rallydev.rest.util.Ref;
import com.sanbhu.api.rally.bo.RallyIterationDetailResult;
import com.sanbhu.api.rally.bo.RallyIterationResult;
import com.sanbhu.api.rally.bo.RallySubTaskDetail;
import com.sanbhu.api.rally.bo.RallySubTaskDetailResult;
import com.sanbhu.api.rally.bo.RallySubTaskSummary;
import com.sanbhu.api.rally.bo.RallyTaskDetail;
import com.sanbhu.api.rally.iteration.bo.RallyIteration;
import com.sanbhu.api.rally.iteration.bo.Result;
import com.sanbhu.api.rally.iteration.detail.bo.RallyIterationDetail;
import com.sanbhu.api.rally.iteration.detail.bo.Tasks;
import com.sanbhu.api.rally.iteration.task.bo.RallyTask;
import com.sanbhu.api.rally.service.RallyService;

@Service("rallyService")
public class RallyServiceImpl implements RallyService {

	private final RallyRestApi rallyRestApi;

	private final Gson gson = new Gson();

	public RallyServiceImpl() throws Exception {
		rallyRestApi = new RallyRestApi(new URI(RALLY_URL), RALLY_API_KEY);
	}

	@Override
	public List<RallyIterationResult> getAllIteration() {
		final List<RallyIterationResult> rallyIterationResults = new ArrayList<RallyIterationResult>();
		try {
			GetRequest getRequest = new GetRequest("/iterationstatus");
			GetResponse getResponse = rallyRestApi.get(getRequest);
			String[] errors = getResponse.getErrors();
			for (String error : errors) {
				System.err.println("Error : " + error);
			}
			if (getResponse.wasSuccessful()) {
				JsonObject jsonObject = getResponse.getObject();
				final RallyIteration rallyIteration = gson.fromJson(jsonObject, RallyIteration.class);
				if (rallyIteration != null) {
					for (final Result result : rallyIteration.getResults()) {
						RallyIterationResult rallyIterationResult = new RallyIterationResult();
						rallyIterationResult.setStartDate(result.getStartDate());
						rallyIterationResult.setEndDate(result.getEndDate());
						rallyIterationResult.setIterationName(result.getRefObjectName());
						rallyIterationResult.setWebserviceURL(result.getIteration().getRef());
						rallyIterationResults.add(rallyIterationResult);
					}
				}
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return rallyIterationResults;
	}

	@Override
	public RallyIterationDetailResult getAllTaskFromIteration(String iterationName, String projectRefernceURL,
			String startDate, String endDate) {
		final RallyIterationDetailResult rallyIterationDetailResult = new RallyIterationDetailResult();
		try {
			GetRequest getRequest = new GetRequest("/artifact");
			setParameterForAllTaskFromIteration(getRequest, iterationName, projectRefernceURL, startDate, endDate);
			GetResponse getResponse = rallyRestApi.get(getRequest);
			String[] errors = getResponse.getErrors();
			for (String error : errors) {
				System.err.println("Error : " + error);
			}
			if (getResponse.wasSuccessful()) {
				rallyIterationDetailResult.setIterationName(iterationName);
				rallyIterationDetailResult.setIterationStartDate(startDate);
				rallyIterationDetailResult.setIterationEndDate(endDate);
				JsonObject jsonObject = getResponse.getObject();
				RallyIterationDetail rallyIterationDetail = gson.fromJson(jsonObject, RallyIterationDetail.class);
				List<com.sanbhu.api.rally.iteration.detail.bo.Result> resultList = rallyIterationDetail.getResults();
				for (com.sanbhu.api.rally.iteration.detail.bo.Result result : resultList) {
					RallyTaskDetail rallyTaskDetail = new RallyTaskDetail();
					rallyTaskDetail.setName(result.getName());
					rallyTaskDetail.setTaskEstimateTotal(result.getTaskEstimateTotal());
					rallyTaskDetail.setTaskRemainingTotal(result.getTaskRemainingTotal());
					rallyTaskDetail.setPlanEstimate(result.getPlanEstimate());
					rallyTaskDetail.setReferenceURL(result.getRef());
					rallyTaskDetail.setTaskStatus(result.getTaskStatus());
					rallyTaskDetail.setFormattedID(result.getFormattedID());

					Tasks tasks = result.getTasks();
					RallySubTaskSummary rallySubTaskSummary = new RallySubTaskSummary();
					rallySubTaskSummary.setSubTaskReferenceURL(tasks.getRef());
					rallySubTaskSummary.setSubTaskType(tasks.getType());
					rallyTaskDetail.setSubTaskSummary(rallySubTaskSummary);

					rallyIterationDetailResult.getRallyTaskDetails().add(rallyTaskDetail);
				}
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return rallyIterationDetailResult;
	}
	
	@Override
	public RallySubTaskDetailResult getAllSubTaskFromParentTask(String referenceURL) {
		final RallySubTaskDetailResult rallyIterationDetailResult = new RallySubTaskDetailResult();
		try {
			GetRequest getRequest = new GetRequest("/artifact");
			setParameterForSubTaskFromTaskDetail(getRequest, referenceURL);
			GetResponse getResponse = rallyRestApi.get(getRequest);
			if (getResponse != null) {
				String[] errors = getResponse.getErrors();
				for (String error : errors) {
					System.err.println("Error : " + error);
				}
			}
			if (getResponse.wasSuccessful()) {
				JsonObject jsonObject = getResponse.getObject();
				RallyTask rallyTask = gson.fromJson(jsonObject, RallyTask.class);
				if (rallyTask != null) {
					rallyIterationDetailResult.setPageSize(rallyTask.getPageSize());
					rallyIterationDetailResult.setStartIndex(1);
					rallyIterationDetailResult.setTotalResultCount(rallyTask.getTotalResultCount());
					List<com.sanbhu.api.rally.iteration.task.bo.Result> subTaskLIst = rallyTask.getResults();
					for (com.sanbhu.api.rally.iteration.task.bo.Result subTask : subTaskLIst) {
						RallySubTaskDetail rallySubTaskDetail = new RallySubTaskDetail();
						rallySubTaskDetail.setName(subTask.getName());
						rallySubTaskDetail.setFormattedID(subTask.getFormattedID());
						rallySubTaskDetail.setEstimate(subTask.getIteration().getPlanEstimate());
						rallyIterationDetailResult.getRallySubTaskDetails().add(rallySubTaskDetail);
					}
				}
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return rallyIterationDetailResult;
	}

	@Override
	public String createTask(String taskName, String projectReferenceURL, String ownerReferenceURL,
			String iterationReferenceURL) {
		String taskRef = "";
		try {
			JsonObject newTaskJsonObject = new JsonObject();
			newTaskJsonObject.addProperty("Name", taskName);
			newTaskJsonObject.addProperty("Project", projectReferenceURL);
			newTaskJsonObject.addProperty("Owner", ownerReferenceURL);
			newTaskJsonObject.addProperty("Iteration", iterationReferenceURL);
			CreateRequest createTaskRequest = new CreateRequest("hierarchicalrequirement", newTaskJsonObject);
			createTaskRequest.addParam("fetch", "false");
			createTaskRequest.addParam("rankTo", "BOTTOM");
			createTaskRequest.addParam("rankScope", iterationReferenceURL);
			createTaskRequest.addParam("includePermissions", "true");
			createTaskRequest.addParam("compact", "false");
			createTaskRequest.addParam("project", projectReferenceURL);
			CreateResponse createTaskResponse = rallyRestApi.create(createTaskRequest);
			if (createTaskResponse.wasSuccessful()) {
				System.out.println("Rally Task Created  : " + taskName);
				taskRef = Ref.getRelativeRef(createTaskResponse.getObject().get("_ref").getAsString());
			}

		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return taskRef;
	}

	@Override
	public String createSubTask(String subTaskName, String projectRefernceURL, String workProductRefernceURL,
			String parentTaskRefernceURL, String ownerReferenceURL, Double estimated, Double todo) {
		String subTaskReferenceURL = "";
		try {
			JsonObject newSubTaskJsonObject = new JsonObject();
			newSubTaskJsonObject.addProperty("Name", subTaskName);
			newSubTaskJsonObject.addProperty("Estimate", estimated);
			newSubTaskJsonObject.addProperty("Owner", ownerReferenceURL);
			newSubTaskJsonObject.addProperty("Project", projectRefernceURL);
			newSubTaskJsonObject.addProperty("WorkProduct", workProductRefernceURL);
			CreateRequest createSubTaskRequest = new CreateRequest("tasks", newSubTaskJsonObject);
			CreateResponse createTaskResponse = rallyRestApi.create(createSubTaskRequest);
			createSubTaskRequest.addParam("fetch", "true");
			createSubTaskRequest.addParam("includePermissions", "true");
			createSubTaskRequest.addParam("compact", "false");
			createSubTaskRequest.addParam("_slug", parentTaskRefernceURL);
			if (createTaskResponse.wasSuccessful()) {
				System.out.println("Rally Sub Task Created  : " + subTaskName);
				subTaskReferenceURL = Ref.getRelativeRef(createTaskResponse.getObject().get("_ref").getAsString());
			}

		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return subTaskReferenceURL;
	}

	private void setParameterForSubTaskFromTaskDetail(GetRequest getRequest, String referenceURL) {
		getRequest.addParam("types", "hierarchicalrequirement,defect,task,testcase");
		getRequest.addParam("pagesize", "20");
		getRequest.addParam("start", "1");
		getRequest.addParam("order", "TaskIndex ASC,DragAndDropRank ASC,ObjectID");
		getRequest.addParam("query", "(((Parent = \"" + referenceURL + "\") OR " + "(Requirement = \"/" + referenceURL
				+ "\")) OR " + "(WorkProduct = \"/" + referenceURL + "\"))");
		getRequest.addParam("fetch",
				"PlanEstimate,Release,Iteration,DisplayColor,Project,ObjectID,Name,Tags,DragAndDropRank,"
						+ "FormattedID,ScheduleState,Blocked,Ready,ScheduleStatePrefix,Tasks,TaskStatus,TaskEstimateTotal,Estimate,"
						+ "TaskRemainingTotal,ToDo,State,Owner,Defects,DefectStatus,Discussion:summary,LatestDiscussionAgeInMinutes,"
						+ "VersionId,TestCases,Children,TaskIndex,Parent,Requirement,DefectSuites,TestCase,WorkProduct,TestSets");
		getRequest.addParam("includePermissions", "true");
		getRequest.addParam("_slug", "/iterationstatus.js?fetch=true");
	}

	private void setParameterForAllTaskFromIteration(GetRequest getRequest, String iterationName,
			String projectRefernceURL, String iterationStartDate, String iterationEndDate) {
		getRequest.addParam("types", "hierarchicalrequirement,defect,defectsuite,testset");
		getRequest.addParam("pagesize", "20");
		getRequest.addParam("start", "1");
		getRequest.addParam("order", "FormattedID ASC,ObjectID");
		getRequest.addParam("query", "(((Iteration.Name = \"" + iterationName + "\") AND (Iteration.StartDate = \""
				+ iterationStartDate + "\")) AND (Iteration.EndDate = \"" + iterationEndDate + "\"))");
		getRequest.addParam("fetch", "PlanEstimate,Release,Iteration,DisplayColor,Project,ObjectID,Name,Tags,"
				+ "DragAndDropRank,FormattedID,ScheduleState,Blocked,Ready,ScheduleStatePrefix,Tasks,TaskStatus,"
				+ "TaskEstimateTotal,Estimate,TaskRemainingTotal,ToDo,State,Owner,Defects,DefectStatus,"
				+ "Discussion:summary,LatestDiscussionAgeInMinutes,VersionId,TestCases,Children,TaskIndex,Parent,"
				+ "Requirement,DefectSuites,TestCase,sum:[PlanEstimate,TaskEstimateTotal,TaskRemainingTotal]");
		getRequest.addParam("includePermissions", "");
		getRequest.addParam("project", projectRefernceURL);
	}

}

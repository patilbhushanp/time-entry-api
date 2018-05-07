	<jsp:include page="../header/header.jsp" />
	<jsp:include page="../navigator/navigator.jsp" />
		<div class="wrapper wrapper-content">
			<div id="loadingDiv" class="loader"></div>
			<div class="row">
				<div class="col-lg-12 ibox-content" id="ibox-content">
					<div class="col-lg-1 pull-left">
						<h4 class="title">Username</h4>
					</div>
					<div class="col-lg-2 pull-left">
						<input name="username" id="username" type="text" class="form-control" placeholder="Enter username" />
					</div>
					<div class="col-lg-1 pull-left">
						<h4 class="title">Password</h4>
					</div>
					<div class="col-lg-2 pull-left">
						<input name="password" id="password" type="password" class="form-control" placeholder="Enter password" value="Xpanxion2013" />
					</div>
					<div class="col-lg-2 pull-left">
						<h4 class="title">Click-time Rest URL</h4>
					</div>
					<div class="col-lg-4 pull-left">
						<select class="form-control" id="clickTimeRestUrl" name="clickTimeRestUrl" >
							<option value="#">##########Select URL##########</option>
							<option value="/clicktime/createSession">Create User Session</option>
						    <option value="/clicktime/companyDetail">Company Details</option>
						    <option value="/clicktime/clientProjects">Client Project</option>
						    <option value="/clicktime/taskList">Tasks</option>
						    <option value="/clicktime/report/weekly">Weekly Time Entry Report</option>
						    <option value="/clicktime/report/monthly">Monthly Time Entry Report</option>
						    <option value="/clicktime/destroySession">Destroy Session</option>
						  </select>
						<br/>
					</div>	
					<div class="col-lg-6 pull-left">
						<h4 class="title">Header Parameters</h4>
					</div>
					<div class="col-lg-6 pull-left">
						<h4 class="title">Request</h4>
					</div>
					<div class="col-lg-6 pull-left">
						<textarea class="form-control" rows="7" id="headerParameters" name="headerParameters" >
accept-encoding: gzip, deflate;
accept-language: en-US,en, q=0.8;
user-agent: Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36;
accept: application/json;
						</textarea><br/>
						<button type="button" class="btn btn-success" id="executeButton" name="executeButton" >Execute</button>
					</div>
					<div class="col-lg-6 pull-left">
						<textarea class="form-control" rows="7" id="request" name="request" ></textarea><br/>
					</div>
					<div class="col-lg-12 pull-right">
						<h4 class="title">Response</h4>
					</div>
					<div class="col-lg-12 pull-left">
						<textarea class="form-control" rows="10" id="response" name="response" ></textarea><br/>
					</div>
				</div>
			</div>				
		</div>
<jsp:include page="../include_js/include_js.jsp" />
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
<script src="/js/restCall/restCallEditor.js"></script>
<jsp:include page="../footer/footer.jsp" />
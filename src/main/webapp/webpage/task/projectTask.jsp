<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>任务管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="projectTaskForm" class="form-horizontal form-bordered" action="/projectTask/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">所属模块:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="projectName" 
	          	value="${projectTask.projectName}"  maxlength="20"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">任务名称:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="name" 
	          	value="${projectTask.name}"  maxlength="50"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">预计开始时间:</label>
        <div class="col-md-4">
        	<%-- <div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="startTime" 
	          	value="${projectTask.startTime}"  maxlength=""/>
	        </div> --%>
	        
	        
	        <div class="input-icon right">
	        	<i class="fa"></i>
	        	<div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
							<input type="text" class="form-control" name="startTime" readonly required
								value="<fmt:formatDate 	value="${projectTask.startTime}"  pattern="yyyy-MM-dd"/>"  maxlength="11"/>
							<span class="input-group-btn">
							<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
	        </div>
	        
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">预计结束时间:</label>
        <div class="col-md-4">
        	<%-- <div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="endTime" 
	          	value="${projectTask.endTime}"  maxlength=""/>
	        </div> --%>
	        
	         <div class="input-icon right">
	        	<i class="fa"></i>
	        	<div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
							<input type="text" class="form-control" name="endTime" readonly required
								value="<fmt:formatDate value="${projectTask.endTime}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
							<span class="input-group-btn">
							<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
	        </div>
	        
	        
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">实际开始时间:</label>
        <div class="col-md-4">
        	<%-- <div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="factStartTime" 
	          	value="${projectTask.factStartTime}"  maxlength=""/>
	        </div> --%>
	        <div class="input-icon right">
	        	<i class="fa"></i>
	        	<div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
							<input type="text" class="form-control" name="factStartTime" readonly required
								value="<fmt:formatDate value="${projectTask.factStartTime}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
							<span class="input-group-btn">
							<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
	        </div>
        </div>
      </div>
          <!--  -->
        <div class="form-group">
        <label class="col-md-3 control-label">实际结束时间:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	        	<div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
							<input type="text" class="form-control" name="factEndTime" readonly required
								value="<fmt:formatDate value="${projectTask.factEndTime}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
							<span class="input-group-btn">
							<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
	        </div>
        </div>
      </div>
      <!--  -->
  		<%-- <div class="form-group">
        <label class="col-md-3 control-label">实际结束时间:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="factEndTime" 
	          	value="${projectTask.factEndTime}"  maxlength=""/>
	        </div>
        </div>
      </div> --%>
  		<div class="form-group">
        <label class="col-md-3 control-label">负责人名称:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="presideName" 
	          	value="${projectTask.presideName}"  maxlength="20"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">负责人id:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="presideUserId" 
	          	value="${projectTask.presideUserId}"  maxlength="10"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">任务描述:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="remark" 
	          	value="${projectTask.remark}"  maxlength="255"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">任务完成状态:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="status" 
	          	value="${projectTask.status}"  maxlength="5"/>
	        </div>
        </div>
      </div>
      <div class="form-actions">
        <div class="col-md-9 col-md-offset-3">
          <button type="button" class="btn btn-primary" onclick="save(this)">
          	<spring:message code="btn.save"></spring:message>
          </button>
          <button type="reset" class="btn btn-default" onclick="cancel()">
          	<spring:message code="btn.return"></spring:message>
          </button>
        </div>
      </div>
      <input type="hidden" name="id" value="${projectTask.id}">
  	</form>
  </div>
</div>
<script type="text/javascript">
	$(function(){
		$('#projectTaskForm').validate();
		//init datepicker
		$('.date-picker').datepicker({
			language: 'zh-CN',
		 	autoclose: true,
			todayHighlight: true
		});
	});
</script>
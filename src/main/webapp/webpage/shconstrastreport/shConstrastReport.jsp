<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>势航表数据对比报告
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="shConstrastReportForm" class="form-horizontal form-bordered" action="/shConstrastReport/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">子平台id:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="platformId" 
	          	value="${shConstrastReport.platformId}"  maxlength="10"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">对比类型:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="consrastType" 
	          	value="${shConstrastReport.consrastType}"  maxlength="5"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">对比开始时间:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="startTime" 
	          	value="${shConstrastReport.startTime}"  maxlength=""/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">对比结束时间:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="endTime" 
	          	value="${shConstrastReport.endTime}"  maxlength=""/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">对比状态:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="status" 
	          	value="${shConstrastReport.status}"  maxlength="5"/>
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
      <input type="hidden" name="id" value="${shConstrastReport.id}">
  	</form>
  </div>
</div>
<script type="text/javascript">
	$(function(){
		$('#shConstrastReportForm').validate();
	});
</script>
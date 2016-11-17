<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>车辆对比结果管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="carConsrastResultForm" class="form-horizontal form-bordered" action="/carConsrastResult/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">结果类型:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="resultType" 
	          	value="${carConsrastResult.resultType}"  maxlength="5"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">结果说明:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="resultRemark" 
	          	value="${carConsrastResult.resultRemark}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">车牌号:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="plateCode" 
	          	value="${carConsrastResult.plateCode}"  maxlength="20"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">车身颜色:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="plateColor" 
	          	value="${carConsrastResult.plateColor}"  maxlength="5"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">处理状态:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="status" 
	          	value="${carConsrastResult.status}"  maxlength="5"/>
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
      <input type="hidden" name="id" value="${carConsrastResult.id}">
  	</form>
  </div>
</div>
<script type="text/javascript">
	$(function(){
		$('#carConsrastResultForm').validate();
	});
</script>
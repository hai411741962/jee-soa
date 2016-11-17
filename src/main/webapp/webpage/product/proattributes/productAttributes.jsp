<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>产品属性名管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="productAttributesForm" class="form-horizontal form-bordered" action="/productAttributes/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">属性名:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="title" 
	          	value="${productAttributes.title}"  maxlength="10"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">是否影响价格:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="isPay" 
	          	value="${productAttributes.isPay}"  maxlength="5"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">类型id:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="proTypeId" 
	          	value="${productAttributes.proTypeId}"  maxlength="10"/>
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
      <input type="hidden" name="id" value="${productAttributes.id}">
  	</form>
  </div>
</div>
<script type="text/javascript">
	$(function(){
		$('#productAttributesForm').validate();
	});
</script>
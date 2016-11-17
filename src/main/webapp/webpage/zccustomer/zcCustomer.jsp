<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>客户管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="zcCustomerForm" class="form-horizontal form-bordered" action="/zcCustomer/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">客户名称:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="name" 
	          	value="${zcCustomer.name}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">联系方式:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="mobile" 
	          	value="${zcCustomer.mobile}"  maxlength="20"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">送货地址:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="address" 
	          	value="${zcCustomer.address}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">客户类型:</label>
        <div class="col-md-4">
        	<%-- <div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="type" 
	          	value="${zcCustomer.type}"  maxlength="5"/>
	        </div> --%>
	        
	        <div class="input-icon right">
	        <i class="fa"></i>
	        	<select class="form-control" name="type" required>
							<option value="">--请选择--</option>
							<option value="1"
								<c:if test="${zcCustomer.type eq '1'}">selected</c:if>
							>学校</option>
							<option value="2"
								<c:if test="${zcCustomer.type eq '2'}">selected</c:if>
							>公司</option>
					
				</select>
			</div>
	        
	        
	        
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">客户编码:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="code" 
	          	value="${zcCustomer.code}"  maxlength="20"/>
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
      <input type="hidden" name="id" value="${zcCustomer.id}">
  	</form>
  </div>
</div>
<script type="text/javascript">
	$(function(){
		$('#zcCustomerForm').validate();
	});
</script>
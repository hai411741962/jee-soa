<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="col-md-12">
	<div class="panel-search">
	  <form class="form-inline" action="/zcCustomer/list">
	    <div class="form-group">
	      <label class="control-label">客户名称：</label>
	      <input type="text" class="form-control" name="name">
	    </div>
	    <div class="form-group">
	      <label class="control-label">联系方式：</label>
	      <input type="text" class="form-control" name="mobile">
	    </div>
	    <div class="form-group">
	      <label class="control-label">送货地址：</label>
	      <input type="text" class="form-control" name="address">
	    </div>
	    <div class="form-group">
	      <label class="control-label">客户类型：</label>
	      <input type="text" class="form-control" name="type">
	    </div>
	    <div class="form-group">
	      <label class="control-label">客户编码：</label>
	      <input type="text" class="form-control" name="code">
	    </div>
	  </form>
	  <div class="btn-div">
			<div class="div-left">
				<button type="button" class="btn btn-warning" onclick="add('/zcCustomer/zcCustomer')">
					<i class="fa fa-plus"></i> <spring:message code="btn.add"></spring:message>
				</button>
			</div>
			<div class="div-right">
				<button type="button" class="btn btn-primary" onclick="search()">
					<i class="fa fa-search"></i> <spring:message code="btn.search"></spring:message>
				</button>
		    <button type="button" class="btn btn-default" onclick="reset()">
		    	<i class="fa fa-repeat"></i> <spring:message code="btn.reset"></spring:message>	
		    </button>
			</div>
		</div>
	</div>
	<div class="panel-content"></div>
</div>
<script type="text/javascript">
	$(function(){
		search();
	});
</script>
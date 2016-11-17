<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="col-md-12">
	<div class="panel-search">
	  <form class="form-inline" action="/projectTask/list" id="/projectTask/exportExcel">
	    <div class="form-group">
	      <label class="control-label">任务名称：</label>
	      <input type="text" class="form-control" name="name">
	    </div>
	    <div class="form-group">
	      <label class="control-label">开始时间：</label>
	      <input type="text" class="form-control" name="startTime">
	    </div>
	    <div class="form-group">
	      <label class="control-label">结束时间：</label>
	      <input type="text" class="form-control" name="endTime">
	    </div>
	    <div class="form-group">
	      <label class="control-label">负责人名称：</label>
	      <input type="text" class="form-control" name=" presideName">
	    </div>
	    <div class="form-group">
	      <label class="control-label">负责人id：</label>
	      <input type="text" class="form-control" name="presideUserId">
	    </div>
	    <div class="form-group">
	      <label class="control-label">任务完成状态：</label>
	      <input type="text" class="form-control" name="status">
	    </div>
	  </form>
	  <div class="btn-div">
			<div class="div-left">
				<button type="button" class="btn btn-warning" onclick="add('/projectTask/projectTask')">
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
		    
		     <button type="button" class="btn btn-default" onclick="excel()">
		    	<i class="fa fa-file-excel-o"></i> <spring:message code="btn.excel"></spring:message>	
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
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="col-md-12">
	<div class="panel-search">
	  <form class="form-inline" action="/shConstrastReport/list">
	    <div class="form-group">
	      <label class="control-label">id：</label>
	      <input type="text" class="form-control" name="id">
	    </div>
	    <div class="form-group">
	      <label class="control-label">子平台id：</label>
	      <input type="text" class="form-control" name="platformId">
	    </div>
	    <div class="form-group">
	      <label class="control-label">对比类型：</label>
	      <input type="text" class="form-control" name="consrastType">
	    </div>
	    <div class="form-group">
	      <label class="control-label">对比开始时间：</label>
	      <input type="text" class="form-control" name="startTime">
	    </div>
	    <div class="form-group">
	      <label class="control-label">对比结束时间：</label>
	      <input type="text" class="form-control" name="endTime">
	    </div>
	    <div class="form-group">
	      <label class="control-label">对比状态：</label>
	      <input type="text" class="form-control" name="status">
	    </div>
	  </form>
	  <div class="btn-div">
			<div class="div-left">
				<button type="button" class="btn btn-warning" onclick="add('/shConstrastReport/shConstrastReport')">
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
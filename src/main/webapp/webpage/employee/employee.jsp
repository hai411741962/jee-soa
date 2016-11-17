<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>员工管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="employeeForm" class="form-horizontal form-bordered" action="/employee/save" method="post">
  		<div class="form-group">
        <label class="col-md-3 control-label">addressid:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="addressid" 
	          	value="${employee.addressid}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">deptid:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="deptid" 
	          	value="${employee.deptid}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">compid:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="compid" 
	          	value="${employee.compid}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">compname:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="所属公司" 
	          	value="${employee.所属公司}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">name:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="姓名" 
	          	value="${employee.姓名}"  maxlength="200"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">age:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="年龄" 
	          	value="${employee.年龄}"  maxlength="10"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">sex:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="性别" 
	          	value="${employee.性别}"  maxlength="10"/>
	        </div>
        </div>
      </div>
  		
  		<div class="form-group">
        <label class="col-md-3 control-label">department:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="所属部门" 
	          	value="${employee.所属部门}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		
  		<div class="form-group">
        <label class="col-md-3 control-label">moble:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="moble" 
	          	value="${employee.moble}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">phone:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="手机号" 
	          	value="${employee.手机号}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">address:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="地址" 
	          	value="${employee.地址}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">idcard:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="idcard" 
	          	value="${employee.idcard}"  maxlength="100"/>
	        </div>
        </div>
      </div>
  		
  		<div class="form-group">
        <label class="col-md-3 control-label">头像:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="头像" 
	          	value="${employee.头像}"  maxlength="100"/>
	        </div>
        </div>
      </div>
      <!--  -->
        <div class="form-group">
        <label class="col-md-3 control-label">出生日期:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	        	<div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
							<input type="text" class="form-control" name="employdate" readonly required
								value="<fmt:formatDate value="${employee.employdate}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
							<span class="input-group-btn">
							<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
	        </div>
        </div>
      </div>
      <!--  -->
  		<%-- <div class="form-group">
        <label class="col-md-3 control-label">员工生日</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="employdate" 
	          	value="${employee.employdate}"  maxlength=""/>
	        </div>
        </div>
      </div>
  		 --%>
  		<div class="form-group">
        <label class="col-md-3 control-label">email:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="email" 
	          	value="${employee.email}"  maxlength="200"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">qq:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="qq" 
	          	value="${employee.qq}"  maxlength="200"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">wechat:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="微信" 
	          	value="${employee.微信}"  maxlength="200"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">weibo:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="微博" 
	          	value="${employee.微博}"  maxlength="200"/>
	        </div>
        </div>
      </div>
  		
  		<div class="form-group">
        <label class="col-md-3 control-label">类型</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="类型" 
	          	value="${employee.类型}"  maxlength="10"/>
	        </div>
        </div>
      </div>
  		
  	
  		
  		<div class="form-group">
        <label class="col-md-3 control-label">排序</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="排序" 
	          	value="${employee.排序}"  maxlength="10"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">status:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="状态" 
	          	value="${employee.状态}"  maxlength="10"/>
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
      <input type="hidden" name="id" value="${employee.id}">
  	</form>
  </div>
</div>
<script type="text/javascript">
	$(function(){
		$('#employeeForm').validate();
		
		
		
		//init datepicker
		$('.date-picker').datepicker({
			language: 'zh-CN',
		 	autoclose: true,
			todayHighlight: true
		});
		
		
		
	});
</script>
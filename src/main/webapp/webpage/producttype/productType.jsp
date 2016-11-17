<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>产品类型管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="productTypeForm" class="form-horizontal form-bordered" action="/productType/save" method="post">
  	<%-- 	<div class="form-group">
        <label class="col-md-3 control-label">公司id:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="companyId" 
	          	value="${productType.companyId}"  maxlength="10"/>
	        </div>
        </div>
      </div> --%>
      
      <!--  -->
       <div class="form-group">
        <label class="col-md-3 control-label">所属公司:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="hidden" id="companyId" name="companyId" value="${productType.companyId}"/>
	          <input type="text" class="form-control" id="orgName" name="orgName" required onclick="showOrg()"
	          	required readonly value="${user.orgName}"> 
	        </div>
        </div>
      </div>
      <!--  -->
      
      
      
  	<%-- 	<div class="form-group">
        <label class="col-md-3 control-label">上级id:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="parentId" 
	          	value="${productType.parentId}"  maxlength="10"/>
	        </div>
        </div>
      </div> --%>
      <!--  -->
     <div class="form-group">
        <label class="col-md-3 control-label">上级类型:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	        	<input type="hidden" id="parentId" name="parentId" value="${productType.parentId}"/>
	          <input type="text" class="form-control" id="parentName" name="parentName" onclick="showMenu()" readonly
	          	value="${productType.parentMenu.protypeName}" maxlength="200"/>
        	</div>
        </div>
        <div class="col-md-2">
        	<button type="button" class="btn btn-default" onclick="clearParentMenu()">清空</button>
        </div>
      </div>
      <!--  -->
      
  		<div class="form-group">
        <label class="col-md-3 control-label">类型名称:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="protypeName" 
	          	value="${productType.protypeName}"  maxlength="10"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">图标:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="protypeIcon" 
	          	value="${productType.protypeIcon}"  maxlength="255"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">排序:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="sort" 
	          	value="${productType.sort}"  maxlength="10"/>
	        </div>
        </div>
      </div>
<%--   		<div class="form-group">
        <label class="col-md-3 control-label">删除状态:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="delStatus" 
	          	value="${productType.delStatus}"  maxlength="5"/>
	        </div>
        </div>
      </div> --%>
  		<%-- <div class="form-group">
        <label class="col-md-3 control-label">创建时间:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="createData" 
	          	value="${productType.createData}"  maxlength=""/>
	        </div>
        </div>
      </div> --%>
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
      <input type="hidden" name="createData" value="${productType.createData}" />
      <input type="hidden" name="id" value="${productType.id}">
      <input type="hidden"  name="delStatus" value="${productType.delStatus}" />
  	</form>
  </div>
</div>
<div class="modal fade" id="orgModal" tabindex="-1" role="basic" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title">所属公司</h4>
			</div>
			<div class="modal-body">
				 <ul id="orgTree" class="ztree" style="margin-top:0; width:160px;"></ul>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn blue" onclick="saveParentOrg()">确定</button>
				<button type="button" class="btn default" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

<div class="modal fade" id="menuModal" tabindex="-1" role="basic" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title">选择上级菜单</h4>
			</div>
			<div class="modal-body">
				 <ul id="menuTree" class="ztree" style="margin-top:0; width:160px;"></ul>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn blue" onclick="saveParentMenu()">确定</button>
				<button type="button" class="btn default" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function(){
		$('#productTypeForm').validate();
		$('#productTypeForm').validate({
			rules: {
				sort: {
					number: true
				}
			}
		});
	});
	var setting = {
			view: {
				selectedMulti: false
			},
			data: {
				simpleData: {
					enable: true
				}
			}
		};
	// 显示弹窗
	function showOrg(){
		// 加载组织的树状结构
		$.ajax({
			type: 'post',
			url: '<c:url value="/org/getOrgForTree"></c:url>',
			dataType: 'json',
			success: function(data){
				$.fn.zTree.init($("#orgTree"), setting, data);
			}
		});
		$('#orgModal').modal('show');
	}
	// 保存组织
	function saveParentOrg(){
		var nodes = $.fn.zTree.getZTreeObj("orgTree").getSelectedNodes();
		$('#companyId').val(nodes[0].id);
		$('#orgName').val(nodes[0].name);
		// 隐藏弹窗
		$('#orgModal').modal('hide');
	}

	
		// 保存上级菜单
		function saveParentMenu(){
			var nodes = $.fn.zTree.getZTreeObj("menuTree").getSelectedNodes();
			if(nodes[0].id != $('#id').val()){
				$('#parentId').val(nodes[0].id);
				$('#parentName').val(nodes[0].name);
				// 隐藏弹窗
				$('#menuModal').modal('hide');
			}
			else{
				alert('不能选择当前菜单');
			}
		}
		// 清空上级菜单
		function clearParentMenu(){
			$('#parentId').val('');
			$('#parentName').val('');
		}
		// 显示弹窗
		function showMenu(){
			// 加载菜单的树状结构
			$.ajax({
				type: 'post',
				url: '<c:url value="/productType/getProTypeForTree"></c:url>',
				data: {currentId:$('#id').val()},
				dataType: 'json',
				success: function(data){
					$.fn.zTree.init($("#menuTree"), setting, data);
				}
			});
			$('#menuModal').modal('show');
		}
	
	
	
	
	
</script>
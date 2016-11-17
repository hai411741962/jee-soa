<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>属性名管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="proAttrnameForm" class="form-horizontal form-bordered" action="/proAttrname/save" method="post">
  		
  		<div class="form-group">
        <label class="col-md-3 control-label">选择产品类型:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	        	<input type="hidden" id="protypeId" name="protypeId" value="${productType.parentId}"/>
	          <input type="text" class="form-control" id="parentName" name="parentName" onclick="showMenu()" readonly
	          	value="${proAttrname.protypeName}" maxlength="200"/>
        	</div>
        </div>

      </div>
 <%--  	<div class="form-group">
        <label class="col-md-3 control-label">选择产品类型:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="protypeId" 
	          	value="${productType.protypeName}"  maxlength="10"/>
	        </div>
        </div>
      </div> --%>
  		
  		<div class="form-group">
        <label class="col-md-3 control-label">属性名称:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="title" 
	          	value="${proAttrname.title}"  maxlength="10"/>
	        </div>
        </div>
      </div>
      <!--  -->
  <%-- 		<div class="form-group">
        <label class="col-md-3 control-label">类型id:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="protypeId" 
	          	value="${proAttrname.protypeId}"  maxlength="10"/>
	        </div>
        </div>
      </div> --%>
      <!--  -->
 
      <!--  -->
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
      <input type="hidden" name="id" value="${proAttrname.id}">
  	</form>
  </div>
</div>
<!-- 弹出框 -->
	<div class="modal fade" id="menuModal" tabindex="-1" role="basic" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">选择产品类型</h4>
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
<!--  -->
<script type="text/javascript">
	$(function(){
		$('#proAttrnameForm').validate();
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
	// 保存上级菜单
	function saveParentMenu(){
		var nodes = $.fn.zTree.getZTreeObj("menuTree").getSelectedNodes();
		if(nodes[0].id != $('#id').val()){
			$('#protypeId').val(nodes[0].id);
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
		$('#protypeId').val('');
		$('#parentName').val('');
	}
	
	
	
</script>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>产品管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="productForm" class="form-horizontal form-bordered" action="/product/save" method="post">
  		
  	<div class="form-group">
        <label class="col-md-3 control-label">选择产品类型:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	        	<input type="hidden" id="typeId" name="typeId" value="${productType.parentId}"/>
	          <input type="text" class="form-control" id="parentName" name="parentName" onclick="showMenu()" readonly
	          	value="${product.protypeName}" maxlength="200"/>
        	</div>
        </div>

      </div>
  		
  		

  <%-- 		<div class="form-group">
        <label class="col-md-3 control-label">公司id:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="companyId" 
	          	value="${product.companyId}"  maxlength="10"/>
	        </div>
        </div>
      </div> --%>
  		<div class="form-group">
        <label class="col-md-3 control-label">产品名称:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="title" 
	          	value="${product.title}"  maxlength="60"/>
	        </div>
        </div>
      </div>
<%--   		<div class="form-group">
        <label class="col-md-3 control-label">创建时间:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="createDate" 
	          	value="${product.createDate}"  maxlength=""/>
	        </div>
        </div>
      </div> --%>
  		<div class="form-group">
        <label class="col-md-3 control-label">产品logo:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="productLogo" 
	          	value="${product.productLogo}"  maxlength="255"/>
	        </div>
        </div>
      </div>
  		<%-- <div class="form-group">
        <label class="col-md-3 control-label">删除状态:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="delFlag" 
	          	value="${product.delFlag}"  maxlength="2"/>
	        </div>
        </div>
      </div> --%>
  		<div class="form-group">
        <label class="col-md-3 control-label">产品描述:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="remark" 
	          	value="${product.remark}"  maxlength="65,535"/>
	        </div>
        </div>
      </div>
  		<div class="form-group">
        <label class="col-md-3 control-label">排序:</label>
        <div class="col-md-4">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="sort" 
	          	value="${product.sort}"  maxlength="10"/>
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
      <input type="hidden" name="id" value="${product.id}">
      <input type="hidden"  name="companyId" value="${product.companyId}" />
      <input type="hidden" name="createDate" value="${product.createDate}" />
        <input type="hidden"  name="delFlag" value="${product.delFlag}"  maxlength="2"/>
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
<script type="text/javascript">
	$(function(){
		$('#productForm').validate();
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
			$('#typeId').val(nodes[0].id);
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
		$('#typeId').val('');
		$('#parentName').val('');
	}
	
	
	
	
	
	
</script>
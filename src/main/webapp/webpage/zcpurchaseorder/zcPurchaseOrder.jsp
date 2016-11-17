<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<style>

.modal-dialog {
    width: auto;
    margin: 30px auto;
    height:auto;
}
</style>
<link href="${webRoot}/static/custom/style.css" rel="stylesheet" type="text/css"/>
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-gift"></i>采购单管理
		</div>
  </div>
  <div class="portlet-body form">
  	<form id="zcPurchaseOrderForm" class="form-horizontal form-bordered" action="/zcPurchaseOrder/save" method="post">
  		<div class="form-group">
	        <label class="col-md-2 control-label">订单编号:</label>
	        <div class="col-md-3">
	        	<div class="input-icon right">
		        	<i class="fa"></i>
		          <input type="text" class="form-control" name="code" 
		          	value="${zcPurchaseOrder.code}"  maxlength="20"/>
		        </div>
	        </div>
	        
	        
<%-- 	        <label class="col-md-2 control-label">日期:</label>
	        <div class="col-md-3">
	        	<div class="input-icon right">
		        	<i class="fa"></i>
		          <input type="text" class="form-control" name="startTime" 
		          	value="${zcPurchaseOrder.startTime}"  maxlength=""/>
		        </div>
	        </div> --%>
	        
	           
		        <label class="col-md-2 control-label">日期:</label>
		        <div class="col-md-3">
		        	<div class="input-icon right">
			        	<i class="fa"></i>
			        	<div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
									<input type="text" class="form-control" name="startTime" readonly required
										value="<fmt:formatDate value="${zcPurchaseOrder.startTime}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
									<span class="input-group-btn">
									<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
									</span>
						</div>
			        </div>
		        </div>
     
	        
	        
      </div>
  		
  		<div class="form-group">
  		
  		<label class="col-md-2 control-label">供货单位:</label>
  		   <div class="col-md-3">
  		  <div class="input-icon right">
  				
  				<i class="fa"></i>
	        	<select class="form-control" name="supplierId" required>
							<option value="">--请选择--</option>
							<option value="1"
								<c:if test="${zcPurchaseOrder.supplierId eq '1'}">selected</c:if>
							>学校</option>
							<option value="2"
								<c:if test="${zcPurchaseOrder.supplierId eq '2'}">selected</c:if>
							>公司</option>
					
				</select>	
  		  </div>
  		  </div>
      
        <!--  -->
             <label class="col-md-2 control-label">到期日:</label>
		        <div class="col-md-3">
		        	<div class="input-icon right">
			        	<i class="fa"></i>
			        	<div class="input-group date date-picker" data-date-format="yyyy-mm-dd">
									<input type="text" class="form-control" name="endTime" readonly required
										value="<fmt:formatDate value="${zcPurchaseOrder.endTime}" pattern="yyyy-MM-dd"/>"  maxlength="11"/>
									<span class="input-group-btn">
									<button class="btn default" type="button"><i class="fa fa-calendar"></i></button>
									</span>
						</div>
			        </div>
		        </div>
        <!--  -->
      </div>
  		<div class="form-group">
	        <label class="col-md-2 control-label">到货地址:</label>
	        <div class="col-md-2">
	        	<div class="input-icon right">
		        	<i class="fa"></i>
		          <input type="text" class="form-control" name="address" 
		          	value="${zcPurchaseOrder.address}"  maxlength="100"/>
		        </div>
	        </div>
	      
	        <label class="col-md-2 control-label">定金:</label>
	        <div class="col-md-2">
	        	<div class="input-icon right">
		        	<i class="fa"></i>
		          <input type="text" class="form-control" name="dmoney" 
		          	value="${zcPurchaseOrder.dmoney}"  maxlength="10"/>
		        </div>
	        </div>
	      
	        <label class="col-md-2 control-label">税率:</label>
	        <div class="col-md-2">
	        	<div class="input-icon right">
		        	<i class="fa"></i>
		          <input type="text" class="form-control" name="shuilv" 
		          	value="${zcPurchaseOrder.shuilv}"  maxlength="5"/>
		        </div>
	        </div>
      </div>
      
      
        <!--  -->
  <div class="table-scrollable">
	<table class="table table-striped table-hover table-success" border="1">
		<thead>
			<tr>
				<th>#</th>
				<th>存货编码</th>
				<th>存货名称</th>
				<th>商品规格</th>
				<th>商品价</th>
				<th>优惠价</th>
				
			</tr>
		</thead>
		<tbody >
			
			<tr>
				<td id="addproduct"></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				
			</tr>
			
		</tbody>
	</table>
</div>
  <!--  --> 	
      
      
      
  		<div class="form-group">
        <label class="col-md-2 control-label">制单人:</label>
        <div class="col-md-2">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="zhidanren" 
	          	value="${zcPurchaseOrder.zhidanren}"  maxlength="10"/>
	        </div>
        </div>
     
        <label class="col-md-2 control-label">审核人:</label>
        <div class="col-md-2">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="shenheren" 
	          	value="${zcPurchaseOrder.shenheren}"  maxlength="10"/>
	        </div>
        </div>
     
        <label class="col-md-2 control-label">状态:</label>
        <div class="col-md-2">
        	<div class="input-icon right">
	        	<i class="fa"></i>
	          <input type="text" class="form-control" name="state" 
	          	value="${zcPurchaseOrder.state}"  maxlength="5"/>
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
      <input type="hidden" name="id" value="${zcPurchaseOrder.id}">
  	</form>
  </div>
  

</div>

<!--change product start  -->

<div class="modal fade" id="menuModal" tabindex="-1" role="basic" aria-hidden="true">
	<div class="modal-dialog">
			<!-- <div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
			</div> -->
			<!-- <div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title">选择产品</h4>
			</div>
			<div class="modal-body">
				 <ul id="menuTree" class="ztree" style="margin-top:0; width:120px;"></ul>
			</div>
			
			
			
			
			
			<div class="modal-footer">
				<button type="button" class="btn blue" onclick="saveParentMenu()">确定</button>
				<button type="button" class="btn default" data-dismiss="modal">关闭</button>
			</div> -->
			
			
			<!-- new -->
			<div class=" page-content clearfix">
 <div id="products_style">
    <div class="search_style">
      <div class="title_names">搜索查询</div>
      <ul class="search_content clearfix">
       <li><label class="l_f">产品名称</label><input name="" type="text"  class="text_add" placeholder="输入品牌名称"  style=" width:250px"/></li>
       <li><label class="l_f">添加时间</label><input class="inline laydate-icon" id="start" style=" margin-left:10px;"></li>
       <li style="width:90px;"><button type="button" class="btn_search"><i class="icon-search"></i>查询</button></li>
      </ul>
    </div>
     <div class="border clearfix">
       <span class="l_f">
        <a href="javascript:addproduct()" title="添加商品" class="btn btn-warning Order_form"><i class="icon-plus"></i>添加商品</a>
        <a href="javascript:ovid()" class="btn btn-danger"><i class="icon-trash"></i>批量删除</a>
       </span>
       <span class="r_f">共：<b>2334</b>件商品</span>
     </div>
     <!--产品列表展示-->
     <div class="h_products_list clearfix" id="products_list">
       <div id="scrollsidebar" class="left_Treeview">
        <div class="show_btn" id="rightArrow"><span></span></div>
        <div class="widget-box side_content" >
         <div class="side_title"><a title="隐藏" class="close_btn"><span></span></a></div>
         <div class="side_list"><div class="widget-header header-color-green2"><h4 class="lighter smaller">产品类型列表</h4></div>
         <div class="widget-body">
          <div class="widget-main padding-8">
          
          <!-- <div id="treeDemo" class="ztree"></div> -->
          <div class="modal-body">
				 <ul id="menuTree" class="ztree" style="margin-top:0; width:120px;"></ul>
			</div>
          </div>
        </div>
       </div>
      </div>  
     </div>
         <div class="table_menu_list" id="testIframe">
       <table class="table table-striped table-bordered table-hover" id="sample-table">
		<thead>
		 <tr>
				<th width="25px">
				<label><input type="checkbox" class="ace">
				<span class="lbl"></span></label>
				</th>
				<th width="80px">产品编号</th>
				<th width="250px">产品名称</th>
				<th width="100px">原价格</th>
				<th width="100px">现价</th>
                <th width="100px">所属地区/国家</th>				
				<th width="180px">加入时间</th>
                <th width="80px">审核状态</th>
				<th width="70px">状态</th>                
			
			</tr>
		</thead>
	<tbody>

       <tr>
        <td width="25px"><label><input type="checkbox" class="ace" ><span class="lbl"></span></label></td>
        <td width="80px">45631</td>               
        <td width="250px">
        	<u style="cursor:pointer" class="text-primary" onclick="">4G手机Y</u>
    	</td>
        <td width="100px">5467</td>
        <td width="100px">4525</td> 
        <td width="100px">法国</td>         
        <td width="180px">2014-6-11 11:11:42</td>
        <td class="text-l">通过</td>
        <td class="td-status"><span class="label label-success radius">已启用</span></td>
        
	  </tr>

    </tbody>
    </table>
    </div>     
  </div>
 </div>
</div>
			
			<!--new   -->
	
	</div>
</div>

<!--end  -->
<script type="text/javascript">
var setting = {
		view: {
			selectedMulti: false
		},
		data: {
			simpleData: {
				enable: true
			}
		},
		callback: {
			onClick: zTreeOnClick
		}
	};
	$(function(){
		$('#zcPurchaseOrderForm').validate();
		
		$('.date-picker').datepicker({
			language: 'zh-CN',
		 	autoclose: true,
			todayHighlight: true
		});
		$("#addproduct").bind("click",function(){
			showMenu();
		});
		
		
	});
	
	function zTreeOnClick(event, treeId, treeNode) {
	   // alert(treeNode.tId + ", " + treeNode.name);
	    
	    var nodes = $.fn.zTree.getZTreeObj("menuTree").getSelectedNodes();
	    
	   // alert(nodes[0].id);
	};
/*  */	
	
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
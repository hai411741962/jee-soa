<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>订单编号</th>
				<th>日期</th>
				<th>到期日</th>
				<th>到货地址</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="zcPurchaseOrder" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${zcPurchaseOrder.code}</td>
				<td><fmt:formatDate value="${zcPurchaseOrder.startTime}" pattern="yyyy-MM-dd"/></td>
				
				<td><fmt:formatDate value="${zcPurchaseOrder.endTime}" pattern="yyyy-MM-dd"/></td>
				<td>${zcPurchaseOrder.address}</td>
				<td>
					<a href="javascript:" onclick="update('/zcPurchaseOrder/zcPurchaseOrder?id=${zcPurchaseOrder.id}')">编辑</a>
					<a href="javascript:" onclick="del('/zcPurchaseOrder/delete?id=${zcPurchaseOrder.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
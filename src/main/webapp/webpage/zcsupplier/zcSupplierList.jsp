<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>供应商编码</th>
				<th>名称</th>
				<th>联系方式</th>
				<th>联系地址</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="zcSupplier" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${zcSupplier.code}</td>
				<td>${zcSupplier.name}</td>
				<td>${zcSupplier.phone}</td>
				<td>${zcSupplier.address}</td>
				<td>
					<a href="javascript:" onclick="update('/zcSupplier/zcSupplier?id=${zcSupplier.id}')">编辑</a>
					<a href="javascript:" onclick="del('/zcSupplier/delete?id=${zcSupplier.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
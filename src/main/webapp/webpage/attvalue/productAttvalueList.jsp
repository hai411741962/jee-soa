<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>attId</th>
				<th>单位id</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="productAttvalue" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${productAttvalue.attId}</td>
				<td>${productAttvalue.unitId}</td>
				<td>
					<a href="javascript:" onclick="update('/productAttvalue/productAttvalue?id=${productAttvalue.id}')">编辑</a>
					<a href="javascript:" onclick="del('/productAttvalue/delete?id=${productAttvalue.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
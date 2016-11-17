<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>单位名称</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="productUnit" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${productUnit.title}</td>
				<td>
					<a href="javascript:" onclick="update('/productUnit/productUnit?id=${productUnit.id}')">编辑</a>
					<a href="javascript:" onclick="del('/productUnit/delete?id=${productUnit.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
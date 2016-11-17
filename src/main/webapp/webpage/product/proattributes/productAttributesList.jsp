<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>属性名</th>
				<th>是否影响价格</th>
				<th>类型id</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="productAttributes" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${productAttributes.title}</td>
				<td>${productAttributes.isPay}</td>
				<td>${productAttributes.proTypeId}</td>
				<td>
					<a href="javascript:" onclick="update('/productAttributes/productAttributes?id=${productAttributes.id}')">编辑</a>
					<a href="javascript:" onclick="del('/productAttributes/delete?id=${productAttributes.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
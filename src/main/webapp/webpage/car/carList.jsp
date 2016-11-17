<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>颜色</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="car" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${car.carColor}</td>
				<td>
					<a href="javascript:" onclick="update('/car/car?id=${car.id}')">编辑</a>
					<a href="javascript:" onclick="del('/car/delete?id=${car.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
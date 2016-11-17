<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>结果类型</th>
				<th>结果说明</th>
				<th>车牌号</th>
				<th>车身颜色</th>
				<th>处理状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="carConsrastResult" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${carConsrastResult.resultType}</td>
				<td>${carConsrastResult.resultRemark}</td>
				<td>${carConsrastResult.plateCode}</td>
				<td>${carConsrastResult.plateColor}</td>
				<td>${carConsrastResult.status}</td>
				<td>
					<a href="javascript:" onclick="update('/carConsrastResult/carConsrastResult?id=${carConsrastResult.id}')">编辑</a>
					<a href="javascript:" onclick="del('/carConsrastResult/delete?id=${carConsrastResult.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>所属模块</th>
				<th>任务名称</th>
				<th>开始时间</th>
				<th>结束时间</th>
				<th>实际开始时间</th>
				<th>实际技术时间</th>
				<th>负责人名称</th>
				<th>负责人id</th>
				<th>任务描述</th>
				<th>任务完成状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="projectTask" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${projectTask.projectName}</td>
				<td>${projectTask.name}</td>
				<td><fmt:formatDate value="${projectTask.startTime}" pattern="yyyy-MM-dd"/></td>
				<td><fmt:formatDate value="${projectTask.endTime}" pattern="yyyy-MM-dd"/></td>
				<td><fmt:formatDate value="${projectTask.factStartTime}" pattern="yyyy-MM-dd"/></td>
				<td><fmt:formatDate value="${projectTask.factEndTime}" pattern="yyyy-MM-dd"/></td>
				<td>${projectTask. presideName}</td>
				<td>${projectTask.presideUserId}</td>
				<td>${projectTask.remark}</td>
				<td>${projectTask.status}</td>
				<td>
					<a href="javascript:" onclick="update('/projectTask/projectTask?id=${projectTask.id}')">编辑</a>
					<a href="javascript:" onclick="del('/projectTask/delete?id=${projectTask.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
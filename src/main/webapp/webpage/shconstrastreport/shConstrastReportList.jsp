<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>子平台id</th>
				<th>对比类型</th>
				<th>对比开始时间</th>
				<th>对比结束时间</th>
				<th>对比状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="shConstrastReport" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${shConstrastReport.platformId}</td>
				<td>${shConstrastReport.consrastType}</td>
				<td>${shConstrastReport.startTime}</td>
				<td>${shConstrastReport.endTime}</td>
				<td>${shConstrastReport.status}</td>
				<td>
					<a href="javascript:" onclick="update('/shConstrastReport/shConstrastReport?id=${shConstrastReport.id}')">编辑</a>
					<a href="javascript:" onclick="del('/shConstrastReport/delete?id=${shConstrastReport.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
				<th>属性名称</th>
				<th>所属类型</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="proAttrname" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${proAttrname.title}</td>
				<td>${proAttrname.protypeName}</td>
				<td>
					<a href="javascript:" onclick="update('/proAttrname/proAttrname?id=${proAttrname.id}')">编辑</a>
					<a href="javascript:" onclick="del('/proAttrname/delete?id=${proAttrname.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
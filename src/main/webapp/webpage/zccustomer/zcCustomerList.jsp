<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>客户名称</th>
				<th>联系方式</th>
				<th>送货地址</th>
				<th>客户类型</th>
				<th>客户编码</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="zcCustomer" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${zcCustomer.name}</td>
				<td>${zcCustomer.mobile}</td>
				<td>${zcCustomer.address}</td>
				<td>
					<c:if test="${zcCustomer.type eq '1'}">学校</c:if>
					<c:if test="${zcCustomer.type eq '2'}">公司</c:if>
				</td>
				<td>${zcCustomer.code}</td>
				<td>
					<a href="javascript:" onclick="update('/zcCustomer/zcCustomer?id=${zcCustomer.id}')">编辑</a>
					<a href="javascript:" onclick="del('/zcCustomer/delete?id=${zcCustomer.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
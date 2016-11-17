<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>存货编码</th>
				<th>存货名称</th>
				<th>商品规格</th>
				<th>商品价</th>
				<th>优惠价</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="zcStock" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${zcStock.proCode}</td>
				<td>${zcStock.proName}</td>
				<td>${zcStock.proSpacname}</td>
				<td>${zcStock.proPrice}</td>
				<td>${zcStock.proDiscount}</td>
				<td>
					<a href="javascript:" onclick="update('/zcStock/zcStock?id=${zcStock.id}')">编辑</a>
					<a href="javascript:" onclick="del('/zcStock/delete?id=${zcStock.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
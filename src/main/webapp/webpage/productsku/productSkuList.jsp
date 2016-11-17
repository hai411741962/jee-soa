<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>产品id</th>
				<th>属性名id</th>
				<th>属性值id</th>
				<th>产品编码(货号)</th>
				<th>产品库存</th>
				<th>销售价格</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="productSku" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${productSku.productId}</td>
				<td>${productSku.attrnameId}</td>
				<td>${productSku.attrvalueId}</td>
				<td>${productSku.proCode}</td>
				<td>${productSku.proStock}</td>
				<td>${productSku.salsePrice}</td>
				<td>
					<a href="javascript:" onclick="update('/productSku/productSku?id=${productSku.id}')">编辑</a>
					<a href="javascript:" onclick="del('/productSku/delete?id=${productSku.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
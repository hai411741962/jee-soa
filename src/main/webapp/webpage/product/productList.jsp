<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>类型id</th>
				<th>公司id</th>
				<th>产品名称</th>
				<th>创建时间</th>
				<th>产品logo</th>
				<th>删除状态</th>
				<th>产品描述</th>
				<th>排序</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="product" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${product.typeId}</td>
				<td>${product.companyId}</td>
				<td>${product.title}</td>
				<td>${product.createDate}</td>
				<td>${product.productLogo}</td>
				<td>${product.delFlag}</td>
				<td>${product.remark}</td>
				<td>${product.sort}</td>
				<td>
					<a href="javascript:" onclick="update('/product/product?id=${product.id}')">编辑</a>
					<a href="javascript:" onclick="del('/product/delete?id=${product.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
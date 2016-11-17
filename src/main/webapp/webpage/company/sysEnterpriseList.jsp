<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
								<th>公司名称</th>
				<th>法人姓名</th>
				<th>身份证号</th>
				<th>通讯地址</th>
				<th>联系方式</th>
				<th>企业传真</th>
				<th>邮编</th>
				<th>组织机构代码</th>
				<th>省编码</th>
				<th>市编码</th>
				<th>区编码</th>
				<th>公司编号</th>
				<th>根节点</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="sysEnterprise" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<td>${sysEnterprise.name}</td>
				<td>${sysEnterprise.legal}</td>
				<td>${sysEnterprise.identcode}</td>
				<td>${sysEnterprise.address}</td>
				<td>${sysEnterprise.enterphone}</td>
				<td>${sysEnterprise.enterfox}</td>
				<td>${sysEnterprise.enterzipcode}</td>
				<td>${sysEnterprise.orgcode}</td>
				<td>${sysEnterprise.areap}</td>
				<td>${sysEnterprise.areac}</td>
				<td>${sysEnterprise.areaa}</td>
				<td>${sysEnterprise.enterpisecode}</td>
				<td>${sysEnterprise.pid}</td>
				<td>
					<a href="javascript:" onclick="update('/sysEnterprise/sysEnterprise?id=${sysEnterprise.id}')">编辑</a>
					<a href="javascript:" onclick="del('/sysEnterprise/delete?id=${sysEnterprise.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
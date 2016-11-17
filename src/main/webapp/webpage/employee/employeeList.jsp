<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="table-scrollable">
	<table class="table table-striped table-hover table-success">
		<thead>
			<tr>
				<th>#</th>
				<!-- <th>addressid</th>
				<th>deptid</th>
				<th>compid</th> -->
				<th>所属公司</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>性别</th>
			
				<th>所属部门</th>
			
				<th>联系方式</th>
				<th>地址</th>
				<th>idcard</th>
			
				<th>头像</th>
				<th>生日</th>
			
				<th>email</th>
				<th>qq</th>
				<th>wechat</th>
				<th>weibo</th>
			
				<th>类型</th>
			
				<th>创建时间</th>
				<!-- <th>starttime</th>
				<th>endtime</th> -->
				<th>排序</th>
				<th>状态</th>
			
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.result}" var="employee" varStatus="vs">
			<tr>
				<td>${vs.count + page.offset}</td>
				<%-- <td>${employee.addressid}</td>
				<td>${employee.deptid}</td>
				<td>${employee.compid}</td> --%>
				<td>${employee.所属公司}</td>
				<td>${employee.姓名}</td>
				<td>${employee.年龄}</td>
				<td>${employee.性别}</td>
			
				<td>${employee.所属部门}</td>

				<td>${employee.手机号}</td>
				<td>${employee.地址}</td>
			
				<td>${employee.头像}</td>
				<td>${employee.生日}</td>
			
				<td>${employee.email}</td>
				<td>${employee.qq}</td>
				<td>${employee.微信}</td>
				<td>${employee.微博}</td>
		
				<td>${employee.类型}</td>
			
				<td>${employee.创建时间}</td>
				<%-- <td>${employee.starttime}</td>
				<td>${employee.endtime}</td> --%>
				<td>${employee.排序}</td>
				<td>${employee.状态}</td>
			
				<td>
					<a href="javascript:" onclick="update('/employee/employee?id=${employee.id}')">编辑</a>
					<a href="javascript:" onclick="del('/employee/delete?id=${employee.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="pageination-panel">${page}</div>
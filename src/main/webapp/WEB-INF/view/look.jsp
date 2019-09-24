<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>详情</title>
<link rel="stylesheet" href="/resource/css/bootstrap.min.css"> 
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
</head>
<body>
	
	<table class="table">
		<tr>
		
			<td>主键 </td>
			<td>项目名称 </td>
			<td>投资金额</td>  
			<td>分管领导 </td>
			<td>部门 </td>
			<td>操作 </td>
		</tr>
		<c:forEach items="${key}" var="p">
			<tr>
			<td>${p.pid} </td>
			<td>${p.pname } </td>
			<td>${p.amount } </td>
			<td>${p.manager } </td>
			<td>${p.department.name} </td>
			
			</tr>
		</c:forEach>
	</table>
	
</body>

</html>
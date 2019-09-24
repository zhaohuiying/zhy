<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>计划列表</title>
<link rel="stylesheet" href="/resource/css/bootstrap.min.css"> 
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
</head>
<body>
	<div class="form-group">
		<form action="/selects" method="post">
			<input type="text" name="pname" value="${pname }" >
			<button type="submit">查询</button>
		</form>
	</div>
	<table class="table">
		<tr>
			<td>
				<button onclick="qx()">全选</button>
				<button onclick="qbx()">全不选</button>
				<button onclick="fx()">反选</button>
			</td>
			<td>主键 </td>
			<td>项目名称 </td>
			<td>投资金额</td>
			<td>分管领导 </td>
			<td>部门 </td>
			<td>操作 </td>
		</tr>
		<c:forEach items="${plan}" var="p" varStatus="i">
			<tr>
			<td><input type="checkbox" name="che"  value="${p.pid }"></td>
			<td>${i.index+1 } </td>
			<td>${p.pname } </td>
			<td>${p.amount } </td>
			<td>${p.manager } </td>
			<td>${p.department.name} </td>
			<td>
				<button onclick="plsc()">批量删除</button>
				<a href="look?pid=${p.pid }">详情</a>
			</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		${page}
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$('.page-link').click(function (e) {
	      	  //获取点击的的url
	          var url = $(this).attr('data');
	      	  location=url;
	      });
	})
	
	
	function qx() {
		$("[name=che]").attr("checked",true);
	}
	function qbx() {
		$("[name=che]").attr("checked",false);
	}
	function fx() {
		$("[name=che]").each(function() {
			if(this.checked==true){
				this.checked=false;
			}else{
				this.checked=true;
			}
		})
	}
	function plsc() {
		var ids = "";
		$("[name=che]:checked").each(function () {
			ids+=","+this.value;
			
		})
		ids=ids.substring(1);
		alert(ids);
		
		$.post("delPlan",{ids:ids},function(flag){
			if(flag){
				alert("删除成功");
				location="/selects"
			}
		},"json")
	}
	
	
</script>
</html>
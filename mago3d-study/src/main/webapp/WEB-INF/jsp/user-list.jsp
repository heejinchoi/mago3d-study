<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>사용자 목록 조회</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2 class="text-center">사용자 목록</h2>
		<table class="table table-bordered table table-hover"> 
			<thead> 
				<tr> 
					<th>아이디</th> 
					<th>이름</th> 
					<th>등록일</th>
					<th>국가</th>
					<th>&nbsp;</th>
					<th>&nbsp;</th>
				</tr> 
		</thead> 
		<tbody> 
			<c:forEach var="user" items="${userList}">
				<tr>
					<td><a href="user-detail.do?user_id=${user.user_id}">${user.user_id }</a></td>
					<td>${user.password }</td>
					<td>${user.insert_date }</td>
					<td>${user.country }</td>
					<td><a href="user-update-form-old.do?user_id=${user.user_id}">수정</a>
<%-- 					<td><a href="update-user-form.do?user_id=${user.user_id}">수정</a> --%>
					</td>
					<td><a href="delete-user.do?user_id=${user.user_id}">삭제</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="7">
					<a href="user-insert-form.do">사용자 등록</a>
				</td>
			</tr>
		</tbody> 
	</table>
	</div>
</body>
</html>
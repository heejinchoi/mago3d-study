<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사용자 정보 등록</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2 class="text-center">사용자 정보 수정</h2>
		<div>
			<form id="userList" method="post" action="user-update-old.do?user_id=${user.user_id }" >
			<input type="hidden" name="user_id"/>
				<table  class="table table-bordered table table-hover">
					<tr>
						<td>아이디 </td>
						<td>${userList.user_id }</td>
					</tr>
					<tr>
						<td>비밀번호 </td>
						<td><input type="text" name="password"/></td>
					</tr>
					<tr>
						<td>salt </td>
						<td><input type="text" name="salt" /></td>
					</tr>
					<tr>
						<td>이름 </td>
						<td><input type="text" name="name" /></td>
					</tr>
					<tr>
						<td>국가 </td>
						<td>
<%-- 							<select name="country">
								<c:forEach var="country" items="${countryList.country}">
									<option value="${country.nemeric}">${country.country}</option>
								</c:forEach>
							</select> --%>
						</td>
					</tr>
					<tr>
					<td colspan="2"  class="text-center">
						<input type="submit" value="수정" /></td>
					</tr>
					<tr>					
						<td colspan="2" class="text-center"><a href="user-list.do">목록</a></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
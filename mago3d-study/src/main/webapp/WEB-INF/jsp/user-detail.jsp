<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사용자 정보 등록</title>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="../../js/jquery-ui.min.js">
<link rel="stylesheet" href="../../js/jquery.js">
</head>
<body>
	<div class="container">
		<h2 class="text-center">사용자 정보 상세</h2>
		<div>
			<input type="hidden" name="user_id"/>
				<table  class="table table-bordered table table-hover">
					<tr>
						<td>아이디 </td>
						<td>${user.user_id }</td>
					</tr>
					<tr>
						<td>이름 </td>
						<td>${user.name }</td>
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
						<td>등록일 </td>
						<td>${user.insert_date }</td>
					</tr>
					<tr>
						<td>수정일 </td>
						<td>${user.update_date }</td>
					</tr>
					<tr>					
						<td colspan="2" class="text-center"><a href="user-list.do">목록</a></td>
					</tr>
				</table>
		</div>
	</div>
</body>
</html>
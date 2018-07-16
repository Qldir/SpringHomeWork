<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>베스트 셀러</title>
</head>
<body>
<h2>[ 가장 많이 팔린 책 ]</h2>

<table border="1">
	<tr>
		<th>상품코드</th><td>${book.bookcode}</td>
	</tr>
	<tr>
		<th>제목</th><td>${book.title}</td>
	</tr>
	<tr>
		<th>가격</th><td>${book.price}</td>
	</tr>
	<tr>
		<th>총 판매수량</th><td>${totalAmount}</td>
	</tr>



</table>
</body>
</html>
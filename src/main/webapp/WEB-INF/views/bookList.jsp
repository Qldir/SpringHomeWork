<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>[ 상품목록 ]</h2>

<table border="1">
	<tr>
		<th>상품코드</th>
		<td>제목</td>
	</tr>

	<c:forEach var="book" items="${bookList}">
		<tr>
			<th>${book.bookcode}</th>
			<td><a href="bookInfo?bookcode=${book.bookcode}">${book.title}</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
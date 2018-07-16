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
<h2>[ ${sessionScope.username}(${sessionScope.userid}) 님의 구매목록 ]</h2>

<table border="1">
	<tr>
		<th>구입일</th>
		<th>상품코드</th>
		<th>제목</th>
		<th>가격</th>
		<th>수량</th>
		<th>합계금액</th>
	</tr>
	
	<!-- saleList check -->
	<c:if test="${orderList == null}">
	<tr>
		<td colspan="6"> 구매내역이 없습니다. </td>
	</tr>
	</c:if>
	
	<c:forEach var="order" items="${orderList}">
	<tr>
		<td>${order.purchasedate}</td>
		<td>${order.bookcode}</td>
		<td>${order.title}</td>
		<td>${order.price}</td>
		<td>${order.quantity}</td>
		<td>${order.price * order.quantity}</td>
	</tr>
	</c:forEach>
	
	<tr>
		<td colspan="5">누적 구매액</td>
		<td>${totalPrice}</td>
	</tr>

</table>
</body>
</html>
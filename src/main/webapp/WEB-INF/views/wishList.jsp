<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>위시 리스트</title>

<script type="text/javascript">

function deleteWish(bookcode) {

	var form = document.forms["form"];

	form["bookcode"].value = bookcode;
	form.submit();
}

</script>

</head>
<body>
<h2>[ ${sessionScope.username}(${sessionScope.userid}) 님의 WishList ]</h2>

<form id="form" action="wishDelete" method="post">
<input type="hidden" name="bookcode" value="">
<table border="1">
	<tr>
		<th>상품코드</th>
		<th>제목</th>
		<th>가격</th>
		<th>관심상품 삭제하기</th>
	</tr>
	
	<!-- wishList check -->
	<c:if test="${wishList == null}">
	<tr>
		<td colspan="4"> 관심상품이 없습니다. </td>
	</tr>
	</c:if>
	
	<c:forEach var="wish" items="${wishList}">
	<tr>
		<td>${wish.bookcode}</td>
		<td>${wish.title}</td>
		<td>${wish.price}</td>
		<td>
			<input type="button" name="delete" value="삭제" onclick="deleteWish(${wish.bookcode})">
		</td>
	</tr>
	</c:forEach>
	

</table>
</form>
</body>
</html>
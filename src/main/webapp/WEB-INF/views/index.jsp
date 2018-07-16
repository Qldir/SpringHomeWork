<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>온라인 서점</title>
</head>
<body>
<h2>[ 온라인 서점 ]</h2>
<ul>
	<!-- 세션 없으면 회원가입, 로그인 출력 -->
	<c:if test="${sessionScope.userid == null}">
		<li><a href="joinForm">회원가입</a></li>
		<li><a href="loginForm">로그인</a></li>
	</c:if>
	
	<!--  세션 존재 시 로그아웃, 주문정보, 관심상품 출력 -->
	<c:if test="${sessionScope.userid != null }">
		<li><a href="logout">로그아웃</a></li>
		<li><a href="orderList">주문정보</a></li>
		<li><a href="wishList">관심상품</a></li>
	</c:if>
	
	<!-- 세션 유무 상관없이 나오는 리스트 -->
	<li><a href="bookList">상품목록</a></li>
	<li><a href="bestSeller">베스트셀러</a></li>
</ul>
</body>
</html>
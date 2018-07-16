<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품 상세 정보</title>

<script type="text/javascript">
function buyBook() {

	var quantity = document.getElementById("quantity").value;
	var purchasecnt = document.getElementById("purchasecnt");

	// quantity의 값을 string으로 불러오므로 parseInt로 형변환 해서 비교
	if(purchasecnt.value=='' || purchasecnt.value<1 || purchasecnt.value>parseInt(quantity)){
		alert('구매수량을 확인해주세요');
		
		return;
	}
	
	var form = document.forms["form"];

	form.action = "buyBook";
	form.submit();
}

function wishList() {
	var form = document.forms["form"];

	form.action = "addWishList";
	form.submit();
}
</script>

</head>
<body>
<h2>[ 상품 상세 정보 ]</h2>


<form id="form" action="" method="post">
	<input type="hidden" name="userid" value="${sessionScope.userid}">
	<input type="hidden" name="bookcode" value="${book.bookcode}">
	<input type="hidden" name="title" value="${book.title}">
	<input type="hidden" name="price" value="${book.price}">
	<input type="hidden" id="quantity" name="quantity" value="${book.quantity}">
	<table border="1">
		<tr>
			<th>상품코드</th>
			<td>${book.bookcode}</td>
		</tr>
 		<tr>
			<th>제목</th>
			<td>${book.title}</td>
		</tr>
		<tr>
			<th>가격</th>
			<td>${book.price}</td>
		</tr>
		<tr>
			<th>재고수량</th>
			<td>${book.quantity}</td>
		</tr>
		
		<tr>
			<td colspan=2>
				구매수량<input type="number" id="purchasecnt" name="purchasecnt"/>
				<input type="button" value="구입하기" onclick="buyBook()"/>
				<input type="button" value="관심상품저장" onclick="wishList()"/>
			</td>
		</tr>
	</table>
	</form>

</body>
</html>
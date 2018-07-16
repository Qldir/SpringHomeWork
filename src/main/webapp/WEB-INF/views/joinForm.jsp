<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

<script type="text/javascript">
function formCheck() {
	var id = document.getElementById("id");
	var pw = document.getElementById("password");

	if (id.length < 3 || id.length > 10) {
		alert('ID는 3 ~ 10자로 입력하세요.');
		id.focus();
		id.select();
		return false;
	}
	
	if (pw.length < 3 || pw.length > 10) {
		alert('비밀번호는 3 ~ 10자로 입력하세요.');
		pw.focus();
		pw.select();
		return false;
	}
	//기타 폼의 입력데이터 검증
	return true;
}


</script>
</head>
<body>
<h2>[ 회원 가입 ]</h2>

<!-- 가입폼 시작 -->
<form id="form" action="join" method="post" onsubmit="return formCheck()">
	<table border="1">
		<tr>
			<th>ID</th>
			<td>
				<input id="userid" type="text" name="userid"/>
			</td>
		</tr>
 		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="username" required/></td>
		</tr>
		<tr>
			<th>주소</th>
			<td><input type="text" name="address" required/></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><input type="text" name="phone" required/></td>
		</tr>
				
		<tr>
			<td colspan=2><input type="submit" value="가입완료" /></td>
		</tr>
	</table>
	</form>
</body>
</html>

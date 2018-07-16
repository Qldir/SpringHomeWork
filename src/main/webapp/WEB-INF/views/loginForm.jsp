<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
<h2>[ 로그인 ]</h2>

<!-- 로그인폼 시작 -->
<form id="form" action="login" method="post" onsubmit="return formCheck()">
	<table border="1">
		<tr>
			<th>ID</th>
			<td>
				<input id="userid" type="text" name="userid" required/>
			</td>
		</tr>
 		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="password" required/></td>
		</tr>
		
		<tr>
			<td colspan=2><input type="submit" value="로그인" /></td>
		</tr>
	</table>
	</form>
</body>
</html>
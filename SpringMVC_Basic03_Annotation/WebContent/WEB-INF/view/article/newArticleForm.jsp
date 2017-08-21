<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--
		키 포인트~
		action이 없다... 왜?
		action이 없으면 현재 url주소를 그대로 사용한다
		현재주소+post
	-->
	폼폼폼폼<h3>게시판 글쓰기 입력 폼</h3>
	<form method="post">
		<input type="hidden" name="parentID" value="0">
		제목: <input type="text" name="title"><br>
		내용: <input type="text" name="content"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>
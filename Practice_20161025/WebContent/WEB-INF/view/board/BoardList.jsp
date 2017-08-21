<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr><th>글번호</th><th>제목</th><th>내용</th></tr>
		<tr><td>${board.index}</td><td>${board.title}</td><td>${board.content}</td></tr>
	</table>
</body>
</html>
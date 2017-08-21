<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>글쓰기 Annotation 연습</h3><br><hr>
	
	<form action="boardWriteOk.do">
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
		글번호 : <input type="text" name="index"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>
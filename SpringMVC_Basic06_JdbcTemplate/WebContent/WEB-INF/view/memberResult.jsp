<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세 조회결과</title>
</head>
<body>
아이디 : ${requestScope.memberok.id}<br>
이  름 : ${requestScope.memberok.name}<br>
이메일 : ${requestScope.memberok.email} <br>
나  이 : ${requestScope.memberok.age}<br>
</body>
</html>
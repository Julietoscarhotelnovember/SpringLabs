<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
입력값 확인
잘 보내짐 ㅇㅇ
<%-- <h3>게시판 등록된 글 내용 확인</h3>
제목: ${newArticleCommand.title}<br>
내용: ${newArticleCommand.content}<br>
순번: ${newArticleCommand.parentId} --%>
<h3>@ModelAttribute("Articledata")게시판 등록된 글 내용 확인</h3>
제목: ${Articledata.title}<br>
내용: ${Articledata.content}<br>
순번: ${Articledata.parentId}
</body>
</html>
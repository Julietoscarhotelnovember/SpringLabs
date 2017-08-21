<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>ModelAttribute</h3>
	<hr>
	<h3>game keyword</h3>
	<ul>
		<c:forEach items="${querylist}" var="keyword">
			<li>${keyword}</li>
		</c:forEach>
	</ul>
	
	<select name="type">
		<c:forEach items="${SearchTypeList}" var="Searchobj">
			<option value="${Searchobj.code}">
				${Searchobj.text}
			</option>
		</c:forEach>
	</select>
</body>
</html>
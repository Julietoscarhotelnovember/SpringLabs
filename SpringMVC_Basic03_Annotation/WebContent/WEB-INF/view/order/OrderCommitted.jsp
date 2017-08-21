<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>주문결과 사용하기</h3>
	<c:forEach items="${orderCommand.orderItem}" var="item">
		<ul>
			<li>${item.itemid}</li>
			<li>${item.number}</li>
			<li>${item.remark}</li>
		</ul>
	</c:forEach>
</body>
</html>
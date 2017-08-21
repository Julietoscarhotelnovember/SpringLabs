<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	상품1<br>
	상품ID: <input type="text" name="orderItem[0].itemid"><br>
	상품수량: <input type="text" name="orderItem[0].number"><br>
	상품주의사항: <input type="text" name="orderItem[0].remark"><br>
	<hr>
	상품2<br>
	상품ID: <input type="text" name="orderItem[1].itemid"><br>
	상품수량: <input type="text" name="orderItem[1].number"><br>
	상품주의사항: <input type="text" name="orderItem[1].remark"><br>
	<hr>
	상품3<br>
	상품ID: <input type="text" name="orderItem[2].itemid"><br>
	상품수량: <input type="text" name="orderItem[2].number"><br>
	상품주의사항: <input type="text" name="orderItem[2].remark"><br>
	<hr>
	<input type="submit" value="상품목록 전송">
</form>
</body>
</html>
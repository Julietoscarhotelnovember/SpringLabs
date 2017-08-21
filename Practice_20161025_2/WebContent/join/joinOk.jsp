<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>
<div class="container">
	<form role="form" action="" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">id</label> 
			<input type="text" class="form-control" id="id" name="" value="${member.userid}" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> 
			<input type="email" class="form-control" id="email" name="" value="${member.email}" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> 
			<input type="password" class="form-control" id="exampleInputPassword1" name="" value="${member.pwd}" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Name</label> 
			<input type="text" class="form-control" id="username" name="" value="${member.name}" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Gender</label> 
			<input type="text" class="form-control" id="gender" name="" value="${member.gender}" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">BirthDay</label> 
			<input type="text" class="form-control" id="birthday" name="" value="${member.birth}" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Lunar</label> 
			<input type="text" class="form-control" id="lunar" name="" value="${member.is_lunar}" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">CellPhone</label> 
			<input type="text" class="form-control" id="CellPhone" name="" value="${member.cphone}" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">habit</label> 
			<input type="text" class="form-control" id="Hobby" name="" value="${member.habit}" readonly>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">RegDate</label> 
			<input type="text" class="form-control" id="RegDate" name="" value="${member.regdate}" readonly>
		</div>
		<a href="index.html"><input type="button" class="btn btn-default" value="메인으로"></a>
	</form>
</div>
	
</body>
</html>
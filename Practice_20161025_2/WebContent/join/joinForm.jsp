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
			<input type="text" class="form-control" id="id" placeholder="Enter id" name="userid">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> 
			<input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> 
			<input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="pwd">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Name</label> 
			<input type="text" class="form-control" id="username" placeholder="Enter your name" name="name">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Gender</label> 
			<input type="text" class="form-control" id="gender" placeholder="Enter your Gender ex)famale or male" name="gender">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">BirthDay</label> 
			<input type="text" class="form-control" id="birthday" placeholder="Enter your BirthDay ex)88.03.24" name="birth">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Lunar</label> 
			<input type="text" class="form-control" id="lunar" placeholder="type of birthday(lunar) ex) 양력 또는 음력" name="is_lunar">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">CellPhone</label> 
			<input type="text" class="form-control" id="CellPhone" placeholder="Enter your CellPhone ex)01088208447" name="cphone">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">habit</label> 
			<input type="text" class="form-control" id="Hobby" placeholder="Enter your habit" name="habit">
		</div>
		<input type="submit" class="btn btn-default" value="전송">
		<button type="submit" class="btn btn-default" href="index.html">취소</button>
	</form>
</div>
	
</body>
</html>
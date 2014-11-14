<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<%=request.getContextPath()%>/js/jQuery/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap/bootstrap.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Xebia HRIMS</title>
</head>
<body style="background-color: white;">
	<div class="container" align="center" style="margin-top: 12%;">
		<div style="vertical-align: top; margin: 10px 10px 10px 10px;">
			<img width="200px;" height="50px;" src="<%=request.getContextPath()%>/images/logo_xebia.jpg">
		</div>
		<form id="login" name="login" action="login.xebia" method="post" style="max-width: 360px; margin: 0px auto;">
			<input type="text" name="userID" id="userID" class="form-control" placeholder="Emp ID" required autofocus> 
			<br>
			<input type="password" name="password" id="password" class="form-control" placeholder="Password" required>
			<div class="checkbox" style="float: left;">
				<label> <input type="checkbox" value="remember-me">Remember me</label>
			</div>
			 <button type="submit" class='btn btn-lg btn-primary btn-block'>Login</button>
		</form>
		<div style="color:red;">${errormessage}</div>
	</div>
</body>
</html>
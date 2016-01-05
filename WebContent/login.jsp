<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="validLogin.js"></script>

</head>
<body>

<div class="jumbotron">
  <div class="text-center">
    <h1><strong>SCRUM TECHNOLOGY</strong></h1>
  </div>
</div>

<div class="container">
<div class="text-center">
<h2><strong>Login Form</strong></h2>
</div>
	<div class="well well-lg">
	<form class="form-horizontal" role="form" method="post" action="login" name="form" onsubmit="return loginValidation()">
	<div class="form-group has-feedback">
		<label class="control-label col-sm-2" for="umail">Unique Id:</label>
		
 
		<div class="col-sm-10">
			<input type="text" class="form-control" name="umail" style=" width: 50%; float: left;" placeholder="enter Email-Id or Unique Id here">
			 <img src="image/cross.png" id="img1" style="display:none;height:15px;width:15px;">

		</div>
	</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">Password:</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" data-minlength="6" name="upwd" style=" width: 50%; float: left;"  placeholder="enter password" >
			   <img src="image/cross.png" id="img2" style="display:none;height:15px;width:15px;">
			</div>

		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
			<div class="checkbox"></div>
			<label><input type="checkbox">Remember me
			</label>
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-success">Submit</button>
				 <a href="Register.jsp" class="btn btn-primary">Register now</a>
			</div>
		</div>
		<hr/>

	</form>
</div>
</div>

</body>
</html>
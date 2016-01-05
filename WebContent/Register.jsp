<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title> Registration Page</title>
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

  <h1><b>SIGNUP FORM</b></h1>
  </div>
  
  <div class="well">
  <form class="form-horizontal" role="form" action="register" method="post" name="form" onsubmit="return validation()">
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="usr">Full Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="fname" style="width:50%;float:left;" placeholder="Enter The Full Name" />
        <img src="image/cross.png" id="img1" style="display:none;height:15px;width:15px;">
      </div>
    </div>
     
    <div class="form-group">
      <label class="control-label col-sm-2" for="uname">Unique Id:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control"  name="uid"  style="width:50%;float:left;"  placeholder="Enter the unique id">
       <img src="image/cross.png" id="img2" style="display:none;height:15px;width:15px;">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">
        <input type="password" class="form-control"  name="upwd" value=""  style="width:50%;float:left;"  placeholder="Enter the Password" >
      <img src="image/cross.png" id="img3" style="display:none;height:15px;width:15px;">
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="email" class="form-control"  name="umail" style="width:50%;float:left;"  placeholder="Enter email id">
      <img src="image/cross.png" id="img4" style="display:none;height:15px;width:15px;">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Phone Number:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" name="uphone" placeholder="Enter Mobile number"  style="width:50%;float:left;"  maxlength="10">
      <img src="image/cross.png" id="img5" style="display:none;height:15px;width:15px;">
      </div>
    </div>
     
     <div class="form-group">
      <label class="control-label col-sm-2" for="addrs">Address:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control"  name="uadd"  style="width:50%;float:left;"  placeholder="Enter Address here" >
      <img src="image/cross.png" id="img6" style="display:none;height:15px;width:15px;">
      </div>
    </div>

      <div class="form-group">
      <label class="control-label col-sm-2" for="dob">Date Of Birth:</label>
      <div class="col-sm-10">
       <input type="date" class="form-control" id="exampleInputDOB1" name="udob"  style="width:50%;float:left;"  placeholder="Date of Birth" required>
      </div>
      </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="gnd">Gender:</label>
       <label class="radio-inline">
      <input type="radio" name="ugender" value="male">Male
    </label>
    <label class="radio-inline">
      <input type="radio" name="ugender" value="female">Female
    </label>
    <img src="image/cross.png" id="img7" style="display:none;height:15px;width:15px;">
    </div>
    <div class="form-group"> 
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-success">Submit</button>
      </div>
    </div>
  </form>
</div>
   <p><a href="index.html" class="btn btn-primary btn-lg">
     <span class="glyphicon glyphicon-arrow-left"></span>Home
    </a>
    <a href="login.jsp" class="btn btn-primary btn-lg" style="float:right;">
     Login Page <span class="glyphicon glyphicon-arrow-right"></span>
    </a>
    
    </p>
</div>


</body>
</html>
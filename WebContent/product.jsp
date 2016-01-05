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
<!--   <script type="text/javascript" src="validLogin.js"></script> -->
</head>
<body>


<div class="jumbotron">
  <div class="text-center">
    <h1><strong>SCRUM TECHNOLOGY</strong></h1>
  </div>
</div>


<div class="container">
  
  <div class="text-center">

  <h1><b>ADD PRODUCT</b></h1>
  </div>
  
  <div class="well">
  <form class="form-horizontal" role="form" action="addproduct" method="post" name="form" onsubmit="return validation()">
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="usr">Product Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="pname" style="width:50%;float:left;" placeholder="Enter product The Full Name" required />
        <img src="image/cross.png" id="img1" style="display:none;height:15px;width:15px;">
      </div>
    </div>
     
    <div class="form-group">
      <label class="control-label col-sm-2" for="pid">Product Id:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control"  name="pid"  style="width:50%;float:left;"  placeholder="Enter product unique id" required>
       <img src="image/cross.png" id="img2" style="display:none;height:15px;width:15px;">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="pbd">Brand:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control"  name="pbd"  style="width:50%;float:left;"  placeholder="Enter the Brand" required>
      <img src="image/cross.png" id="img3" style="display:none;height:15px;width:15px;">
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="price">Price:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control"  name="prc" style="width:50%;float:left;"  placeholder="Enter Product Price" required>
      <img src="image/cross.png" id="img4" style="display:none;height:15px;width:15px;">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">MRP:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" name="pmrp" placeholder="Enter Product M.R.P"  style="width:50%;float:left;"  maxlength="10" required>
      <img src="image/cross.png" id="img5" style="display:none;height:15px;width:15px;">
      </div>
    </div>
     
     <div class="form-group">
      <label class="control-label col-sm-2" for="brcode">Product Barcode:<span class="glyphicon glyphicon-qrcode"></span></label>
      <div class="col-sm-10">
        <input type="text" class="form-control"  name="pcode"  style="width:50%;float:left;"  placeholder="Enter Product code here" required >
      <img src="image/cross.png" id="img6" style="display:none;height:15px;width:15px;">
      </div>
    </div>

      <div class="form-group">
      <label class="control-label col-sm-2" for="doa">Date Of Addition:</label>
      <div class="col-sm-10">
       <input type="date" class="form-control"  name="pdoa"  style="width:50%;float:left;"  placeholder="Date of Birth" required>
      </div>
      </div>

    
<div class="form-group"> 
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-success">Submit</button>
      </div>
    </div>
  </form>
</div>
   <p><a href="index.html" class="btn btn-primary btn-lg" style="float:right;"> <span class="glyphicon glyphicon-home"></span>
     Home
    </a>
    <a href="login.jsp" class="btn btn-primary btn-lg" style="float:right;">
     Login <!-- <span class="glyphicon glyphicon-arrow-right"> --></span>
    </a>
    <a href="welcome.jsp" class="btn btn-primary btn-lg" style="float:left;">
     <span class="glyphicon glyphicon-arrow-left"></span>Back
    </a>
    
    </p>
</div>
<%-- <%/* out.print("SUCCESSFULL ADD NEW PRODUCT"); */
String name=request.getParameter("pname");
if(name!=null){
request.getRequestDispatcher("product.jsp").include(request, response);
}
%> --%>

</body>
</html>
/*
 * LOGIN FUNCTION
 * 
*/
function loginValidation()
{
var x=document.forms["form"]["umail"].value;
/*var atpos=x.indexOf("@");
var dotpos=x.lastIndexOf(".");*/

var p=document.forms["form"]["upwd"].value;

if((x.length=="" && p.length=="") ||( x.length==null && p.length==null)){
	alert("Please Fill out all fields");
	document.getElementById("img1").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
	document.getElementById("img2").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");	
 return false;
}

else if(x==null || x=="")
{
alert("Enter your Unique Id First");
document.getElementById("img1").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
if(p.length<6){
	document.getElementById("img2").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
}
else
{
	 document.getElementById("img2").setAttribute("style","display:none");
	 
}
 return false;
}
/*else if(dotpos<atpos+2 || dotpos+2>= x.length||atpos<1)
{
alert("Please Enter a valid E-mail");
document.getElementById("img1").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
return false;
}*/

else if(x.length < 3){
	alert("Please Enter Minimum 3 of length ID");
	document.getElementById("img1").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
	
	if(p.length<6){
		document.getElementById("img2").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
	}
	else
	 {
		 document.getElementById("img2").setAttribute("style","display:none");
		 
	 }
	return false;
}

else if(p==null || p=="")
{
 alert("Enter Min. Length of 6 Password");
 document.getElementById("img2").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
 if(x.length<3)
 {
 document.getElementById("img1").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
 }
 else
 {
	 document.getElementById("img1").setAttribute("style","display:none");
	 
 }
	 return false;
}
else
{
 /*alert("Successful Submission");*/
 return true;
}

}

/*
 * REGISTER FUNCTION
 * 
*/
function validation() {
	var n= document.forms["form"]["fname"].value;
	var d= document.forms["form"]["uid"].value;
	var p= document.forms["form"]["upwd"].value;
	var m= document.forms["form"]["umail"].value;
	var ph= document.forms["form"]["uphone"].value;
	var ad= document.forms["form"]["uadd"].value;
	var gnd= document.forms["form"]["ugender"].value;
	var atpos=m.indexOf("@");
	var dotpos=m.lastIndexOf(".");
	
	if((n.length==null && d.length==null && p.length==null && m.length==null && ph.length==null && ad.length==null && gnd.length==null) || (n.length=="" && d.length=="" && p.length=="" && m.length=="" && ph.length=="" && ad.length=="" && gnd.length==""))
	{
		document.getElementById("img1").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
		document.getElementById("img2").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
		document.getElementById("img3").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
		document.getElementById("img4").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
		document.getElementById("img5").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
		document.getElementById("img6").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
		document.getElementById("img7").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
        		
		return false;
	}
    if (n==null || n=="")
	{
		alert("first name fill out");
		document.getElementById("img1").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");

		return false;
	}
    
    if (d==null || d=="")
	{
		alert("fill out Unique Id");
		document.getElementById("img2").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");

		return false;
	}
	
	else if(d.length < 3){
		alert("Please Enter Minimum 3 of length ID");
		document.getElementById("img2").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
		return false;
	}
    
	else if (p==null || p=="" || p.length < 6)
	{
		alert("Password Correctly fill out");
		document.getElementById("img3").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");

		return false;
	}
    
    else if(atpos<1 ||dotpos < atpos+2 || dotpos+2>=m.length || m==null || m==""){
		alert("Not a valid e-mail address");
		document.getElementById("img4").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");
		return false;
	}
    
    if ((ph==null || ph=="" || ph.length !=10)||(isNaN(ph)))
	{
		alert("Phone number Correctly fill out");
		document.getElementById("img5").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");

		return false;
	}
    
    if (ad==null || ad=="")
	{
		alert("Address Correctly fill out");
		document.getElementById("img6").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");

		return false;
	}
    
    if (gnd==null || gnd=="")
	{
		alert("Gender Correctly fill out");
		document.getElementById("img7").setAttribute("style","display:inline;height:15px;width:15px;margin-left:10px;");

		return false;
	}
	
}
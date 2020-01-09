function Validate(){

var x=document.forms["login"]["name"].value;
var y=document.forms["login"]["email"].value;
var z=document.forms["login"]["dob"].value;
var isValid = true;
if(x==""||y==""|| z=="") {

if(x==""){
    document.getElementById('message').style.visibility="visible";
    document.getElementById('message').innerHTML="Please enter your name";
    isValid =  false;

}
else{
    document.getElementById('message').style.visibility="hidden";

    }
if(y==""){
    document.getElementById('message1').style.visibility="visible";
    document.getElementById('message1').innerHTML="Please enter your email";
    isValid =  false;
}
else{
    document.getElementById('message1').style.visibility="hidden";
    }

if(z==""){
    document.getElementById('message2').style.visibility="visible";
    document.getElementById('message2').innerHTML="Please enter your Date of Birth";
    isValid =  false;
}
else{
    document.getElementById('message2').style.visibility="hidden";
    }
  return isValid;
}
else{
    alert("Form submitted Successfully")
}
}
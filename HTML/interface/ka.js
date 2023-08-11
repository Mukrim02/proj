function validate(){
  var username=document.getElementById("username").value;
  var password=document.getElementById("password").value;
if (username=="mukrim"&& password=="02/12/2002")
{
  open("file:///D:/PROJ/HTML/pratice/one.html")
}
else {
  alert("login failed")
}
}
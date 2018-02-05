<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>from jsp</title>
</head>
<body>
<%
System.out.println("you can write java code in jsp");
%>
<form action="/login.do" method="post">
Enter Your Name <input type="text" name="name"/>
Enter Your Password <input type="password" name="password"/>
<input type="submit"/>
<p><font color="red">${error}</font></p>

</form>
</body>
</html>
		

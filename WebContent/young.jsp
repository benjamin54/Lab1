<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>young</title>
</head>
<body>
	<jsp:useBean id="person" scope="application" type="lab.mvc.model.Person"></jsp:useBean>
	
	<jsp:getProperty property="firstName" name="person"/>
	<jsp:getProperty property="lastName" name="person"/>
	<jsp:getProperty property="birthDay" name="person"/>
	<jsp:getProperty property="sex" name="person"/>
</body>
</html>
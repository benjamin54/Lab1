<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:usebean id="person" scope="application" lkclass="isep.lab1.bean.Person"/>
	
	<jsp:setProperty name="person" property="*" />
<%-- 	<jsp:setProperty name="person" property="prenom" value=Person.getPrenom() />
	<jsp:setProperty name="person" property="date" value=Person.getDate() />
	<jsp:setProperty name="person" property="sexe" value=Person.getSexe() /> --%>
	
 	<ul>
	<li><jsp:getProperty name="person" property="nom" /></li>
 	<li><jsp:getProperty name="person" property="prenom" /></li>
	<li><jsp:getProperty name="person" property="nom" /></li>
	<li><jsp:getProperty name="person" property="sexe" /></li>
	</ul>
</body>
</html>
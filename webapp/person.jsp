<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import ="com.cricbuzz.model.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Persons</title>
</head>
<body>
In Persons
<br><br>
<s:iterator value="personList">

<s:a href="index.jsp"><s:property value="Name"></s:property></s:a>
<br>
</s:iterator>


</body>
</html>
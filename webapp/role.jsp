<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import ="com.cricbuzz.model.Role" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Roles</title>
</head>
<body>
In Roles
<br><br>
<s:iterator value="RoleList">

<s:a href="index.jsp"><s:property value="role"></s:property></s:a>
<br>
</s:iterator>


</body>
</html>
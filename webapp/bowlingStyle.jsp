<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import ="com.cricbuzz.model.BowlingStyle" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BowlingStyles</title>
</head>
<body>
In BowlingStyles
<br><br>
<s:iterator value="BowlingStyleList">

<s:a href="index.jsp"><s:property value="bowlingStyle"></s:property></s:a>
<br>
</s:iterator>


</body>
</html>
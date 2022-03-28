<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import ="com.cricbuzz.model.BattingStyle" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BattingStyles</title>
</head>
<body>
In BattingStyles
<br><br>
<s:iterator value="BattingStyleList">

<s:a href="index.jsp"><s:property value="battingStyle"></s:property></s:a>
<br>
</s:iterator>


</body>
</html>
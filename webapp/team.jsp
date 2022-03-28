<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.cricbuzz.model.Team"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css" type="text/css">
<meta charset="UTF-8">
<title>Teams</title>
</head>


<body>

	<div class="wrapper">
	
		<nav class="navbar">
			<img src="./images/cricbuzz.svg" class="logo" alt="logo">
			<ul>

				<li><s:a href="index.jsp">Home</s:a></li>
				<li><s:a cssClass="current" href="teams">Teams</s:a></li>
				<li><s:a href="players">Players</s:a></li>
			</ul>
		</nav>

		<div class="center">
			<table>
			<tr><th>Team</th></tr>
						
			<s:iterator value="teamList">

				<s:url var="teamDetail" action="TeamAction">
					<s:param name="teamId" value="teamId"></s:param>
				</s:url>
			
			
			<tr><td><a href="${teamDetail}"><s:property value="teamName"></s:property><br></a></td></tr>
			
			</s:iterator>
			
			</table>
	
		</div>

	</div>

</body>


</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.cricbuzz.model.Team"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css" type="text/css">
<meta charset="UTF-8">
<title>Add Team</title>
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
			<s:form  var="addTeam" action="addTeamAction">
				<s:textfield label="Team Name" key="team.teamName" />
				<s:submit value="Add Team" />
			</s:form>
		</div>

	</div>

</body>


</html>
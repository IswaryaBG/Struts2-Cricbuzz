<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.cricbuzz.model.Person"%>
<%@ page import="com.cricbuzz.model.Team"%>
<%@ page import="com.cricbuzz.model.Player"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css" type="text/css">
<meta charset="UTF-8">
<title>Delete Player</title>

<style>
table {
	width: 100% !important;
}
</style>

</head>


<body>
	<div class="wrapper">

		<nav class="navbar">
			<img src="./images/cricbuzz.svg" class="logo" alt="logo">
			<ul>

				<li><s:a href="index.jsp">Home</s:a></li>
				<li><s:a href="teams">Teams</s:a></li>
				<li><s:a cssClass="current" href="players">Players</s:a></li>
			</ul>
		</nav>
		<div class="center">
			<s:form action="deletePlayer">
				<s:select label="Select Player" headerKey="-1" headerValue="Select Player" 
					list="playerList"
					listKey ="playerId"
					listValue="name"
					name="selectedPlayerId"
					 />
				<s:submit value="Delete Player" />
			</s:form>
		</div>

	</div>

</body>


</html>
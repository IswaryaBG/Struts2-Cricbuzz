<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Cricbuzz</title>
<style>

</style>
</head>
<body >

	<div class="wrapper">
		<nav class="navbar">
			<img src="./images/cricbuzz.svg" class="logo" alt="logo">
			<ul>
			
			<li ><s:a cssClass="current" href="index.jsp">Home</s:a></li>
			<li><s:a href="teams">Teams</s:a></li>
			<li><s:a href="players">Players</s:a></li>
			<li><s:a href="addTeam.jsp">Add Team</s:a></li>
			<li><s:a href="getAllListAction">Add Player</s:a></li>
			<li><s:a href="getTeamListAction">Delete Team</s:a></li>
			<li><s:a href="getPlayerListAction">Delete Player</s:a></li>
			</ul>
		</nav>
		
		<div class="center">
		
		<h1 >Welcome</h1><br>
		<h1 >to</h1><br>
		<h1 class="typewriter">CRICBUZZ</h1>
		 
		
		</div>
		
	</div>

</body>
</html>
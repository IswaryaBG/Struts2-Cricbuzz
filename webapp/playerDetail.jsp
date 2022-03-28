<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import ="com.cricbuzz.model.Player" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Player Detail</title>

<style>

tr td:hover{
	background:#003300;
	font-weight:normal;
	cursor:default;
}

</style>

</head>
<body>

<div class="wrapper">
		<nav class="navbar">
			<img src="./images/cricbuzz.svg" class="logo" alt="logo">
			<ul>

				<li><s:a  href="index.jsp">Home</s:a></li>
				<li><s:a  href="teams">Teams</s:a></li>
				<li><s:a cssClass="current" href="players">Players</s:a></li>
			</ul>
		</nav>
		

		<div class="center">

			<table>
			<s:iterator value="playerList">
			<tr>
			<td>NAME</td>
			<td><s:property value="name"/></td> 
			</tr>
			<tr>
			<td>AGE</td>
			<td><s:property value="age"/></td> 
			</tr>
			<tr>
			<td>DOB</td>
			<td><s:property value="dateOfBirth"/></td> 
			</tr>
			<tr>
			<td>HOMETOWN</td>
			<td><s:property value="homeTown"/></td> 
			</tr>
			<tr>
			<td>TEAM</td>
			<td><s:property value="teamName"/></td> 
			</tr>
			<tr>
			<td>ROLE</td>
			<td><s:property value="role"/></td> 
			</tr>
			<tr>
			<td>BATTING STYLE</td>
			<td><s:property value="battingStyle"/></td> 
			</tr>
			<tr>
			<td>BOWLING STYLE</td>
			<td><s:property value="bowlingStyle"/></td> 
			</tr>
			<tr>
			<td>ICC RANKING</td>
			<td><s:property value="iccRanking"/></td> 
			</tr>
			
			
			</s:iterator>
			
			</table>

		</div>

	</div>


<s:iterator value="playerList">




</s:iterator>


</body>
</html>
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
<title>Add Player</title>

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
			<s:form action="addPlayer">
			    <s:textfield label="Name" name="person.name" />
				<s:textfield label="Age" name="person.age" />
				<s:textfield label="Date Of Birth" name="person.dateOfBirth" />
				<s:textfield label="Hometown " name="person.homeTown" />
				<s:textfield label="ICC Ranking " name="iccRanking" />
				<s:select label="Select Team" headerKey="-1" headerValue="Select Team" 
					list="teamList"
					listKey ="teamId"
					listValue="teamName"
					name="selectedTeamId"
					 />
			    <s:select label="Select Role" headerKey="-1" headerValue="Select Role" 
					list="roleList"
					listKey ="roleId"
					listValue="role"
					name="selectedRoleId"
					 />
			    <s:select label="Select BattingStyle" headerKey="-1" headerValue="Select BattingStyle" 
					list="battingStyleList"
					listKey ="battingStyleId"
					listValue="battingStyle"
					name="selectedBattingStyleId"
					 />
				<s:select label="Select BowlingStyle" headerKey="-1" headerValue="Select BowlingStyle" 
					list="bowlingStyleList"
					listKey ="bowlingStyleId"
					listValue="bowlingStyle"
					name="selectedBowlingStyleId"
					 />
				<s:submit value="Add Player" />
			</s:form>
		</div>

	</div>

</body>


</html>
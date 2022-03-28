<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.cricbuzz.model.Person"%>

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
			<s:form action="addPersonAction" >
				<s:textfield label="Name" key="person.name" />
				<s:textfield label="Age" key="person.age" />
				<s:textfield label="Date Of Birth" key="person.dateOfBirth" />
				<s:textfield label="Hometown " key="person.homeTown" />
				<s:submit value="Add Person"/>
			</s:form>
		</div>

	</div>

</body>


</html>
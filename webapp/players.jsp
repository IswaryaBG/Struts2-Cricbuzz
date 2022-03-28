<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.cricbuzz.model.Player"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Players</title>
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

			<table>
				<tr>
					<th>Players</th>
				</tr>


				<s:iterator value="PlayerList">
					<s:url var="playerDetail" action="PlayerDetailAction">
						<s:param name="playerId" value="playerId"></s:param>
					</s:url>

					<tr>
						<td><a href="${playerDetail}"><s:property value="name"></s:property></a></td>
					</tr>

				</s:iterator>

			</table>







		</div>

	</div>






</body>
</html>
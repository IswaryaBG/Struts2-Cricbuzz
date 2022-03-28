<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.cricbuzz.model.Player"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>Team Detail</title>
</head>
<body>
<div class="wrapper">
		<nav class="navbar">
			<img src="./images/cricbuzz.svg" class="logo" alt="logo">
			<ul>

				<li><s:a  href="index.jsp">Home</s:a></li>
				<li><s:a cssClass="current" href="teams">Teams</s:a></li>
				<li><s:a href="players">Players</s:a></li>
			</ul>
		</nav>

		<div class="center">

			<table>
			<tr>
			<th>
			<s:iterator value="teamList" begin="0" end="0" >
		<s:property value="teamName"></s:property>
		</s:iterator>
			</th>
			</tr>
			
			
			<s:iterator value="teamList">

				<s:url var="playerDetail" action="PlayerDetailAction">
  <s:param name="playerId" value="playerId"></s:param>
</s:url>
			
			
			<tr>
			<td>
			<a href="${playerDetail}"><s:property value="name"></s:property><br></a>
			</td>
			</tr>
			
			</s:iterator>
			
			</table>
				



			


		</div>

	</div>



	


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.14/angular.min.js"></script>
<link href="WebContent/WEB-INF/lib/js/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<title>BetManager</title>
</head>
<body>

	<h3>BetManager</h3>

	<form method="post" action="./AddTeam">
		Nazwa drużyny&nbsp;<input type="text" name="name" /></br> Poziom&nbsp;<input
			type="text" name="level" /></br>Liga&nbsp;<input type="text"
			name="league" /></br>Mecz&nbsp;<input type="text" name="fixture" /></br>
		<input type="submit" value="Dodaj drużynę">
	</form>

	<!-- 	<div> -->
	<!-- 		<label>Name:</label> <input type="text" ng-model="yourName" -->
	<!-- 			placeholder="Enter a name here"> -->
	<!-- 		<hr> -->
	<!-- 		<h1>Hello {{yourName}}!</h1> -->
	<!-- 	</div> -->

</body>
</html>
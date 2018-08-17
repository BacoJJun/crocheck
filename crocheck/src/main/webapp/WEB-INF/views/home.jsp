<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width">

<script
  src="https://code.jquery.com/jquery-3.3.1.min.js"
  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
  crossorigin="anonymous"></script>

</head>
<body onload="showClock()">
    <div id="divClock" class="clock"></div>


	<div id="SystemStatus" ></div>
	
	</br></br></br>
<table>
	<c:forEach  var="row" items="${list}">
				<tr>
					<td> cpu : </td>
					<td>${row.cpu_sys_pct } + ${row.cpu_user_pct} + ${row.cpu_iowait_pct}</td>
					<td>memory : </td>
					<td>${row.mem_use}</td>
					<td>${row.mem_total}</td>
				</tr>
	</c:forEach>
</table>
</body>
</html>

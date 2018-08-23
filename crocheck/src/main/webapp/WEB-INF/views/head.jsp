<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expires" content="-1">
    <!-- Main JS-->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/c3.css">
	<link rel="stylesheet" type="text/css" href="css/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/jquery.toast.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-table.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-editable.css">
	<link rel="stylesheet" type="text/css" href="css/jquery.bootstrap-touchspin.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-switch.css">
	<link rel="stylesheet" type="text/css" href="css/header.css">
	<link rel="stylesheet" type="text/css" href="css/footer.css">
	<link rel="stylesheet" type="text/css" href="css/common.css">
	<link rel="stylesheet" type="text/css" href="css/custom.css">
	
	<script type='text/javascript' src='js/jquery-3.2.1.min.js'></script>
	<script type='text/javascript' src='js/jquery-ui.min.js'></script>
	<script type='text/javascript' src='js/jquery.toast.js'></script>
	<script type='text/javascript' src='js/d3.min.js'></script>
	<script type='text/javascript' src='js/c3.min.js'></script>
	<script type='text/javascript' src='js/moment.js'></script>
	<script type='text/javascript' src='js/bootstrap.min.js'></script>

<title></title>
</head>
<body class="homes index">
	<header>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid" id="main-header">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-main">
					<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/dashboard">
				<img src="img/logo.png" width="35" height="25" alt="Logo">
				</a>
			</div>
			<div class="collapse navbar-collapse" id="navbar-collapse-main">
				<ul class="nav navbar-nav">
					<li>
					<span class="glyphicon glyphicon-dashboard" aria-hidden="true"></span> 대시보드
						<p class="here-triangle">▲</p> </a></li>

					<li>
						
					<span class="glyphicon glyphicon-bell" aria-hidden="true"></span> 파밍 
						<p class="here-triangle">▲</p> </a></li>

					<li>
					<span class="glyphicon glyphicon-pawn" aria-hidden="true"></span> 정책 관리
						<p class="here-triangle">▲</p> </a></li>
					<li>
					<span class="glyphicon glyphicon-th-list" aria-hidden="true"></span> 조직도 관리
						<p class="here-triangle">▲</p> </a></li>
					<li>
					<span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> 보고서
						<p class="here-triangle">▲</p> </a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li> Setting </a></li>
					<li> Guide </a></li>
		            <li> <a rel="nofollow" data-method="delete" href="/proc/logout">Logout</a></li>
				</ul>
			</div>
		</div>
		<div class="container-fluid" id="sub-header">
			<div class="navbar-header">
				<h3 id="current-time"></h3>
			</div>
		</div>
	</nav>
	</header>

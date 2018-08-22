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
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Dashboard</title>

    <!-- Fontfaces CSS-->
    <link href="ex/css/font-face.css" rel="stylesheet" media="all">
    <link href="ex/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="ex/vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="ex/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="ex/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="ex/vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="ex/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="ex/vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="ex/vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="ex/vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="ex/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="ex/vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="ex/css/theme.css" rel="stylesheet" media="all">

    <!-- Jquery JS-->
    <script src="ex/vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="ex/vendor/bootstrap-4.1/popper.min.js"></script>
    <script src="ex/vendor/bootstrap-4.1/bootstrap.min.js"></script>
    <!-- Vendor JS       -->
    <script src="ex/vendor/slick/slick.min.js">
    </script>
    <script src="ex/vendor/wow/wow.min.js"></script>
    <script src="ex/vendor/animsition/animsition.min.js"></script>
    <script src="ex/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
    </script>
    <script src="ex/vendor/counter-up/jquery.waypoints.min.js"></script>
    <script src="ex/vendor/counter-up/jquery.counterup.min.js">
    </script>
    <script src="ex/vendor/circle-progress/circle-progress.min.js"></script>
    <script src="ex/vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
    <script src="ex/vendor/chartjs/Chart.bundle.min.js"></script>
    <script src="ex/vendor/select2/select2.min.js">
    </script>

    <!-- Main JS-->
    <script src="js/main.js"></script>

<script type='text/javascript' src='ex/js/jquery-3.2.1.min.js'></script>
<script type='text/javascript' src='ex/js/jquery-ui.min.js'></script>
<script type='text/javascript' src='ex/js/jquery.toast.js'></script>
<script type='text/javascript' src='ex/js/d3.min.js'></script>
<script type='text/javascript' src='ex/js/c3.min.js'></script>
<script type='text/javascript' src='ex/js/moment.js'></script>
<script type='text/javascript' src='ex/js/mobile-detect.js'></script>
<script type='text/javascript' src='ex/js/daterangepicker.js'></script>
<script type='text/javascript' src='ex/js/bootstrap.min.js'></script>
<script type='text/javascript' src='ex/js/bootstrap-table.min.js'></script>1111111111111111111111111111111111111111111111111111111111111111111
<script type='text/javascript' src='ex/js/bootstrap-table-ko-KR.min.js'></script>
<script type='text/javascript' src='ex/js/bootstrap-editable.min.js'></script>
<script type='text/javascript' src='ex/js/bootstrap-table-editable.js'></script>
<script type='text/javascript' src='ex/js/jquery.bootstrap-touchspin.js'></script>
<script type='text/javascript' src='ex/js/bootstrap-switch.js'></script>
<script type='text/javascript' src='ex/js/common.js'></script>
<script>
	$(document).ready(function() {
		updateTime();
		setInterval(updateTime, 1000);

		$('[data-hide]').on('click', function() {
			$('.' + $(this).attr('data-hide')).hide();
		});

		$('.alert').delay(2400).fadeTo(760, 0.42).slideUp(500, function() {
			$(this).remove();
		});
	});
1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
	function updateTime() {
		var date = moment().format('YYYY. MM. DD HH:mm:ss');
		$('#sub-header .navbar-header #current-time').text(date);
	}
</script>
<title>CROCHECK</title>
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
					<span class="glyphicon glyphicon-dashboard" aria-hidden="true"></span> 대시보드
						<p class="here-triangle">▲</p> </a></li>
					<li>
					<span class="glyphicon glyphicon-bell" aria-hidden="true"></span> 파밍 
						<p class="here-triangle">▲</p> </a></li>
					<span class="glyphicon glyphicon-pawn" aria-hidden="true"></span> 정책 관리
						<p class="here-triangle">▲</p> </a></li>
					<span class="glyphicon glyphicon-th-list" aria-hidden="true"></span> 조직도 관리
						<p class="here-triangle">▲</p> </a></li>
					<span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> 보고서
						<p class="here-triangle">▲</p> </a></li>
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

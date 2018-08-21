<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="au theme template">
<meta name="author" content="Hau Nguyen">
<meta name="keywords" content="au theme template">

<!-- Title Page-->
<title>Dashboard</title>

<!-- Fontfaces CSS-->
<link href="css/font-face.css" rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-5/css/fontawesome-all.min.css"
	rel="stylesheet" media="all">
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet"
	media="all">

<!-- Vendor CSS-->
<link href="vendor/animsition/animsition.min.css" rel="stylesheet"
	media="all">
<link
	href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet" media="all">
<link href="vendor/wow/animate.css" rel="stylesheet" media="all">
<link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet"
	media="all">
<link href="vendor/slick/slick.css" rel="stylesheet" media="all">
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/perfect-scrollbar/perfect-scrollbar.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="css/theme.css" rel="stylesheet" media="all">

</head>

<body>
	<div class="page-wrapper">
		<!-- HEADER MOBILE-->
		<!-- END HEADER MOBILE-->

		<!-- PAGE CONTAINER-->
		<div class="container">
			<!-- HEADER DESKTOP-->
			<!-- HEADER DESKTOP-->

			<!-- MAIN CONTENT-->
			<div class="content">
				<div class="section__content section__content--p60 ">
					<div class="container-fluid">
						<div class="row">
							<div class="col-md-12">
								<div class="overview-wrap">
									<h2 class="title-1">2018. 08. 07 10:00:00</h2>
									<button class="au-btn au-btn-icon au-btn--blue">
										<i class="zmdi zmdi-plus"></i>MENU
									</button>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="row col-sm-6 col-lg-8">
								<div class="col-sm-6 col-lg-6">
									<div class="overview-item overview-item--c1">
										<div class="overview__inner">
											<div class="overview-box clearfix">
												<div class="text-right" style="color: white;">
													<span>Today</span>
													<h2 style="color: white;" id="dayPharmingList">1036128</h2>
													<p> yesterday </p>
													<span style="color: white;" id="yesterdayPharmingList"></span> 
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6 col-lg-6">
									<div class="overview-item overview-item--c4">
										<div class="overview__inner">
											<div class="overview-box clearfix">
												<div class="text-right">
													<span>Last 5 Min</span>
													<h2 style="color: white;" id="nowPharmingList">1036128</h2>
													<p> 1 Hour </p>
													<span style="color: white;" id="hourPharmingList"></span> 
												</div>

											</div>
										</div>
									</div>
								</div>

								<div class="au-cardw col-lg-12">
									<div class="au-card-inner">
										<div class="cahrtjs-size-monitor">
											<canvas id="barChart" style="height: 480px;"></canvas>
										</div>
									</div>
								</div>
							</div>
							<div class="row col-sm-6 col-lg-4">
								<div class="col-sm-6 col-lg-6">
									<div class="statistic__item statistic__item--blue">
										<div class="overview__inner">
											<div class="overview-box clearfix">
												<div class="text-right" style="color: white;">
													<h2 class="text-left" style="color: white;">CPU</h2>
													<h4 style="color: white;" id="cpu_idle">52%</h2>
													<p>
														IOWait : <span id="cpu_iowait">48</span>
													</p>
													<p>
														System : <span id="cpu_sys">0%</span>
													</p>
													<p>
														User : <span id="cpu_user">48</span>
													</p>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6 col-lg-6">
									<div class="statistic__item statistic__item--blue">
										<div class="overview__inner">
											<div class="overview-box clearfix">
												<div class="text-right" style="color: white;">
													<h2 style="color: white;">MEMORY</h2>
													<h4 style="color: white;" id="mem_percentage">32%</h2>
													<p class="text-right" id="mem_total"></p>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-md-6 col-lg-6">
									<div class="statistic__item statistic__item--blue">
										<div class="overview__inner">
											<div class="overview-box clearfix">
												<div style="color: white;">
													<h2 class="text-left">Network</h2>
													<h4 class="desc" id="bytes_rx_total">Idle : 48% </h4></br> <h4
														class="desc" id="pkts_rx_total">IOWait : 0%</h4></br>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-md-6 col-lg-6">
									<div class="statistic__item statistic__item--blue">
										<div class="overview__inner">
											<div class="overview-box clearfix">
												<div style="color: white;">
													<h2 class="text-left" style="color: white;">DISK</h2>
													<h4 class="text-left" style="color: white;" id="disk1"></h2>
													<h4 class="text-left" style="color: white;" id="disk2"></h2>
													<h4 class="text-left" style="color: white;" id="disk3"></h2>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6 col-lg-6">
								<h2 class="title-1 m-b-25">Domain Top List</h2>
								<div class="table-responsive table--no-card m-b-40">
									<table
										class="table table-borderless table-striped table-earning">
										<thead>
											<tr>
												<th>Domain</th>
												<th>Count</th>
											</tr>
										</thead>
										<tbody id="show_domain">
										</tbody>
									</table>
								</div>
							</div>
							<div class="col-sm-6 col-lg-6">
								<h2 class="title-1 m-b-25">Client Top List</h2>
								<div class="table-responsive table--no-card m-b-40">
									<div class="au-card-inner">
										<div class="table-responsive">
											<table
												class="table table-borderless table-striped table-earning">
												<thead>
													<tr>
														<th>Client</th>
														<th>Count</th>
													</tr>
												</thead>
												<tbody id="show_departure">
												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="copyright">
									<p>HUMANSTAR</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- END MAIN CONTENT-->
		<!-- END PAGE CONTAINER-->
	</div>

	</div>

	<!-- Jquery JS-->
	<script src="vendor/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap JS-->
	<script src="vendor/bootstrap-4.1/popper.min.js"></script>
	<script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
	<!-- Vendor JS       -->
	<script src="vendor/slick/slick.min.js">
		
	</script>
	<script src="vendor/wow/wow.min.js"></script>
	<script src="vendor/animsition/animsition.min.js"></script>
	<script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
		
	</script>
	<script src="vendor/counter-up/jquery.waypoints.min.js"></script>
	<script src="vendor/counter-up/jquery.counterup.min.js">
		
	</script>
	<script src="vendor/circle-progress/circle-progress.min.js"></script>
	<script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
	<script src="vendor/chartjs/Chart.bundle.min.js"></script>
	<script src="vendor/select2/select2.min.js">
		
	</script>
	<!-- Main JS-->
	<!-- <script src="js/main.js"></script>-->
	<script type="text/javascript" src="/crocheck/js/refresh.js"></script>




</body>

</html>
<!-- end document-->

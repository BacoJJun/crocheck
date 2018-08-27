<!DOCTYPE html>
<html lang="en">
<%@ include file="header.jsp"%>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col">
				<div class="left_col scroll-view">
					<div class="navbar nav_title" style="border: 0;">
						<a href="/crocheck" class="site_title"> <span>CROCHECK
								SDNS</span></a>
					</div>

					<div class="clearfix"></div>

					<br />

					<!-- sidebar menu -->
					<%@ include file="side.jsp"%>
					<!-- sidebar menu -->
				</div>
			</div>

			<!-- top navigation -->
			<div class="top_nav">
				<div class="nav_menu">
					<nav>
						<div class="nav toggle">
							<a id="menu_toggle"><i class="fa fa-bars"></i></a>
						</div>

						<ul class="nav navbar-nav navbar-right">
							<li class=""><a href="javascript:;"
								class="user-profile dropdown-toggle" data-toggle="dropdown"
								aria-expanded="false"> Administator<span
									class=" fa fa-angle-down"></span>
							</a>
								<ul class="dropdown-menu dropdown-usermenu pull-right">
									<li><a href="javascript:;"> Profile</a></li>
									<li><a href="javascript:;"> <span
											class="badge bg-red pull-right">50%</span> <span>Settings</span>
									</a></li>
									<li><a href="javascript:;">Help</a></li>
									<li><a href="login.html"><i
											class="fa fa-sign-out pull-right"></i> Log Out</a></li>
								</ul></li>

							<li role="presentation" class="dropdown"><a
								href="javascript:;" class="dropdown-toggle info-number"
								data-toggle="dropdown" aria-expanded="false"> <i
									class="fa fa-bell-o"></i> <span class="badge bg-green">6</span>
							</a>
								<ul id="menu1" class="dropdown-menu list-unstyled msg_list"
									role="menu">
									<li><a> <span class="image"><img
												src="images/img.jpg" alt="Profile Image" /></span> <span> <span>John
													Smith</span> <span class="time">3 mins ago</span>
										</span> <span class="message"> Film festivals used to be
												do-or-die moments for movie makers. They were where... </span>
									</a></li>
									<li><a> <span class="image"><img
												src="images/img.jpg" alt="Profile Image" /></span> <span> <span>John
													Smith</span> <span class="time">3 mins ago</span>
										</span> <span class="message"> Film festivals used to be
												do-or-die moments for movie makers. They were where... </span>
									</a></li>
									<li><a> <span class="image"><img
												src="images/img.jpg" alt="Profile Image" /></span> <span> <span>John
													Smith</span> <span class="time">3 mins ago</span>
										</span> <span class="message"> Film festivals used to be
												do-or-die moments for movie makers. They were where... </span>
									</a></li>
									<li><a> <span class="image"><img
												src="images/img.jpg" alt="Profile Image" /></span> <span> <span>John
													Smith</span> <span class="time">3 mins ago</span>
										</span> <span class="message"> Film festivals used to be
												do-or-die moments for movie makers. They were where... </span>
									</a></li>
									<li>
										<div class="text-center">
											<a> <strong>See All Alerts</strong> <i
												class="fa fa-angle-right"></i>
											</a>
										</div>
									</li>
								</ul></li>
						</ul>
					</nav>
				</div>
			</div>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main">
				<!-- top tiles -->
				<div class="row tile_count">
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top">Total Query</span>
						<div class="count">2500</div>
						<span class="count_bottom"><i class="green">4% </i> From
							yesterday</span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top">Last 1 Hours Query</span>
						<div class="count">123.50</div>
						<span class="count_bottom"><i class="green"><i
								class="fa fa-sort-asc"></i>3% </i> From last Week</span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-check"></i> Now
							Query</span>
						<div class="count green">2,500</div>
						<span class="count_bottom"><i class="green"><i
								class="fa fa-sort-asc"></i>34% </i> From last Week</span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-user"></i> Today
							DDOS</span>
						<div class="count">25</div>
						<span class="count_bottom"><i class="red"><i
								class="fa fa-sort-desc"></i>12% </i> From last Week</span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-user"></i> Last 1
							Hours DDOS</span>
						<div class="count">20</div>
						<span class="count_bottom"><i class="green"><i
								class="fa fa-sort-asc"></i>34% </i> From last Week</span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-user"></i> Now DDOS</span>
						<div class="count">0</div>
						<span class="count_bottom"><i class="green"><i
								class="fa fa-sort-asc"></i>34% </i> From last Week</span>
					</div>
					<!-- /top tiles -->

					<!--  main graph  left 2/3-->
					<div class="col-md-6">
						<div class="x_panel">
							<div class="x_title">
								<h2>Today Query graph</h2>
								 <div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="col-md-12 col-sm-12 col-xs-12">
									<div class="demo-container" style="height: 280px">
										<div id="chart_plot_02" class="demo-placeholder"></div>
									</div>
									<div class="tiles">
										<div class="col-md-4 tile">
											<span>Yesterday Query Status</span>
											<h2>231,809</h2>
										</div>
										<div class="col-md-4 tile">
											<span>Yesterday Query Average</span>
											<h2>$231,809</h2>
										</div>
										<div class="col-md-4 tile">
											<span>Yesterday DDOS Status</span>
											<h2>231,809</h2>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="x_panel">
							<div class="panel panel-body">
								<div class="x_title">
									<h4>Appliance Status</h4>
								</div>
								<div class="row">
									<div class="col-xs-4">
										<span class="chart" data-percent="86"> <span
											class="percent"></span>
										</span>
									</div>
									<div class="col-xs-4">
										<span class="chart" data-percent="73"> <span
											class="percent"></span>
										</span>
									</div>
									<div class="col-xs-4">
										<span class="chart" data-percent="60"> <span
											class="percent"></span>
										</span>
									</div>
									<div class="clearfix"></div>
								</div>

							</div>
						</div>
					</div>
					<!--  end main graph  left 2/3-->

					<!--  main table right 1/3 -->
					<div class="col-md-6 col-sm-6 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>
									DNS <small>Top Query List</small>
								</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<table class="table table-striped">
									<thead>
										<tr>
											<th>#</th>
											<th>Client</th>
											<th>Domain</th>
											<th>Count</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<th scope="row">1</th>
											<td>Mark</td>
											<td>Otto</td>
											<td>@mdo</td>
										</tr>
										<tr>
											<th scope="row">2</th>
											<td>Jacob</td>
											<td>Thornton</td>
											<td>@fat</td>
										</tr>
										<tr>
											<th scope="row">3</th>
											<td>Larry</td>
											<td>the Bird</td>
											<td>@twitter</td>
										</tr>
										<tr>
											<th scope="row">3</th>
											<td>Larry</td>
											<td>the Bird</td>
											<td>@twitter</td>
										</tr>
										<tr>
											<th scope="row">3</th>
											<td>Larry</td>
											<td>the Bird</td>
											<td>@twitter</td>
										</tr>
										<tr>
											<th scope="row">1</th>
											<td>Mark</td>
											<td>Otto</td>
											<td>@mdo</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="x_panel">
							<div class="x_title">
								<h2>
									DDOS <small>Top List</small>
								</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<table class="table table-striped">
									<thead>
										<tr>
											<th>#</th>
											<th>Source IP</th>
											<th>Domain</th>
											<th>Count</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<th scope="row">1</th>
											<td>Mark</td>
											<td>Otto</td>
											<td>@mdo</td>
										</tr>
										<tr>
											<th scope="row">2</th>
											<td>Jacob</td>
											<td>Thornton</td>
											<td>@fat</td>
										</tr>
										<tr>
											<th scope="row">3</th>
											<td>Larry</td>
											<td>the Bird</td>
											<td>@twitter</td>
										</tr>
										<tr>
											<th scope="row">3</th>
											<td></td>
											<td></td>
											<td></td>
										</tr>
										<tr>
											<th scope="row">3</th>
											<td>Larry</td>
											<td>the Bird</td>
											<td>@twitter</td>
										</tr>
										<tr>
											<th scope="row">1</th>
											<td>Mark</td>
											<td>Otto</td>
											<td>@mdo</td>
										</tr>
									</tbody>
								</table>

							</div>
						</div>
					</div>
					<!--  end main table  -->
					<!-- /page content -->

				</div>
			</div>
				<!-- jQuery -->
				<script src="js/jquery.min.js"></script>
				<!-- Bootstrap -->
				<script src="js/bootstrap.min.js"></script>
				<!-- FastClick -->
				<script src="js/fastclick.js"></script>
				<!-- NProgress -->
				<script src="js/nprogress.js"></script>
				<!-- Chart.js -->
				<script src="js/Chart.min.js"></script>
				<!-- gauge.js -->
				<script src="js/gauge.min.js"></script>
				<!-- bootstrap-progressbar -->
				<script src="js/bootstrap-progressbar.min.js"></script>
				<!-- iCheck -->
				<script src="js/icheck.min.js"></script>
				<!-- Skycons -->
				<script src="js/skycons.js"></script>
				<!-- Flot -->
				<script src="js/jquery.flot.js"></script>
				<script src="js/jquery.flot.pie.js"></script>
				<script src="js/jquery.flot.time.js"></script>
				<script src="js/jquery.flot.stack.js"></script>
				<script src="js/jquery.flot.resize.js"></script>
				<!-- Flot plugins -->
				<script src="js/jquery.flot.orderBars.js"></script>
				<script src="js/jquery.flot.spline.min.js"></script>
				<script src="js/curvedLines.js"></script>
				<!-- DateJS -->
				<script src="js/date.js"></script>
				<!-- JQVMap -->
				<script src="js/jquery.vmap.js"></script>
				<script src="js/jquery.vmap.world.js"></script>
				<script src="js/jquery.vmap.sampledata.js"></script>
				<!-- bootstrap-daterangepicker -->
				<script src="js/moment.min.js"></script>
				<script src="js/daterangepicker.js"></script>
				<script src="js/jquery.easypiechart.min.js"></script>

				<!-- Custom Theme Scripts -->
				<script src="js/custom.min.js"></script>
</body>
</html>

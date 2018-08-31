<!DOCTYPE html>
<html lang="en">


<body class="nav-sm">
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
			<%@ include file="header.jsp"%>
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
				<div class="row ">
					<div class="col-md-4"></div>
					<div class="col-md-4">
						<div class="radio">
							<label>
							 <input type="radio" class="flat" checked name="check_time" id="check_last_min""> Last 5 Minutes
							 </label>
							 <label>
							 <input type="radio" class="flat" name="check_time" id="check_mins"> Minutes	
							 </label>
							 <label>
							 <input type="radio" class="flat"  name="check_time" id="check_hours"> Hours 
							 </label>
							 <label>
							 <input type="radio" class="flat" name="check_time" id="check_days"> Days
							</label>
						</div>
						</div>
						<div class="col-md-3">
							<form class="form-horizontal">
								<fieldset>
									<div class="control-group">
										<div class="controls">
											<div class="input-prepend input-group">
												<span class="add-on input-group-addon"><i
													class="glyphicon glyphicon-calendar fa fa-calendar"></i></span> <input
													type="text" name="reservation-times" id="reservation-time"
													class="form-control"  disabled="disabled" value="" />
											</div>
										</div>
									</div>
								</fieldset>
							</form>

						</div>
						<button type="button" class="btn btn-success">Success</button>
					</div>


					<div class="row">
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										DNS QUERY <small>Dns query </small>
									</h2>

									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<canvas id="lineChart-dns"></canvas>
								</div>
							</div>
						</div>
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										DNS QUERY STATUS <small>Dns query status</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<div id="echart_pie_dns" style="height: 250px;"></div>
								</div>
							</div>
						</div>

						<div class="col-md-4 col-sm-4 col-xs-4">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										DNS QUERY TOP LIST <small>Dns query top list</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>CLIENT</th>
												<th>DOMAIN</th>
												<th>COUNT</th>
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
												<th scope="row"></th>
												<td></td>
												<td></td>
												<td></td>
											</tr>
										</tbody>
									</table>

								</div>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="row">
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										DDOS COUNT<small>DDOS Count</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<canvas id="lineChart-ddos"></canvas>
								</div>
							</div>
						</div>
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										DDOS STATUS <small>DDos Status</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<div id="echart_pie_ddos" style="height: 250px;"></div>
								</div>
							</div>
						</div>
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										DDOS TOP LIST<small>DDos top list</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>SOURCE IP</th>
												<th>DOMAIN</th>
												<th>COUNT</th>
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
												<th scope="row"></th>
												<td></td>
												<td></td>
												<td></td>
											</tr>
										</tbody>
									</table>

								</div>
							</div>
						</div>
					</div>
				</div>



			</div>
		</div>

		<!--end  page content -->

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
		<script src="js/echarts.min.js"></script>

		<!-- Custom Theme Scripts -->
		<script src="js/statistics.js"></script>
		<script src="js/custom.js"></script>
</body>
</html>

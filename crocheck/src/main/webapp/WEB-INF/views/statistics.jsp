<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<!--header include-->
<%@ include file="header.jsp"%>

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

			<!--  top navigation -->
			<%@ include file="top.jsp"%>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col">
				<div class="row ">
					<div class="col-md-4"></div>
					<div class="col-md-4">
						<form class="radio">
							<label> <input type="radio" class="flat"
								name="check_time" value="last_min" checked>Last 10
									Minutes </input>
							</label> <label> <input type="radio" class="flat"
								name="check_time" value="min"></input>Minutes
							</label> <label> <input type="radio" class="flat"
								name="check_time" value="hour"></input>Hours
							</label> <label> <input type="radio" class="flat"
								name="check_time" value="day"></input>Days
							</label>
						</form>
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
												class="form-control" value="" />
										</div>
									</div>
								</div>
							</fieldset>
						</form>

					</div>
					<button type="button" class="btn btn-success" id="search_stat">SUBMIT</button>
				</div>

				<div class="x_panel">
					<div class="row">
						<div class="col-md-4 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>Bar Graph</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<div id="topListquery" style="height: 270px;"></div>
								</div>
							</div>
						</div>
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
						<div class="col-md-4 col-sm-12 col-sm-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>Appliance Status</h2>

									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<canvas id="lineChart-app"></canvas>
								</div>
							</div>
						</div>
					</div>
					<div class="row">

						<div class="col-md-3 col-sm-6 col-xs-4">
							<div class="x_panel tile fixed_height_320 overflow_hidden">
								<div class="x_title">
									<h2>DNS Query</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<table class="" style="width: 100%">
										<tr>
											<th style="width: 37%;">
												<p>Top 5</p>
											</th>
											<th>
												<div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">
													<p class="">Domain</p>
												</div>
												<div class="col-lg-5 col-md-5 col-sm-5 col-xs-5 text-right">
													<p class="">Count(%)</p>
												</div>
											</th>
										</tr>
										<tr>
											<td><canvas class="canvasDoughnut" height="140"
													width="140" style="margin: 15px 10px 10px 0"></canvas></td>
											<td>
												<table class="tile_info">
													<tr>
														<td>
															<p>
																<i class="fa fa-square blue"></i>IOS
															</p>
														</td>
														<td>30%</td>
													</tr>
													<tr>
														<td>
															<p>
																<i class="fa fa-square green"></i>Android
															</p>
														</td>
														<td>10%</td>
													</tr>
													<tr>
														<td>
															<p>
																<i class="fa fa-square purple"></i>Blackberry
															</p>
														</td>
														<td>20%</td>
													</tr>
													<tr>
														<td>
															<p>
																<i class="fa fa-square aero"></i>Symbian
															</p>
														</td>
														<td>15%</td>
													</tr>
													<tr>
														<td>
															<p>
																<i class="fa fa-square red"></i>Others
															</p>
														</td>
														<td>30%</td>
													</tr>
												</table>
											</td>
										</tr>
									</table>
								</div>
							</div>
						</div>


						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>DDos Client List</h2>
									<div class="clearfix"></div>
								</div>
								<div class="ddos_progress">

									<table class="table table-striped">
										<thead>
											<tr>
												<th width="20%">SOURCE IP</th>
												<th width="70%">  </th>
												<th width="10%">% </th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>192.168.0.40</td>
												<td  >
													<div class="progress">
														<div class="progress-bar progress-bar-success"
															data-transitiongoal="100%">12513</div>
													</div>
												</td>
												<td>100%</td>
											</tr>
																						<tr>
												<td>192.168.0.40</td>
												<td  >
													<div class="progress">
														<div class="progress-bar progress-bar-success"
															data-transitiongoal="100%">12513</div>
													</div>
												</td>
												<td>100%</td>
											</tr>
																						<tr>
												<td>192.168.0.40</td>
												<td>
													<div class="progress">
														<div class="progress-bar progress-bar-success"
															data-transitiongoal="50%">6524</div>
													</div>
												</td>
												<td>100%</td>
											</tr>
																						<tr>
												<td>192.168.0.40</td>
												<td  >
													<div class="progress">
														<div class="progress-bar progress-bar-success"
															data-transitiongoal="100%">12513</div>
													</div>
												</td>
												<td>100%</td>
											</tr>
											
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="col-md-3 col-sm-6 col-xs-4">
							<div class="x_panel tile fixed_height_320 overflow_hidden">
								<div class="x_title">
									<h2>Device Usage</h2>
									<ul class="nav navbar-right panel_toolbox">
										<li><a class="collapse-link"><i
												class="fa fa-chevron-up"></i></a></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown" role="button" aria-expanded="false"><i
												class="fa fa-wrench"></i></a>
											<ul class="dropdown-menu" role="menu">
												<li><a href="#">Settings 1</a></li>
												<li><a href="#">Settings 2</a></li>
											</ul></li>
										<li><a class="close-link"><i class="fa fa-close"></i></a>
										</li>
									</ul>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<table class="" style="width: 100%">
										<tr>
											<th style="width: 37%;">
												<p>Top 5</p>
											</th>
											<th>
												<div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">
													<p class="">Device</p>
												</div>
												<div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
													<p class="">Progress</p>
												</div>
											</th>
										</tr>
										<tr>
											<td><canvas class="canvasDoughnut" height="140"
													width="140" style="margin: 15px 10px 10px 0"></canvas></td>
											<td>
												<table class="tile_info">
													<tr>
														<td>
															<p>
																<i class="fa fa-square blue"></i>IOS
															</p>
														</td>
														<td>30%</td>
													</tr>
													<tr>
														<td>
															<p>
																<i class="fa fa-square green"></i>Android
															</p>
														</td>
														<td>10%</td>
													</tr>
													<tr>
														<td>
															<p>
																<i class="fa fa-square purple"></i>Blackberry
															</p>
														</td>
														<td>20%</td>
													</tr>
													<tr>
														<td>
															<p>
																<i class="fa fa-square aero"></i>Symbian
															</p>
														</td>
														<td>15%</td>
													</tr>
													<tr>
														<td>
															<p>
																<i class="fa fa-square red"></i>Others
															</p>
														</td>
														<td>30%</td>
													</tr>
												</table>
											</td>
										</tr>
									</table>
								</div>
							</div>
						</div>


						<div class="col-md-3 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>DDos Client List</h2>
									<div class="clearfix"></div>
								</div>
								<div class="ddos_progress">

									<table class="table table-striped">
										<thead>
											<tr>
												<th width="20%">SOURCE IP</th>
												<th width="70%">  </th>
												<th width="10%">% </th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>192.168.0.40</td>
												<td  >
													<div class="progress">
														<div class="progress-bar progress-bar-success"
															data-transitiongoal="100%">12513</div>
													</div>
												</td>
												<td>100%</td>
											</tr>
																						<tr>
												<td>192.168.0.40</td>
												<td  >
													<div class="progress">
														<div class="progress-bar progress-bar-success"
															data-transitiongoal="100%">12513</div>
													</div>
												</td>
												<td>100%</td>
											</tr>
																						<tr>
												<td>192.168.0.40</td>
												<td>
													<div class="progress">
														<div class="progress-bar progress-bar-success"
															data-transitiongoal="50%">6524</div>
													</div>
												</td>
												<td>100%</td>
											</tr>
																						<tr>
												<td>192.168.0.40</td>
												<td  >
													<div class="progress">
														<div class="progress-bar progress-bar-success"
															data-transitiongoal="100%">12513</div>
													</div>
												</td>
												<td>100%</td>
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

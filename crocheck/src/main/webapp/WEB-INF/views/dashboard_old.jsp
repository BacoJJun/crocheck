<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<!--header include-->
<%@ include file="header.jsp"%>

<body class="nav-sm">
	<div class="container body" id="fullscreen">
		<div class="main_container">

			<!-- sidebar menu -->
			<%@ include file="side.jsp"%>
			<!-- sidebar menu -->


			<!--  top navigation -->
			<%@ include file="top.jsp"%>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main" style="height: 100%">
				<div class="x_panel">
					<div class="row">
						<!--  CPU CHART -->
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										CPU<small>Usage</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<div id="cpu_donut" style="height: 350px;"></div>
								</div>
							</div>
						</div>
						<!-- CPU CHART END -->


						<!-- MEMORY CHART -->
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										Bar graph <small>Sessions</small>
									</h2>
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
									<canvas id="memorygraph"></canvas>
								</div>
							</div>
						</div>
						<!-- MEMORY CHART END -->


						<!-- DISK CHART  -->
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>Horizontal Bar</h2>
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

									<div id="disk_bar_horizontal" style="height: 370px;"></div>

								</div>
							</div>
						</div>
						<!-- DISK CHART END -->


						<!-- NETWORK CHART -->
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>Line Graph</h2>
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

									<div id="network_line" style="height: 350px;"></div>

								</div>
							</div>
						</div>
						<!-- NETWORK CHART END -->
					</div>
					<div class="row">
						<!-- QUERY CHART  -->
						<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>Line Graph</h2>
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

									<div id="packet_line" style="height: 350px;"></div>

								</div>
							</div>
						</div>
						<!-- QUERY CHART END -->

						<!-- DNS DOMAIN -->
						<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										DNS <small>Top list</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Source IP</th>
												<th>Domain</th>
												<th>Count</th>
											</tr>
										</thead>
										<tbody id="show_dns">
										</tbody>
									</table>

								</div>
							</div>
						</div>
						<!-- DNS DOMAIN END -->

						<!-- DNS CLENT -->
						<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										DDOS <small>Top List</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Source IP</th>
												<th>Domain</th>
												<th>Count</th>
											</tr>
										</thead>
										<tbody id="show_ddos">
										</tbody>
									</table>

								</div>
							</div>
						</div>
						<!-- DNS CLENT END -->
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
	<script src="js/echarts.min.js"></script>
	<script src="js/jquery.easypiechart.min.js"></script>
	<!-- Datatables -->
	<script src="js/datatables.net/js/jquery.dataTables.min.js"></script>
	<script src="js/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
	<script src="js/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
	<script src="js/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
	<script src="js/datatables.net-buttons/js/buttons.flash.min.js"></script>
	<script src="js/datatables.net-buttons/js/buttons.html5.min.js"></script>
	<script src="js/datatables.net-buttons/js/buttons.print.min.js"></script>
	<script
		src="js/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
	<script src="js/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
	<script
		src="js/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
	<script
		src="js/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
	<script src="js/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
	<script src="js/jquery.fullscreen.min.js"></script>
	<script src="js/fullscreen.js"></script>

	<!-- Custom Theme Scripts -->
	<script src="js/dashboard_old.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

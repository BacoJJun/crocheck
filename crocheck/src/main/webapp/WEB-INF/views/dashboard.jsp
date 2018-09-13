<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<!--header include-->
<%@ include file="header.jsp"%>

<body class="nav-sm">
	<div class="container body" id="fullscreen" >
		<div class="main_container">

			<!-- sidebar menu -->
			<%@ include file="side.jsp"%>
			<!-- sidebar menu -->


			<!--  top navigation -->
			<%@ include file="top.jsp"%>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main"  style="height:100%" >
			<div class="x_panel">
				<!-- top tiles -->
				<div class="row tile_count">
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top">Total Query</span>
						<div class="count text-right" id="todayquerystat"></div>
						<span class="count_bottom"></span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top">Last 1 Hours Query</span>
						<div class="count text-right" id="minquerystat"></div>
						<span class="count_bottom"></span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-check"></i> Now
							Query</span>
						<div class="count green text-right" id="nowquerystat"></div>
						<span class="count_bottom"></span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-user"></i> Today
							DDOS</span>
						<div class="count text-right" id="todayddosstat"></div>
						<span class="count_bottom"></span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-user"></i> Last 1
							Hours DDOS</span>
						<div class="count text-right" id="minddosstat"></div>
						<span class="count_bottom"></span>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
						<span class="count_top"><i class="fa fa-user"></i> Now DDOS</span>
						<div class="count red text-right" id="nowddosstat"></div>
						<span class="count_bottom"></span>
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
										<!-- <div id="chart_plot_02_dns" class="demo-placeholder"></div> -->
										<canvas id="mybarChart_dns" class="demo-placeholder"></canvas>
									</div>
								</div>
							</div>
						</div>
						<div class="x_panel">
							<div class="panel panel-body">
								<div class="x_title">
									<h2>Appliance Status</h2>
									<div class="clearfix"></div>
								</div>
								<div class="row">
									<div class="col-xs-4">
										<div class="x_content">
											<div id="echart_gauge_cpu" style="height: 200px;"></div>
										</div>
									</div>
									<div class="col-xs-4">
										<div class="x_content">
											<div id="echart_gauge_memory" style="height: 200px;"></div>
										</div>
									</div>
									<div class="col-xs-4">
										<div class="x_content">
											<div id="echart_gauge_disk" style="height: 200px;"></div>
										</div>
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
								<table class="table table-bordered">
									<thead>
										<tr>
											<th>#</th>
											<th>Client</th>
											<th>Domain</th>
											<th>Count</th>
										</tr>
									</thead>
									<tbody id="show_dns">
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
					<!--  end main table  -->
					<!-- /page content -->

				</div>
			</div>
			</div>
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
	<script src="js/custom.js"></script>
	<script src="js/sdnsdashboard.js"></script>
</body>
</html>

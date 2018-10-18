<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="ko" data-placeholders-focus="false">
<!--header include-->
<%@ include file="header.jsp"%>

<body class="nav-sm">
	<div class="container body">
		<div class="main_container">
			<!-- sidebar menu -->
			<%@ include file="side.jsp"%>
			<!-- sidebar menu -->

			<!--  top navigation -->
			<%@ include file="top.jsp"%>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main" style="height=900px;">
				<div class="row ">

					<!--  Report start -->
					<div class="x_panel">
						<div class="x_title">
							<h2>
								임계값 설정 <small></small>
							</h2>

							<div class="clearfix"></div>
						</div>

						<!-- form grid slider -->
						<div class="x_panel" >

							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>CPU</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="cpu_range_graph">
									<input type="text" id="cpu_range" value="" name="range" />
								</div>
							</div>
							<br>
							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>Memory</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="memory_range_graph">
									<input type="text" id="memory_range" value="" name="range" />
								</div>
							</div>
							<br>
							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>Disk</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="disk_range_graph">
									<input type="text" id="disk_range" value="" name="range" />
								</div>
							</div>
							<br>
							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>DNS</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="dns_range_graph">
									<input type="text" id="dns_range" value="" name="range" />
								</div>
							</div>
							<br>
							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>DDOS</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="ddos_range_graph">
									<input type="text" id="ddos_range" value="" name="range" />
								</div>
							</div>
							<br><br>
																<div class="col-lg-8 col-md-8 col-sm-12 col-xs-12 text-right">
										<input type="button"
											class="btn btn-success" id="btn-save" value="save"></input>
									</div>
						</div>
						
						
					</div>
					<!--  page part -->
					
				</div>

				<!-- Report  end -->
			</div>
		</div>
		<!--end  page content -->
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
	<!-- datatable -->
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
	<script src="js/ion.rangeSlider.min.js"></script>
	<!-- Custom Theme Scripts -->

	<script src="js/alertList.js"></script>
	<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

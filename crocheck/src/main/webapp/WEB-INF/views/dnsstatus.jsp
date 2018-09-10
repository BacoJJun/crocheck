<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
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
			<div class="right_col" role="main">
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>
									DNS <small>dns</small>
								</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="col-md-5">
									<form class="form-horizontal">
										<fieldset>
											<div class="control-group">
												<div class="controls">
													<div class="input-prepend input-group">
														<span class="add-on input-group-addon"><i
															class="glyphicon glyphicon-calendar fa fa-calendar"></i></span>
														<input type="text" name="reservation-time"
															id="reservation-time" class="form-control" />
													</div>
												</div>
											</div>
										</fieldset>
										<input type="hidden" name="date_start" id="date_start" /> <input
											type="hidden" name="date_end" id="date_end" />

									</form>

								</div>
								<button id="submit" type="button"
									class="btn btn-success fa fa-search"></button>
								<button id="pause" type="button"
									class="btn btn-info fa fa-pause"></button>
								<button id="play" type="button"
									class="btn btn-warning fa fa-play"></button>
								<table id="dnsdatatable"
									class="table table-striped table-bordered dt-responsive nowrap">
									<thead>
										<tr>
											<th>Client</th>
											<th>Domain</th>
											<th>Server IP</th>
											<th>Query Time</th>
										</tr>
									</thead>
									<tbody id="show_dns_list">
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!--end  page content -->
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
	<script src="js/jquery.easypiechart.min.js"></script>
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
	<script src="js/pdfmake/build/pdfmake.min.js"></script>

	<!-- Custom Theme Scripts -->
	<script src="js/dnsstatus.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

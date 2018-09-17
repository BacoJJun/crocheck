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
			<div class="right_col" role="main">
				<div class="row ">

					<!--  Report start -->
					<div class="x_panel">
						<div class="x_title">
							<h2>
								ALERT<small></small>
							</h2>

							<div class="clearfix"></div>
						</div>

						<!--  page part -->
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<!-- report view part -->
								<div class="col-md-9" style="overflow-y: auto; height: 600px;">

									<!--  update liststart -->
									<div class="x_panel">
										<div class="x_title">
											<h2>
												CRITICAL VALUE <small></small>
											</h2>

											<div class="clearfix"></div>
										</div>
										<div class="x_content">
											<table class="table table-bordered">
												<colgroup>
													<col width="20%" />
													<col width="40%" />
													<col width="40%" />
												</colgroup>
												<thead>
													<tr>
														<th>TYPE</th>
														<th>WARNING</th>
														<th>CRITICAL</th>
													</tr>
												</thead>
												<tbody>
												<tr>
													<td>CPU</td>
													<td>  <input type="number" id="cpu_warning" name="cpu_warning" required="required" data-validate-minmax="0,100" class="form-control col-md-7 col-xs-12"></td>
													<td>   <input type="number" id="cpu_critical" name="cpu_critical" required="required" data-validate-minmax="0,100" class="form-control col-md-7 col-xs-12"></td>
												</tr>
													<tr>
													<td>MEMORY</td>
													<td>  <input type="number" id="memory_warning" name="memory_warning" required="required" data-validate-minmax="0,100" class="form-control col-md-7 col-xs-12"></td>
													<td>   <input type="number" id="memory_critical" name="memory_critical" required="required" data-validate-minmax="0,100" class="form-control col-md-7 col-xs-12"></td>
												</tr>
													<tr>
													<td>DISK</td>
													<td>  <input type="number" id="disk_warning" name="disk_warning" required="required" data-validate-minmax="0,100" class="form-control col-md-7 col-xs-12"></td>
													<td>   <input type="number" id="disk_critical" name="disk_critical" required="required" data-validate-minmax="0,100" class="form-control col-md-7 col-xs-12"></td>
												</tr>
													<tr>
													<td>DNS</td>
													<td>  <input type="number" id="dns_warning" name="dns_warning" required="required" data-validate-minmax="0,100000000" class="form-control col-md-7 col-xs-12"></td>
													<td>   <input type="number" id="dns_critical" name="dns_critical" required="required" data-validate-minmax="0,100000000" class="form-control col-md-7 col-xs-12"></td>
												</tr>
													<tr>
													<td>DDOS</td>
													<td>  <input type="number" id="ddos_warning" name="ddos_warning" required="required" data-validate-minmax="0,100000000" class="form-control col-md-7 col-xs-12"></td>
													<td>   <input type="number" id="ddos_critical" name="ddos_critical" required="required" data-validate-minmax="0,100000000" class="form-control col-md-7 col-xs-12"></td>
												</tr>
												</tbody>
											</table>
										</div>
										<div class="clearfix"></div>
										<div>
											<input type="button" class="btn btn-info btn-reset" id="btn-reset" value="reset"></input>
											<input type="button" class="btn btn-success" id="btn-save" value="save"
											></input>
										</div>
									</div>
								</div>
								<!-- update list end -->

							</div>
							<!-- report check list end -->
						</div>
					</div>

					<!-- Report  end -->
				</div>
			</div>
			<!--end  page content -->
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
	<!-- Custom Theme Scripts -->

	<script src="js/alertList.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

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
								Alert Message List<small></small>
							</h2>

							<div class="clearfix"></div>
						</div>

						<!--  page part -->
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								
								<div class="x_panel">
									<div class="x_content">
										<!--search start -->
										<div class="x_panel">
											<div class="x_title">
												<div class="row">

												<div class="col-lg-2 col-md-2"><h2>검색조건</h2></div>

												<div class="col-lg-8 col-md-8">
													<div id="reportrange" class="pull-right"
														style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
														<i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
														<span></span> <b class="caret"></b>
													</div>
													<div class="clearfix"></div>
												</div>
												<div class="col-lg-1 col-md-1">
													<button type="button" class="btn btn-success">
														<span>SUBMIT</span>
													</button>
												</div>
											</div>
											<!--  search start -->

											</div>
											<!-- search end -->
											
											<div class="row">
												<div class="table">
													<table id="alertdatatable" class="table table-striped jambo_table bulk_action">
														<thead>
															<tr>
																<th>#</th>
																<th> Message </th>
																<th> Date </th>
																</tr>
														</thead>
														<tbody id="alertMessageListtable">
														
														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div>
								</div>
								<!-- table view end -->


							</div>
						</div>
					</div>

					<!-- Report  end -->
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
	<script src="js/alert_notice.js"></script>
	<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

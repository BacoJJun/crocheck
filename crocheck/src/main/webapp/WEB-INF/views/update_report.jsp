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
								REPORT<small></small>
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
												DNS update list <small></small>
											</h2>

											<div class="clearfix"></div>
										</div>
										<div class="x_content">
											<table id="datatable"
												class="table table-striped table-bordered">
												<colgroup>
													<col width="15%"/>
													<col width="*"/>
													<col width="10%"/>
													<col width="10%"/>
													<col width="15%"/>
												</colgroup>
												<thead>
													<tr>
														<th>type</th>
														<th>title</th>
														<th>user</th>
														<th>ip</th>
														<th>date</th>
													</tr>
												</thead>
												<tbody id="changeValueList">
												</tbody>
											</table>

										</div>
									</div>
								</div>
								<!-- update list end -->

								<!-- report check list -->
								<div class="col-md-3">
									<div class="x_panel">
										<div class="x_title">
											<h2>체크 리스트</h2>
										</div>
										<div class="clearfix"></div>

										<div class="radio" id="check_dns_domain_div">
											<label> <input type="radio" class="flat"
												id="check_dns_update" name="check_update" checked="checked">
												DNS UPDATE LIST
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" class="flat"
												id="check_dhcp_update" name="check_update"> DHCP
												UPDATE LIST
											</label>
										</div>
									</div>
									<!-- report check list -->

									<!-- report search start -->
									<div class="x_panel">
										<div class="x_title">
											<h2>
												검색조건 <small> </small>
											</h2>
										</div>
										<div class="clearfix"></div>
										<div id="reportrange" class="pull-right"
											style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
											<i class="glyphicon glyphicon-calendar fa fa-calendar"></i> <span></span>
											<b class="caret"></b>
										</div>
										<div class="clearfix"></div>
										<div class="text-right">
											<button type="button" class="btn btn-success">
												<span>SUBMIT</span>
											</button>

										</div>
									</div>
									<!-- report search end -->
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

	<script src="js/custom.js"></script>
	<script src="js/update_report.js"></script>
</body>
</html>

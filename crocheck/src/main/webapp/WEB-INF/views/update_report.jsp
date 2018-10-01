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
							<!-- report view part -->
							<div class="col-lg-9 col-md-9" style="overflow-y: auto; height: 600px;" id="changereportmain">

								<!--  update liststart -->
								<div class="x_panel">
									<div class="x_title">
										<h2>
											DNS update list <small></small>
										</h2>

										<div class="clearfix"></div>
									</div>
									<div class="x_content">
										<table id="changeValuedatatable"
											class="table table-striped table-bordered">
											<colgroup>
												<col width="5%" />
												<col width="15%" />
												<col width="*" />
												<col width="10%" />
												<col width="10%" />
												<col width="30%" />
											</colgroup>
											<thead>
												<tr>
													<th>No</th>
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

							<!-- report search list -->
							<div class="col-lg-3 col-md-3">
								<div class="x_panel">
									<div class="x_title">

										<h2>검색 조건</h2>


										<div class="clearfix"></div>
									</div>

									<div class="col-lg-6 col-md-6">
										<div class="radio" id="check_dns_domain_div">
											<label> <input type="radio" id="check_dns_update"
												name="check_change_type" checked="checked" value="dns"> DNS
											</label>
										</div>
									</div>
									<div class="col-lg-6 col-md-6">
										<div class="radio">
											<label> <input type="radio" id="check_dhcp_update"
												name="check_change_type" value="dhcp">DHCP
											</label>
										</div>
									</div>
									<div class="col-lg-10 col-md-10">
										<div class="input-prepend input-group">
											<span class="add-on input-group-addon"><i
												class="glyphicon glyphicon-calendar fa fa-calendar"></i></span> <input
												type="text" name="reservation-times" id="reservation-time"
												class="form-control" value="" />
										</div>
									</div>
									<div class="col-lg-2 col-md-2">
										<button type="button" class="btn btn-success fa fa-search"
											id="change_value_search"></button>
									</div>
								</div>
								<!-- report search list -->

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

<!-- change value detail Modal start -->
	<div id="changeValueDetailModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">상세 정보 </h4>
				</div>
				<div class="modal-body">
						 <textarea id="changeValueDetailView" name="textarea" class="form-control col-md-7 col-xs-12"></textarea>
					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-default" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> Close
							</button>
						</div>
					</div>

				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dalog -->
		</div>
	</div>
	<!-- /.modal -->
	<!--change value detail Modal end -->
	
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

	<script src="js/update_report.js"></script>
	<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

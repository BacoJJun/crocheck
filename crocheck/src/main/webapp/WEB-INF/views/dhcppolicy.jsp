<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="ko" data-placeholders-focus="false">

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
			<div class="right_col" role="main">
				<div class="row ">

					<div class="x_panel">
						<div class="x_title">
							<h2>
								DHCP <small>Dynamic Host Configuration Protocol </small>
							</h2>
							<div class="clearfix"></div>
						</div>

						<!--  dhcp  start -->
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="table-responsive">
								<table class="table table-striped jambo_table bulk_action">
									<thead>
										<tr class="headings ">
											<th class="column-title">TOTAL</th>
											<th class="column-title text-center">전체 IP :</th>
											<th class="column-title" id="ddos_count"></th>
											<th class="column-title text-center">예외 IP :</th>
											<th class="column-title" id="ddos_attacker"></th>
											<th class="column-title text-center">고정 IP :</th>
											<th class="column-title" id="ddos_count"></th>
											<th class="column-title text-center">할당 IP :</th>
											<th class="column-title" id="ddos_attacker"></th>
											<th class="column-title text-center">미할당 IP :</th>
											<th class="column-title" id="ddos_count"></th>
										</tr>
										<tr class="headings ">
											<th class="column-title">SUB_TOTAL</th>
											<th class="column-title text-center">전체 IP :</th>
											<th class="column-title" id="ddos_count"></th>
											<th class="column-title text-center">예외 IP :</th>
											<th class="column-title" id="ddos_attacker"></th>
											<th class="column-title text-center">고정 IP :</th>
											<th class="column-title" id="ddos_count"></th>
											<th class="column-title text-center">할당 IP :</th>
											<th class="column-title" id="ddos_attacker"></th>
											<th class="column-title text-center">미할당 IP :</th>
											<th class="column-title" id="ddos_count"></th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
						</div>
						<!--  dhcp setting end -->

						<!--  DDOS search start -->
						<div class="x_panel">
							<div class="x_title">
								<h2>
									DHCP Lookup <small> </small>
								</h2>
								<div class="clearfix"></div>
							</div>
							<div class="col-md-6  col-sm-12 col-xs-12">
								<div class="input-group">
									<input type="text" class="form-control" id="text-lookup"
										placeholder="Input your finding address"> <span
										class="input-group-btn">
										<button type="button" class="btn btn-default" title="주소검색"
											id="btn-lookup">
											<span class="glyphicon glyphicon-search"></span>
										</button>
									</span>
								</div>
							</div>
							<div class="col-md-6  col-sm-12 col-xs-12">
								<div id="dhcp-lookup-result"></div>
							</div>
						</div>
						<div class="clearfix"></div>
						<!--  DDOS search end -->

						<!--  DHCP List start -->
						<div class="x_panel">
							<div class="x_title">
								<H2>DHCP</H2>
								<div class="clearfix"></div>
							</div>

							<div class="col-md-8 col-sm-6 col-xs-6">
								<table id="datatable" class="table table-striped ">
									<colgroup>
										<col width="20%"></col>
										<col width="15%"></col>
										<col width="20%"></col>
										<col width="*%"></col>
										<col width="10%"></col>
									</colgroup>
									<thead>
										<tr>
											<th>대분류</th>
											<th>소분류</th>
											<th>프로토콜</th>
											<th style="display: none;"></th>
											<th>Host Address</th>
											<th></th>
										</tr>
									</thead>
									<tbody id="dhcplist">
									</tbody>
								</table>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-6">
								<table id="table-responsive" class="table table-hover">
									<thead>
										<tr class="headings">
											<th colspan="4">세부설정</th>
										</tr>
										<tr class="headings ">
											<th class="column-title">종류</th>
											<th class="column-title">시작 IP</th>
											<th class="column-title">종료 IP</th>
											<th class="column-title">MAC</th>
										</tr>
									</thead>
									<tbody id="dhcp_sublist">
									</tbody>
								</table>
								<table id="table-responsive" class="table table-hover">
									<thead>
										<tr class="headings">
											<th colspan="4">임대 IP 내역</th>
										</tr>
										<tr class="headings ">
											<th class="column-title">IP</th>
											<th class="column-title">MAC</th>
											<th class="column-title">PC</th>
											<th class="column-title">임대시간</th>
										</tr>
									</thead>
									<tbody id="dhcp_rentlist">
									</tbody>
								</table>
							</div>
						</div>
						<!--  DHCP Zone List end -->
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
			<script src="js/datatables.net/js/jquery.dataTables.min.js"></script>
			<script src="js/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
			<script src="js/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
			<script
				src="js/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
			<script src="js/datatables.net-buttons/js/buttons.flash.min.js"></script>
			<script src="js/datatables.net-buttons/js/buttons.html5.min.js"></script>
			<script src="js/datatables.net-buttons/js/buttons.print.min.js"></script>
			<script
				src="js/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
			<script
				src="js/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
			<script
				src="js/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
			<script
				src="js/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
			<script
				src="js/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
			<!-- Custom Theme Scripts -->
			<script src="js/dhcppolicy.js"></script>
			<script src="js/custom.js"></script>
</body>
</html>

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
					<!--  Policy setting start -->
					<div class="x_panel">
						<div class="x_title">
							<h2>System Management</h2>
							<div class="clearfix"></div>
						</div>
						<div class="row panel">
							<div class="row">
								<div class="col-lg-1 col-md-1"></div>
								<div class="col-lg-2 col-md-2">
									<span><strong>장비이름</strong></span>
								</div>
								<div class="col-lg-6 col-md-6">
									<span><strong>CroCheck SDNS 3.0</strong></span>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="row">
								<div class="col-lg-1 col-md-1"></div>
								<div class="col-lg-2 col-md-2">
									<span><strong>라이센스</strong> </span>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="table">
										<table class="table">
											<thead id="license_view">
											</thead>
										</table>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-1 col-md-1"></div>
								<div class="col-lg-2 col-md-2">
									<span><strong>접속 허용 IP 목록 </strong></span>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="table" >
										<table class="table" id="accesslistTable">
											<colgroup>
												<col width="45%"></col>
												<col width="45%"></col>
												<col width="10%"></col>
											</colgroup>
											<thead>
												<tr>
													<th>IP</th>
													<th>사용자 이름</th>
													<th></th>
												</tr>
											</thead>
											<tbody id="access_list"></tbody>
										</table>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-1 col-md-1"></div>
								<div class="col-lg-2 col-md-2">
									<span><strong>관리자 E-mail 목록 </strong> </span>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="table">
										<table class="table" id="operatorlistTable">
											<colgroup>
												<col width="25%"></col>
												<col width="25%"></col>
												<col width="20%"></col>
												<col width="20%"></col>
												<col width="10%"></col>
											</colgroup>
											<thead>
												<tr>
													<th>E-mail</th>
													<th>휴대폰 번호</th>
													<th>사용자 이름</th>
													<th>메일 발송</th>
													<th></th>
												</tr>
											</thead>
											<tbody id="operator_list">
											</tbody>
										</table>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-1 col-md-1"></div>
								<div class="col-lg-2 col-md-2">
									<span><strong>비밀번호 관리 </strong></span>
								</div>
								<div class="col-lg-6 col-md-6">
									<button type="button" class="btn btn-info" id="password_change">관리자
										비밀번호 변경</button>
								</div>
							</div>
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
		<!-- switch -->
		<script src="js/switchery.min.js"></script>
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
		<script src="js/setting.js"></script>
		<script src="js/alert.js"></script> 
		<script src="js/custom.js"></script>
</body>
</html>

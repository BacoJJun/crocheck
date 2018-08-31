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
								DNS <small>Domain Named System </small>
							</h2>
							<div class="clearfix"></div>
						</div>

						<!--  DDos  start -->
						<div class="x_panel">
							<div class="col-md-12 col-sm-12 col-xs-12">
								<div class="x_title">
									<h2>
										DDoS 차단 현황 <small>최근 한시간 이내의 내역 표기</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div class="table-responsive">
									<table class="table table-striped jambo_table bulk_action">
										<thead>
											<tr class="headings ">
												<th class="column-title text-center">공격자 :</th>
												<th class="column-title" id="ddos_attacker"></th>
												<th class="column-title text-center">횟수 :</th>
												<th class="column-title" id="ddos_count"></th>
											</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
								</div>
								<div class="table-bordered">
									<table class="table table-bordered">
										<thead>
											<tr>
												<th>IP주소</th>
												<th>도메인</th>
												<th>차단횟수</th>
												<th>마지막 탐지된 시</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<th scope="row">1</th>
												<td>Mark</td>
												<td>Otto</td>
												<td>@mdo</td>
											</tr>
										</tbody>
									</table>
								</div>

							</div>
						</div>
						<!--  DDos setting end -->

						<!--  DNS search start -->
						<div class="x_panel">
							<div class="x_title">
								<h2>
									DNS search <small> </small>
								</h2>
								<div class="clearfix"></div>
							</div>
							<div class="col-md-6  col-sm-12 col-xs-12">
									<div class="radio">
										<label> <input type="radio" class="flat" checked
											name="dns_search" checked id="dns_lookup""> Lookup
										</label> <label> <input type="radio" class="flat"
											name="dns_search" id="dns_zone_search"> Zone search
										</label>
									</div>
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
									<div id="lookup-result"></div>
							</div>
						</div>
						<div class="clearfix"></div>
						<!--  DNS search end -->

						<!--  DNS Zone List start -->
						<div class="x_panel">
							<div class="x_title">
								<H2>Domain</H2>
								<div class="clearfix"></div>
							</div>

							<div class="col-md-6 col-sm-6 col-xs-6">
								<table id="datatable" class="table table-striped table-bordered">
									<thead>
										<tr>
											<th>Zone</th>
											<th>Primary_ns</th>
											<th>Comment</th>
											<th></th>
										</tr>
									</thead>
									<tbody id="zonelist">
									</tbody>
								</table>
							</div>
							<div class="col-md-6 col-sm-6 col-xs-6">
								<table id="table-responsive"
									class="table table-striped jambo_table bulk_action">
									<thead>
										<tr class="headings ">
											<th class="column-title">Type</th>
											<th class="column-title">Host</th>
											<th class="column-title">Data</th>
											<th class="column-title"></th>
										</tr>
									</thead>
									<tbody id="sublist">
									</tbody>
								</table>
							</div>
						</div>
						<!--  DNS Zone List end -->
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

			<!-- Custom Theme Scripts -->
			<script src="js/custom.js"></script>
</body>
</html>

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
								<div class="col-md-10" style="overflow-y: auto; height: 600px;">
									<!--  dns domain start -->
									<div id="dns_domain" class="row" >
										<div class="col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel">
												<div class="x_title">
													<h2>
														DNS DOMAIN<small>Donut graph</small>
													</h2>
												</div>
												<div class="x_content ">
													<div id="dns_domain_pie" style="height: 270px;"></div>
												</div>
											</div>
										</div>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel">
												<div class="x_content">
													<table class="table table-hover">
														<colgroup>
															<col width="60%">
															<col width="20%">
															<col width="20%">
														</colgroup>
														<thead>
															<tr>
																<th>Domain</th>
																<th>Count</th>
																<th>Percentage</th>
															</tr>
														</thead>
														<tbody id="dnsDomaintableList">
														</tbody>
													</table>

												</div>
											</div>
										</div>
									</div>
									<!-- dns domain end -->

									<!-- dns client start -->
									<div id="dns_client" class="row">
										<div class="col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel">
												<div class="x_title">
													<h2>
														DNS CLIENT<small>Donut graph</small>
													</h2>
												</div>
												<div class="x_content ">
													<div id="dns_client_pie" style="height: 270px;"></div>
												</div>
											</div>
										</div>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel">
												<div class="x_content">
													<table class="table table-hover">
														<colgroup>
															<col width="60%">
															<col width="20%">
															<col width="20%">
														</colgroup>
														<thead>
															<tr>
																<th>Src_ip</th>
																<th>Count</th>
																<th>Percentage</th>
															</tr>
														</thead>
														<tbody id="dnsClienttableList">
														</tbody>
													</table>

												</div>
											</div>
										</div>
									</div>
									<!-- dns client end -->

									<!-- ddos domain start -->
									<div id="ddos_domain" class="row">
										<div class="col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel">
												<div class="x_title">
													<h2>
														DDOS Domain<small>Donut graph</small>
													</h2>
												</div>
												<div class="x_content ">
													<div id="ddos_domain_pie" style="height: 270px;"></div>
												</div>
											</div>
										</div>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel">
												<div class="x_content">
													<table class="table table-hover">
														<colgroup>
															<col width="60%">
															<col width="20%">
															<col width="20%">
														</colgroup>
														<thead>
															<tr>
																<th>Src</th>
																<th>Count</th>
																<th>Percentage</th>
															</tr>
														</thead>
														<tbody id="ddosDomaintableList">
														</tbody>
													</table>

												</div>
											</div>
										</div>
									</div>
									<!-- ddos domain end -->

									<!-- ddos client start -->
									<div id="ddos_client" class="row">
										<div class="col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel">
												<div class="x_title">
													<h2>
														DDOS CLIENT<small>Donut graph</small>
													</h2>
												</div>
												<div class="x_content ">
													<div id="ddos_client_pie" style="height: 270px;"></div>
												</div>
											</div>
										</div>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel">
												<div class="x_content">
													<table class="table table-hover">
														<colgroup>
															<col width="60%">
															<col width="20%">
															<col width="20%">
														</colgroup>
														<thead>
															<tr>
																<th>Src_ip</th>
																<th>Count</th>
																<th>Percentage</th>
															</tr>
														</thead>
														<tbody id="ddosClienttableList">
														</tbody>
													</table>

												</div>
											</div>
										</div>
									</div>
									<!-- ddos client end -->

									<!-- packet graph start -->
									<div id="packet_graph" class="col-md-6 col-sm-6 col-xs-12">
										<div class="x_panel">
											<div class="x_title">
												<h2>
													PACKET <small>graph</small>
												</h2>
												<div class="clearfix"></div>
											</div>
											<div class="x_content">
												<canvas id="packetChart"></canvas>
											</div>
										</div>
									</div>
									<!-- packet graph end -->

									<!-- cpu graph start -->
									<div id="cpu_graph" class="col-md-6 col-sm-6 col-xs-12">
										<div class="x_panel">
											<div class="x_title">
												<h2>
													CPU <small>graph</small>
												</h2>
												<div class="clearfix"></div>
											</div>
											<div class="x_content">
												<canvas id="cpuChart"></canvas>
											</div>
										</div>
									</div>
									<!-- cpu graph end -->

									<!-- memory graph start -->
									<div id="memroy_graph" class="col-md-6 col-sm-6 col-xs-12">
										<div class="x_panel">
											<div class="x_title">
												<h2>
													MEMORY <small>graph</small>
												</h2>
												<div class="clearfix"></div>
											</div>
											<div class="x_content">
												<canvas id="memoryChart"></canvas>
											</div>
										</div>
									</div>
									<!-- memory graph end -->

									<!-- disk graph start -->
									<div id="disk_graph" class="col-md-6 col-sm-6 col-xs-12">
										<div class="x_panel">
											<div class="x_title">
												<h2>
													DISK <small>graph</small>
												</h2>
												<div class="clearfix"></div>
											</div>
											<div class="x_content">
												<canvas id="diskChart"></canvas>
											</div>
										</div>
									</div>
									<!-- disk graph end -->
								</div>
								<!-- report view part end -->

								<!-- report check list -->
								<div class="col-md-2">
									<div class="x_panel">
										<div class="x_title">
											<h2>체크 리스트</h2>
											<div class="clearfix"></div>
										</div>

        <div class="[ form-group ]">
            <input type="checkbox" name="check_dns_domain" id="fancy-checkbox-success" autocomplete="off" />
            <div class="[ btn-group ]">
                <label for="fancy-checkbox-success" class="[ btn btn-success ]">
                    <span class="[ glyphicon glyphicon-ok ]"></span>
                    <span> </span>
                </label>
                <label for="fancy-checkbox-success" class="[ btn btn-default active ]">
                   DNS DOMAIN
                </label>
            </div>
        </div>

										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												id="check_dns_client" checked="checked"> DNS CLIENT
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												id="check_ddos_domain" checked="checked"> DDOS
												DOMAIN
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												id="check_ddos_client" checked="checked"> DDOS
												CLIENT
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												id="check_query_graph" checked="checked"> QUERY
												GRAPH
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												id="check_cpu_graph" checked="checked"> CPU GRAPH
											</label>
										</div>

										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												id="check_memroy_graph" checked="checked"> MEMORY
												GRAPH
											</label>
										</div>

										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												id="check_disk_graph" checked="checked"> DISK GRAPH
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
											<div class="clearfix"></div>
										</div>

										<div class="radio">
											<label> <input type="radio" class="flat" checked
												name="report_type" checked id="daily"> 일간
											</label> <label> <input type="radio" class="flat"
												name="report_type" id="weekly"> 주간
											</label> <label> <input type="radio" class="flat"
												name="report_type" id="monthly"> 월간
											</label>
										</div>
										<div class="clearfix"></div>
										<div id="reportrange" class="pull-right"
											style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
											<i class="glyphicon glyphicon-calendar fa fa-calendar"></i> <span></span>
											<b class="caret"></b>
										</div>
										<div class="clearfix"></div>
										<div class="radio">
											<label> <input type="radio" class="flat" checked
												name="report_count_type" checked id="all"> 전체
											</label> <label> <input type="radio" class="flat"
												name="report_count_type" id="unit"> 선택
											</label>
										</div>
										<div>
											<input class="numeric integer optional form-control input-sm"
												value="100" type="number" step="1" name="report_count"
												id="dhcp_min" />
										</div>
										<div class="clearfix"></div>
										<div>
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

	<!-- Custom Theme Scripts -->
	<script src="js/status_report.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

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
								보고서<small></small>
							</h2>

							<div class="clearfix"></div>
						</div>

						<!--  page part -->
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
							
								<div class="col-md-2">
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
												name="report_type" checked value="daily"> 일간
											</label> <label> <input type="radio" class="flat"
												name="report_type" value="weekly"> 주간
											</label> <label> <input type="radio" class="flat"
												name="report_type" value="monthly"> 월간
											</label>
										</div>
										<div class="clearfix"></div>
											<div class="input-prepend input-group">
												<span class="add-on input-group-addon"><i
													class="glyphicon glyphicon-calendar fa fa-calendar"></i></span> <input
													type="text" name="reservation-time" id="reportrange_right"
													class="form-control" />
											</div>
										<div>
											<button type="button" class="btn btn-success"
												id="search_stat">
												<span>검색</span>
											</button>
										</div>
									</div>
									<!-- report search end -->
									
										<!-- report check list -->								
										<div class="x_panel">
											<div class="x_title">
												<h2>체크 리스트</h2>
												<div class="clearfix"></div>
											</div>

											<div class="checkbox">
												<label> <input type="checkbox" id="check_dns_domain"
													checked="checked"> DNS DOMAIN
												</label>
											</div>

											<div class="checkbox">
												<label> <input type="checkbox" id="check_dns_client"
													checked="checked"> DNS CLIENT
												</label>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox"
													id="check_ddos_domain" checked="checked"> DDOS
													DOMAIN
												</label>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox"
													id="check_ddos_client" checked="checked"> DDOS
													CLIENT
												</label>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox"
													id="check_query_graph" checked="checked"> QUERY
													GRAPH
												</label>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox" id="check_cpu_graph"
													checked="checked"> CPU GRAPH
												</label>
											</div>

											<div class="checkbox">
												<label> <input type="checkbox"
													id="check_memroy_graph" checked="checked"> MEMORY
													GRAPH
												</label>
											</div>

											<div class="checkbox">
												<label> <input type="checkbox" id="check_disk_graph"
													checked="checked"> DISK GRAPH
												</label>
											</div>
											
											<div class="panel">
												<label> <button type="button" class="btn btn-primary" id="makepdf">PDF 생성</button>
												</label>									
											</div>
										</div>
									<!-- report check list -->

								
								</div>
								<!-- report check list end -->
								
								<!-- report view part -->
								
								<div class="col-lg-10 col-md-10" style="overflow-y: auto; height: 750px;" >
									<div id="report_page">
										<!--  dns domain start -->
										<div id="dns_domain" class="row">
											<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12" >
												<div class="x_panel"  style="height: 490px;" >
													<div class="x_title">
														<h2>
															DNS DOMAIN<small>Donut graph</small>
														</h2>
													</div>
													<div class="x_content ">
														<div id="dns_domain_pie" style="height: 430px;"></div>
													</div>
												</div>
											</div>
											<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
												<div class="x_panel" style="height: 490px;" >
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
											<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
												<div class="x_panel" style="height: 490px;" >
													<div class="x_title">
														<h2>
															DNS CLIENT<small>Donut graph</small>
														</h2>
													</div>
													<div class="x_content ">
														<div id="dns_client_pie" style="height: 430px;"></div>
													</div>
												</div>
											</div>
											<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
												<div class="x_panel" style="height: 490px;" >
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
											<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
												<div class="x_panel" style="height: 490px;" >
													<div class="x_title">
														<h2>
															DDOS Domain<small>Donut graph</small>
														</h2>
													</div>
													<div class="x_content ">
														<div id="ddos_domain_pie" style="height: 430px;"></div>
													</div>
												</div>
											</div>
											<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
												<div class="x_panel" style="height: 490px;" >
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
											<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
												<div class="x_panel" style="height: 490px;" >
													<div class="x_title">
														<h2>
															DDOS CLIENT<small>Donut graph</small>
														</h2>
													</div>
													<div class="x_content ">
														<div id="ddos_client_pie" style="height: 430px;"></div>
													</div>
												</div>
											</div>
											<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
												<div class="x_panel" style="height: 490px;" >
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
										<div class="row">
										<div id="packet_graph" class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel" style="height: 490px;">
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
										<div id="cpu_graph" class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel" style="height: 490px;">
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
										<div id="memroy_graph" class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel" style="height: 490px;">
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
										<div id="disk_graph" class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="x_panel" style="height: 490px;">
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
										</div>
										<!-- disk graph end -->
									</div>
									</div>
									<!-- report view part end -->
				

								
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
	<script src="js/printThis.js"></script>
		<script src="js/jspdf.min.js"></script>
	<script type="text/javascript" src="js/html2canvas.js"></script>

	<!-- Custom Theme Scripts -->
	<script src="js/status_report.js"></script>
	<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

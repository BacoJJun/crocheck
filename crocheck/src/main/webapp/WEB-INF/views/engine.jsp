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
							<h2>
								정책관리 <small>Policy Setting </small>
							</h2>

							<div class="clearfix"></div>
						</div>
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										엔진 작동 <small> </small>
									</h2>

									<div class="clearfix"></div>
								</div>
								<div class="col-md-4">
									<div class="x_panel">
										<div class="x_title">
											<h2>
												DNS <small> </small>
											</h2>

											<div class="clearfix"></div>
										</div>
										<div class="radio">
											<label> <input type="radio" checked name="check_dns"
												checked id="check_dns_start" value="true"> 작동
											</label> <label> <input type="radio" name="check_dns"
												id="check_dns_stop" value="false"> 정지
											</label>
										</div>
										<p>DNS 작동 여부를 결정합니다.</p>
										<div class="controls">
											<button type="button" class="btn btn-success btn-sm"
												id="dns_submit">적용</button>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="x_panel">
										<div class="x_title">
											<h2>
												DHCP <small> </small>
											</h2>

											<div class="clearfix"></div>
										</div>
										<div class="radio">
											<label> <input type="radio" checked name="check_dhcp"
												checked id="check_dhcp_start" value="true"> 작동
											</label> <label> <input type="radio" name="check_dhcp"
												id="check_dhcp_stop" value="false"> 정지
											</label>
										</div>
										<p>DHCP 작동 여부를 결정합니다.</p>
										<div class="controls">
											<button type="button" class="btn btn-sm btn-success"
												id="dhcp_submit">적용</button>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="x_panel">
										<div class="x_title">
											<h2>
												NTP <small>시간 동기화 서버 </small>
											</h2>

											<div class="clearfix"></div>
										</div>
										<div class="radio">
											<label> <input type="radio" checked name="check_ntp"
												id="check_ntp_start" value="true"> 작동
											</label> <label> <input type="radio" name="check_ntp"
												id="check_ntp_stop" value="false"> 정지
											</label>
										</div>
										<p>NTP 작동 여부를 결정합니다.</p>
										<div class="controls">
											<button type="button" class="btn btn-success btn-sm"
												id="ntp_submit">적용</button>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!--  Policy setting end -->


						<!--  NTP setting start -->
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										NTP <small> network time protocal</small>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div>
									<div class="col-md-12 col-sm-12 col-xs-12">
										<div class="col-md-6 col-sm-8 col-xs-8">
											<table id="table-responsive" class="table  table-hover">
												<thead>
													<tr class="headings ">
														<th class="column-title">SERVER NAME</th>
														<th class="column-title">비고</th>
														<th class="column-title text-right">
															<button type="button" class="btn btn-xs fa fa-plus"
																data-toggle="modal" data-target="#ntpInsertModal"></button>
															<button type="button" class="btn btn-xs fa fa-question"
																id="status_ntp"></button>
														</th>
													</tr>
												</thead>
												<tbody id="ntplist">
												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!--  NTP setting end -->


						<!--  DHCP Rental start -->
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										DHCP <small> Dynamic Host Configuration Protocol</small>
									</h2>

									<div class="clearfix"></div>
								</div>
								<div>
									<div class="section" id="dhcp-set">
										<div class="col-md-1"></div>
										<form class="simple_form form-horizontal" id="dhcp-set-form"
											action="/roles/1" accept-charset="UTF-8" method="post">
											<input name="utf8" type="hidden" value="&#x2713;" /> <input
												type="hidden" name="_method" value="patch" /><input
												type="hidden" name="authenticity_token"
												value="BIA7PzVo3PwxLVpqvYrmbCovcBfvOK8OnWN41Js95Y+R3Eu5AKOhz1jhnJWecP4g5HRN8cWd7eU2oWH/t6vTnw==" />
											<input type="hidden" name="action" value="dhcp-set-update">
											<div class="form-group">
												<div class="col-md-1">
													<label class=" optional control-label full-width"
														for="lease_time">임대시간</label>
												</div>
												<div class="col-md-1">
													<input
														class="numeric integer optional form-control input-sm"
														type="number" step="1" name="dhcp[day]" id="dhcp_day" />
													<span id="day-help" class="help-block">일</span>
												</div>
												<div class="col-md-1">
													<input
														class="numeric integer optional form-control input-sm"
														type="number" step="1" name="dhcp[hour]" id="dhcp_hour" />
													<span id="hour-help" class="help-block">시간</span>
												</div>
												<div class="col-md-1">
													<input
														class="numeric integer optional form-control input-sm"
														value="1" type="number" step="1" name="dhcp[min]"
														id="dhcp_min" /> <span id="min-help" class="help-block">분</span>
												</div>
											</div>

											<div class="col-md-1"></div>
											<div class="form-group">
												<div class="col-md-1">
													<label class="string optional control-label full-width"
														for="dhcp_primary_dns">Primary DNS</label>
												</div>
												<div class="col-md-3">
													<input class="string optional form-control input-sm"
														type="text" name="dhcp[pri_dns]" id="dhcp_primary_dns"
														value="192.168.0.205" /> <span id="pri-dns-help"
														class="help-block">Primary_DNS를 설정합니다.</span>
												</div>
											</div>

											<div class="col-md-1"></div>
											<div class="form-group">
												<div class="col-md-1">
													<label class="string optional control-label full-width"
														for="dhcp_second_dns">Secondary DNS</label>
												</div>
												<div class="col-md-3">
													<input class="string optional form-control input-sm"
														type="text" name="dhcp[second_dns]"
														id="dhcp_secondary_dns" value="192.168.0.201" /> <span
														id="second-dns-help" class="help-block">
														Secondary_DNS를 설정합니다.</span>
												</div>
											</div>
											<div class="col-md-1"></div>
											<div class="col-md-3">
												<input type="submit" name="commit" value="적용"
													data-disable-with="설정 저장중.." class="btn btn-success btn-sm" />
											</div>

										</form>
									</div>
								</div>
							</div>
						</div>

						<!-- DHCP Rental end -->
					</div>
				</div>
				<!--end  page content -->

			</div>
		</div>

	</div>

	<!--ntp insert Modal start -->
	<div id="ntpInsertModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">Insert NTP Server</h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">NTP
									SERVER</label>
								<div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="NTP_SERVER" id="insert_ntp_server" type="text"
										required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">비고
								</label>
								<div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
									<input class="form-control" name="subject" placeholder="ETC"
										id="insert_ntp_etc" type="text" required value="" />
								</div>
							</div>
					</div>

					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-danger" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> Cancel
							</button>
							<button class="btn btn-primary" id="insert_ntp">
								<span class="glyphicon glyphicon-check"></span> Save
							</button>
						</div>
					</div>

				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dalog -->
		</div>
		<!-- /.modal -->
		<!-- ntp insert Modal end -->
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
		<script src="js/engine.js"></script>
		<script src="js/alert.js"></script>
		<script src="js/custom.js"></script>
</body>
</html>

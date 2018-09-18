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
								<div class="col-lg-9 col-md-9">
									<H2>DHCP</H2>
								</div>
								<div class="col-md-3 text-right">
									<button type="button" class="btn btn-success btn-xs"
										id="insertDomain" data-toggle="modal"
										data-target="#dhcpInsertModal">
										<i class="fa fa-plus"></i>DHCP
									</button>
									<button type="button" class="btn btn-info btn-xs"
										id="insertSubDomain" data-toggle="modal"
										data-target="#subDhcpInsertModal">
										<i class="fa fa-plus"></i>DHCP OPTION
									</button>
								</div>
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

		</div>
	</div>


	<!-- The Modal   -->
	<!-- dhcp Insert Modal start -->

	<div class="modal fade" id="dhcpInsertModal" tabindex="-1" role="dialog"
		aria-labelledby="contactLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<i class="glyphicon glyphicon-remove"></i>
					</button>
					<h4 class="panel-title">
						<span class="glyphicon glyphicon-info-sign"></span> INSERT DHCP
						
					</h4>
				</div>
				<div class="modal-body" style="padding: 5px;">
					<div class="row"></div>
					<div class="row">
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>zone : </span> <input class="form-control" name="subject"
								placeholder="zone" id="dhcp_insert" type="text" required
								value="zone_name" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>ttl : </span> <input class="form-control" name="subject"
								placeholder="ttl" id="dhcp_insert_ttl" type="text" required
								value="3600" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>type : </span> <input class="form-control" name="subject"
								placeholder="type" id="dhcp_insert_type" type="text" required
								value="SOA" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>host : </span> <input class="form-control" name="subject"
								placeholder="host" id="dhcp_insert_host" type="text" required
								value="@" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>data : </span> <input class="form-control" name="subject"
								placeholder="data" id="dhcp_insert_data" type="text" required
								value="data_name" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>primary_ns : </span> <input class="form-control"
								name="subject" placeholder="primary_ns"
								id="dhcp_insert_primary_ns" type="text" required />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>resp_contact : </span> <input class="form-control"
								name="subject" placeholder="resp_contact"
								id="dhcp_insert_resp_contact" type="text" required
								value="resp_contact" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>serial : </span> <input class="form-control" name="subject"
								placeholder="serial" id="dhcp_insert_serial" type="text" required
								value="20180104" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>refresh : </span> <input class="form-control"
								name="subject" placeholder="refresh" id="dhcp_insert_refresh"
								type="text" required value="14400" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>retry : </span> <input class="form-control" name="subject"
								placeholder="retry" id="dhcp_insert_retry" type="text" required
								value="3600" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>expire : </span> <input class="form-control" name="subject"
								placeholder="dhcp_insert_expire" id="expire" type="text" required
								value="604800" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>minimum : </span> <input class="form-control"
								name="subject" placeholder="minimum" id="dhcp_insert_minimum"
								type="text" required value="86400" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>modified : </span> <input class="form-control"
								name="subject" placeholder="modified" id="dhcp_insert_modified"
								type="text" required value="0" />
						</div>
						<div class="row">
							<div class="col-lg-12 col-md-12 col-sm-12">
								<textarea style="resize: vertical;" class="form-control"
									placeholder="comment" id="dhcp_insert_comment" rows="6"
									name="comment" required>asjdlfkasjd</textarea>
							</div>
						</div>

					</div>
					<div class="panel-footer" style="margin-bottom: -14px;">
						<input type="button" class="btn btn-success" id="insertdhcp"
							value="INSERT" />
						<!--<span class="glyphicon glyphicon-ok"></span>-->
						<input type="reset" class="btn btn-danger" value="Clear" />
						<!--<span class="glyphicon glyphicon-remove"></span>-->
						<button style="float: right;" type="button"
							class="btn btn-default btn-close" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- dhcp Insert Modal end -->

	<!-- dhcp update Modal start -->
	<div class="modal fade" id="dhcpUpdateModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> dhcp update
						Modal
					</h4>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-success btn-vote">Vote!</button>
					<span class="btn btn-primary dropdown-results btn-results"
						data-for=".results">View Results</span>
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>
	<!-- dhcp update Modal end -->

	<!-- dhcp Delete Modal start -->
	<div class="modal fade" id="dhcpDeleteModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> dhcp Delete
						Modal
					</h4>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-success btn-vote">Vote!</button>
					<span class="btn btn-primary dropdown-results btn-results"
						data-for=".results">View Results</span>
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>
	<!-- dhcp Delete Modal end -->

	<!-- subDomain Insert Modal start -->
	<div class="modal fade" id="subDhcpInsertModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> Sub_Domain
						Insert Modal
					</h4>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-success btn-vote">Vote!</button>
					<span class="btn btn-primary dropdown-results btn-results"
						data-for=".results">View Results</span>
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>
	<!-- subDomain Insert Modal end -->

	<!-- subDomain update Modal start -->
	<div class="modal fade" id="subDhcpUpdateModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> Sub_Domain
						update Modal
					</h4>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-success btn-vote">Vote!</button>
					<span class="btn btn-primary dropdown-results btn-results"
						data-for=".results">View Results</span>
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>
	<!-- subDomain update Modal end -->

	<!-- subDomain Insert Modal start -->
	<div class="modal fade" id="subDhcpDeleteModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> Sub_Domain
						Delete Modal
					</h4>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-success btn-vote">Vote!</button>
					<span class="btn btn-primary dropdown-results btn-results"
						data-for=".results">View Results</span>
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>
	<!-- subDomain Delete Modal end -->

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
	
	<script src="js/dhcppolicy.js"></script>
		<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

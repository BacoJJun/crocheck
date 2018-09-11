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
												<th class="column-title text-center">공격자 :<span
													id="ddos_attacker"></span></th>
												<th class="column-title" id="ddos_attacker"></th>
												<th class="column-title text-center">횟수 : <span
													id="ddos_attack_count"></span></th>
												<th class="column-title" id="ddos_count"></th>
											</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
								</div>
								<div class="table-bordered">
									<table class="table table-striped">
										<thead>
											<tr>
												<th>IP주소</th>
												<th>도메인</th>
												<th>차단횟수</th>
												<th>마지막 탐지된 시간</th>
											</tr>
										</thead>
										<tbody id="ddos_block_list">
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
							<div class="col-md-3  col-sm-12 col-xs-12">
								<div class="radio">
									<label> <input type="radio" class="flat" checked
										name="dns_search" checked id="dns_lookup" value="lookup">
										Lookup
									</label> <label> <input type="radio" class="flat"
										name="dns_search" id="dns_zone_search" value="zone">
										Zone search
									</label>
								</div>
								<div class="input-group">
									<input type="text" class="form-control" id="text-lookup"
										placeholder="Input your finding address"> <span
										class="input-group-btn">
										<button type="button" class="btn btn-default" title="검색"
											id="btn-lookup">
											<span class="glyphicon glyphicon-search"></span>
										</button>
									</span>
								</div>
							</div>
							<div class="col-md-9  col-sm-12 col-xs-12">
								<div id="lookup-result"></div>
							</div>
						</div>
						<div class="clearfix"></div>
						<!--  DNS search end -->

						<!--  DNS Zone List start -->
						<div class="x_panel">
							<div class="x_title">
								<div class="col-md-9">
									<H2>Domain</H2>
								</div>

								<div class="col-md-3 text-right">
									<button type="button" class="btn btn-success btn-xs"
										id="insertDomain" data-toggle="modal" data-target="#dnsInsertModal">
										<i class="fa fa-plus"></i>DOMAIN
									</button>
									<button type="button" class="btn btn-defalut btn-xs"
										id="insertSubDomain" data-toggle="modal"
										data-target="#subDomainInsertModal">
										<i class="fa fa-plus"></i>SUB_DOMAIN
									</button>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="col-md-8 col-sm-12 col-xs-12">
								<table id="datatable" class="table table-striped table-bordered">
									<colgroup>
										<col width="20%"></col>
										<col width="20%"></col>
										<col width="*"></col>
										<col width="15%"></col>
									</colgroup>
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
							<div class="col-md-4 col-sm-12 col-xs-12">
								<div class="x_title">
									<h2>
										sub_domain : <span id="sub_domain_count"></span>
									</h2>
									<div class="clearfix"></div>
								</div>
								<table id="datatable" class="table table-striped" cellspacing="0"
									width="100%">
									<colgroup>
										<col width="15%"></col>
										<col width="15%"></col>
										<col width="50%"></col>
										<col width="20%"></col>
									</colgroup>
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

		</div>
	</div>


	<!-- The Modal   -->
	<!-- dns Insert Modal start -->
	
	<div class="modal fade" id="dnsInsertModal" tabindex="-1" role="dialog"
		aria-labelledby="contactLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<i class="glyphicon glyphicon-remove"></i>
					</button>
					<h4 class="panel-title">
						<span class="glyphicon glyphicon-info-sign"></span> INSERT DNS
						ZONE
					</h4>
				</div>
				<div class="modal-body" style="padding: 5px;">
					<div class="row"></div>
					<div class="row">
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>zone : </span> <input class="form-control" name="subject"
								placeholder="zone" id="dns_insert_zone" type="text" required
								value="zone_name" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>ttl : </span> <input class="form-control" name="subject"
								placeholder="ttl" id="dns_insert_ttl" type="text" required
								value="3600" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>type : </span> <input class="form-control" name="subject"
								placeholder="type" id="dns_insert_type" type="text" required
								value="SOA" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>host : </span> <input class="form-control" name="subject"
								placeholder="host" id="dns_insert_host" type="text" required
								value="@" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>data : </span> <input class="form-control" name="subject"
								placeholder="data" id="dns_insert_data" type="text" required
								value="data_name" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>primary_ns : </span> <input class="form-control"
								name="subject" placeholder="primary_ns"
								id="dns_insert_primary_ns" type="text" required />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>resp_contact : </span> <input class="form-control"
								name="subject" placeholder="resp_contact"
								id="dns_insert_resp_contact" type="text" required
								value="resp_contact" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>serial : </span> <input class="form-control" name="subject"
								placeholder="serial" id="dns_insert_serial" type="text" required
								value="20180104" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>refresh : </span> <input class="form-control"
								name="subject" placeholder="refresh" id="dns_insert_refresh"
								type="text" required value="14400" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>retry : </span> <input class="form-control" name="subject"
								placeholder="retry" id="dns_insert_retry" type="text" required
								value="3600" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>expire : </span> <input class="form-control" name="subject"
								placeholder="dns_insert_expire" id="expire" type="text" required
								value="604800" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>minimum : </span> <input class="form-control"
								name="subject" placeholder="minimum" id="dns_insert_minimum"
								type="text" required value="86400" />
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12"
							style="padding-bottom: 10px;">
							<span>modified : </span> <input class="form-control"
								name="subject" placeholder="modified" id="dns_insert_modified"
								type="text" required value="0" />
						</div>
						<div class="row">
							<div class="col-lg-12 col-md-12 col-sm-12">
								<textarea style="resize: vertical;" class="form-control"
									placeholder="comment" id="dns_insert_comment" rows="6"
									name="comment" required>asjdlfkasjd</textarea>
							</div>
						</div>

					</div>
					<div class="panel-footer" style="margin-bottom: -14px;">
						<input type="button" class="btn btn-success" id="insertdns"
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
	<!-- dns Insert Modal end -->

	<!-- dns Copy start -->	
	<div class="modal fade" id="dnsCopyModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> dns Copy Modal
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
	<!-- dns Copy Modal end -->	
	
	<!-- dns update Modal start -->	
	<div class="modal fade" id="dnsUpdateModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> dns update Modal
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
	<!-- dns update Modal end -->	
	
	<!-- dns Delete Modal start -->	
	<div class="modal fade" id="dnsDeleteModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> dns Delete Modal
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
	<!-- dns Delete Modal end -->	
	
	<!-- subDomain Insert Modal start -->	
	<div class="modal fade" id="subDomainInsertModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> Sub_Domain Insert Modal
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
	<div class="modal fade" id="subDomainUpdateModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> Sub_Domain update Modal
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
	<div class="modal fade" id="subDomainDeleteModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> Sub_Domain Delete Modal
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
	<script src="js/Example.Modal.js"></script>
	<script src="js/dnspolicy.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

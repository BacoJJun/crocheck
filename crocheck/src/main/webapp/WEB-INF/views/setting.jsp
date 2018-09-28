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
									<div class="x_panel">
										<span><strong>장비이름</strong></span>
									</div>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="x_panel">
										<span><strong>CroCheck SDNS 3.0</strong></span>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="row">
								<div class="col-lg-1 col-md-1"></div>
								<div class="col-lg-2 col-md-2">
									<div class="x_panel">
										<span><strong>라이센스</strong> </span>
									</div>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="x_panel">
										<div class="table">
											<table class="table">
												<thead id="license_view">
												</thead>
											</table>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-1 col-md-1"></div>
								<div class="col-lg-2 col-md-2">
									<div class="x_panel">
										<span><strong>접속 허용 IP 목록 </strong></span>
									</div>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="x_panel">
										<div class="table">
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
														<th><button type="button"
																class="btn btn-success btn-xs" data-toggle="modal"
																data-target="#accessInsertModal">NEW</button></th>
													</tr>
												</thead>
												<tbody id="access_list"></tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-1 col-md-1"></div>
								<div class="col-lg-2 col-md-2">
									<div class="x_panel">
										<span><strong>관리자 E-mail 목록 </strong> </span>
									</div>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="x_panel">
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
														<th><button type="button"
																class="btn btn-success btn-xs" data-toggle="modal"
																data-target="#operatorInsertModal">NEW</button></th>
													</tr>
												</thead>
												<tbody id="operator_list">
												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-lg-1 col-md-1"></div>
								<div class="col-lg-2 col-md-2">
									<div class="x_panel">
										<span><strong>비밀번호 관리 </strong></span>
									</div>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="x_panel">
										<button type="button" class="btn btn-info"
											id="password_change">관리자 비밀번호 변경</button>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!--end  page content -->

				</div>
			</div>
		</div>

		<!-- The Modal   -->
		<!-- access_insert Modal start -->
		<div class="modal fade" id="accessInsertModal" tabindex="-1"
			role="dialog" aria-labelledby="contactLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">
							<i class="glyphicon glyphicon-remove"></i>
						</button>
						<h4 class="panel-title">
							<span class="glyphicon glyphicon-info-sign"></span> 접속 허용 IP 추가
						</h4>
					</div>
					<div class="modal-body" style="padding: 5px;">
						<div class="x_panel">
							<form class="form-horizontal form-label-left">
								<div class="form-group">
									<label
										class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">IP</label>
									<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
										<input class="form-control" name="subject"
											placeholder="접속 허용하실 IP를 입력합니다." id="access_ip_text"
											type="text" required value="" />
									</div>
								</div>
								<div class="form-group">
									<label
										class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">이름
									</label>
									<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
										<input class="form-control" name="subject"
											placeholder="사용자 이름을 입력해 주십시오." id="access_name_text"
											type="text" required value="" />
									</div>
								</div>
								<div class="modal-footer">
									<input type="button" class="btn btn-success" id="insertdns"
										value="INSERT" />
									<!--<span class="glyphicon glyphicon-ok"></span>-->
									<input type="reset" class="btn btn-danger btn-close"
										value="Clear" />
									<!--<span class="glyphicon glyphicon-remove"></span>-->
									<button style="float: right;" type="button"
										class="btn btn-default btn-close" data-dismiss="modal">Close</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- access_insert Modal end -->

		<!-- access_edit Modal start -->
		<div class="modal fade" id="accessUpdateModal" tabindex="-1"
			role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">
							<i class="glyphicon glyphicon-remove"></i>
						</button>
						<h4 class="panel-title">
							<span class="glyphicon glyphicon-info-sign"></span> <span
								id="update_zone_name"></span>
						</h4>
					</div>
					<div class="modal-body" style="padding: 5px;">
						<div class="x_panel">
							<form class="form-horizontal form-label-left">
								<div class="form-group">
									<label
										class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">IP</label>
									<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
										<input class="form-control" name="subject"
											placeholder="접속 허용하실 IP를 입력합니다." id="access_edit_ip_text"
											type="text" required value="" />
									</div>
								</div>
								<div class="form-group">
									<label
										class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">이름
									</label>
									<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
										<input class="form-control" name="subject"
											placeholder="사용자 이름을 입력해 주십시오." id="access_edit_name_text"
											type="text" required value="" />
									</div>
								</div>
								<div class="modal-footer">
									<input type="button" class="btn btn-info" id="updatedns"
										value="UPDATE" />
									<button style="float: right;" type="button"
										class="btn btn-default btn-close" data-dismiss="modal">Close</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- access_edit Modal end -->

		<!-- access Delete Modal start -->
		<div class="modal fade" id="accessDeleteModal" tabindex="-1"
			role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="panel panel-danger">
					<div class="panel-heading">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>
						<h4 class="panel-title panel-danger" id="voteLabel">접속 허용 IP
							삭제</h4>
					</div>
					<div class="modal-body"></div>
					<div class="modal-footer">
						<button type="button" class="btn btn-danger " id="accessdelete">DELETE</button>
						<button type="button" class="btn btn-default btn-close"
							data-dismiss="modal">Close</button>

					</div>
				</div>
			</div>
		</div>
		<!-- access Delete Modal end -->

		<!-- operator Insert Modal start -->
		<div class="modal fade" id="operatorInsertModal" tabindex="-1"
			role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">
							<i class="glyphicon glyphicon-remove"></i>
						</button>
						<h4 class="panel-title">
							<span class="glyphicon glyphicon-info-sign"></span>INSERT
							SUB_DOMAIN
						</h4>
					</div>
					<div class="modal-body" style="padding: 5px;">
						<div class="x_panel">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">E-mail</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="관리자 E-mail을 입력해주십시오." id="operator_email_text"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">핸드폰
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="관리자 핸드폰을 입력해주십시오." id="operator_phone_text"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">이름
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="관리자 이름을 입력해 주십시오." id="operator_name_text"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">메일
									발송 </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<ul class="list-group checked-list-box">
										<li class="list-group-item" id="operator_insert_mail_check"
											data-color="info" data-checked="true">메일 발송중</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<input type="button" class="btn btn-info" id="insertsubdomain"
								value="INSERT" />
							<button style="float: right;" type="button"
								class="btn btn-default btn-close" data-dismiss="modal">Close</button>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- operator Insert Modal end -->

	<!-- operator update Modal start -->
	<div class="modal fade" id="operatorUpdateModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<i class="glyphicon glyphicon-remove"></i>
					</button>
					<h4 class="panel-title">
						<span class="glyphicon glyphicon-info-sign"></span><span
							id="subdomain_zone_name"></span>
					</h4>
				</div>
				<div class="modal-body" style="padding: 5px;">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">E-mail</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="관리자 E-mail을 입력해주십시오."
										id="operator_update_email_text" type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">핸드폰
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="관리자 핸드폰을 입력해주십시오."
										id="operator_update_phone_text" type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">이름
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="관리자 이름을 입력해 주십시오." id="operator_update_name_text"
										type="text" required value="" />
								</div>
								<div class="form-group">
									<label
										class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">메일
										발송 </label>
									<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
										<ul class="list-group checked-list-box"
											id="operator_update_mail">
											<li class="list-group-item" id="operator_update_mail_check"
												data-color="info" data-checked="false">메일 발송</li>
										</ul>
									</div>
								</div>
							</div>
							<div class="modal-footer" style="margin-bottom: -14px;">
								<input type="button" class="btn btn-info" id="updatesubdomain"
									value="UPDATE" />
								<button style="float: right;" type="button"
									class="btn btn-default btn-close" data-dismiss="modal">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- operator update Modal end -->

	<!-- operator Delete Modal start -->
	<div class="modal fade" id="operatorDeleteModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-danger">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title">Delete Operator</h4>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger btn-close"
						id="deleteoperator" value="DELETE">DELETE</button>
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>
	<!-- operator Delete Modal end -->

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
	<script src="js/checkbox_custom.js"></script>
	<script src="js/setting.js"></script>

	<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

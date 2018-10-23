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
				<div class="row">
					<div class="page-title">
						<div class="title_left">
							<h3>
								조직도 <small>Organization </small>
							</h3>
						</div>

						<div class="title_right text-right">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12  ">
									<button class="btn btn-defalut " type="button"  data-toggle="modal" data-target="#insertMemberModal">+</button>
							</div>
						</div>
					</div>

					<div class="clearfix"></div>

					<div class="row">
						<div class="col-md-12">
							<div class="x_panel">
								<div class="x_content">

									<!-- organization list -->

									<div class="col-sm-2 col-md-2 affix-sidebar">
										<%@ include file="organization_menu.jsp"%>
									</div>
									<!-- organization list end -->
									<!-- start project list -->

									<div id="datatables">
										<div class="col-md-10 col-sm-12 col-xs-12">
											<table id="member_datatable"
												class="table table-striped table-bordered dt-responsive nowrap"
												cellspacing="0" width="100%">

												<colgroup>
													<col width="10%"></col>
													<col width="7%"></col>
													<col width="15%"></col>
													<col width="12%"></col>
													<col width="12%"></col>
													<col width="15%"></col>
													<col width="*%"></col>
													<col width="10%"></col>
												</colgroup>
												<thead>
													<tr>
														<th>부서</th>
														<th>이름</th>
														<th>IP</th>
														<th>전화번호</th>
														<th>휴대전화</th>
														<th>E메일</th>
														<th>기타</th>
														<th>수정</th>
													</tr>
												</thead>
												<tbody id="member_list">
												</tbody>
											</table>
										</div>
									</div>
									<!-- end project list -->


								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /page content -->
		</div>
	</div>


<!--insert member start -->
	<div id="insertMemberModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">구성원 추가</h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">부서 
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
											<select class="select_multiple form-control" id="insert_post_list">
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">이름  </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="insert_member_name" type="text" required value="" />
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">IP주소  </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="insert_member_ip" type="text" value=""  />
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">전화번호 </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="insert_member_phone" type="text" required value="" />
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">휴대전화 </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="insert_member_mobile" type="text" required value="" />
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">E-Mail</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="insert_member_mail" type="text" required value="" />
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">기타 </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="insert_member_etc" type="text" required value="" />
									</div>
								</div>
							</div>
						</form>
					</div>

					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-danger" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> 취소 
							</button>
							<button class="btn btn-primary" id="insert_member_info">
								<span class="glyphicon glyphicon-check"></span> 추가 
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
	<!--insert member Modal end -->
	
	<!--update member start -->
	<div id="updateMemberModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">구성원 정보 수정 </h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
													<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">부서 
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
										<select id="update_post_list" class="form-control"
											required>
										</select>
									</div>
									<input type="hidden" id="update_member_id"/>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">이름  </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=""
											id="update_member_name" type="text" required value="" />
									
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">IP주소  </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="update_member_ip" type="text" required value="" readonly />
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">전화번호 </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="update_member_phone" type="text" required value="" />
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">휴대전화 </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="update_member_mobile" type="text" required value="" />
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">E-Mail</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="update_member_mail" type="text" required value="" />
									</div>
								</div>
							</div>
								<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">기타 </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder=" "
											id="update_member_etc" type="text" required value="" />
									</div>
								</div>
							</div>
						</form>
					</div>

					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-danger" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> 취소 
							</button>
							<button class="btn btn-primary" id="update_member_info">
								<span class="glyphicon glyphicon-check"></span> 수정 
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
	<!--update member Modal end -->
	
	<!--delete member Modal start -->
	<div id="deleteMemberModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header bg-danger">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">구성원 정보 삭제 </h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<span id="delete_member_info_view"></span>
						<input type="hidden" id="delete_member_id"/>
					</div>
					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-default" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> 취소
							</button>
							<button class="btn btn-danger" id="delete_member_info">
								<span class="glyphicon glyphicon-check"></span> 삭제 
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
	<!-- dhcp delete Modal end -->

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
	<script src="js/organization_menu.js"></script>
	<script src="js/organization.js"></script>
	<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

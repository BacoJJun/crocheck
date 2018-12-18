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
			<div class="right_col" role="main" style="min-height: 1200px;">
				<div class="row "> 

					<div class="base_panel">
						<div class="x_title">
							<h2>
								DDOS 
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
						<div class="x_panel">
							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="x_title">
									<h2>DDos 차단 목록 </h2>
									<div class="clearfix"></div>
								</div>
								<div class="table-reponsive">
									<table id="ddosblocktable" class="table  table-striped jambo_table bulk_action">
										<colgroup>
											<col width="30%"/>
											<col width="30%"/>
											<col width="30%"/>
											<col width="10%"/>
										</colgroup>
										<thead>
											<tr>
												<th>IP</th>
												<th>비고</th>
												<th>차단일자</th>
												<th><button type="button" class="btn btn-default btn-xs" data-toggle="modal" 	data-target="#ddosblockinsertModal"  id="insert_ddosblock_ip"><i class="fa fa-plus"></i></button></th>
											</tr>
										</thead>
										<tbody id="blockiplist"></tbody>
									</table>
								</div>
							</div>
						</div>
						<!--end  page content -->
					</div>
				</div>
			</div>

		</div>
	</div>



	<!-- The Modal   -->
	<!-- ddosblock Insert Modal start -->
	<div class="modal fade" id="ddosblockinsertModal" tabindex="-1" role="dialog"
		aria-labelledby="contactLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<i class="glyphicon glyphicon-remove"></i>
					</button>
					<h4 class="panel-title">
						<span class="glyphicon glyphicon-info-sign"></span>DDos 차단 추가 
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
										placeholder="차단 IP" id="ddosblock_insert_ip" type="text"
										required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">COMMENT</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<textarea style="resize: vertical;" class="form-control"
										placeholder="comment" id="ddosblock_insert_comment" rows="2"
										name="comment" required></textarea>
								</div>
							</div>
							<div class="panel-footer" style="margin-bottom: -14px;">
								<input type="button" class="btn btn-success" id="ddosblock_insert"
									value="저장" />
								<!--<span class="glyphicon glyphicon-ok"></span>-->
								<input type="reset" class="btn btn-danger btn-close" value="초기화" />
								<!--<span class="glyphicon glyphicon-remove"></span>-->
								<button style="float: right;" type="button"
									class="btn btn-default btn-close" data-dismiss="modal">닫기 </button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ddosblock Insert Modal end -->

	<!-- ddosblock Delete Modal start -->
	<div class="modal fade" id="ddosblockdeleteModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-danger">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title panel-danger" id="voteLabel">
						DDOS 차단 내용 삭제  
					</h4>
				</div>
				<div class="modal-body">
					<span id ="delete_ddosblock_view"></span><input type="hidden" id="delete_ddosblock_ip"/>
				</div>
				<div class="modal-footer">
									<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">닫기 </button>
					<button type="button" class="btn btn-danger " id="ddosblock_delete">삭제 </button>
			</div>
			</div>
		</div>
	</div>
	<!-- ddosblock Delete Modal end -->

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
	<script src="js/ddosban.js"></script>
		<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>


</body>
</html>

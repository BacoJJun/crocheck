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
				<div class="">
					<div class="page-title">
						<div class="title_left">
							<h3>
								Organization <small>조직도 </small>
							</h3>
						</div>

						<div class="title_right">
							<div
								class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
								<div class="input-group">
									<input type="text" class="form-control"
										placeholder="Search for..."> <span
										class="input-group-btn">
										<button class="btn btn-default" type="button">Go!</button>
									</span>
								</div>
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
										<div class="sidebar-nav">
											<div class="navbar navbar-default" role="navigation">
												<div
													class="navbar-collapse collapse sidebar-navbar-collapse">
													<ul class="nav navbar-nav" id="sidenav">
														<li><a href="#" data-toggle="collapse"
															data-target="#toggleDemo" data-parent="#sidenav01"
															class="collapsed"> <span
																class="glyphicon glyphicon-cloud"></span> Submenu 1 <span
																class="fa fa-sort-down"></span>
														</a>
															<div class="collapse" id="toggleDemo"
																style="height: 0px;">
																<ul class="nav nav-list">
																	<li><a href="#">Submenu1.1</a></li>
																	<li><a href="#">Submenu1.2</a></li>
																	<li><a href="#">Submenu1.3</a></li>
																</ul>
															</div></li>
														<li class="active"><a href="#" data-toggle="collapse"
															data-target="#toggleDemo2" data-parent="#sidenav01"
															class="collapsed"> <span
																class="glyphicon glyphicon-inbox"></span> Submenu 2 <span
																class="caret pull-right"></span>
														</a>
															<div class="collapse" id="toggleDemo2"
																style="height: 0px;">
																<ul class="nav nav-list">
																	<li><a href="#">Submenu2.1</a></li>
																	<li><a href="#">Submenu2.2</a></li>
																	<li class="active"><a href="#" data-toggle="collapse" data-target="#toggleDemo3" data-parent="#sidenav01" class="collapsed">Submenu2.3</a><div class="collapse" id="toggleDemo3"
																style="height: 0px;">
																<ul class="nav nav-list">
																	<li><a href="#">Submenu2.1</a></li>
																	<li><a href="#">Submenu2.2</a></li>
																	</ul>
																	</div>
																	</li>
																</ul>
															</div></li>
													</ul>
												</div>
												<!--/.nav-collapse -->
											</div>
										</div>
									</div>
									<!-- organization list end -->
									<!-- start project list -->
									<div class="col-md-10 col-sm-12 col-xs-12">
										<table id="datatable"
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
												<tr>
													<td>개발연구소</td>
													<td>이준석</td>
													<td>192.168.0.78</td>
													<td>02-XXXX-XXXX</td>
													<td>010-XXXX-XXXX</td>
													<td>asjdfla@humanstar.co.kr</td>
													<td>기타사항란</td>
													<td><a href="#" class="btn btn-info btn-xs"><i
															class="fa fa-pencil"></i></a> <a href="#"
														class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i>
													</a></td>
												</tr>

											</tbody>
										</table>
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
	<script src="js/organization_menu.js"></script>
	<script src="js/organization.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

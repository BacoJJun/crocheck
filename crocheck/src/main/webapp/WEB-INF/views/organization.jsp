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
									<div class="col-md-2 col-sm-12 col-xs-12">
										<div class="panel-body">
											<div class="x_title"> 
												<h2 class="text-right"><small><a href="#" class="btn btn-info btn-xs"><i
															class="fa fa-pencil"></i> </a><a href="#" class="btn btn-success btn-xs"><i class="fa fa-plus"></i></a></small></h2>
											</div>
											<div class="clearfix"></div>
											<ul class="treeview">
												<li><a href="#">휴먼스타 </a>
													<ul>
														<li><a href="#">본사 </a>
															<ul>
																<li><a href="#">경영지원팀 </a></li>
																<li><a href="#">인프라운영팀 </a></li>
																<li><a href="#">개발연구소 </a></li>
															</ul></li>
														<li><a href="#">메뉴 테스트  </a></li>
													</ul></li>
											</ul>
											<!-- TREEVIEW CODE -->
										</div>
									</div>
									<!-- organization list end -->
									<!-- start project list -->
									<div class="col-md-10 col-sm-12 col-xs-12">
										<table id="datatable-responsive"
											class="table table-striped table-bordered dt-responsive nowrap"
											cellspacing="0" width="100%">
											<thead>
												<tr>
													<th style="width: 2%">#</th>
													<th style="width: 20%">부서</th>
													<th>직급</th>
													<th>이름</th>
													<th>IP</th>
													<th>인적사항</th>
													<th style="width: 15%">수정</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>1</td>
													<td>휴먼스타/개발연구소</td>
													<td>주임</td>
													<td>이준석</td>
													<td>192.168.0.78</td>
													<td><i class="fa fa-phone"></i> 02-XXXX-XXXX <br>
														<i class="fa fa-mobile-phone"></i> 010-XXXX-XXXX<br>
														<i class="fa fa-envelope-o"></i> jslee@humanstar.co.kr</td>
													<td><a href="#" class="btn btn-info btn-xs"><i
															class="fa fa-pencil"></i> Edit </a> <a href="#"
														class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i>
															Delete </a></td>
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

	<!-- Custom Theme Scripts -->
	<script src="js/organization_menu.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

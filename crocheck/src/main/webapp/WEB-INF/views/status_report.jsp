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
								REPORT <small> </small>
							</h2>

							<div class="clearfix"></div>
						</div>
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="col-md-10">
									<div class="x_panel"></div>
								</div>
								<div class="col-md-2">
									<div class="x_panel">
										<div class="x_title">
											<h2>체크 리스트</h2>
										</div>
										<div class="clearfix"></div>

										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
										</div>
										<div class="checkbox">
											<label> <input type="checkbox" class="flat"
												checked="checked"> Checked
											</label>
											<div class="checkbox">
												<label> <input type="checkbox" class="flat"
													checked="checked"> Checked
												</label>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox" class="flat"
													checked="checked"> Checked
												</label>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox" class="flat"
													checked="checked"> Checked
												</label>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox" class="flat"
													checked="checked"> Checked
												</label>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox" class="flat"
													checked="checked"> Checked
												</label>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox" class="flat"
													checked="checked"> Checked
												</label>
											</div>
										</div>
									</div>
									<div class="x_panel">
										<div class="x_title">
											<h2>
												검색조건 <small> </small>
											</h2>
										</div>
										<div class="clearfix"></div>
										<div class="radio">
											<label> <input type="radio" class="flat" checked
												name="report_type" checked id="daily""> 일간
											</label> <label> <input type="radio" class="flat"
												name="report_type" id="weekly"> 주간
											</label> <label> <input type="radio" class="flat"
												name="report_type" id="monthly"> 월간
											</label>
										</div>
										<div class="clearfix"></div>
										<div id="reportrange" class="pull"
											style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
											<i class="glyphicon glyphicon-calendar fa fa-calendar"></i> <span>November
												6, 2015 - December 15, 2015</span> <b class="caret"></b>
										</div>
										<div class="clearfix"></div>
										<div class="radio">
											<label> <input type="radio" class="flat" checked
												name="report_count_type" checked id="all""> 전체
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
											<button type="button" class="btn btn-success"><span>SUBMIT</span></button>
										</div>
									</div>
								</div>
							</div>
						</div>

						<!-- Report  end -->
					</div>
				</div>
				<!--end  page content -->

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

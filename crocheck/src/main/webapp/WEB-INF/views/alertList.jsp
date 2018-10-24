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
			<div class="right_col" role="main" style="">
				<div class="row ">

					<!--  Report start -->
					<div class="x_panel">
						<div class="x_title">
							<h2>
								임계값 설정 <small></small>
							</h2>

							<div class="clearfix"></div>
						</div>

						<!-- form grid slider -->
<<<<<<< HEAD
						<div class="x_panel" >
<div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
=======
						<div class="x_panel">
							<div class="row">
								<div class="col-md-12 col-sm-12 col-xs-12">
									<div class="x_content">
										<br />
										<form id="demo-form2" data-parsley-validate
											class="form-horizontal form-label-left">
>>>>>>> branch 'master' of https://github.com/BacoJJun/crocheck.git

<<<<<<< HEAD
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">First Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="first-name" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">Last Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="last-name" name="last-name" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Middle Name / Initial</label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="middle-name">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Gender</label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <div id="gender" class="btn-group" data-toggle="buttons">
                            <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                              <input type="radio" name="gender" value="male"> &nbsp; Male &nbsp;
                            </label>
                            <label class="btn btn-primary" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                              <input type="radio" name="gender" value="female"> Female
                            </label>
                          </div>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">Date Of Birth <span class="required">*</span>
                        </label>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                          <input id="birthday" class="date-picker form-control col-md-7 col-xs-12" required="required" type="text">
                        </div>
                                                <label class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">Date Of Birth <span class="required">*</span>
                        </label>
                        <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                          <input id="birthday" class="date-picker form-control col-md-7 col-xs-12" required="required" type="text">
                        </div>
                      </div>
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">

                          <button type="submit" class="btn btn-success">저장</button>
                        </div>
                      </div>

                    </form>
                  </div>
                </div>

            </div>
							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>CPU</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="cpu_range_graph">
									<input type="text" id="cpu_range" value="" name="range" />
								</div>
							</div>
							<br>
							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>Memory</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="memory_range_graph">
									<input type="text" id="memory_range" value="" name="range" />
								</div>
							</div>
							<br>
							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>Disk</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="disk_range_graph">
									<input type="text" id="disk_range" value="" name="range" />
								</div>
							</div>
							<br>
							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>DNS</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="dns_range_graph">
									<input type="text" id="dns_range" value="" name="range" />
								</div>
							</div>
							<br>
							<div class="row grid_slider">
								<div class="col-lg-2 col-md-2 col-sm-4 col-xs-4">
									<p>DDOS</p>
								</div>
								<div class="col-lg-6 col-md-6 col-sm-8 col-xs-8"
									id="ddos_range_graph">
									<input type="text" id="ddos_range" value="" name="range" />
								</div>
							</div>
							<br><br>
																<div class="col-lg-8 col-md-8 col-sm-12 col-xs-12 text-right">
										<input type="button"
											class="btn btn-success" id="btn-save" value="save"></input>
=======
											<div class="form-group">
												<label
													class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12"> CPU

												</label>
												<div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
													<label
														class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12"><button type="button" class="btn btn-warning btn-xs">Warning</button>
													</label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="cpu_warning"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
													<label
														class=" control-label col-lg-1 col-md-1 col-sm-1 col-xs-12">
														<button type="button" class="btn btn-danger btn-xs">Critical</button> </label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="cpu_critical"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
												</div>
											</div>
											<div class="form-group">
												<label
													class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12"> MEMORY

												</label>
												<div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
													<label
														class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12"><button type="button" class="btn btn-warning btn-xs">Warning</button>
													</label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="memory_warning"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
													<label
														class=" control-label col-lg-1 col-md-1 col-sm-1 col-xs-12">
														<button type="button" class="btn btn-danger btn-xs">Critical</button> </label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="memory_critical"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
												</div>
											</div>
											<div class="form-group">
												<label
													class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12"> DISK

												</label>
												<div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
													<label
														class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12"><button type="button" class="btn btn-warning btn-xs">Warning</button>
													</label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="disk_warning"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
													<label
														class=" control-label col-lg-1 col-md-1 col-sm-1 col-xs-12">
														<button type="button" class="btn btn-danger btn-xs">Critical</button> </label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="disk_critical"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
												</div>
											</div>
											<div class="form-group">
												<label
													class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12"> DNS
												</label>
												<div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
													<label
														class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12"><button type="button" class="btn btn-warning btn-xs">Warning</button>
													</label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="dns_warning"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
													<label
														class=" control-label col-lg-1 col-md-1 col-sm-1 col-xs-12">
														<button type="button" class="btn btn-danger btn-xs">Critical</button> </label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="dns_critical"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
												</div>
											</div>
											<div class="form-group">
												<label
													class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12"> DDOS

												</label>
												<div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
													<label
														class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12"><button type="button" class="btn btn-warning btn-xs">Warning</button>
													</label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="ddos_warning"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
													<label
														class=" control-label col-lg-1 col-md-1 col-sm-1 col-xs-12">
														<button type="button" class="btn btn-danger btn-xs">Critical</button> </label>
													<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
														<input id="ddos_critical"
															class="form-control col-md-3 col-xs-12"
															required="required" type="text">
													</div>
												</div>
											</div>
											<div class="ln_solid"></div>
											<div class="form-group">
											<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12"></div>
												<div class="col-md-3 col-sm-3 col-xs-12 col-md-offset-3">

													<button id="alert_save" type="submit" class="btn btn-success">저장</button>
												</div>
											</div>

										</form>
>>>>>>> branch 'master' of https://github.com/BacoJJun/crocheck.git
									</div>
								</div>

							</div>
					</div>
					<!--  page part -->

				</div>

				<!-- Report  end -->
			</div>
		</div>
		<!--end  page content -->
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
	<script src="js/ion.rangeSlider.min.js"></script>
	<!-- Custom Theme Scripts -->

	<script src="js/alertList.js"></script>
	<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

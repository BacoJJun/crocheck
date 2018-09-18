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

					<!--  Report start -->
					<div class="x_panel">
						<div class="x_title">
							<h2>
								REPORT<small></small>
							</h2>

							<div class="clearfix"></div>
						</div>

						<!--  page part -->
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">

								<!--  Guide Form start -->
								<div class="x_panel">
									<div class="x_title">
										<h2>
											<i class="fa fa-bars"></i> Tabs <small>Float right</small>
										</h2>
										<div class="clearfix"></div>
									</div>
									<div class="x_content">

										<div class="" role="tabpanel" data-example-id="togglable-tabs">
											<ul id="myTab1" class="nav nav-tabs bar_tabs right"
												role="tablist">
												<li role="presentation" class="active"><a
													href="#tab_content11" id="home-tabb" role="tab"
													data-toggle="tab" aria-controls="home" aria-expanded="true">Home</a>
												</li>
												<li role="presentation" class=""><a
													href="#tab_content22" role="tab" id="profile-tabb"
													data-toggle="tab" aria-controls="profile"
													aria-expanded="false">Profile</a></li>
												<li role="presentation" class=""><a
													href="#tab_content33" role="tab" id="profile-tabb3"
													data-toggle="tab" aria-controls="profile"
													aria-expanded="false">Profile</a></li>
											</ul>
											<div id="myTabContent2" class="tab-content">
												<div role="tabpanel" class="tab-pane fade active in"
													id="tab_content11" aria-labelledby="home-tab">
													<p>Raw denim you probably haven't heard of them jean
														shorts Austin. Nesciunt tofu stumptown aliqua, retro synth
														master cleanse. Mustache cliche tempor, williamsburg
														carles vegan helvetica. Reprehenderit butcher retro
														keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui
														irure terr.</p>
												</div>
												<div role="tabpanel" class="tab-pane fade"
													id="tab_content22" aria-labelledby="profile-tab">
													<p>Food truck fixie locavore, accusamus mcsweeney's
														marfa nulla single-origin coffee squid. Exercitation +1
														labore velit, blog sartorial PBR leggings next level wes
														anderson artisan four loko farm-to-table craft beer twee.
														Qui photo booth letterpress, commodo enim craft beer
														mlkshk aliquip</p>
												</div>
												<div role="tabpanel" class="tab-pane fade"
													id="tab_content33" aria-labelledby="profile-tab">
													<p>xxFood truck fixie locavore, accusamus mcsweeney's
														marfa nulla single-origin coffee squid. Exercitation +1
														labore velit, blog sartorial PBR leggings next level wes
														anderson artisan four loko farm-to-table craft beer twee.
														Qui photo booth letterpress, commodo enim craft beer
														mlkshk</p>
												</div>
											</div>
										</div>

									</div>
								</div>
							</div>
							<div class="clearfix"></div>
							<!--  Guide Form end -->
						</div>
					</div>

					<!-- Guide  end -->
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
	<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

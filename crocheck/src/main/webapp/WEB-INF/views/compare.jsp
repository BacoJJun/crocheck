<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
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
			<div class="right_col">
				<div class="row ">
					<div class="col-lg-4 col-md-4"></div>
					<div class="col-lg-2 col-md-2">
						<form class="form-horizontal">
							<fieldset>
								<div class="control-group">
									<div class="controls">
										<div class="input-prepend input-group">
											<input type="text" class="form-control has-feedback-left"
												id="single_cal2" placeholder="First Name"
												aria-describedby="inputSuccess2Status2"> <span
												class="fa fa-calendar-o form-control-feedback left"
												aria-hidden="true"></span> <span id="inputSuccess2Status2"
												class="sr-only"></span>
										</div>
									</div>
								</div>
							</fieldset>
						</form>

					</div>

					<div class="col-lg-2 col-md-2">
						<form class="form-horizontal">
							<fieldset>
								<div class="control-group">
									<div class="controls">
										<div class="input-prepend input-group">
											<input type="text" class="form-control has-feedback-left"
												id="single_cal3" placeholder="First Name"
												aria-describedby="inputSuccess2Status3"> <span
												class="fa fa-calendar-o form-control-feedback left"
												aria-hidden="true"></span> <span id="inputSuccess2Status3"
												class="sr-only"></span>
										</div>
									</div>
								</div>
							</fieldset>
						</form>

					</div>
					<div class="col-lg-2 col-md-2">
						<button type="button" class="btn btn-success" id="search_btn">
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</div>

				</div>
				<div class="row">
					<div class="col-lg-3 col-md-3"></div>
					<div class="col-lg-8 col-md-8">
						<form class="radio">
							<label> <input type="radio" class="flat"
								name="search_type" value="query" checked>QUERY STATUS</input>
							</label> <label> <input type="radio" class="flat"
								name="search_type" value="dnsdomain">DNS(Domain)</input>
							</label> <label> <input type="radio" class="flat"
								name="search_type" value="dnsclient">DNS(Client)</input>
							</label> <label> <input type="radio" class="flat"
								name="search_type" value="ddosdomain">DDOS(Domain)</input>
							</label> <label> <input type="radio" class="flat"
								name="search_type" value="ddosclient">DDOS(Client)</input>
							</label>
						</form>
					</div>
				</div>

				<div class="x_panel">
					<!-- compare query -->
					<div class="row" id="comparequery">
						<div class="x_panel">
							<div class="x_title">
								<h2>Compare Query</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div id="comparequeryline" style="height: 350px;"></div>
							</div>
						</div>

					</div>
					<!--  compare query end -->

					<!-- compare dns domain -->
					<div class="row" id="comparednsdomain">
						<div class="col-lg-6 col-md-6 com-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2 id="title_first"></h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<div id="dnsdomainfirstdonut" style="height: 350px;"></div>

								</div>
								<div class="table">
									<table class="table table-striped table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Domain</th>
												<th>count</th>
												<th>%</th>
											</tr>
										</thead>
										<tbody id="dnsdomainfirstlist"></tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="col-lg-6 col-md-6 com-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2 id="title_first"></h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<div id="dnsdomainseconddonut" style="height: 350px;"></div>

								</div>
								<div class="table">
									<table class="table table-striped table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Domain</th>
												<th>count</th>
												<th>%</th>
											</tr>
										</thead>
										<tbody id="dnsdomainsecondlist"></tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					<!--  compare dns domain end -->

					<!--  compare dns client -->
					<div class="row" id="comparednsclient">
					<div class="col-lg-6 col-md-6 com-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2 id="title_first"></h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<div id="dnsclientfirstdonut" style="height: 350px;"></div>

								</div>
								<div class="table">
									<table class="table table-striped table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Domain</th>
												<th>count</th>
												<th>%</th>
											</tr>
										</thead>
										<tbody id="dnsclientfirstlist"></tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="col-lg-6 col-md-6 com-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2 id="title_first"></h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<div id="dnsclientseconddonut" style="height: 350px;"></div>

								</div>
								<div class="table">
									<table class="table table-striped table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Domain</th>
												<th>count</th>
												<th>%</th>
											</tr>
										</thead>
										<tbody id="dnsclientsecondlist"></tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					<!--  compare dns client end -->

					<!--  compare ddos domain -->
					<div class="row" id="compareddosdomain">
					<div class="col-lg-6 col-md-6 com-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2 id="title_first"></h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<div id="ddosdomainfirstdonut" style="height: 350px;"></div>

								</div>
								<div class="table">
									<table class="table table-striped table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Domain</th>
												<th>count</th>
												<th>%</th>
											</tr>
										</thead>
										<tbody id="ddosdomainfirstlist"></tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="col-lg-6 col-md-6 com-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2 id="title_first"></h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<div id="ddosdomainseconddonut" style="height: 350px;"></div>

								</div>
								<div class="table">
									<table class="table table-striped table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Domain</th>
												<th>count</th>
												<th>%</th>
											</tr>
										</thead>
										<tbody id="ddosdomainsecondlist"></tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					<!--  compare ddos domain end -->

					<!--  compare ddos client -->
					<div class="row" id="compareddosclient">
					
					<div class="col-lg-6 col-md-6 com-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2 id="title_first"></h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<div id="ddosclientfirstdonut" style="height: 350px;"></div>

								</div>
								<div class="table">
									<table class="table table-striped table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Domain</th>
												<th>count</th>
												<th>%</th>
											</tr>
										</thead>
										<tbody id="ddosclientnfirstlist"></tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="col-lg-6 col-md-6 com-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2 id="title_first"></h2>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">

									<div id="ddosclientseconddonut" style="height: 350px;"></div>

								</div>
								<div class="table">
									<table class="table table-striped table-bordered">
										<thead>
											<tr>
												<th>#</th>
												<th>Domain</th>
												<th>count</th>
												<th>%</th>
											</tr>
										</thead>
										<tbody id="ddosclientsecondlist"></tbody>
									</table>
								</div>
							</div>
						</div>
						</div>
					<!--  compare ddos client end  -->
				</div>
			</div>



		</div>
	</div>

	<!--end  page content -->

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="js/fastclick.js"></script>
	<!-- Chart.js -->
	<script src="js/Chart.min.js"></script>
	<!-- gauge.js -->
	<script src="js/gauge.min.js"></script>
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
	<!-- NProgress -->
	<script src="js/nprogress.js"></script>
	<!-- bootstrap-progressbar -->
	<script src="js/bootstrap-progressbar.min.js"></script>

	<!-- Custom Theme Scripts -->
	<script src="js/compare.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

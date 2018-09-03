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
								REPORT<small></small>
							</h2>

							<div class="clearfix"></div>
						</div>

						<!--  page part -->
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<!-- report view part -->
								<div class="col-md-9" style="overflow-y: auto; height: 600px;">

									<!--  update liststart -->
									<div class="x_panel">
										<div class="x_title">
											<h2>
												DNS update list <small></small>
											</h2>

											<div class="clearfix"></div>
										</div>
										<div class="x_content">
											<ul class="list-unstyled timeline">
												<li>
													<div class="block">
														<div class="tags" >
															<div class="btn btn-info btn-sm"> <i class="fa fa-plus">INSERT</i></div>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>Insert DNS Zone</a>
															</h2>
															<div class="byline">
																<span>2018.08.31 00:00:00</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																zone : humanstar.co.kr / ip : 192.168.0.38
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<div class="btn btn-warning btn-sm"> <i class="fa fa-edit">UPDATE</i></div>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>UPDATE SUB_DOMAIN</a>
															</h2>
															<div class="byline">
																<span>2018.08.23 09:45:22</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																zone : crocheck.co.kr / ip : 192./168.0.40
																sub_domain : update.crocheck.co.kr / ip : 192.168.0.38
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<div class="btn btn-danger btn-sm"> <i class="fa fa-trash-o">DELTE</i></div>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>Delete DNS ZONE</a>
															</h2>
															<div class="byline">
																<span>2018.08.20 16:23:11</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																Delete DNS ZONE : delete.co.kr / ip : 192.168.10.33
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<a href="" class="tag"> <span>INSERT</span>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>Insert DNS Zone</a>
															</h2>
															<div class="byline">
																<span>2018.08.31 00:00:00</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																zone : humanstar.co.kr / ip : 192.168.0.38
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<a href="" class="tag"> <span>UPDATE</span>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>UPDATE SUB_DOMAIN</a>
															</h2>
															<div class="byline">
																<span>2018.08.23 09:45:22</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																zone : crocheck.co.kr / ip : 192./168.0.40
																sub_domain : update.crocheck.co.kr / ip : 192.168.0.38
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<a href="" class="tag"> <span>DELETE</span>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>Delete DNS ZONE</a>
															</h2>
															<div class="byline">
																<span>2018.08.20 16:23:11</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																Delete DNS ZONE : delete.co.kr / ip : 192.168.10.33
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<a href="" class="tag"> <span>INSERT</span>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>Insert DNS Zone</a>
															</h2>
															<div class="byline">
																<span>2018.08.31 00:00:00</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																zone : humanstar.co.kr / ip : 192.168.0.38
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<a href="" class="tag"> <span>UPDATE</span>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>UPDATE SUB_DOMAIN</a>
															</h2>
															<div class="byline">
																<span>2018.08.23 09:45:22</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																zone : crocheck.co.kr / ip : 192./168.0.40
																sub_domain : update.crocheck.co.kr / ip : 192.168.0.38
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<a href="" class="tag"> <span>DELETE</span>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>Delete DNS ZONE</a>
															</h2>
															<div class="byline">
																<span>2018.08.20 16:23:11</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																Delete DNS ZONE : delete.co.kr / ip : 192.168.10.33
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<a href="" class="tag"> <span>INSERT</span>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>Insert DNS Zone</a>
															</h2>
															<div class="byline">
																<span>2018.08.31 00:00:00</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																zone : humanstar.co.kr / ip : 192.168.0.38
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<a href="" class="tag"> <span>UPDATE</span>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>UPDATE SUB_DOMAIN</a>
															</h2>
															<div class="byline">
																<span>2018.08.23 09:45:22</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																zone : crocheck.co.kr / ip : 192./168.0.40
																sub_domain : update.crocheck.co.kr / ip : 192.168.0.38
															</p>
														</div>
													</div>
												</li>
												<li>
													<div class="block">
														<div class="tags">
															<a href="" class="tag"> <span>DELETE</span>
															</a>
														</div>
														<div class="block_content">
															<h2 class="title">
																<a>Delete DNS ZONE</a>
															</h2>
															<div class="byline">
																<span>2018.08.20 16:23:11</span> by <a>Administrator</a>
															</div>
															<p class="excerpt">
																Delete DNS ZONE : delete.co.kr / ip : 192.168.10.33
															</p>
														</div>
													</div>
												</li>
											</ul>

										</div>
									</div>
								</div>
								<!-- update list end -->

								<!-- report check list -->
								<div class="col-md-3">
									<div class="x_panel">
										<div class="x_title">
											<h2>체크 리스트</h2>
										</div>
										<div class="clearfix"></div>

										<div class="radio" id="check_dns_domain_div">
											<label> <input
												type="radio" class="flat" id="check_dns_update" name="check_update"
												checked="checked"> DNS UPDATE LIST
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" class="flat"
												id="check_dhcp_update" name="check_update" > DHCP UPDATE LIST
											</label>
										</div>
									</div>
									<!-- report check list -->

									<!-- report search start -->
									<div class="x_panel">
										<div class="x_title">
											<h2>
												검색조건 <small> </small>
											</h2>
										</div>
										<div class="clearfix"></div>
										<div id="reportrange" class="pull-right"
											style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
											<i class="glyphicon glyphicon-calendar fa fa-calendar"></i> <span></span>
											<b class="caret"></b>
										</div>
										<div class="clearfix"></div>
										<div class="text-right">
											<button type="button" class="btn btn-success">
												<span>SUBMIT</span>
											</button>
											
										</div>
									</div>
									<!-- report search end -->
								</div>
								<!-- report check list end -->
							</div>
						</div>

						<!-- Report  end -->
					</div>
				</div>
				<!--end  page content -->
			</div>
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

	<script src="js/custom.js"></script>
</body>
</html>

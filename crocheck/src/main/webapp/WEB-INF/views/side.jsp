<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="ko" data-placeholders-focus="false">
<!-- sidebar menu -->
<div class="col-md-3 left_col">
	<div class="left_col scroll-view">
		<div class="navbar nav_title" style="border: 0;">
			<a href="/dashboard" class="site_title"> <span>CROCHECK
					SDNS</span></a>
		</div>

		<div class="clearfix"></div>

		<br />
		<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
			<div class="menu_section">
				<ul class="nav side-menu">
					<li><a><i class="fa fa-home"></i> <strong>처음화면</strong> <span
							class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu">
							<li><a href=" /dashboard">대시보드 </a></li>
							<li><a href=" /dashboard2">Dashboard2</a></li>
							<li><a href=" /dashboard3">Dashboard3</a></li>
						</ul></li>
					<li><a><i class="fa fa-bar-chart-o"></i> <strong>통계분석 </strong><span
							class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu">
							<li><a href=" /dnsstatus">DNS-STATUS</a></li>
							<li><a href=" /statistics">분석</a></li>
							<li><a href=" /compare">비교</a></li>
						</ul></li>
					<li><a><i class="fa fa-edit"></i><strong>정책설정 </strong><span
							class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu">
							<li><a href=" /dnspolicy">DNS</a></li>
							<li><a href=" /dhcppolicy">DHCP</a></li>
							<li><a href="/ddosban">DDoS</a>
							<li><a href=" /alertList">ALERT</a></li>
							<li><a href=" /engine">ENGINE</a></li>
						</ul></li>
					<li><a><i class="fa fa-sitemap"></i><strong>조 직 도</strong><span
							class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu">
							<li><a href=" /organization">ORGANIZATION</a></li>
						</ul></li>

					<li><a><i class="fa fa-clone"></i><strong>보 고 서</strong><span
							class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu">
							<li><a href=" /status_report">STATUS</a></li>
							<li><a href=" /update_report">UPDATE</a></li>
						</ul></li>
				</ul>
			</div>


			<!-- /sidebar menu -->

			<!-- /menu footer buttons -->

		</div>
		<div class="sidebar-footer hidden-small">
			<a href=" /setting" data-toggle="tooltip"
				data-placement="top" title="Settings"> <span
				class="glyphicon glyphicon-cog" aria-hidden="true"></span>
			</a> <a href=" /guide" data-toggle="tooltip" data-placement="top"
				title="Guide"> <span class="glyphicon glyphicon-book"
				aria-hidden="true"></span>
			</a> <a href="#" class="requestfullscreen" data-toggle="tooltip"
				data-placement="top" id="requestfullscreen" title="FullScreen">
				<span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
			</a><a href="#" class="exitfullscreen" data-toggle="tooltip"
				data-placement="top" id="exitfullscreen" title="FullScreen"
				style="display: none"> <span
				class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
			</a><a data-toggle="tooltip" data-placement="top" title="Logout"
				href="login.html"> <span class="glyphicon glyphicon-off"
				aria-hidden="true"></span>
			</a>

			<!-- /menu footer buttons -->
		</div>

	</div>
</div>
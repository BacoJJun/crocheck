<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
			<div class="top_nav">
				<div class="nav_menu">
					<nav>
					<div class="nav toggle">
						<a id="menu_toggle"><i class="fa fa-bars"></i></a>
					</div>

					<ul class="nav navbar-nav navbar-right">
						<li class=""><a href="javascript:;"
							class="user-profile dropdown-toggle" data-toggle="dropdown"
							aria-expanded="false"> Administrator<span
								class=" fa fa-angle-down"></span>
						</a>
							<ul class="dropdown-menu dropdown-usermenu pull-right">
							<li><a href="#" id="requestfullscreen_top" class="requestfullscreen">풀스크린모드 </a><a href="#" id="exitfullscreen_top" class="exitfullscreen" style="display: none">브라우져 모드</a></li>
								<li><a href="/setting">설정</a></li>
								<!-- <li><a href="/guide"> <span>가이드</span>
								</a></li>		 -->
								<li><a href="/logout"><i
										class="fa fa-sign-out pull-right"></i>로그아웃</a></li>
							</ul></li>

						<li role="presentation" class="dropdown"><a
							href="javascript;" class="dropdown-toggle info-number"
							data-toggle="dropdown" aria-expanded="false"> <i
								class="fa fa-bell-o"></i> <span class="badge bg-green" id="alertCount"></span>
						</a>
						
							<ul id="alertMenu" class="dropdown-menu list-unstyled msg_list"
								role="menu">
								<div id="alertList"></div>
								<li>
								<div class="col-lg-4 col-md-4">
									<div class="text-center">
										<span id="allread"><a><strong>모두 읽기 </strong></a></span>
									</div>
								</div>
								<div class="col-lg-8 col-md-8">
									<div class="text-center">
										<a href="/alert_notice"> <strong>메세지 모두 보기</strong> <i
											class="fa fa-angle-right"></i>
										</a>
									</div>
									</div>
								</li>
							</ul>
							</li> 
					</ul>
					</nav>
				</div>
			</div>
			
			

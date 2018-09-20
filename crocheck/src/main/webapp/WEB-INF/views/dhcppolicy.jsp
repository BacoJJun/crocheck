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

					<div class="x_panel">
						<div class="x_title">
							<h2>
								DHCP <small>Dynamic Host Configuration Protocol </small>
							</h2>
							<div class="clearfix"></div>
						</div>

						<!--  dhcp  start -->
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="table-responsive">
								<table class="table table-striped jambo_table bulk_action">
									<thead>
										<tr class="headings ">
											<th class="column-title">TOTAL</th>
											<th class="column-title text-center">전체 IP :</th>
											<th class="column-title" id="total_count"></th>
											<th class="column-title text-center">예외 IP :</th>
											<th class="column-title" id="total_exception_count"></th>
											<th class="column-title text-center">고정 IP :</th>
											<th class="column-title" id="total_hold_count"></th>
											<th class="column-title text-center">할당 IP :</th>
											<th class="column-title" id="total_rent_count"></th>
											<th class="column-title text-center">미할당 IP :</th>
											<th class="column-title" id="total_not_rent_count"></th>
										</tr>
										<tr class="headings ">
											<th class="column-title">SUB_TOTAL</th>
											<th class="column-title text-center">전체 IP :</th>
											<th class="column-title" id="sub_total_count"></th>
											<th class="column-title text-center">예외 IP :</th>
											<th class="column-title" id="sub_exception_count"></th>
											<th class="column-title text-center">고정 IP :</th>
											<th class="column-title" id="sub_hold_count"></th>
											<th class="column-title text-center">할당 IP :</th>
											<th class="column-title" id="sub_rent_count"></th>
											<th class="column-title text-center">미할당 IP :</th>
											<th class="column-title" id="sub_not_rent_count"></th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
						</div>
						<!--  dhcp setting end -->

						<!--  DDOS search start -->
						<div class="x_panel">
							<div class="x_title">
								<h2>
									DHCP Lookup <small> </small>
								</h2>
								<div class="clearfix"></div>
							</div>
							<div class="col-md-6  col-sm-12 col-xs-12">
								<div class="input-group">
									<input type="text" class="form-control" id="text-lookup"
										placeholder="Input your finding address"> <span
										class="input-group-btn">
										<button type="button" class="btn btn-default" title="주소검색"
											id="btn-lookup">
											<span class="glyphicon glyphicon-search"></span>
										</button>
									</span>
								</div>
							</div>
							<div class="col-md-6  col-sm-12 col-xs-12">
								<div id="dhcp-lookup-result"></div>
							</div>
						</div>
						<div class="clearfix"></div>
						<!--  DDOS search end -->

						<!--  DHCP List start -->
						<div class="x_panel">
							<div class="x_title">
								<div class="col-lg-9 col-md-9">
									<H2>DHCP</H2>
								</div>
								<div class="col-md-3 text-right">
									<button type="button" class="btn btn-success btn-xs"
										id="insertDomain" data-toggle="modal"
										data-target="#dhcpInsertModal">
										<i class="fa fa-plus"></i>DHCP
									</button>
									<button type="button" class="btn btn-info btn-xs"
										id="insertSubDomain" data-toggle="modal"
										data-target="#subInsertModal">
										<i class="fa fa-plus"></i>DHCP OPTION
									</button>
								</div>
								<div class="clearfix"></div>
							</div>

							<div class="col-md-8 col-sm-6 col-xs-6">
								<table id="datatable" class="table table-striped ">
									<colgroup>
										<col width="20%"></col>
										<col width="15%"></col>
										<col width="20%"></col>
										<col width="*%"></col>
										<col width="10%"></col>
									</colgroup>
									<thead>
										<tr>
											<th>대분류</th>
											<th>소분류</th>
											<th>프로토콜</th>
											<th style="display: none;"></th>
											<th>Host Address</th>
											<th></th>
										</tr>
									</thead>
									<tbody id="dhcplist">
									</tbody>
								</table>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-6"
								style="overflow-y: auto; height: 450px;">
								<table id="subtable" class="table table-hover">
									<thead>
										<tr class="headings">
											<th colspan="4">세부설정</th>
										</tr>
										<tr class="headings ">
											<th class="column-title">종류</th>
											<th class="column-title">시작 IP</th>
											<th class="column-title">종료 IP</th>
											<th class="column-title">MAC</th>
										</tr>
									</thead>
									<tbody id="dhcp_sublist">
									</tbody>
								</table>
								<table id="table" class="table table-hover">
									<thead>
										<tr class="headings">
											<th colspan="4">임대 IP 내역</th>
										</tr>
										<tr class="headings ">
											<th class="column-title">IP</th>
											<th class="column-title">MAC</th>
											<th class="column-title">PC</th>
											<th class="column-title">임대시간</th>
										</tr>
									</thead>
									<tbody id="dhcp_rentlist">
									</tbody>
								</table>
							</div>
						</div>
						<!--  DHCP Zone List end -->
						<!--end  page content -->
					</div>
				</div>
			</div>

		</div>
	</div>


	<!-- The Modal   -->
	<!--dhcpInsert Modal start -->
	<div id="dhcpInsertModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">DHCP INSERT</h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">대분류
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_category1" type="text" required value="" />
									</div>
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<select id="dhcp_category" class="form-control" required>
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">소분류
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_category2" type="text" required value="" />
									</div>
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<select id="dhcp_category_group" class="form-control" required>
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Protocal
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<select id="insert_dhcp_protocal" class="form-control" required>
											<option value="ipv4">ipv4</option>
										</select>
									</div>
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12"></div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Host
									Address </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_host" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">길이
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-3 col-md-3 col-sm-3 col-xs12">
										<input class="number" name="subject" placeholder="ETC"
											id="insert_dhcp_subnet_length" type="text" required value="24" />
									</div>
									<div class="col-lg-9 col-md-9 col-sm-9 col-xs12"></div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Subnet
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_subnet" type="text" required value="255.255.255.0" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Broadcast
									Address </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_broadcast" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Gateway
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_gateway" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">임대시간 
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_day" type="text" required value="" />
									</div>
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_hour" type="text" required value="" />
									</div>
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_min" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Primary_DNS
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_dns1" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Secondary_DNS
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_dhcp_dns2" type="text" required value="" />
									</div>
								</div>
							</div>
						</form>
					</div>

					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-danger" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> Cancel
							</button>
							<button class="btn btn-primary" id="insert_dhcp">
								<span class="glyphicon glyphicon-check"></span> Save
							</button>
						</div>
					</div>

				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dalog -->
		</div>
	</div>
	<!-- /.modal -->
	<!-- dhcp insert Modal end -->
	
	<!--dhcp edit Modal start -->
	<div id="dhcpeditModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">DHCP INSERT</h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">대분류
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_category1" type="text" required value="" />
									</div>
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<select id="dhcp_update_category" class="form-control" required>
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">소분류
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_category2" type="text" required value="" />
									</div>
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<select id="dhcp_update_category_group" class="form-control" required>
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Protocal
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<select id="update_dhcp_protocal" class="form-control" required>
											<option value="ipv4">ipv4</option>
										</select>
									</div>
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12"></div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Host
									Address </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_host" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">길이
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-3 col-md-3 col-sm-3 col-xs12">
										<input class="number" name="subject" placeholder="ETC"
											id="update_dhcp_subnet_length" type="text" required value="24" />
									</div>
									<div class="col-lg-9 col-md-9 col-sm-9 col-xs12"></div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Subnet
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_subnet" type="text" required value="255.255.255.0" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Broadcast
									Address </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_broadcast" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Gateway
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_gateway" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">임대시간 
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_day" type="text" required value="" />
									</div>
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_hour" type="text" required value="" />
									</div>
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_min" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Primary_DNS
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_dns1" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Secondary_DNS
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="update_dhcp_dns2" type="text" required value="" />
									</div>
								</div>
							</div>
						</form>
					</div>

					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-danger" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> Cancel
							</button>
							<button class="btn btn-primary" id="update_dhcp">
								<span class="glyphicon glyphicon-check"></span> Save
							</button>
						</div>
					</div>

				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dalog -->
		</div>
	</div>
	<!-- /.modal -->
	<!-- dhcp edit Modal end -->
	
	<!--dhcp delete Modal start -->
	<div id="dhcpDeleteModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header bg-danger">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">DHCP DELETE</h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-12 col-md-12 col-sm-12 col-xs-12">
								</label>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-default" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> Cancel
							</button>
							<button class="btn btn-danger" id="delete_dhcp">
								<span class="glyphicon glyphicon-check"></span> Delete
							</button>
						</div>
					</div>

				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dalog -->
		</div>
	</div>
	<!-- /.modal -->
	<!-- dhcp delete Modal end -->

	<!--sub insert Modal start -->
	<div id="subInsertModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">세부 설정 추가</h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">DHCP </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
																			<select id="heard" class="form-control" required>
											<option value="">Choose..</option>
											<option value="press">Press</option>
											<option value="net">Internet</option>
											<option value="mouth">Word of mouth</option>
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">종류 
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
																				<select id="heard" class="form-control" required>
											<option value="">Choose..</option>
											<option value="press">Press</option>
											<option value="net">Internet</option>
											<option value="mouth">Word of mouth</option>
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">시작 IP
								</label>
									<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_ntp_etc" type="text" required value="" />
											</div>
									</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">끝 IP
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_ntp_etc" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Mac
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_ntp_etc" type="text" disable value="" />
									</div>
								</div>
							</div>
						</form>
					</div>

					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-danger" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> Cancel
							</button>
							<button class="btn btn-primary" id="insert_sub_dhcp">
								<span class="glyphicon glyphicon-check"></span> Save
							</button>
						</div>
					</div>

				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dalog -->
		</div>
	</div>
	<!-- /.modal -->
	<!-- sub insert Modal end -->
	<!--sub edit Modal start -->
	<div id="subUpdateModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">세부 설정 추가</h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">DHCP </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
																			<select id="heard" class="form-control" required>
											<option value="">Choose..</option>
											<option value="press">Press</option>
											<option value="net">Internet</option>
											<option value="mouth">Word of mouth</option>
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">종류 
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-4 col-md-4 col-sm-4 col-xs12">
																				<select id="heard" class="form-control" required>
											<option value="">Choose..</option>
											<option value="press">Press</option>
											<option value="net">Internet</option>
											<option value="mouth">Word of mouth</option>
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">시작 IP
								</label>
									<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_ntp_etc" type="text" required value="" />
											</div>
									</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">끝 IP
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_ntp_etc" type="text" required value="" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Mac
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_ntp_etc" type="text" disable value="" />
									</div>
								</div>
							</div>
						</form>
					</div>

					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-danger" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> Cancel
							</button>
							<button class="btn btn-primary" id="insert_ntp">
								<span class="glyphicon glyphicon-check"></span> Save
							</button>
						</div>
					</div>

				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dalog -->
		</div>
	</div>
	<!-- /.modal -->
	<!-- sub edit Modal end -->
		<!--dhcp delete Modal start -->
	<div id="subDeleteModal" class="modal fade in">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header bg-danger">
					<a class="btn btn-default" data-dismiss="modal"><span
						class="glyphicon glyphicon-remove"></span></a>
					<h4 class="modal-title">DHCP DELETE</h4>
				</div>
				<div class="modal-body">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">소분류
								</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<input class="form-control" name="subject" placeholder="ETC"
											id="insert_ntp_etc" type="text" required value="" />
									</div>
									<div class="col-lg-6 col-md-6 col-sm-6 col-xs12">
										<select id="heard" class="form-control" required>
											<option value="">Choose..</option>
											<option value="press">Press</option>
											<option value="net">Internet</option>
											<option value="mouth">Word of mouth</option>
										</select>
									</div>
								</div>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<div class="btn-group">
							<button class="btn btn-default" data-dismiss="modal">
								<span class="glyphicon glyphicon-remove"></span> Cancel
							</button>
							<button class="btn btn-danger" id="insert_ntp">
								<span class="glyphicon glyphicon-check"></span> Delete
							</button>
						</div>
					</div>

				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dalog -->
		</div>
	</div>
	<!-- /.modal -->
	<!-- dhcp delete Modal end -->
	
	
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

	<script src="js/dhcppolicy.js"></script>
	<script src="js/alert.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>

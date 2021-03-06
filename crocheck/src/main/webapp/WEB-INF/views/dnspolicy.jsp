<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="ko" data-placeholders-focus="false">

<!--header include-->
<%@ include file="header.jsp"%>

<body class="nav-sm">
	<div class="container body" >
		<div class="main_container">

			<!-- sidebar menu -->
			<%@ include file="side.jsp"%>
			<!-- sidebar menu -->


			<!--  top navigation -->
			<%@ include file="top.jsp"%>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main" style="min-height: 1200px;">
				<div class="row ">

					<div class="base_panel">
						<div class="x_title">
							<h2>
								DNS <small>Domain Named System </small>
							</h2>
							<div class="clearfix"></div>
						</div>

						<!--  DDos  start -->
						<div class="x_panel">
							<div class="col-md-12 col-sm-12 col-xs-12">
								<div class="x_title">
									<h2>유해사이트 차단</h2>
									<div class="clearfix"></div>
								</div>
								<div class="table-bordered">
									<table class="table table-striped" id = "dnsbantable">
										<colgroup>
											<col width="35%" />
											<col width="55%" />
											<col width="10%" />
										</colgroup>
										<thead>
											<tr>
												<th>도메인</th>
												<th>비고</th>
												<th><button type="button"
														class="btn btn-primary btn-xs" data-toggle="modal"
														data-target="#dnsblockinsertModal">
														<i class="fa fa-plus"></i>
													</button></th>
											</tr>
										</thead>
										<tbody id="dnsblocklist">
										</tbody>
									</table>
								</div>

							</div>
						</div>
						<!--  DDos setting end -->

						<!--  DNS search start -->
						<div class="x_panel">
							<div class="x_title">
								<h2>
									DNS search <small> </small>
								</h2>
								<div class="clearfix"></div>
							</div>
							<div class="col-md-3  col-sm-12 col-xs-12">
								<div class="radio">
									<label> <input type="radio" class="flat" checked
										name="dns_search" checked id="dns_lookup" value="lookup">
										Lookup
									</label> <label> <input type="radio" class="flat"
										name="dns_search" id="dns_zone_search" value="zone">
										Zone search
									</label>
								</div>
								<div class="input-group">
									<input type="text" class="form-control" id="text-lookup"
										placeholder="Input your finding address"> <span
										class="input-group-btn">
										<button type="button" class="btn btn-default" title="검색"
											id="btn-lookup">
											<span class="glyphicon glyphicon-search"></span>
										</button>
									</span>
								</div>
							</div>
							<div class="col-md-9  col-sm-12 col-xs-12">
								<div id="lookup-result"></div>
							</div>
						</div>
						<div class="clearfix"></div>
						<!--  DNS search end -->

						<!--  DNS Zone List start -->
						<div class="x_panel">
							<div class="x_title">
								<div class="col-md-9">
									<H2>Domain</H2>
								</div>

								<div class="col-md-3 text-right">
									<button type="button" class="btn btn-success btn-xs"
										id="insertDomainBtn" data-toggle="modal"
										data-target="#dnsInsertModal">
										<i class="fa fa-plus"></i>DOMAIN
									</button>
									<button type="button" class="btn btn-defalut btn-xs"
										id="insertSubDomainBtn" data-toggle="modal"
										data-target="#subDomainInsertModal">
										<i class="fa fa-plus"></i>SUB_DOMAIN
									</button>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="col-md-6 col-sm-12 col-xs-12">
								<table id="zone_datatable" class="table table-striped table-bordered">
									<colgroup>
										<col width="20%"></col>
										<col width="20%"></col>


										<col width="*"></col>
										<col width="15%"></col>
									</colgroup>
									<thead>
										<tr>
											<th>Zone</th>
											<th>Primary_ns</th>
											<th>Comment</th>
											<th></th>
										</tr>
									</thead>
									<tbody id="zonelist">
									</tbody>
								</table>
							</div>
							<div class="col-md-6 col-sm-12 col-xs-12">
								<div class="x_title">
									<h2>
										sub_domain : <span id="sub_domain_count"></span>
									</h2>
									<div class="clearfix"></div>
								</div>
								<div id="sublist_table">
								<table id="subdomain_datatable" class="table table-striped"
									cellspacing="0" width="100%">
									<colgroup>
										<col width="15%"></col>
										<col width="15%"></col>
										<col width="40%"></col>
										<col width="10%"></col>
										<col width="20%"></col>
									</colgroup>
									<thead>
										<tr class="headings ">
											<th class="column-title">Type</th>
											<th class="column-title">Host</th>
											<th class="column-title">Data</th>
											<th class="column-title">mx_priority</th>
											<th class="column-title"></th>
										</tr>
									</thead>
									<tbody id="sublist">
									</tbody>
								</table>
								</div>
							</div>
						</div>
						<!--  DNS Zone List end -->
						<!--end  page content -->
					</div>
				</div>
			</div>

		</div>
	</div>


	<!-- The Modal   -->
	<!-- dns Insert Modal start -->
	<div class="modal fade" id="dnsInsertModal" tabindex="-1" role="dialog"
		aria-labelledby="contactLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<i class="glyphicon glyphicon-remove"></i>
					</button>
					<h4 class="panel-title">
						<span class="glyphicon glyphicon-info-sign"></span> DNS ZONE 생성 
					</h4>
				</div>
				<div class="modal-body" style="padding: 5px;">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">ZONE</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="도메인을 입력합니다." id="dns_insert_zone" type="text"
										required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Origin</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="Origin을 설정합니다." id="dns_insert_data" type="text"
										required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">TTL</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input type="number" id="dns_insert_ttl" name="number"
										required="required" class="form-control  col-xs-12"
										value="3600">
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Type</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input type="radio" id="dns_insert_type" name="dns_insert_type"
										value="SOA" checked class="flot">SOA
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Primary_ns</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="Primary_ns을 입력합니다. " id="dns_insert_primaryns"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Primary_IP</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="primary_ip 를 입력합니다. " id="dns_insert_primary_ip"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Responsible
									Person</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="관리자 E-Mail을 입력합니다. " id="dns_insert_resp_contact"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Detail
									Settings </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<table id="table" class="table">
										<thead>
											<tr>
												<th>Serial</th>
												<th>Refresh</th>
												<th>Retry</th>
												<th>Expire</th>
												<th>Minimun</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td><input type="number" id="dns_insert_serial"
													name="number" required="required" value="20180912"
													class="form-control  col-xs-12"></td>
												<td><input type="number" id="dns_insert_refresh"
													name="number" required="required"
													class="form-control  col-xs-12" value="14400"></td>
												<td><input type="number" id="dns_insert_retry"
													name="number" required="required"
													class="form-control  col-xs-12" value="3600"></td>
												<td><input type="number" id="dns_insert_expire"
													name="number" required="required"
													class="form-control  col-xs-12" value="60480"></td>
												<td><input type="number" id="dns_insert_minimum"
													name="number" required="required"
													class="form-control  col-xs-12" value="86400"></td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">COMMENT</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<textarea style="resize: vertical;" class="form-control"
										placeholder="" id="dns_insert_comment" rows="6" name="comment"
										required></textarea>
								</div>
							</div>
							<div class="panel-footer" style="margin-bottom: -14px;">
								<input type="button" class="btn btn-success" id="insertdns"
									value="저장" />
								<button style="float: right;" type="button"
									class="btn btn-default btn-close" data-dismiss="modal">닫기
								</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- dns Insert Modal end -->

	<!-- dns Copy start -->
	<div class="modal fade" id="dnsCopyModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> DNS ZONE 복사
					</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<div class="row">
							<span id="dns_copy_title"></span>
						</div>
						<br>
						<div class="row">
							<input class="form-control" name="subject"
								placeholder="신규 ZONE 이름" id="dns_copy_zone" type="text" required
								value="" /><input type="hidden" id="dns_copy_id" /><input
								type="hidden" id="dns_copy_zone_name" />
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-success btn-vote"
						id="dns_copy">저장</button>
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">닫기</button>

				</div>
			</div>
		</div>
	</div>
	<!-- dns Copy Modal end -->

	<!-- dns update Modal start -->
	<div class="modal fade" id="dnsUpdateModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<i class="glyphicon glyphicon-remove"></i>
					</button>
					<h4 class="panel-title">
						<span class="glyphicon glyphicon-info-sign"></span> <span
							id="update_zone_name"></span>
					</h4>
				</div>
				<div class="modal-body" style="padding: 5px;">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">ZONE</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="도메인을 입력합니다." id="dns_update_zone" type="text"
										required />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Type</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input type="radio" id="dns_update_type" name="type_check"
										value="SOA" checked class="flot">SOA
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Host</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject" placeholder="Host"
										id="dns_update_host" type="text" required value="@" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Origin</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="Origin을 설정합니다." id="dns_update_data" type="text"
										required value="Origin" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">TTL</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input type="number" id="dns_update_ttl" name="number"
										required="required" class="form-control  col-xs-12"
										value="3600">
								</div>
							</div>

							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Primary_ns</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="Primary_ns 설정" id="dns_update_primaryns"
										type="text" required value="Primary_ns" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Responsible
									Person</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="관리자 계정 " id="dns_update_resp_contact" type="text"
										required value="Responsible Person" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Detail
									Settings </label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<table id="table" class="table">
										<thead>
											<tr>
												<th>Serial</th>
												<th>Refresh</th>
												<th>Retry</th>
												<th>Expire</th>
												<th>Minimun</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td><input type="number" id="dns_update_serial"
													name="number" required="required"
													class="form-control  col-xs-12"></td>
												<td><input type="number" id="dns_update_refresh"
													name="number" required="required"
													class="form-control  col-xs-12" value="14400"></td>
												<td><input type="number" id="dns_update_retry"
													name="number" required="required"
													class="form-control  col-xs-12" value="3600"></td>
												<td><input type="number" id="dns_update_expire"
													name="number" required="required"
													class="form-control  col-xs-12" value="60480"></td>
												<td><input type="number" id="dns_update_minimum"
													name="number" required="required"
													class="form-control  col-xs-12" value="86400"></td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">COMMENT</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<textarea style="resize: vertical;" class="form-control"
										placeholder="comment" id="dns_update_comment" rows="6"
										name="comment" required>test comment</textarea>
								</div>
							</div>
							<div class="panel-footer" style="margin-bottom: -14px;">
								<input type="button" class="btn btn-info" id="updatedns"
									value="UPDATE" />
								<button style="float: right;" type="button"
									class="btn btn-default btn-close" data-dismiss="modal">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- dns update Modal end -->

	<!-- dns Delete Modal start -->
	<div class="modal fade" id="dnsDeleteModal" tabindex="-1" role="dialog"
		aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-danger">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title panel-danger" id="voteLabel">DELELTE</h4>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger " id="deletednszone">DELETE</button>
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>
	<!-- dns Delete Modal end -->

	<!-- subDomain Insert Modal start -->
	<div class="modal fade" id="subDomainInsertModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<i class="glyphicon glyphicon-remove"></i>
					</button>
					<h4 class="panel-title">
						<span class="glyphicon glyphicon-info-sign"></span>서브 도메인 추가
					</h4>
				</div>
				<div class="modal-body" style="padding: 5px;">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">ZONE</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12"
									id="subdomain_zonelist"></div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Type</label>
								<div id="subdomain_type"		class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<label><input type="radio" id="subdomain_insert_type"
										name="zone_type_check" value="A" class="flot" value="A"
										checked>A</label>
									<label> <input type="radio"
										id="subdomain_insert_type" name="zone_type_check" value="NS"
										class="flot" value="NS">NS
									</label>
									<label> <input type="radio" id="subdomain_insert_type"
										name="zone_type_check" value="CNAME" class="flot"
										value="CNAME">CNAME
									</label>
									<label><input type="radio" id="subdomain_insert_type"
										name="zone_type_check" value="PTR" class="flot" value="PTR">PTR
									</label>
									<label><input type="radio" id="subdomain_insert_type"
										name="zone_type_check" value="TXT" class="flot" value="TXT">TXT
									</label>
									<label><input type="radio" id="subdomain_insert_type"
										name="zone_type_check" value="SRV" class="flot" value="SRV">SRV
									</label>
									<label><input
										type="radio" id="subdomain_insert_type" name="zone_type_check"
										value="MX" class="flot" value="MX">MX 
									</label>
								</div>
							</div>
								<div  id="mx_view" class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">mx_priority</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="MX값을 설정합니다. " id="subdomain_insert_mx_priority"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Host</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="Host를 설정합니다. " id="subdomain_insert_host"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">DATA(IP)</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="IP를 설정합니다. " id="subdomain_insert_data"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12"></label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<textarea style="resize: vertical;" class="form-control"
										placeholder="도메인에 대한 메모할 사항을 적어주십시오."
										id="subdomain_insert_comment" rows="6" name="comment" required></textarea>
								</div>
							</div>
							<div class="panel-footer" style="margin-bottom: -14px;">
								<input type="button" class="btn btn-info" id="continuousinsertsubdomain"
									value="연속저장" /> <input type="button" class="btn btn-info"
									id="insertsubdomain" value="저장" />
								<button style="float: right;" type="button"
									class="btn btn-default btn-close" data-dismiss="modal">닫기</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- subDomain Insert Modal end -->

	<!-- subDomain update Modal start -->
	<div class="modal fade" id="subDomainUpdateModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<i class="glyphicon glyphicon-remove"></i>
					</button>
					<h4 class="panel-title">
						<span class="glyphicon glyphicon-info-sign"></span><span
							id="subdomain_zone_name"></span>
					</h4>
				</div>
				<div class="modal-body" style="padding: 5px;">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">ZONE</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject" placeholder="Host"
										id="subdomain_update_zone" type="text" required
										disabled="disabled" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Type</label>
								<div  id="subdomain_update_type" class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<label><input type="radio" id="subdomain_update_type"
										name="subdomain_zone_type_check" value="A" class="flot">A</label>
										<label>
										<input type="radio" id="subdomain_update_type"
										name="subdomain_zone_type_check" value="NS" class="flot">NS</label>
										<label>
										<input type="radio" id="subdomain_update_type"
										name="subdomain_zone_type_check" value="CNAME" class="flot">CNAME</label>
										<label>
										<input type="radio" id="subdomain_update_type"
										name="subdomain_zone_type_check" value="PTR" class="flot">PTR</label>
										<label>
										<input type="radio" id="subdomain_update_type"
										name="subdomain_zone_type_check" value="TXT" class="flot">TXT</label>
										<label>
										<input type="radio" id="subdomain_update_type"
										name="subdomain_zone_type_check" value="SRV" class="flot">SRV</label>
										<label>
										<input type="radio" id="subdomain_update_type"
										name="subdomain_zone_type_check" value="MX" class="flot">MX</label>
										<label>
									</label>
								</div>
							</div>
							<div  id="update_mx_view" class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">mx_priority</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject"
										placeholder="MX값을 설정합니다. " id="subdomain_update_mx_priority"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">Host</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject" placeholder="Host"
										id="subdomain_update_host" type="text" required value="@" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">DATA(IP)</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="subject" placeholder="DATA"
										id="subdomain_update_data" type="text" required value="@" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">COMMENT</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<textarea style="resize: vertical;" class="form-control"
										placeholder="comment" id="subdomain_update_comment" rows="6"
										name="comment" required>test comment</textarea>
								</div>
							</div>
							<div class="panel-footer" style="margin-bottom: -14px;">
								<input type="button" class="btn btn-info" id="updatesubdomain"
									value="UPDATE" />
								<button style="float: right;" type="button"
									class="btn btn-default btn-close" data-dismiss="modal">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- subDomain update Modal end -->

	<!-- subDomain Delete Modal start -->
	<div class="modal fade" id="subDomainDeleteModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-danger">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title" id="voteLabel">
						<span class="glyphicon glyphicon-arrow-right"></span> Sub_Domain
						Delete Modal
					</h4>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger btn-close"
						id="deletesubdomain" value="DELETE">DELETE</button>
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>
	<!-- subDomain Delete Modal end -->



	<!-- dnsblock Insert Modal start -->
	<div class="modal fade" id="dnsblockinsertModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<i class="glyphicon glyphicon-remove"></i>
					</button>
					<h4 class="panel-title">
						<span class="glyphicon glyphicon-info-sign"></span>유해사이트 차단 추가
					</h4>
				</div>
				<div class="modal-body" style="padding: 5px;">
					<div class="x_panel">
						<form class="form-horizontal form-label-left">
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">ZONE</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="block_insert_zone"
										placeholder="차단하실 DOMAIN을 입력하세요." id="dnsblock_insert_zone"
										type="text" required value="" />
								</div>
							</div>
							<div class="form-group">
								<label
									class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-12">COMMENT</label>
								<div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
									<input class="form-control" name="insert_block_comment"
										placeholder="차단 사유를 입력하세요." id="dnsblock_insert_comment"
										type="text" required value="" />
								</div>
							</div>
							<div class="panel-footer" style="margin-bottom: -14px;">
								<input type="button" class="btn btn-success"
									id="dnsblock_insert" value="저장" />
								<!--<span class="glyphicon glyphicon-ok"></span>-->
								<button style="float: right;" type="button"
									class="btn btn-default btn-close" data-dismiss="modal">닫기
								</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- dnsblock Insert Modal end -->

	<!-- dnsblock Delete Modal start -->
	<div class="modal fade" id="dnsblockdeleteModal" tabindex="-1"
		role="dialog" aria-labelledby="voteLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="panel panel-danger">
				<div class="panel-heading">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="panel-title panel-danger" id="voteLabel">차단 정책 삭제</h4>
				</div>
				<div class="modal-body">
					<span id="deletednsblockview"></span> <input type="hidden"
						id="deletednsblockzone" />
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default btn-close"
						data-dismiss="modal">취소</button>
					<button type="button" class="btn btn-danger " id="dnsblock_delete">삭제
					</button>

				</div>
			</div>
		</div>
	</div>
	<!-- dnsblock delete Modal end -->

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
		<script src="js/custom.js"></script>
	<script src="js/dnspolicy.js"></script>
	<script src="js/alert.js"></script>



</body>
</html>

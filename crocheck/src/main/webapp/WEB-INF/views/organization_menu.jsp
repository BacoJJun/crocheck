<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<div class="panel-group" id="accordion">
	<div class="panel">
		<div class="col-lg-6 col-md-6"></div>
		<div class="col-lg-6 col-md-6 text-right">
			<button type="button" class="btn btn-primary btn-xs fa fa-pencil"
				id="dep_edit" data-toggle="modal" data-target="#editdepart"></button>
		</div>
	</div>
	<div class="panel ">
		<h4 class="x-title">
			<a data-toggle="collapse" data-parent="#accordion"
				href="#collapseOne"><span id="organization_first">Organization_First</span></a>
		</h4>
	</div>
	<div id="collapseOne" class="panel-collapse collapse">
		<table id="dep_table">
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_first" id="dep_one"></a>
					<div id="collapseOne_first" class="panel-collapse collapse">
						<ul id="dep_one_list">

						</ul>
					</div></td>
			</tr>
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_second" id="dep_two"></a>
					<div id="collapseOne_second" class="panel-collapse collapse">
						<ul id="dep_two_list">

						</ul>
					</div></td>
			</tr>
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_third" id="dep_three"></a>
					<div id="collapseOne_third" class="panel-collapse collapse">
						<ul id="dep_three_list">

						</ul>
					</div></td>
			</tr>
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_fourth" id="dep_four"></a>
					<div id="collapseOne_fourth" class="panel-collapse collapse">
						<ul id="dep_four_list">

						</ul>
					</div></td>
			</tr>
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_fifth" id="dep_five"></a>
					<div id="collapseOne_fifth" class="panel-collapse collapse">
						<ul id="dep_five_list">

						</ul>
					</div></td>
			</tr>
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_sixth" id="dep_six"></a>
					<div id="collapseOne_sixth" class="panel-collapse collapse">
						<ul id="dep_six_list">

						</ul>
					</div></td>
			</tr>
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_seventh" id="dep_seven"></a>
					<div id="collapseOne_seventh" class="panel-collapse collapse">
						<ul id="dep_seven_list">

						</ul>
					</div></td>
			</tr>
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_eighth" id="dep_eight"></a>
					<div id="collapseOne_eighth" class="panel-collapse collapse">
						<ul id="dep_eight_list">
						</ul>
					</div></td>
			</tr>
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_ninth" id="dep_nine"></a>
					<div id="collapseOne_ninth" class="panel-collapse collapse">
						<ul id="dep_nine_list">
						</ul>
					</div></td>
			</tr>
			<tr>
				<td><a data-toggle="collapse" data-parent="#accordion"
					href="#collapseOne_tenth" id="dep_ten"></a>
					<div id="collapseOne_tenth" class="panel-collapse collapse">
						<ul id="dep_ten_list">
						</ul>
					</div></td>
			</tr>
		</table>
	</div>
</div>


<!-- dns Insert Modal start -->
<div class="modal fade" id="editdepart" tabindex="-1" role="dialog"
	aria-labelledby="contactLabel" aria-hidden="true">
	<div class="modal-dialog modal-lg">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">
					<i class="glyphicon glyphicon-remove"></i>
				</button>
				<h4 class="panel-title">
					<span class="glyphicon glyphicon-info-sign"></span> ORGANIZATION
					LIST
				</h4>
			</div>
			<div class="modal-body" style="padding: 5px;">
				<div class="x_panel">
					<form class="form-horizontal form-label-left">
						<div class="col-lg-6 col-md-6">
							<div class="row">
								<select class="select_multiple form-control"
									id="organization_list" multiple="multiple"
									style="width: 100%; height: 240px;">
								</select>
							</div>
							<div class="row text-right">
								<button type="button" class="btn btn-default btn-xs"
									id="derp_up">▲</button>
								<button type="button" class="btn btn-default btn-xs"
									id="derp_down">▼</button>
							</div>
						</div>

						<div class="col-lg-6 col-md-6">
							<div class="row">
	
									<div class="form-group">
										<label
											class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">상위
											부서 </label>
										<div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
												<select class="select_multiple form-control"
													id="insert_displaypost">
												</select>
										</div>
									</div>
									<div class="form-group" >
										<label
											class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">부서명</label>
										<div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
											<input type="text" class="form-control"
												id="insert_organization_text" placeholder=""> <span
												class="input-group-btn"></span>
										</div>
									</div>
									<div class="form-group" >
										<label
											class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-12">부서명</label>
										<div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
											<input type="textarea" class="form-control"
												id="insert_organization_info" placeholder=""> <span
												class="input-group-btn"></span>
										</div>
									</div>

							<div class="row">
								<div class="col-lg-6 col-md-6"></div>
								<div class="col-lg-6 col-md-6 text-right">
									<button type="button" class="btn btn-info btn-xs"
										id="derp_insert">신규 부서</button>
									<button type="button" class="btn btn-danger btn-xs"
										id="derp_delete">부서 삭제</button>
								</div>
							</div>
							</div>


						</div>
					</form>
					<div class="modal-footer" style="margin-bottom: -14px;">
						<button style="float: right;" type="button"
							class="btn btn-default btn-close" data-dismiss="modal">닫기</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- dns Insert Modal end -->

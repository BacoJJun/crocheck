$(document).ready(function() {
	allmemberList();
	table_click_event();

	$('.dataTable').each(function() {
		$(this).dataTable().fnDraw();
	});
});
function table_click_event() {
	$('#dep_table button').click(function() {
		var id = $(this).val();

		postmemberList(id);
	});

}
function draw_div() {
	var datatablename = document.getElementById("datatables");
	datatablename.innerHTML = '';
	var div_html = '';
	div_html += '<div class="col-md-10 col-sm-12 col-xs-12"><table id="member_datatable"';
	div_html += 'class="table table-striped table-bordered dt-responsive nowrap"';
	div_html += 'cellspacing="0" width="100%">';
	div_html += '<colgroup>';
	div_html += '<col width="10%"></col>';
	div_html += '<col width="7%"></col>';
	div_html += '<col width="15%"></col>';
	div_html += '<col width="12%"></col>';
	div_html += '<col width="12%"></col>';
	div_html += '<col width="15%"></col>';
	div_html += '<col width="*%"></col>';
	div_html += '<col width="10%"></col>';
	div_html += '</colgroup>';
	div_html += '<thead>';
	div_html += '<tr>';
	div_html += '<th>부서</th>';
	div_html += '<th>이름</th>';
	div_html += '<th>IP</th>';
	div_html += '<th>전화번호</th>';
	div_html += '<th>휴대전화</th>';
	div_html += '<th>E메일</th>';
	div_html += '<th>기타</th>';
	div_html += '<th>수정</th>';
	div_html += '</tr>';
	div_html += '</thead>';
	div_html += '<tbody id="member_list">';
	div_html += '</tbody>';
	div_html += '</table>';
	div_html += '</div>';
	
	datatablename.innerHTML=div_html;
}
function postmemberList(id) {
	draw_div();
	var memberlist = document.getElementById("member_list");

	$
			.ajax({
				url : '/postmemberslist',
				data : {
					"organization_id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var member_html = '';
						for (var i = 0; i < result.memberList.length; i++) {
							member_html += '<tr>';
							member_html += '<td>' + result.memberList[i].post
									+ '</td>';
							member_html += '<td>' + result.memberList[i].name
									+ '</td>';
							member_html += '<td>' + result.memberList[i].ip
									+ '</td>';
							member_html += '<td>' + result.memberList[i].phone
									+ '</td>';
							member_html += '<td>' + result.memberList[i].mobile
									+ '</td>';
							member_html += '<td>' + result.memberList[i].email
									+ '</td>';
							member_html += '<td>' + result.memberList[i].etc
									+ '</td>';
							member_html += '<td><a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i></a> <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i></a></td>';
							member_html += '</tr>';
						}
						memberlist.innerHTML = member_html;

					} else {
						alert(result.errorMsg);
					}
				},
				error : function(request) {
					alert('error!');
					alert("code:" + request.status + "\n" + "message:"
							+ request.responseText + "\n");
				}
			});

	 $("#member_datatable").dataTable(); 
}
function allmemberList() {
	draw_div();
	var memberlist = document.getElementById("member_list");
	$
			.ajax({
				url : '/memberslist',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var member_html = '';
						for (var i = 0; i < result.memberList.length; i++) {
							member_html += '<tr>';
							member_html += '<td>' + result.memberList[i].post
									+ '</td>';
							member_html += '<td>' + result.memberList[i].name
									+ '</td>';
							member_html += '<td>' + result.memberList[i].ip
									+ '</td>';
							member_html += '<td>' + result.memberList[i].phone
									+ '</td>';
							member_html += '<td>' + result.memberList[i].mobile
									+ '</td>';
							member_html += '<td>' + result.memberList[i].email
									+ '</td>';
							member_html += '<td>' + result.memberList[i].etc
									+ '</td>';
							member_html += '<td><a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i></a> <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i></a></td>';
							member_html += '</tr>';
						}
						memberlist.innerHTML = member_html;

					} else {
						alert(result.errorMsg);
					}
				},
				error : function(request) {
					alert('error!');
					alert("code:" + request.status + "\n" + "message:"
							+ request.responseText + "\n");
				}
			});
	$("#member_datatable").dataTable({
		responsive : true
	});
}
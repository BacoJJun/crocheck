$(document).ready(function() {
	allmemberList();
	table_click_event();

	button_click_event();
	$('.dataTable').each(function() {
		$(this).dataTable().fnDraw();
	});
});
function button_click_event(){
	$("#member_list button").click(function(){
		var id = $(this).attr('value');
		memberselect(id);
	});
	$("#insert_member_info").click(function(){
		var insertMember_name = document.getElementById("insert_member_name").value;
		var insertMember_gid = $("#insert_post_list").val();
		var insertMember_post = $("#insert_post_list option:checked").text();
		var insertMember_phone = document.getElementById("insert_member_phone").value;
		var insertMember_mobile = document.getElementById("insert_member_mobile").value;
		var insertMember_mail = document.getElementById("insert_member_mail").value;
		var insertMember_ip = document.getElementById("insert_member_ip").value;
		var insertMember_etc = document.getElementById("insert_member_etc").value;
		$
		.ajax({
			url : '/insertmember',
			data : {
				"ip" : insertMember_ip,
				"name" : insertMember_name,
				"post" : insertMember_post,
				"phone" : insertMember_phone,
				"organization_id" : insertMember_gid,
				"mobile" : insertMember_mobile,
				"email" : insertMember_mail,
				"etc" : insertMember_etc
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					setTimeout(function(){
						location.reload();
					});
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
		

	});
	$("#update_member_info").click(function(){
		var updateMember_id =  document.getElementById("update_member_id").value;
		var updateMember_name = document.getElementById("update_member_name").value;
		var updateMember_gid = $("#update_post_list").val();
		var updateMember_post = $("#update_post_list option:checked").text();
		var updateMember_phone = document.getElementById("update_member_phone").value;
		var updateMember_mobile = document.getElementById("update_member_mobile").value;
		var updateMember_mail = document.getElementById("update_member_mail").value;
		var updateMember_ip = document.getElementById("update_member_ip").value;
		var updateMember_etc = document.getElementById("update_member_etc").value;
$
		.ajax({
			url : '/updatemember',
			data : {
				"id" : updateMember_id,
				"name" : updateMember_name,
				"post" : updateMember_post,
				"phone" : updateMember_phone,
				"organization_id" : updateMember_gid,
				"mobile" : updateMember_mobile,
				"email" : updateMember_mail,
				"etc" : updateMember_etc
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					setTimeout(function(){
						location.reload();
					});
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
	});
	$("#delete_member_info").click(function(){
		var deleteview_id =  document.getElementById("delete_member_id").value;
		$
		.ajax({
			url : '/deletemember',
			data : {
				"id" : deleteview_id,
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					setTimeout(function(){
						location.reload();
					});
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
	});
}
function memberselect(id){
	var updateMember_name = document.getElementById("update_member_name");
	var updateMember_phone = document.getElementById("update_member_phone");
	var updateMember_mobile = document.getElementById("update_member_mobile");
	var updateMember_mail = document.getElementById("update_member_mail");
	var updateMember_ip = document.getElementById("update_member_ip");
	var updateMember_etc = document.getElementById("update_member_etc");
	var updateMember_id =  document.getElementById("update_member_id");
	var deleteview_id =  document.getElementById("delete_member_id");
	var deleteview = document.getElementById("delete_member_info_view");
	$
			.ajax({
				url : '/selectmember',
				data : {
					"id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						$("#update_post_list").val(result.selectmember.organization_id).prop("selected", true);
						updateMember_id.value = result.selectmember.id;
						updateMember_name.value = result.selectmember.name;
						updateMember_phone.value = result.selectmember.phone
						updateMember_mobile.value = result.selectmember.mobile;
						updateMember_mail.value = result.selectmember.mail;
						updateMember_ip.value = result.selectmember.ip;
						updateMember_etc.value = result.selectmember.etc;
						deleteview_id.value = result.selectmember.id;
						deleteview.innerText = result.selectmember.post + '부서의 ' + result.selectmember.name + '에 대한 정보를 삭제하시겠습니까?';
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
}
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
							member_html += '<td><button type="button"  id="updateModal" class="btn btn-info btn-xs" data-toggle="modal" data-target="#updateMemberModal" value="'+ result.memberList[i].id +'" ><i class="fa fa-pencil"></i></button> <button type="button"  id="deleteModal" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#deleteMemberModal" value="'+ result.memberList[i].id +'" ><i class="fa fa-trash-o"></i></button></td>';
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
							member_html += '<td><button type="button"  id="updateModal"  class="btn btn-info btn-xs" data-toggle="modal" data-target="#updateMemberModal" value=" '+ result.memberList[i].id +' "><i class="fa fa-pencil"></i></button> <button type="button"   id="deleteModal" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#deleteMemberModal" value=" '+ result.memberList[i].id +' "><i class="fa fa-trash-o"></i></button></td>';
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
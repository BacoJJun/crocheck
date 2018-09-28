$(document).ready(function() {
	systemInfo();
	operatorlist();
	accesslist();
	buttonClickEvent();
});
function buttonClickEvent(){
	$("#operator_list button").click(function(){
		var operator_id = $(this).attr('value');
		operatorEvent(operator_id);
	});
	$("#access_list button").click(function(){
		var access_id = $(this).attr('value');
		accessEvent(access_id);
	});
	$("#operator_insert_mail_check").click(function(){
		var test = $("#operator_insert_mail_check input").is(':checked');
		console.log(test);
	});
}
function operatorEvent(operator_id){
	var operator_email = document.getElementById('operator_update_email_text');
	var operator_phone = document.getElementById('operator_update_phone_text');
	var operator_name = document.getElementById('operator_update_name_text');
	var operator_mail = document.getElementById('operator_update_mail');
	var update_modal = 		$
	.ajax({
		url : '/searchoperator',
		data : {
			"id" : operator_id
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				operator_email.value = result.searchoperator.email;
				operator_phone.value = result.searchoperator.phone;
				operator_name.value = result.searchoperator.name;
				console.log(result.searchoperator.mail_yn);
				if(result.searchoperator.mail_yn =='1'){
					console.log($('#operator_update_mail_check input').attr('data-checked'));
					$('#operator_update_mail_check input').show();
				}else{
					$('#operator_update_mail_check input').prop('checked', false);
				}
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
	
	$("#deleteoperator").click(function(){
		$
		.ajax({
			url : '/deleteoperator',
			data : {
				"id" : operator_id
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {		
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
		location.reload();
	});
}
function accessEvent(access_id){
	var accessor_ip = document.getElementById('access_edit_ip_text');
	var accessor_name = document.getElementById('access_edit_name_text');
	
	var update_modal = 		$
	.ajax({
		url : '/searchaccess',
		data : {
			"id" : access_id
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				accessor_ip.value = result.searchaccess.ip;
				accessor_name.value = result.searchaccess.name;
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
	
	$("#accessdelete").click(function(){
		$
		.ajax({
			url : '/deleteaccess',
			data : {
				"id" : access_id
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
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
		location.reload();
	});
}
function systemInfo(){
	var license  = document.getElementById('license_view');
	var license_table = '';
	$
	.ajax({
		url : '/systemInfo',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {

			if (result.result == 'success') {
				license_table += '<tr><th>' + 'SDNS' +'</th><th>' + result.systemInfo.key_domains + '</th></tr>';
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
	license.innerHTML = license_table;
	
}

function operatorlist(){
	var operatorList = document.getElementById('operator_list');
	$
	.ajax({
		url : '/operatorList',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					var table_list = '';
					for(var i =0; i<result.operatorList.length;i++){
						table_list += '<tr>';
						table_list += '<td>' + result.operatorList[i].email + '</td>';
						table_list += '<td>' + result.operatorList[i].phone + '</td>';
						table_list += '<td>' + result.operatorList[i].name + '</td>';
						if(result.operatorList[i].mail_yn == 1){
							table_list += '<td>' + '<button type="button" class="btn btn-info btn-xs">메일발송중</button>' + '</td>';
						}
						else{
							table_list += '<td>' + '<button type="button" class="btn btn-defalut btn-xs">비활성화</button>' + '</td>';
						}
						table_list += '<td>' + '<button type="button" class="btn btn-info btn-xs" id="operator_edit" name="operator_edit" value="'+ result.operatorList[i].id +'" data-toggle="modal" data-target="#operatorUpdateModal"><i class="fa fa-edit"></i></button>' + '<button type="button" class="btn btn-danger btn-xs" id="operator_delete" name="operator_delete" value="'+ result.operatorList[i].id +'" data-toggle="modal" data-target="#operatorDeleteModal"><i class="fa fa-trash"></i></button>' + '</td>';
						table_list += '</tr>';
					}
					operatorList.innerHTML = table_list;
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
	$("#operatorlistTable").dataTable();
}
function accesslist(){
	var accessList = document.getElementById('access_list');
	$
	.ajax({
		url : '/accesslist',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					var access_table = '';
					for(var i =0; i<result.accessList.length; i++){
						access_table += '<tr>';
						access_table += '<td>' + result.accessList[i].ip + '</td>';
						access_table += '<td>' + result.accessList[i].name + '</td>';
						access_table += '<td>' + '<button type="button" class="btn btn-info btn-xs" id="access_edit" name="access_edit" value="'+ result.accessList[i].id +'"data-toggle="modal" data-target="#accessUpdateModal"><i class="fa fa-edit"></i></button>' + '<button type="button" class="btn btn-danger btn-xs" id="access_delete" name="access_delete" value="'+ result.accessList[i].id +'" data-toggle="modal" data-target="#accessDeleteModal"><i class="fa fa-trash"></i></button>' + '</td>';
						access_table += '</tr>';
					}
					accessList.innerHTML = access_table;
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
	$("#accesslistTable").dataTable();
}
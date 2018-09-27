$(document).ready(function() {
	systemInfo();
	operatorlist();
	accesslist();
});

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
						table_list += '<td>' + '<button type="button" class="btn btn-info btn-xs" id="operator_edit" name="operator_edit" value="'+ result.operatorList[i].id +'"><i class="fa fa-edit"></i></button>' + '<button type="button" class="btn btn-danger btn-xs" id="operator_delete" name="operator_delete" value="'+ result.operatorList[i].id +'"><i class="fa fa-trash"></i></button>' + '</td>';
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
						access_table += '<td>' + '<button type="button" class="btn btn-info btn-xs" id="access_edit" name="access_edit" value="'+ result.accessList[i].id +'"><i class="fa fa-edit"></i></button>' + '<button type="button" class="btn btn-danger btn-xs" id="access_delete" name="access_delete" value="'+ result.accessList[i].id +'"><i class="fa fa-trash"></i></button>' + '</td>';
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
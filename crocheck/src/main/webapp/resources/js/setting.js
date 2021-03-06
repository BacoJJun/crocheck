$(document).ready(function() {
	systemInfo();
	operatorlist();
	accesslist();
	buttonClickEvent();
	backupClickEvent();
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
	$("#insertoperators").click(function(){
		var operator_email = document.getElementById("operator_email_text").value;
		var operator_phone = document.getElementById("operator_phone_text").value;
		var operator_name = document.getElementById("operator_name_text").value;
		var result = $("#operator_insert_mail_check").is(":checked");
		var operator_mail_check = 0;
		
		if(result){
			operator_mail_check = 1;
		}else{
			operator_mail_check = 0;
		}
		
		$.ajax({
			url : '/insertoperator',
			data : {
				"name" : operator_name,
				"email" : operator_email,
				"phone" : operator_phone,
				"mail_yn" : operator_mail_check,
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					console.log(result.file_name);
					setTimeout(function(){
						location.reload();			
					},1000);
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
	
	$("#update_operator").click(function(){
		var operator_email = document.getElementById("operator_update_email_text").value;
		var operator_phone = document.getElementById("operator_update_phone_text").value;
		var operator_name = document.getElementById("operator_update_name_text").value;
		var operator_id = document.getElementById("operator_update_id").value;
		var result = $("input:checkbox[id='operator_update_mail_check']").is(":checked");

		var operator_mail_check = 0;
		
		if(result){
			operator_mail_check = 1;
		}else{
			operator_mail_check = 0;
		}
		
		$.ajax({
			url : '/updateoperator',
			data : {
				"id" : operator_id,
				"name" : operator_name,
				"email" : operator_email,
				"phone" : operator_phone,
				"mail_yn" : operator_mail_check,
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					console.log(result.file_name);
					setTimeout(function(){
						location.reload();			
					},1000);
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
	$("#change_pwd").click(function(){
		var change_pwd = document.getElementById("change_pwd_txt").value;
		var change_re = document.getElementById("change_pwd_re").value;

		if(change_pwd == change_re){
		$.ajax({
			url : '/updateuser',
			data: {
				"username" : "admin",
				"encrypted_password": change_pwd
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					scrolltop();
					$("#alert_success").show();
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
		}else{
			scrolltop();
			$("#alert_danger").show();
		}
		
	});
	
	$("#insertaccessor").click(function(){
		var access_ip = document.getElementById("access_ip_text").value;
		var access_name = document.getElementById("access_name_text").value;		
		
		$.ajax({
			url : '/insertaccess',
			data : {
				"name" : access_name,
				"ip" : access_ip,
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					console.log(result.file_name);
					setTimeout(function(){
						location.reload();			
					},1000);
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
	
	$("#updateaccessor").click(function(){
		var access_id = document.getElementById("access_edit_id").value;		
		var access_ip = document.getElementById("access_edit_ip_text").value;
		var access_name = document.getElementById("access_edit_name_text").value;		
	
		$.ajax({
			url : '/updateaccess',
			data : {
				"id" : access_id,
				"name" : access_name,
				"ip" : access_ip,
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					console.log(result.file_name);
					setTimeout(function(){
						location.reload();			
					},1000);
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
function scrolltop(){
	$('html, body').scrollTop(0);

}

function backupClickEvent(){
	$("#dnsbackup").click(function(){

		$
		.ajax({
			url : '/zoneCsv',
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					console.log(result.csvZoneContent);
					 JSONToCSVConvertor(result.csvZoneContent, "DNSZonefile", true);
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
	
	$("#dhcpbackup").click(function(){

		$
		.ajax({
			url : '/dhcpsubcsv',
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					//console.log(result.csvDchpsubContent);
					 JSONToCSVConvertor(result.csvDchpsubContent, "dhcpsubfile", true);
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
	
	$
	.ajax({
		url : '/dhcprentcsv',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				if(result.csvDchpRentContent.length > 0){
					JSONToCSVConvertor(result.csvDchpRentContent, "dhcprentfile", true);
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
		
	$
	.ajax({
		url : '/dhcpcsv',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				//console.log(result.csvDhcpContent);
				JSONToCSVConvertor(result.csvDhcpContent, "dhcpfile", true);
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
	
	$("#enginebackup").click(function(){
		$
		.ajax({
			url : '/operatorcsv',
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					JSONToCSVConvertor(result.csvOperators, "operatorsfile", true);
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
		
		$
		.ajax({
			url : '/accessorcsv',
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					JSONToCSVConvertor(result.csvAccessors, "accessors", true);
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

function JSONToCSVConvertor(JSONData, ReportTitle, ShowLabel) {
    // If JSONData is not an object then JSON.parse will parse the JSON string
	// in an Object
    var arrData = typeof JSONData != 'object' ? JSON.parse(JSONData) : JSONData;
    console.log(arrData);
    var CSV = '';    
    // Set Report title in first row or line
    
    CSV += ReportTitle + '\r\n\n';

    // This condition will generate the Label/Header
    if (ShowLabel) {
        var row = "";
        
        // This loop will extract the label from 1st index of on array
        for (var index in arrData[0]) {
            
            // Now convert each value to string and comma-seprated
            row += index + ',';
        }

        row = row.slice(0, -1);
        
        // append Label row with line break
        CSV += row + '\r\n';
    }
    
    // 1st loop is to extract each row
    for (var i = 0; i < arrData.length; i++) {
        var row = "";
        
        // 2nd loop will extract each column and convert it in string
		// comma-seprated
        for (var index in arrData[i]) {
            row += '"' + arrData[i][index] + '",';
        }

        row.slice(0, row.length - 1);
        
        // add a line break after each row
        CSV += row + '\r\n';
    }

    if (CSV == '') {        
        alert("Invalid data");
        return;
    }   
    
    // Generate a file name
    var fileName = "";
    var BOM = '%EF%BB%BF';
    // this will remove the blank-spaces from the title and replace it with an
	// underscore
    fileName += ReportTitle.replace(/ /g,"_");   
    
    // Initialize file format you want csv or xls
    var uri = 'data:application/csv;charset=utf-8,'+BOM+',' + encodeURIComponent(CSV);
    
    // Now the little tricky part.
    // you can use either>> window.open(uri);
    // but this will not work in some browsers
    // or you will not get the correct file extension
    
    // this trick will generate a temp <a /> tag
    var link = document.createElement("a");    
    link.href = uri;
    
    // set the visibility hidden so it will not effect on your web-layout
    link.style = "visibility:hidden";
	var fullDate = new Date()
	var twoDigitMonth = ((fullDate.getMonth().length+1) === 1)? (fullDate.getMonth()+1) : '0' + (fullDate.getMonth()+1);
	var currentDate = fullDate.getFullYear()+ twoDigitMonth  + fullDate.getDate()  + fullDate.getHours() + fullDate.getMinutes();

	
    link.download = fileName + "_" +currentDate + ".csv";
    
    // this part will append the anchor tag and remove it after automatic click
    document.body.appendChild(link);
    link.click();
    document.body.removeChild(link);
}
function operatorEvent(operator_id){
	var operator_update_id = document.getElementById('operator_update_id');
	var operator_email = document.getElementById('operator_update_email_text');
	var operator_phone = document.getElementById('operator_update_phone_text');
	var operator_name = document.getElementById('operator_update_name_text');
	var operator_mail = document.getElementById('operator_update_mail');
	var operator_delete_view =  document.getElementById('operator_delete_view');
	$.ajax({
		url : '/searchoperator',
		data : {
			"id" : operator_id
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				operator_delete_view.innerText = result.searchoperator.name + "(" +result.searchoperator.email + ") 을(를) 삭제하시겠습니까? "; 
				operator_update_id.value = result.searchoperator.id;
				operator_email.value = result.searchoperator.email;
				operator_phone.value = result.searchoperator.phone;
				operator_name.value = result.searchoperator.name;
				if(result.searchoperator.mail_yn =='1'){
					operator_mail.value = 1;
					$("input:checkbox[id='operator_update_mail_check']").prop("checked", true);
				}else{
					$("input:checkbox[id='operator_update_mail_check']").prop("checked", false);
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
	var access_hidden_id = document.getElementById("access_edit_id");		
	var accessor_ip = document.getElementById('access_edit_ip_text');
	var accessor_name = document.getElementById('access_edit_name_text');
	var accessor_view = document.getElementById('access_delete_view');
	
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
				access_hidden_id.value = result.searchaccess.id;
				accessor_ip.value = result.searchaccess.ip;
				accessor_name.value = result.searchaccess.name;
				accessor_view.innerText = result.searchaccess.name + "("+ result.searchaccess.ip + ") 을(를) 삭제 하시겠습니까?";
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
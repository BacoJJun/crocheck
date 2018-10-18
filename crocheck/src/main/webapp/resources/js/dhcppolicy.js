$(document).ready(function() {
	dhcptable();
	dhcpcount();
	category();
	table_click_event();
	button_click_event();
});
function dhcpcount() {
	var total_count = document.getElementById("total_count");
	var total_exception_count = document
			.getElementById("total_exception_count");
	var total_hold_count = document.getElementById("total_hold_count");
	var total_rent_count = document.getElementById("total_rent_count");
	var total_not_rent_count = document.getElementById("total_not_rent_count");
	$
			.ajax({
				url : '/dhcpcount',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						total_count.innerText = result.dhcpCountValue.total_count;
						total_exception_count.innerText = result.dhcpCountValue.exception_count;
						total_hold_count.innerText = result.dhcpCountValue.hold_count;
						total_rent_count.innerText = result.dhcpCountValue.rent_count;
						total_not_rent_count.innerText = result.dhcpCountValue.total_count
								- result.dhcpCountValue.rent_count;
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

function dhcpscript() {
	$.ajax({
		url : '/dhcpupdatescript',
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
}

function dhcpsubcount(id) {
	var sub_total_count = document.getElementById("sub_total_count");
	var sub_exception_count = document.getElementById("sub_exception_count");
	var sub_hold_count = document.getElementById("sub_hold_count");
	var sub_rent_count = document.getElementById("sub_rent_count");
	var sub_not_rent_count = document.getElementById("sub_not_rent_count");
	$
			.ajax({
				url : '/dhcpsubcount',
				data : {
					"id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						sub_total_count.innerText = result.dhcpCountValue.total_count;
						sub_exception_count.innerText = result.dhcpCountValue.exception_count;
						sub_hold_count.innerText = result.dhcpCountValue.hold_count;
						sub_rent_count.innerText = result.dhcpCountValue.rent_count;
						sub_not_rent_count.innerText = result.dhcpCountValue.total_count
								- result.dhcpCountValue.rent_count;
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
function dhcptable() {
	var dhcp_zone = document.getElementById("dhcplist");
	var subdhcp_title = document.getElementById("insert_subdhcp_title");

	$
			.ajax({
				url : '/dhcpTableList',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						var dhcp_html = '';
						for (var i = 0; i < result.dhcpTableList.length; i++) {
							domain_html += '<tr >';
							domain_html += '<td>'
									+ result.dhcpTableList[i].category1
									+ '</td>';
							domain_html += '<td>'
									+ result.dhcpTableList[i].category2
									+ '</td>';
							domain_html += '<td>'
									+ result.dhcpTableList[i].protocol
									+ '</td>';
							domain_html += '<td style="display:none;">'
									+ result.dhcpTableList[i].id + '</td>';
							domain_html += '<td>'
									+ result.dhcpTableList[i].start_ip + '/'
									+ result.dhcpTableList[i].subnet_length
									+ '</td>';
							domain_html += '<td><button type="button"   class="btn btn-success btn-xs fa fa-edit" name="dhcp_edit" data-toggle="modal" data-target="#dhcpeditModal" value="'
									+ result.dhcpTableList[i].id
									+ '"></button> <button type="button" id="dhcp_delete" class="btn btn-danger btn-xs fa fa-trash" name="dhcp_delete" data-toggle="modal" data-target="#dhcpDeleteModal" value="'
									+ result.dhcpTableList[i].id
									+ '"></button></td>';
							dhcp_html += '<option value="'
									+ result.dhcpTableList[i].id + '">'
									+ result.dhcpTableList[i].category1 + '/'
									+ result.dhcpTableList[i].category2 + '/'
									+ result.dhcpTableList[i].start_ip
									+ '</option>';
						}
						dhcp_zone.innerHTML = domain_html;
						subdhcp_title.innerHTML = dhcp_html;
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
function category() {
	var selectCategory = document.getElementById("dhcp_category");
	var selectUpdateCategory = document.getElementById("dhcp_update_category");
	var selectGroup = document.getElementById("dhcp_category_group");
	var selectUpdateGroup = document
			.getElementById("dhcp_update_category_group");
	$.ajax({
		url : '/dhcpcategory',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				//console.log(result.categoryList);
				var category_html = '';
				for (var i = 0; i < result.categoryList.length; i++) {
					category_html += '<option value="'
							+ result.categoryList[i].category + '">'
							+ result.categoryList[i].category + '</option>';
				}
				selectCategory.innerHTML = category_html;
				selectUpdateCategory.innerHTML = category_html;
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
	$.ajax({
		url : '/dhcpcategorygroup',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				//console.log(result.categoryGroupList);
				var group_html = '';
				for (var i = 0; i < result.categoryGroupList.length; i++) {
					group_html += '<option value="'
							+ result.categoryGroupList[i].category + '">'
							+ result.categoryGroupList[i].category
							+ '</option>';
				}
				selectGroup.innerHTML = group_html;
				selectUpdateGroup.innerHTML = group_html;
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

	$('#dhcp_category').click(
			function() {
				var insert_dhcp_category = document
						.getElementById("insert_dhcp_category1");
				insert_dhcp_category.value = $(this).val();
			});
	$('#dhcp_category_group').click(
			function() {
				var insert_dhcp_category = document
						.getElementById("insert_dhcp_category2");
				insert_dhcp_category.value = $(this).val();
			});

	$('#dhcp_update_category').click(
			function() {
				var insert_dhcp_category = document
						.getElementById("update_dhcp_category1");
				insert_dhcp_category.value = $(this).val();
			});
	$('#dhcp_update_category_group').click(
			function() {
				var insert_dhcp_category = document
						.getElementById("update_dhcp_category2");
				insert_dhcp_category.value = $(this).val();
			});

}
function table_click_event() {
	function onRowClick(tableId, callback) {
		var table = document.getElementById(tableId), rows = table
				.getElementsByTagName("tr"), i;
		for (i = 0; i < rows.length; i++) {
			table.rows[i].onclick = function(row) {
				return function() {
					callback(row);
				};
			}(table.rows[i]);
		}
	}
	;

	onRowClick("datatable", function(row) {
		var id = row.getElementsByTagName("td")[3].innerText;
		subdhcptable(id);
		rentdhcptable(id);
		dhcpsubcount(id);

		dhcpModalEvent(id);

	});

}
function dhcpModalEvent(id) {
	var update_dhcp_category1 = document
			.getElementById("update_dhcp_category1");
	var update_dhcp_category2 = document
			.getElementById("update_dhcp_category2");
	var update_dhcp_host = document.getElementById("update_dhcp_host");
	var update_dhcp_subnet_length = document
			.getElementById("update_dhcp_subnet_length");
	var update_dhcp_subnet = document.getElementById("update_dhcp_subnet");
	var update_dhcp_broadcast = document
			.getElementById("update_dhcp_broadcast");
	var update_dhcp_gateway = document.getElementById("update_dhcp_gateway");
	var update_dhcp_day = document.getElementById("update_dhcp_day");
	var update_dhcp_hour = document.getElementById("update_dhcp_hour");
	var update_dhcp_min = document.getElementById("update_dhcp_min");
	var update_dhcp_dns2 = document.getElementById("update_dhcp_dns2");
	var update_dhcp_dns1 = document.getElementById("update_dhcp_dns1");
	var delete_dhcp_name = document.getElementById("delete_dhcp_name");
	var update_subdhcp_title = document.getElementById("update_subdhcp_title");

	var update_dhcp_button =  document.getElementById("update_dhcp");
	var delete_dhcp_button  = document.getElementById("delete_dhcp");
	delete_dhcp_button.value = id;
	update_dhcp_button.value = id;
	
	$
			.ajax({
				url : '/catchdhcp',
				data : {
					"id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						console.log(result.selectdhcp);
						update_dhcp_category1.value = result.selectdhcp.category1;
						$("#dhcp_update_category").val(
								result.selectdhcp.category1).prop("selected",
								true);
						update_dhcp_category2.value = result.selectdhcp.category2;
						$("#dhcp_update_category_group").val(
								result.selectdhcp.category2).prop("selected",
								true);
						$("#update_dhcp_protocol").val(
								result.selectdhcp.protocol).prop("selected",
								true);
						update_dhcp_host.value = result.selectdhcp.start_ip;
						update_dhcp_subnet_length.value = result.selectdhcp.subnet_length;
						update_dhcp_subnet.value = result.selectdhcp.subnet;
						update_dhcp_broadcast.value = result.selectdhcp.end_ip;
						update_dhcp_gateway.value = result.selectdhcp.gateway;
						update_dhcp_day.value = result.selectdhcp.day;
						update_dhcp_hour.value = result.selectdhcp.hour;
						update_dhcp_min.value = result.selectdhcp.min;
						update_dhcp_dns1.value = result.selectdhcp.dns1;
						update_dhcp_dns2.value = result.selectdhcp.dns2;

						delete_dhcp_name.value = result.start_ip;
						update_subdhcp_title.value = result.selectdhcp.start_ip;
						update_subdhcp_title.name = result.selectdhcp.id;

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
function sub_button_event() {
	$('#dhcp_sublist button').click(function() {
		var sub_id = $(this).attr('value');
		//console.log(sub_id);
		subDhcpModalEvent(sub_id);
	});
}
function subDhcpModalEvent(sub_id) {
	var update_subdhcp_selectType = document
			.getElementById("update_subdhcp_selectType");
	var update_subdhcp_startip = document
			.getElementById("update_subdhcp_startip");
	var update_subdhcp_endip = document.getElementById("update_subdhcp_endip");
	var update_subdhcp_mac = document.getElementById("update_subdhcp_mac");
	var delete_subdhcp_title = document.getElementById("delete_subdhcp_title");
	var update_subdhcp_button =  document.getElementById("update_subdhcp");
	var delete_subdhcp_button  = document.getElementById("delete_subdhcp");
	delete_subdhcp_button.value = sub_id;
	update_subdhcp_button.value = sub_id;
	
	$.ajax({
		url : '/catchsubdhcp',
		data : {
			"id" : sub_id
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				//console.log(result.selectsubdhcp);
				$("#update_subdhcp_selectType").val(result.selectsubdhcp.type)
						.prop("selected", true);
				update_subdhcp_startip.value = result.selectsubdhcp.start_ip;
				update_subdhcp_endip.value = result.selectsubdhcp.end_ip;
				update_subdhcp_mac.value = result.selectsubdhcp.mac;

				delete_subdhcp_title.innerText = result.selectsubdhcp.start_ip
						+ '을(를) 삭제하시겠습니까?';
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
function button_click_event() {
	$('#insert_dhcp').click(function() {
		insertdhcp();
	});
	$('#insert_sub_dhcp').click(function() {
		insertsubdhcp();
	});
	$("#update_dhcp").click(function(){
		var id = $(this).attr('value');
		updatedhcp(id);
	});
	$("#delete_dhcp").click(function(){
		var id = $(this).attr('value');
		deletedhcp(id);
	});
	$("#update_subdhcp").click(function(){
		var sub_id = $(this).attr('value');
		updatesubdhcp(sub_id);
	});
	$("#delete_subdhcp").click(function(){
		var sub_id = $(this).attr('value');
		deletesubdhcp(sub_id);
	});
}
function insertdhcp() {
	var insert_dhcp_category1 = document.getElementById("insert_dhcp_category1").value;
	var insert_dhcp_category2 = document.getElementById("insert_dhcp_category2").value;
	var insert_dhcp_host = document.getElementById("insert_dhcp_host").value;
	var insert_dhcp_protocal = document.getElementById("insert_dhcp_protocal").value;
	var insert_dhcp_subnet_length = document.getElementById("insert_dhcp_subnet_length").value;
	var insert_dhcp_subnet = document.getElementById("insert_dhcp_subnet").value;
	var insert_dhcp_broadcast = document.getElementById("insert_dhcp_broadcast").value;
	var insert_dhcp_gateway = document.getElementById("insert_dhcp_gateway").value;
	var insert_dhcp_day = document.getElementById("insert_dhcp_day").value;
	var insert_dhcp_hour = document.getElementById("insert_dhcp_hour").value;
	var insert_dhcp_min = document.getElementById("insert_dhcp_min").value;
	var insert_dhcp_dns2 = document.getElementById("insert_dhcp_dns2").value;
	var insert_dhcp_dns1 = document.getElementById("insert_dhcp_dns1").value;
	var insert_dhcp_start_ip = '';
	var insert_dhcp_end_ip = '';
	var insert_dhcp_ip_count = 0;
	

	insert_dhcp_start_ip = sipchk(insert_dhcp_host, insert_dhcp_subnet, '1');
	insert_dhcp_end_ip = sipchk(insert_dhcp_host, insert_dhcp_subnet, '2');
	insert_dhcp_ip_count = insert_dhcp_end_ip.split('.')[3] - insert_dhcp_start_ip.split('.')[3] -1;
	
	$.ajax(
	{
		url : '/dhcpinsert',
		data : {
			"protocol" : insert_dhcp_protocal
			, "start_ip" : insert_dhcp_start_ip
			,"end_ip" : insert_dhcp_end_ip
			,"dns1" : insert_dhcp_dns1
			,"dns2" : insert_dhcp_dns2
			,"day" : insert_dhcp_day
			,"hour" : insert_dhcp_hour
			,"min" : insert_dhcp_min
			,"category1" : insert_dhcp_category1
			,"category2" : insert_dhcp_category2
			,"ip_count" : insert_dhcp_ip_count
			,"subnet" :  insert_dhcp_subnet
			,"gateway" : insert_dhcp_gateway
			,"subnet_length" : insert_dhcp_subnet_length
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				setTimeout(function(){
					dhcpscript();
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
}
function updatedhcp(id){
	var update_dhcp_category1 = document.getElementById("update_dhcp_category1").value;
	var update_dhcp_category2 = document.getElementById("update_dhcp_category2").value;
	var update_dhcp_host = document.getElementById("update_dhcp_host").value;
	var update_dhcp_protocol = document.getElementById("update_dhcp_protocol").value;
	var update_dhcp_subnet_length = document.getElementById("update_dhcp_subnet_length").value;
	var update_dhcp_subnet = document.getElementById("update_dhcp_subnet").value;
	var update_dhcp_broadcast = document.getElementById("update_dhcp_broadcast").value;
	var update_dhcp_gateway = document.getElementById("update_dhcp_gateway").value;
	var update_dhcp_day = document.getElementById("update_dhcp_day").value;
	var update_dhcp_hour = document.getElementById("update_dhcp_hour").value;
	var update_dhcp_min = document.getElementById("update_dhcp_min").value;
	var update_dhcp_dns2 = document.getElementById("update_dhcp_dns2").value;
	var update_dhcp_dns1 = document.getElementById("update_dhcp_dns1").value;
	var update_dhcp_start_ip = '';
	var update_dhcp_end_ip = '';
	var update_dhcp_ip_count = 0;
	
	update_dhcp_start_ip = sipchk(update_dhcp_host, update_dhcp_subnet, '1');
	update_dhcp_end_ip = sipchk(update_dhcp_host, update_dhcp_subnet, '2');
	update_dhcp_ip_count = update_dhcp_end_ip.split('.')[3] - update_dhcp_start_ip.split('.')[3] -1;
	
	$.ajax(
			{
				url : '/dhcpupdate',
				data : {
					"id" : id
					,"protocol" : update_dhcp_protocol
					, "start_ip" : update_dhcp_start_ip
					,"end_ip" : update_dhcp_end_ip
					,"dns1" : update_dhcp_dns1
					,"dns2" : update_dhcp_dns2
					,"day" : update_dhcp_day
					,"hour" : update_dhcp_hour
					,"min" : update_dhcp_min
					,"category1" : update_dhcp_category1
					,"category2" : update_dhcp_category2
					,"ip_count" : update_dhcp_ip_count
					,"subnet" :  update_dhcp_subnet
					,"gateway" : update_dhcp_gateway
					,"subnet_length" : update_dhcp_subnet_length
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						setTimeout(function(){
							dhcpscript();
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
}
function deletedhcp(id){
	$.ajax(
			{
				url : '/dhcpdelete',
				data : {
					"id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						setTimeout(function(){
							dhcpscript();
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

}

function insertsubdhcp(){
	var insert_subdhcp_title = document.getElementById("insert_subdhcp_title").value;
	var insert_subdhcp_selectType = document.getElementById("insert_subdhcp_selectType").value;
	var insert_subdhcp_start_ip = document.getElementById("insert_subdhcp_startip").value;
	var insert_subdhcp_end_ip = document.getElementById("insert_subdhcp_endip").value;
	var insert_subdhcp_mac = document.getElementById("insert_subdhcp_mac").value;
	var insert_subdhcp_ip_count = 0;
	
	insert_subdhcp_ip_count = insert_subdhcp_end_ip.split('.')[3] - insert_subdhcp_start_ip.split('.')[3] +1;
	
	$.ajax(
			{
				url : '/subdhcpinsert',
				data : {
					"type" : insert_subdhcp_selectType
					,"start_ip" : insert_subdhcp_start_ip
					,"end_ip" : insert_subdhcp_end_ip
					,"mac" : insert_subdhcp_mac
					,"mid" : insert_subdhcp_title
					,"ip_count" : insert_subdhcp_ip_count
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						setTimeout(function(){
							dhcpscript();
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
			
}

function updatesubdhcp(sub_id){
	var update_subdhcp_title = document.getElementById("update_subdhcp_title").name;
	var update_subdhcp_selectType = document.getElementById("update_subdhcp_selectType").value;
	var update_subdhcp_start_ip = document.getElementById("update_subdhcp_startip").value;
	var update_subdhcp_end_ip = document.getElementById("update_subdhcp_endip").value;
	var update_subdhcp_mac = document.getElementById("update_subdhcp_mac").value;
	var update_subdhcp_ip_count = 0;
	
	update_subdhcp_ip_count = update_subdhcp_end_ip.split('.')[3] - update_subdhcp_start_ip.split('.')[3] +1;
	
	$.ajax(
			{
				url : '/subdhcpupdate',
				data : {
					"id" : sub_id
					,"type" : update_subdhcp_selectType
					,"start_ip" : update_subdhcp_start_ip
					,"end_ip" : update_subdhcp_end_ip
					,"mac" : update_subdhcp_mac
					,"mid" : update_subdhcp_title
					,"ip_count" : update_subdhcp_ip_count
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
}
function deletesubdhcp(sub_id){
	$.ajax(
			{
				url : '/subdhcpdelete',
				data : {
					"id" : sub_id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						setTimeout(function(){
							dhcpscript();
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
}
function subdhcptable(id) {
	var dhcpsublist = document.getElementById("dhcp_sublist");
	$
			.ajax({
				url : '/subdhcpList',
				data : {
					"id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						//console.log(result.dhcpSubList);
						for (var i = 0; i < result.dhcpSubList.length; i++) {
							domain_html += '<tr>';
							if (result.dhcpSubList[i].type == 1) {
								domain_html += '<td>' + '예외' + '</td>';
							} else if (result.dhcpSubList[i].type == 2) {
								domain_html += '<td>' + '고정' + '</td>';
							} else if (result.dhcpSubList[i].type == 3) {
								domain_html += '<td>' + '범위' + '</td>';
							}
							domain_html += '<td>'
									+ result.dhcpSubList[i].start_ip + '</td>';
							domain_html += '<td>'
									+ result.dhcpSubList[i].end_ip + '</td>';
							domain_html += '<td>' + result.dhcpSubList[i].mac
									+ '</td>';
							domain_html += '<td><button type="button"   class="btn btn-success btn-xs fa fa-edit" name="dhcp_edit" data-toggle="modal" data-target="#subUpdateModal" value="'
									+ result.dhcpSubList[i].id
									+ '"></button> <button type="button" id="dhcp_delete" class="btn btn-danger btn-xs fa fa-trash" name="dhcp_delete" data-toggle="modal" data-target="#subDeleteModal" value="'
									+ result.dhcpSubList[i].id
									+ '"></button></td>';
							domain_html += '</tr>'
						}
						dhcpsublist.innerHTML = domain_html;
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
	sub_button_event();
}

function rentdhcptable(id) {
	var dhcprentlist = document.getElementById("dhcp_rentlist");
	$
			.ajax({
				url : '/rentdhcpList',
				data : {
					"id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						for (var i = 0; i < result.dhcpRentList.length; i++) {
							domain_html += '<td><button type="button"   class="btn btn-success btn-xs fa fa-edit" name="dhcp_edit" value="'
									+ result.dhcpRentList[i].id
									+ '"></button> <button type="button" id="dhcp_delete" class="btn btn-danger btn-xs fa fa-trash" name="dhcp_delete" value="'
									+ result.dhcpRentList[i].id
									+ '"></button></td>';
						}
						dhcprentlist.innerHTML = domain_html;
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

function sipchk(sip, sub, type) {
	var start_long = sip.split('.');
	var sub_long = sub.split('.');
	var max_long = ('255.255.255.255').split('.');
	var range_form = [];
	var range_bo = [];
	var range_to = [];
	var range_go = [];

	for (var i = 0; i < 4; i++) {
		range_form[i] = parseInt(start_long[i]) & parseInt(sub_long[i]);
		range_bo[i] = parseInt(sub_long[i]) ^ parseInt(max_long[i]);
		range_to[i] = parseInt(start_long[i]) | parseInt(sub_long[i]);
		range_go[i] = parseInt(range_form[i]) | parseInt(range_bo[i]);
	}

	if (type == "1") {
		return range_form[0] + '.' + range_form[1] + '.' + range_form[2] + '.'
				+ range_form[3];
	}
	if (type == "2") {
		return range_go[0] + '.' + range_go[1] + '.' + range_go[2] + '.'
				+ range_go[3];
	}
}

function getSubmask(input) {
	// self explanatory 
	if (input == 0) {
		return "0.0.0.0";
	}
	if (input == 1) {
		return "128.0.0.0";
	}
	if (input == 2) {
		return "192.0.0.0";
	}
	if (input == 3) {
		return "224.0.0.0";
	}
	if (input == 4) {
		return "240.0.0.0";
	}
	if (input == 5) {
		return "248.0.0.0";
	}
	if (input == 6) {
		return "252.0.0.0";
	}
	if (input == 7) {
		return "254.0.0.0";
	}
	if (input == 8) {
		return "255.0.0.0";
	}
	if (input == 9) {
		return "255.128.0.0";
	}
	if (input == 10) {
		return "255.192.0.0";
	}
	if (input == 11) {
		return "255.224.0.0";
	}
	if (input == 12) {
		return "255.240.0.0";
	}
	if (input == 13) {
		return "255.248.0.0";
	}
	if (input == 14) {
		return "255.252.0.0";
	}
	if (input == 15) {
		return "255.254.0.0";
	}
	if (input == 16) {
		return "255.255.0.0";
	}
	if (input == 17) {
		return "255.255.128.0";
	}
	if (input == 18) {
		return "255.255.192.0";
	}
	if (input == 19) {
		return "255.255.224.0";
	}
	if (input == 20) {
		return "255.255.240.0";
	}
	if (input == 21) {
		return "255.255.248.0";
	}
	if (input == 22) {
		return "255.255.252.0";
	}
	if (input == 23) {
		return "255.255.254.0";
	}
	if (input == 24) {
		return "255.255.255.0";
	}
	if (input == 25) {
		return "255.255.255.128";
	}
	if (input == 26) {
		return "255.255.255.192";
	}
	if (input == 27) {
		return "255.255.255.224";
	}
	if (input == 28) {
		return "255.255.255.240";
	}
	if (input == 29) {
		return "255.255.255.248";
	}
	if (input == 30) {
		return "255.255.255.252";
	}
	if (input == 31) {
		return "255.255.255.254";
	}
	if (input == 32) {
		return "255.255.255.255";
	}
}

function getCidr(input) {
	//self explanatory 
	if (input == "0.0.0.0") {
		return 0;
	}
	if (input == "128.0.0.0") {
		return 1;
	}
	if (input == "192.0.0.0") {
		return 2;
	}
	if (input == "224.0.0.0") {
		return 3;
	}
	if (input == "240.0.0.0") {
		return 4;
	}
	if (input == "248.0.0.0") {
		return 5;
	}
	if (input == "252.0.0.0") {
		return 6;
	}
	if (input == "254.0.0.0") {
		return 7;
	}
	if (input == "255.0.0.0") {
		return 8;
	}
	if (input == "255.128.0.0") {
		return 9;
	}
	if (input == "255.192.0.0") {
		return 10;
	}
	if (input == "255.224.0.0") {
		return 11;
	}
	if (input == "255.240.0.0") {
		return 12;
	}
	if (input == "255.248.0.0") {
		return 13;
	}
	if (input == "255.252.0.0") {
		return 14;
	}
	if (input == "255.254.0.0") {
		return 15;
	}
	if (input == "255.255.0.0") {
		return 16;
	}
	if (input == "255.255.128.0") {
		return 17;
	}
	if (input == "255.255.192.0") {
		return 18;
	}
	if (input == "255.255.224.0") {
		return 19;
	}
	if (input == "255.255.240.0") {
		return 20;
	}
	if (input == "255.255.248.0") {
		return 21;
	}
	if (input == "255.255.252.0") {
		return 22;
	}
	if (input == "255.255.254.0") {
		return 23;
	}
	if (input == "255.255.255.0") {
		return 24;
	}
	if (input == "255.255.255.128") {
		return 25;
	}
	if (input == "255.255.255.192") {
		return 26;
	}
	if (input == "255.255.255.224") {
		return 27;
	}
	if (input == "255.255.255.240") {
		return 28;
	}
	if (input == "255.255.255.248") {
		return 29;
	}
	if (input == "255.255.255.252") {
		return 30;
	}
	if (input == "255.255.255.254") {
		return 31;
	}
	if (input == "255.255.255.255") {
		return 32;
	}
}

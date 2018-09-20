$(document).ready(function() {
	dhcptable();
	dhcpcount();
	category();
	table_click_event();
	insert_button_click_event();
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
				url : '/crocheck/dhcpcount',
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

function dhcpsubcount(id) {
	var sub_total_count = document.getElementById("sub_total_count");
	var sub_exception_count = document.getElementById("sub_exception_count");
	var sub_hold_count = document.getElementById("sub_hold_count");
	var sub_rent_count = document.getElementById("sub_rent_count");
	var sub_not_rent_count = document.getElementById("sub_not_rent_count");
	$
			.ajax({
				url : '/crocheck/dhcpsubcount',
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
	$
			.ajax({
				url : '/crocheck/dhcpTableList',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
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
						}
						dhcp_zone.innerHTML = domain_html;
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
	button_click_event();
}
function category() {
	var selectCategory = document.getElementById("dhcp_category");
	var selectUpdateCategory = document.getElementById("dhcp_update_category");
	var selectGroup = document.getElementById("dhcp_category_group");
	var selectUpdateGroup = document
			.getElementById("dhcp_update_category_group");
	$.ajax({
		url : '/crocheck/dhcpcategory',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.categoryList);
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
		url : '/crocheck/dhcpcategorygroup',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.categoryGroupList);
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
	
	$('#dhcp_category').click(function(){
		var insert_dhcp_category = document.getElementById("insert_dhcp_category1");
		insert_dhcp_category.value = $(this).val();
	});
	$('#dhcp_category_group').click(function(){
		var insert_dhcp_category = document.getElementById("insert_dhcp_category2");
		insert_dhcp_category.value = $(this).val();
	});
		
	$('#dhcp_update_category').click(function(){
		var insert_dhcp_category = document.getElementById("update_dhcp_category1");
		insert_dhcp_category.value = $(this).val();
	});
	$('#dhcp_update_category_group').click(function(){
		var insert_dhcp_category = document.getElementById("update_dhcp_category2");
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
	});

}

function sub_button_event() {
	$('#dhcp_sublist button').click(function() {
		var sub_id = $(this).attr('value');
		var sub_type = $(this).attr('name');
		console.log(sub_type);
		console.log(sub_id);
	});
}
function button_click_event() {
	$('#dhcplist button').click(function(){
		var sub_id = $(this).attr('value');
		var sub_name = $(this).attr('name');
		})
}
function insert_button_click_event(){
	$('#insert_dhcp').click(function(){
		
	});
	$('#insert_sub_dhcp').click(function(){
		console.log("insert sub");
	});
}
function subdhcptable(id) {
	var dhcpsublist = document.getElementById("dhcp_sublist");
	$
			.ajax({
				url : '/crocheck/subdhcpList',
				data : {
					"id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						console.log(result.dhcpSubList);
						for (var i = 0; i < result.dhcpSubList.length; i++) {
							domain_html += '<tr>';
							domain_html += '<td>' + result.dhcpSubList[i].type
									+ '</td>';
							domain_html += '<td>'
									+ result.dhcpSubList[i].start_ip + '</td>';
							domain_html += '<td>'
									+ result.dhcpSubList[i].end_ip + '</td>';
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
				url : '/crocheck/rentdhcpList',
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

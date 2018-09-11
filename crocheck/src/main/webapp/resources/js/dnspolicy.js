$(document)
		.ready(
				function() {
					dnstable();
					table_click_event();

					$('#btn-lookup')
							.click(
									function() {
										if ($(
												'input:radio[name="dns_search"]:checked')
												.val() == 'lookup') {
										} else if ($(
												'input:radio[name="dns_search"]:checked')
												.val() == 'zone') {
											searhdnsdomain();
										}
									});
					table_loop();
					dns_button_event();

					buttonClickEvent();

				});
function buttonClickEvent() {
	$("#insertDomain").click(function() {
		console.log("test");
	});
	$("#insertdns").click(function() {
		console.log("insert test");
		var zone_name = document.getElementById("dns_insert_zone").value;
		console.log(zone_name);
	});

}
function dns_button_event() {
	$('#zonelist button').click(function() {
		var dns_id = $(this).attr('value');
		var dns_type = $(this).attr('name');
		console.log(dns_type);
		console.log(dns_id);
	});
}
function sub_button_event() {
	console.log("test start");
	$('#sublist button').click(function() {
		var sub_id = $(this).attr('value');
		var sub_type = $(this).attr('name');
		console.log(sub_type);
		console.log(sub_id);
	});
}
function table_loop() {
	init_ddos_block_table();
	setTimeout(table_loop, 1000);
}
function init_ddos_block_table() {
	var blocklist = document.getElementById("ddos_block_list");
	var ddos_attacker = document.getElementById("ddos_attacker");
	var ddos_attack_count = document.getElementById("ddos_attack_count");
	$
			.ajax({
				url : '/crocheck/ddosBlockStatus',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						var attack_count = 0;
						for (var i = 0; i < result.ddosBlockList.length; i++) {
							domain_html += '<tr>';
							domain_html += '<td>'
									+ result.ddosBlockList[i].src_ip + '</td>';
							domain_html += '<td>'
									+ result.ddosBlockList[i].domain + '</td>';
							domain_html += '<td>'
									+ result.ddosBlockList[i].count + '</td>';
							domain_html += '<td>'
									+ result.ddosBlockList[i].created_at
									+ '</td>';
							domain_html += '</tr>';
							attack_count = attack_count
									+ result.ddosBlockList[i].count;
						}
						ddos_attacker.innerText = result.ddosBlockList.length;
						ddos_attack_count.innerText = attack_count;
						blocklist.innerHTML = domain_html;
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
function searhdnsdomain() {
	var search_text = document.getElementById("text-lookup").value;
	var result_table = document.getElementById("lookup-result");
	$
			.ajax({
				url : '/crocheck/searchDnsDomain',
				data : {
					"zone" : search_text
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						domain_html += '<table id="datatable" class="table table-striped table-bordered">';
						domain_html += '<colgroup><col width="15%"></col><col width="10%"></col><col width="30%"></col><col width="*"></col><col width="10%"></col></colgroup>'
						domain_html += '<thead><tr><th>Zone</th><th>Type</th><th>Host</th><th>Data</th><th></th></thead><tbody>';
						for (var i = 0; i < result.dnsTableList.length; i++) {
							domain_html += '<tr>';
							domain_html += '<td>' + result.dnsTableList[i].zone
									+ '</td>';
							domain_html += '<td>' + result.dnsTableList[i].type
									+ '</td>';
							domain_html += '<td>' + result.dnsTableList[i].host
									+ '</td>';
							if (result.dnsTableList[i].data != null) {
								domain_html += '<td>'
										+ result.dnsTableList[i].data + '</td>';
							} else {
								domain_html += '<td></td>';
							}
							domain_html += '<td></button><button type="button"   class="btn btn-success btn-xs fa fa-edit" name="dns_edit" data-toggle="modal" data-target="#dnsUpdateModal" value="'
									+ result.dnsTableList[i].id
									+ '"></button> <button type="button" id="dns_delete" class="btn btn-danger btn-xs fa fa-trash" name="dns_delete" data-toggle="modal" data-target="#dnsDeleteModal" value="'
									+ result.dnsTableList[i].id
									+ '"></button></td>';
							domain_html += '</tr>';
							console.log("aaa");
						}
						domain_html += '</tbody></table>';
						result_table.innerHTML = domain_html;
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
function dnstable() {
	var dns_zone = document.getElementById("zonelist");
	$
			.ajax({
				url : '/crocheck/dnsTableList',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						for (var i = 0; i < result.dnsTableList.length; i++) {
							domain_html += '<tr>';
							domain_html += '<td>' + result.dnsTableList[i].zone
									+ '</td>';
							domain_html += '<td>'
									+ result.dnsTableList[i].primary_ns
									+ '</td>';
							if (result.dnsTableList[i].comment != null) {
								domain_html += '<td>'
										+ result.dnsTableList[i].coment
										+ '</td>';
							} else {
								domain_html += '<td></td>';
							}
							domain_html += '<td><button type="button"  class="btn btn-info btn-xs fa fa-copy" name="dns_copy" data-toggle="modal" data-target="#dnsCopyModal" value="'
									+ result.dnsTableList[i].id
									+ '"></button><button type="button"   class="btn btn-success btn-xs fa fa-edit" name="dns_edit" data-toggle="modal" data-target="#dnsUpdateModal" value="'
									+ result.dnsTableList[i].id
									+ '"></button> <button type="button" id="dns_delete" class="btn btn-danger btn-xs fa fa-trash" name="dns_delete" data-toggle="modal" data-target="#dnsDeleteModal" value="'
									+ result.dnsTableList[i].id
									+ '"></button></td>';
							domain_html += '</tr>';
						}
						dns_zone.innerHTML = domain_html;
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
		var zone_name = row.getElementsByTagName("td")[0].innerHTML;
		subDnstable(zone_name);
	});

}
function subDnstable(zone_name) {
	var sub_domain = document.getElementById("sublist");
	var sub_count = document.getElementById("sub_domain_count");
	$
			.ajax({
				url : '/crocheck/subDnsList',
				data : {
					"zone" : zone_name
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						sub_count.innerText = result.dnsTableList.length;
						for (var i = 0; i < result.dnsTableList.length; i++) {
							domain_html += '<tr>';
							domain_html += '<td>' + result.dnsTableList[i].type
									+ '</td>';
							domain_html += '<td>' + result.dnsTableList[i].host
									+ '</td>';
							if (result.dnsTableList[i].data != null) {
								domain_html += '<td>'
										+ result.dnsTableList[i].data + '</td>';
							} else {
								domain_html += '<td></td>';
							}
							domain_html += '<td><button type="button"  id="sub_edit" class="btn btn-success btn-xs fa fa-edit" name="sub_edit" data-toggle="modal" data-target="#subDomainUpdateModal" value="'
									+ result.dnsTableList[i].id
									+ '"></button> <button type="button"  class="btn btn-danger btn-xs fa fa-trash" data-toggle="modal" data-target="#subDomainDeleteModal" name="sub_delete" value="'
									+ result.dnsTableList[i].id + '"></td>';
							domain_html += '</tr>';
						}
						sub_domain.innerHTML = domain_html;
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

$(document)
		.ready(
				function() {
					dnstable();
					table_click_event();
					dnsblocklist();
					$('#btn-lookup')
							.click(
									function() {
										if ($(
												'input:radio[name="dns_search"]:checked')
												.val() == 'lookup') {
											lookupdnsdomain();
										} else if ($(
												'input:radio[name="dns_search"]:checked')
												.val() == 'zone') {
											searhdnsdomain();
										}
									});
					dns_button_event();
					buttonClickEvent();

				});

function dnsscript() {
	$.ajax({
		url : '/dnsupdatescript',
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
function dnsblocklist() {
	var dnsblocktable = document.getElementById("dnsblocklist");

	$
			.ajax({
				url : '/dnsbanlist',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						console.log(result.dnsbanList);
						var tablelist = '';
						for (var i = 0; i < result.dnsbanList.length; i++) {
							tablelist += '<tr>';
							tablelist += '<td>' + result.dnsbanList[i].zone
									+ '</td>';
							tablelist += '<td>' + result.dnsbanList[i].comment
									+ '</td>';
							tablelist += '<td><button type="button" data-toggle="modal" data-target="#dnsblockdeleteModal" class="btn btn-danger btn-xs" value="'
									+ result.dnsbanList[i].zone
									+ '"><i class="fa fa-trash-o"></i> </button> </td> ';
							tablelist += '</tr>';
						}
						dnsblocktable.innerHTML = tablelist;
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
function buttonClickEvent() {
	$("#insertdns").click(function() {
		insertdnszone();
	});
	$("#updatedns").click(function() {
		updatednszone();
	});
	$("#insertSubDomainBtn").click(function() {
		zonelistdraw();
	});
	$("#dns_copy").click(function(){
		copydomain();
	});
	$("#insertsubdomain").click(function() {
		subdomaininsert();
	});
	$("#continuousinsertsubdomain").click(function(){
		subdomaininsert2();
	});
	$("#updatesubdomain").click(function() {
		updatesubdomain();
	});

	$("#dnsblocklist button").click(function() {
		var zone = $(this).attr('value');
		console.log(zone);
		var deletednsblockview = document.getElementById("deletednsblockview");
		var deletednsblockzone = document.getElementById("deletednsblockzone");

		deletednsblockview.innerText = zone + '을(를) 삭제하시겠습니까?';
		deletednsblockzone.value = zone;

	});

	$("#dnsblock_insert")
			.click(
					function() {
						var insertdnsblockzone = document
								.getElementById("dnsblock_insert_zone").value;
						var insertdnsblockcomment = $(
								"#dnsblock_insert_comment").val();
						
						$.ajax({
							url : '/insertdnsban',
							data : {
								"zone" : insertdnsblockzone,
								"data" : insertdnsblockzone,
								"comment" : insertdnsblockcomment,
							},
							type : 'post',
							dataType : 'json',
							async : false,
							success : function(result) {
								if (result.result == 'success') {
									setTimeout(function(){
									dnsscript();
									location.reload();
									});
								} else {
									alert(result.errorMsg);
								}
							},
							error : function(request) {
								alert('error!');
								alert("code:" + request.status + "\n"
										+ "message:" + request.responseText
										+ "\n");
							}
						});

					});

	$("#dnsblock_delete").click(
			function() {
				var deletednsblockzone = document
						.getElementById("deletednsblockzone").value;

				var action = $.ajax({
					url : '/deletednsban',
					data : {
						"zone" : deletednsblockzone
					},
					type : 'post',
					dataType : 'json',
					async : false,
					success : function(result) {
						if (result.result == 'success') {
							dnsscript();
							setTimeout(function() {
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
function dns_button_event() {
	$('#zonelist button').click(function() {
		var dns_value = $(this).attr('value');
		var dns_type = $(this).attr('name');
		if (dns_type == "dns_edit") {
			dnsupdate(dns_value);
		} else if (dns_type == "dns_delete") {
			dnsdeletebuttonevent(dns_value);
		}else if(dns_type == "dns_copy"){
			dnscopy(dns_value);
		}

	});
}
function sub_button_event() {
	$('#sublist button').click(function() {
		var sub_id = $(this).attr('value');
		var sub_type = $(this).attr('name');
		console.log(sub_type);
		console.log(sub_id);
		if (sub_type == "sub_edit") {
			subdomainupdate(sub_id);
		}
		if (sub_type == "sub_delete") {
			subdomaindeletebuttonevent(sub_id);
		}
	});
}

function updatednszone() {
	var zone = document.getElementById("dns_update_zone").value;
	var type = $('input:radio[name="dns_insert_type"]:checked').val();
	var host = document.getElementById("dns_update_host").value;
	var data = document.getElementById("dns_update_data").value;
	var ttl = document.getElementById("dns_update_ttl").value;
	var primaryns = document.getElementById("dns_update_primaryns").value;
	var resp_contact = document.getElementById("dns_update_resp_contact").value;
	var serial = document.getElementById("dns_update_serial").value;
	var refresh = document.getElementById("dns_update_refresh").value;
	var retry = document.getElementById("dns_update_retry").value;
	var expire = document.getElementById("dns_update_expire").value;
	var minimum = document.getElementById("dns_update_minimum").value;
	var comment = document.getElementById("dns_update_comment").value;

	$.ajax({
		url : '/updatedns',
		data : {
			"zone" : zone,
			"type" : type,
			"host" : host,
			"data" : data,
			"ttl" : ttl,
			"primary_ns" : primaryns,
			"resp_contact" : resp_contact,
			"serial" : serial,
			"refresh" : refresh,
			"retry" : retry,
			"expire" : expire,
			"minimum" : minimum,
			"comment" : comment,
			"bl" : 0
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				sleep(1000);
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
function insertdnszone() {
	var zone = document.getElementById("dns_insert_zone").value;
	var type = $('input:radio[name="dns_insert_type"]:checked').val();
	var host = '@';
	var data = document.getElementById("dns_insert_primary_ip").value;
	var ttl = document.getElementById("dns_insert_ttl").value;
	var primaryns = document.getElementById("dns_insert_primaryns").value;
	var resp_contact = document.getElementById("dns_insert_resp_contact").value;
	var serial = document.getElementById("dns_insert_serial").value;
	var refresh = document.getElementById("dns_insert_refresh").value;
	var retry = document.getElementById("dns_insert_retry").value;
	var expire = document.getElementById("dns_insert_expire").value;
	var minimum = document.getElementById("dns_insert_minimum").value;
	var comment = document.getElementById("dns_insert_comment").value;
	var bl = 0;

	
	if(zone == "" || zone == null){
		$("#dns_insert_zone").focus();
		//$("#dns_insert_zone").blur();
	}else if (data =="" || data == null){
		$("#dns_insert_data").focus();
	}else if (primaryns =="" || primaryns == null){
		$("#dns_insert_primaryns").focus();
	}else if (resp_contact =="" || resp_contact == null){
		$("#dns_insert_resp_contact").focus();
	}else{
		$.ajax({
			url : '/insertdns',
			data : {
				"zone" : zone,
				"type" : type,
				"host" : host,
				"data" : data,
				"ttl" : ttl,
				"primary_ns" : primaryns,
				"resp_contact" : resp_contact,
				"serial" : serial,
				"refresh" : refresh,
				"retry" : retry,
				"expire" : expire,
				"minimum" : minimum,
				"comment" : comment,
				"bl" : bl
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

		
	}
	
	
}
function updatesubdomain() {
	var zone = document.getElementById("subdomain_update_zone").value;
	var type = $('input:radio[name="subdomain_zone_type_check"]:checked').val();
	var host = document.getElementById("subdomain_update_host").value;
	var data = document.getElementById("subdomain_update_data").value;
	var comment = document.getElementById("subdomain_update_comment").value;

	$.ajax({
		url : '/updatesubdomain',
		data : {
			"zone" : zone,
			"type" : type,
			"host" : host,
			"data" : data,
			"comment" : comment
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				dnsscript();
				sleep(1000);
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
function subdomainupdate(sub_id) {
	var modaltitle = document.getElementById("subdomain_zone_name");
	var zone = document.getElementById("subdomain_update_zone");
	var type = $('input:radio[name="subdomain_zone_type_check"]:checked');
	var host = document.getElementById("subdomain_update_host");
	var data = document.getElementById("subdomain_update_data");
	var comment = document.getElementById("subdomain_update_comment");
	$.ajax({
		url : '/catchDnsDomain',
		data : {
			"id" : sub_id
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.dnsTableList);
				modaltitle.innerText = result.dnsTableList[0].zone + '  설정';
				zone.value = result.dnsTableList[0].zone;
				$(
						'input:radio[name="subdomain_zone_type_check"][value='
								+ result.dnsTableList[0].type + ']').prop(
						'checked', true);
				host.value = result.dnsTableList[0].host;
				data.value = result.dnsTableList[0].data;
				comment.value = result.dnsTableList[0].comment;

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
function copydomain(){
	var copy_zone_name = document.getElementById("dns_copy_zone").value;
	var copy_zone = document.getElementById("dns_copy_zone_name").value;
	var copy_id = document.getElementById("dns_copy_id").value;
		
	if(copy_zone == copy_zone_name){
		//같은 이름 이벤트 처리 
		console.log("test");
	}
	$.ajax({
		url : '/copydns',
		data : {
			"id" : copy_id,
			"zone" : copy_zone_name
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				setTimeout(function(){
					dnsscript();
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
function dnscopy(dns_id) {
	var copy_title = document.getElementById("dns_copy_title");
	var copy_zone = document.getElementById("dns_copy_zone_name");
	var copy_id = document.getElementById("dns_copy_id");
	$.ajax({
		url : '/catchDnsDomain',
		data : {
			"id" : dns_id
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				copy_title.innerText = result.dnsTableList[0].zone + "을(를) 복제 하시겠습니까?";
				copy_zone.value  = result.dnsTableList[0].zone;
				copy_id.value = result.dnsTableList[0].id;
				console.log(result.dnsTableList);
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
function dnsupdate(dns_id) {
	var modaltitle = document.getElementById("update_zone_name");
	var zone = document.getElementById("dns_update_zone");
	var type = document.getElementById("dns_update_type");
	var host = document.getElementById("dns_update_host");
	var data = document.getElementById("dns_update_data");
	var ttl = document.getElementById("dns_update_ttl");
	var primaryns = document.getElementById("dns_update_primaryns");
	var resp_contact = document.getElementById("dns_update_resp_contact");
	var serial = document.getElementById("dns_update_serial");
	var refresh = document.getElementById("dns_update_refresh");
	var retry = document.getElementById("dns_update_retry");
	var expire = document.getElementById("dns_update_expire");
	var minimum = document.getElementById("dns_update_minimum");
	var comment = document.getElementById("dns_update_comment");
	
	$.ajax({
		url : '/catchDnsDomain',
		data : {
			"id" : dns_id
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.dnsTableList);
				modaltitle.innerText = result.dnsTableList[0].zone + '  설정';
				zone.value = result.dnsTableList[0].zone;
				type.value = result.dnsTableList[0].type;
				host.value = result.dnsTableList[0].host;
				data.value = result.dnsTableList[0].data;
				ttl.value = result.dnsTableList[0].ttl;
				primaryns.value = result.dnsTableList[0].primary_ns;
				resp_contact.value = result.dnsTableList[0].resp_contact;
				serial.value = result.dnsTableList[0].serial;
				refresh.value = result.dnsTableList[0].refresh;
				retry.value = result.dnsTableList[0].retry;
				expire.value = result.dnsTableList[0].expire;
				minimum.value = result.dnsTableList[0].minimum;
				comment.innerText = result.dnsTableList[0].comment;

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
function subdomaindeletebuttonevent(sub_id) {
	$("#deletesubdomain").click(function() {
		subdomaindelete(sub_id);
	})

}
function dnsdeletebuttonevent(dns_value) {
	$("#deletednszone").click(function() {
		dnsdelete(dns_value);
	})

}
function subdomaindelete(sub_id) {
	$.ajax({
		url : '/deletesubdomain',
		data : {
			"id" : sub_id
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				dnsscript();
				sleep(1000);
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
function dnsdelete(dns_value) {
	$.ajax({
		url : '/deletedns',
		data : {
			"zone" : dns_value
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				dnsscript();
				sleep(1000);
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
function subdomaininsert() {
	var zone = document.getElementById("subdomain_insert_zone").value;
	var type = $('input:radio[name="zone_type_check"]:checked').val();
	var host = document.getElementById("subdomain_insert_host").value;
	var data = document.getElementById("subdomain_insert_data").value;
	var comment = document.getElementById("subdomain_insert_comment").value;

	$.ajax({
		url : '/insertsubdomain',
		data : {
			"zone" : zone,
			"type" : type,
			"host" : host,
			"data" : data,
			"comment" : comment,
			"bl" : 0
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				dnsscript();
				sleep(1000);
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

function subdomaininsert2() {
	var zone = document.getElementById("subdomain_insert_zone").value;
	var type = $('input:radio[name="zone_type_check"]:checked').val();
	var host = document.getElementById("subdomain_insert_host").value;
	var data = document.getElementById("subdomain_insert_data").value;
	var comment = document.getElementById("subdomain_insert_comment").value;

	$.ajax({
		url : '/insertsubdomain',
		data : {
			"zone" : zone,
			"type" : type,
			"host" : host,
			"data" : data,
			"comment" : comment,
			"bl" : 0
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				dnsscript();
				
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
function zonelistdraw() {
	var subdomainzonelist = document.getElementById("subdomain_zonelist");
	$
			.ajax({
				url : '/dnszonelist',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var zonelist_html = '';
						zonelist_html += '<select id="subdomain_insert_zone" class="form-control" required>';
						for (var i = 0; i < result.zonelist.length; i++) {
							zonelist_html += '<option value="'
									+ result.zonelist[i].zone + '">'
									+ result.zonelist[i].zone + '</option>';
						}
						zonelist_html += '</select>';
						subdomainzonelist.innerHTML = zonelist_html;
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
function lookupdnsdomain() {
	var search_text = document.getElementById("text-lookup").value;
	var result_table = document.getElementById("lookup-result");
	$
	.ajax({
		url : '/nslookupscript',
		data : {
			"Msg" : search_text
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				var domain_html = '';
				domain_html += '<table id="lookupdatatable" class="table table-striped table-bordered">';
					domain_html += '<tbody>';
					domain_html += '<tr>';
					domain_html += '<td>' + result.commandMsg
							+ '</td>';
					domain_html += '</tr>'
				
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
function searhdnsdomain() {
	var search_text = document.getElementById("text-lookup").value;
	var result_table = document.getElementById("lookup-result");
	$
			.ajax({
				url : '/searchDnsDomain',
				data : {
					"zone" : search_text
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						domain_html += '<table id="lookupdatatable" class="table table-striped table-bordered">';
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
	$("#lookupdatatable").dataTable();
}
function dnstable() {
	var dns_zone = document.getElementById("zonelist");
	$
			.ajax({
				url : '/dnsTableList',
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
										+ result.dnsTableList[i].comment
										+ '</td>';
							} else {
								domain_html += '<td></td>';
							}
							domain_html += '<td><button type="button"  class="btn btn-info btn-xs fa fa-copy" name="dns_copy" data-toggle="modal" data-target="#dnsCopyModal" value="'
									+ result.dnsTableList[i].id
									+ '"></button><button type="button"   class="btn btn-success btn-xs fa fa-edit" name="dns_edit" data-toggle="modal" data-target="#dnsUpdateModal" value="'
									+ result.dnsTableList[i].id
									+ '"></button> <button type="button" id="dns_delete" class="btn btn-danger btn-xs fa fa-trash" name="dns_delete" data-toggle="modal" data-target="#dnsDeleteModal" value="'
									+ result.dnsTableList[i].zone
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
				url : '/subDnsList',
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

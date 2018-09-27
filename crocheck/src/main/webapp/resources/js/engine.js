$(document).ready(function() {
	view_roles();
	view_ntp();
	view_dhcp();
	button_event_list();
});
function button_event_list() {
	$('#dns_submit').click(function() {
		var check_value = $('input:radio[name="check_dns"]:checked').val();
		update_dns_roles(check_value);
	});
	$('#ntp_submit').click(function() {
		var check_value = $('input:radio[name="check_ntp"]:checked').val();
		update_ntp_roles(check_value);
	});
	$('#dhcp_submit').click(function() {
		var check_value = $('input:radio[name="check_dhcp"]:checked').val();
		update_dhcp_roles(check_value);
	});
	
	$('#insert_ntp').click(function() {
			insert_ntp_server();
	});
	
	$('#ntplist button').click(function(){
		var ntp_server = $(this).attr('value');
		delete_ntp_server(ntp_server);
	});

}
function delete_ntp_server(ntp_server){
	$.ajax({
		url : '/deletentp',
		data : {
			"ntp_server" : ntp_server
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
function insert_ntp_server(){
	var ntp = $("#insert_ntp_server").val();
	var etc = $("#insert_ntp_etc").val();
	
	$.ajax({
		url : '/insertntp',
		data : {
			"ntp_server" : ntp,
			"etc" : etc
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
function update_dns_roles(check_value) {
	$.ajax({
		url : '/updateDnsRoles',
		data : {
			"domain" : check_value
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
function update_ntp_roles(check_value) {
	$.ajax({
		url : '/updateNtpRoles',
		data : {
			"ntp" : check_value
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

function update_dhcp_roles(check_value) {
	$.ajax({
		url : '/updatedhcp',
		data : {
			"dhcp" : check_value
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

function view_roles() {
	$.ajax({
		url : '/basicrolse',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.basicRole);
				if (result.basicRole.domain) {
					$('input:radio[name="check_dns"]:input[value=true]').prop(
							"checked", true);
				} else {
					$('input:radio[name="check_dns"]:input[value=false]').prop(
							"checked", true);
				}
				if (result.basicRole.ntp) {
					$('input:radio[name="check_ntp"]:input[value=true]').prop(
							"checked", true);
				} else {
					$('input:radio[name="check_ntp"]:input[value=false]').prop(
							"checked", true);
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
}
function view_ntp() {
	var ntp_list = document.getElementById("ntplist");
	$
			.ajax({
				url : '/ntplist',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						console.log(result.ntplist);
						var ntptable = '';
						console.log(result.ntplist.length);
						for (var i = 0; i < result.ntplist.length; i++) {
							ntptable += '<tr>';
							ntptable += '<td>' + result.ntplist[i].ntp_server
									+ '</td>';
							ntptable += '<td>' + result.ntplist[i].etc
									+ '</td>';
							ntptable += '<td class="text-right"><button type="button" class="btn btn-xs fa fa-trash" id="delete_ntp" value="'
									+ result.ntplist[i].ntp_server
									+ '"></i></td>';
							ntptable += '</tr>';
						}
						ntp_list.innerHTML = ntptable;
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
function view_dhcp() {
	var dhcp_day = document.getElementById("dhcp_day");
	var dhcp_hour = document.getElementById("dhcp_hour");
	var dhcp_min = document.getElementById("dhcp_min");
	var dhcp_primary_dns = document.getElementById("dhcp_primary_dns");
	var dhcp_secondary_dns = document.getElementById("dhcp_secondary_dns");

	$.ajax({
		url : '/basicDhcpRoles',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.basicDhcpRole);
				if (result.basicDhcpRole.dhcp) {
					$('input:radio[name="check_dhcp"]:input[value=true]').prop(
							"checked", true);
				} else {
					$('input:radio[name="check_dhcp"]:input[value=false]')
							.prop("checked", true);
				}
				dhcp_day.value = result.basicDhcpRole.day;
				dhcp_hour.value = result.basicDhcpRole.hour;
				dhcp_min.value = result.basicDhcpRole.min;
				dhcp_primary_dns.value = result.basicDhcpRole.primary_dns;
				dhcp_secondary_dns.value = result.basicDhcpRole.secondary_dns;

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

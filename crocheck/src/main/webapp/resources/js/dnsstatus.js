var loopdns = '';

$(document).ready(function() {
	$("#reservation-time").value = new Date();
	
	initDnsLoop();

	$("#submit").click(function() {
		clearTimeout(loopdns);
		SearchdnsList();
	});
	$("#pause").click(function() {
		clearTimeout(loopdns);

	});
	$("#play").click(function() {
		clearTimeout(loopdns);
		loopdns = setTimeout(initDnsLoop, 3000);

	});

});

function initDnsLoop() {

	getDnsList();
	loopdns = setTimeout(initDnsLoop, 3000);

}
function SearchdnsList() {
	var arrDate = $("#reservation-time").val().split("-");
	var start_date = arrDate[0];
	var end_date = arrDate[1];

	var show_dns = document.getElementById("search_dns_list");

	$.ajax({
		url : '/crocheck/dnsSearchList',
		type : 'post',
		data : {
			"date_start" : start_date,
			"date_end" : end_date
		},
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				var domain_html = ' ';
				for (var i = 0; i < result.dnssearchlist.length; i++) {
					domain_html += '<tr>';
					domain_html += '<td>' + result.dnssearchlist[i].src_ip
							+ '</td>'
					domain_html += '<td>' + result.dnssearchlist[i].domain
							+ '</td>';
					domain_html += '<td>' + result.dnssearchlist[i].server_ip
							+ '</td>';
					domain_html += '<td>' + result.dnssearchlist[i].cr_at
							+ '</td></tr>';
				}
				show_dns.innerHTML = domain_html;
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
	$('#searchdatatable').dataTable();
	$("#searchtable").show();
	$("#refreshtable").hide();

}
function getDnsList() {
	var show_dns = document.getElementById("show_dns_list");

	$.ajax({
		url : '/crocheck/dnsNowList',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				var domain_html = ' ';
				for (var i = 0; i < result.dnsnowlist.length; i++) {
					domain_html += '<tr>';
					domain_html += '<td>' + result.dnsnowlist[i].src_ip
							+ '</td>'
					domain_html += '<td>' + result.dnsnowlist[i].domain
							+ '</td>';
					domain_html += '<td>' + result.dnsnowlist[i].server_ip
							+ '</td>';
					domain_html += '<td>' + result.dnsnowlist[i].cr_at
							+ '</td></tr>';
				}
				show_dns.innerHTML = domain_html;
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
	$("#searchtable").hide();
	$("#refreshtable").show();
	
};
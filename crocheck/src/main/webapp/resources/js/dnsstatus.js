$(document).ready(function() {
	$("#reservation-time").value= new Date();
	initDnsLoop();
	DataTables();
});

function initDnsLoop() {
	getDnsList();
	var loopdns = setTimeout(initDnsLoop, 3000);
	$("#submit").click(function(){
	    clearTimeout(loopdns);
	    searchDataTables();
	});
	$("#pause").click(function(){
	    clearTimeout(loopdns);
	});
	$("#play").click(function(){
	    clearTimeout(loopdns);
	    loopdns = setTimeout(initDnsLoop, 3000);
	    
	});
}
function SearchdnsList(){
	console.log("start Search");
	var arrDate = $("#reservation-time").val().split("-");
	var date_start = arrDate[0];
	var date_end = arrDate[1];
	console.log("start : " + date_start + "  end : " + date_end);
	
	var show_dns = document.getElementById("show_dns_list");

	$.ajax({
		url : '/crocheck/dnsSearchList',
		type : 'post',
		data : {
				date_start : date_start,
				date_end : date_end
		},
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				var domain_html = ' ';
				console.log(result.dnssearchlist.length);
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
	
}
function searchDataTables(){
	if (typeof ($.fn.DataTable) === 'undefined') {
		return;
	}

	var handleDataTableButtons = function() {
	
		if ($("#dnsdatatable").length) {
			$("#dnsdatatable").DataTable({
				dom : "Blfrtip",
				buttons : [ {
					extend : "excel",
					className : "btn-sm"
				}, {
					extend : "csv",
					className : "btn-sm"
				}, {
					extend : "pdfHtml5",
					className : "btn-sm"
				}, {
					extend : "print",
					className : "btn-sm"
				}, ],
				responsive : true
			});
		}
	};

	TableManageButtons = function() {
		"use strict";
		return {
			init : function() {
				handleDataTableButtons();
			}
		};
	}();
	TableManageButtons.init();
	SearchdnsList();
}
function DataTables() {

	if (typeof ($.fn.DataTable) === 'undefined') {
		return;
	}

	var handleDataTableButtons = function() {
		if ($("#dnsdatatable").length) {
			$("#dnsdatatable").DataTable();
		}
	
		if ($("#dnsdatatable-buttons").length) {
			$("#dnsdatatable-buttons").DataTable({
				dom : "Blfrtip",
				buttons : [ {
					extend : "excel",
					className : "btn-sm"
				}, {
					extend : "csv",
					className : "btn-sm"
				}, {
					extend : "pdfHtml5",
					className : "btn-sm"
				}, {
					extend : "print",
					className : "btn-sm"
				}, ],
				responsive : true
			});
		}
	};

	TableManageButtons = function() {
		"use strict";
		return {
			init : function() {
				handleDataTableButtons();
			}
		};
	}();
	TableManageButtons.init();
	getDnsList();
};

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
};
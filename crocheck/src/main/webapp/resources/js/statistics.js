$(document)
		.ready(
				function() {
					$("#reservation-time").value = new Date();
					init_startAjax();

					$('#search_stat')
							.click(
									function() {
										if ($(
												'input:radio[name="check_time"]:checked')
												.val() == 'last_min') {
											init_startAjax();
										} else if ($(
												'input:radio[name="check_time"]:checked')
												.val() == 'min') {
											init_minAjax("min");
										} else if ($(
												'input:radio[name="check_time"]:checked')
												.val() == 'hour') {

											init_hourAjax("hour");
										}
									})
				});

function searchDataPacket(start_date, end_date, search_type) {
	var dns_data = [];
	var dns_date = [];

	$.ajax({
		url : '/searchPacketDns',
		data : {
			"type" : search_type,
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.lastPacketDnsList.length; i++) {
					dns_data[i] = result.lastPacketDnsList[i].count;
					dns_date[i] = result.lastPacketDnsList[i].created_at;
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
	var ddos_data = [];
	var ddos_date = [];

	$.ajax({
		url : '/searchPacketDDos',
		data : {
			"type" : search_type,
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.lastPacketDDosList.length; i++) {
					ddos_data[i] = result.lastPacketDDosList[i].count;
					ddos_date[i] = result.lastPacketDDosList[i].created_at;
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
	linechartdns(dns_data, dns_date, ddos_data, ddos_date);
	toplist(dns_data, dns_date, ddos_data, ddos_date);
}
function lastDatePacket() {
	var dns_data = [];
	var dns_date = [];

	$.ajax({
		url : '/statLastPacketDns',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.lastPacketDnsList.length; i++) {
					dns_data[i] = result.lastPacketDnsList[i].count;
					dns_date[i] = result.lastPacketDnsList[i].created_at;
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
	var ddos_data = [];
	var ddos_date = [];

	$.ajax({
		url : '/statLastPacketDDos',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.lastPacketDDosList.length; i++) {
					ddos_data[i] = result.lastPacketDDosList[i].count;
					ddos_date[i] = result.lastPacketDDosList[i].created_at;
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
	linechartdns(dns_data, dns_date, ddos_data, ddos_date);
	toplist(dns_data, dns_date, ddos_data, ddos_date);
}

function lastDatednsDomain() {
	$.ajax({
		url : '/statlastdnsdomain',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				init_dns_doughnut(result.lastdnsdomainList);
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
function searchdnsDomain(start_date, end_date, search_type) {
	$.ajax({
		url : '/searchdnsdomain',
		data : {
			"type" : search_type,
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				init_dns_doughnut(result.lastdnsdomainList);
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
function lastDateddosDomain() {
	$.ajax({
		url : '/statlastddosdomain',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				init_ddos_doughnut(result.lastddosdomainList);
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
function searchddosDomain(start_date, end_date, search_type) {
	$.ajax({
		url : '/searchddosdomain',
		data : {
			"type" : search_type,
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				init_ddos_doughnut(result.lastddosdomainList);
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
function lastDatednsSrc() {
	$.ajax({
		url : '/statlastdnssrc',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				init_dnssrc_progress(result.lastdnssrcList);
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
function searchdnsSrc(start_date, end_date, search_type) {
	$.ajax({
		url : '/searchdnssrc',
		data : {
			"type" : search_type,
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				init_dnssrc_progress(result.lastdnssrcList);
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
function lastDateddosSrc() {
	$.ajax({
		url : '/statlastddossrc',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				init_ddossrc_progress(result.lastddossrcList);
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
function searchddosSrc(start_date, end_date, search_type) {
	$.ajax({
		url : '/searchddossrc',
		data : {
			"type" : search_type,
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				init_ddossrc_progress(result.lastddossrcList);
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
function lastDateApp() {
	var appCpu = [];
	var appMem = [];
	var appDate = [];
	$.ajax({
		url : '/statLastApp',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.lastApplist.length; i++) {
					appCpu[i] = result.lastApplist[i].cpu_pct;
					appMem[i] = result.lastApplist[i].mem_pct;
					appDate[i] = result.lastApplist[i].hhmmss;
				}
				linechartapp(appCpu, appMem, appDate);
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

function searchApp(start_date, end_date, search_type) {
	var appCpu = [];
	var appMem = [];
	var appDate = [];
	$.ajax({
		url : '/searchApp',
		data : {
			"date_start" : start_date,
			"date_end" : end_date,
			"type" : search_type
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.lastApplist);
				for (var i = 0; i < result.lastApplist.length; i++) {
					appCpu[i] = result.lastApplist[i].cpu_pct;
					appMem[i] = result.lastApplist[i].mem_pct;
					appDate[i] = result.lastApplist[i].hhmmss;
				}
				linechartapp(appCpu, appMem, appDate);
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
function init_startAjax() {
	lastDateApp();
	lastDatePacket();
	lastDatednsDomain();
	lastDateddosDomain();
	lastDatednsSrc();
	lastDateddosSrc();
}
function init_minAjax(search_type) {
	var arrDate = $("#reservation-time").val().split("-");
	var start_date = arrDate[0];
	var end_date = arrDate[1];

	searchApp(start_date, end_date, search_type);
	searchDataPacket(start_date, end_date, search_type);
	searchdnsDomain(start_date, end_date, search_type);
	searchddosDomain(start_date, end_date, search_type);
	searchdnsSrc(start_date, end_date, search_type);
	searchddosSrc(start_date, end_date, search_type);
}
function init_hourAjax(search_type) {
	var arrDate = $("#reservation-time").val().split("-");
	var start_date = arrDate[0];
	var end_date = arrDate[1];

	searchApp(start_date, end_date, search_type);
	searchDataPacket(start_date, end_date, search_type);
	searchdnsDomain(start_date, end_date, search_type);
	searchddosDomain(start_date, end_date, search_type);
	searchdnsSrc(start_date, end_date, search_type);
	searchddosSrc(start_date, end_date, search_type);
}
function toplist(dns_data, dns_date, ddos_data, ddos_date) {
	var maxDDosValue = '0';
	var maxDDosPoint = '0';
	var startDDosPoint = '0';
	var endDDosPoint = '0';

	for (var i = 0; i < ddos_data.length; i++) {
		if (ddos_data[i] > maxDDosValue) {
			maxDDosValue = ddos_data[i];
			maxDDosPoint = i;
		}
	}

	startDDosPoint = maxDDosPoint - 4;
	endDDosPoint = maxDDosPoint + 3;

	if (maxDDosPoint < 4) {
		startDDosPoint = 0;
		endDDosPoint = 7;
	}
	if (maxDDosPoint + 3 > ddos_data.length) {
		startDDosPoint = maxDDosPoint - (ddos_data.length - maxDDosPoint);
		endDDosPoint = ddos_data.length;
	}

	var j = 0;
	var dnslist = [];
	var ddoslist = [];
	var date = [];

	for (var i = startDDosPoint; i < endDDosPoint; i++) {
		dnslist[j] = dns_data[i];
		ddoslist[j] = ddos_data[i];
		date[j++] = ddos_date[i];
	}

	if ($('#topListquery').length) {

		var echartBar = echarts.init(document.getElementById('topListquery'),
				theme);

		echartBar.setOption({
			tooltip : {
				trigger : 'axis'
			},
			legend : {
				data : [ 'dns', 'ddos' ]
			},
			toolbox : {
				show : false
			},
			calculable : false,
			xAxis : [ {
				type : 'category',
				data : date
			} ],
			yAxis : [ {
				type : 'value'
			} ],
			series : [ {
				name : 'dns',
				type : 'bar',
				data : dnslist,
				markPoint : {
					data : [ {
						type : 'max',
						name : 'maxDnsCount'
					}, ]
				},
				markLine : {
					data : [ {
						type : 'average',
						name : 'avg Dns'
					} ]
				}
			}, {
				name : 'ddos',
				type : 'bar',
				data : ddoslist,
				markPoint : {
					data : [ {
						type : 'max',
						name : 'maxDDosCount'
					}, ]
				},
				markLine : {
					data : [ {
						type : 'average',
						name : 'avg DDos'
					} ]
				}

			} ]
		});

	}
}
var theme = {
	color : [ '#26B99A', '#34495E', '#BDC3C7', '#3498DB', '#9B59B6', '#8abb6f',
			'#759c6a', '#bfd3b7' ],

	title : {
		itemGap : 8,
		textStyle : {
			fontWeight : 'normal',
			color : '#408829'
		}
	},

	dataRange : {
		color : [ '#1f610a', '#97b58d' ]
	},

	toolbox : {
		color : [ '#408829', '#408829', '#408829', '#408829' ]
	},

	tooltip : {
		backgroundColor : 'rgba(0,0,0,0.5)',
		axisPointer : {
			type : 'line',
			lineStyle : {
				color : '#408829',
				type : 'dashed'
			},
			crossStyle : {
				color : '#408829'
			},
			shadowStyle : {
				color : 'rgba(200,200,200,0.3)'
			}
		}
	},

	dataZoom : {
		dataBackgroundColor : '#eee',
		fillerColor : 'rgba(64,136,41,0.2)',
		handleColor : '#408829'
	},
	grid : {
		borderWidth : 0
	},

	categoryAxis : {
		axisLine : {
			lineStyle : {
				color : '#408829'
			}
		},
		splitLine : {
			lineStyle : {
				color : [ '#eee' ]
			}
		}
	},

	valueAxis : {
		axisLine : {
			lineStyle : {
				color : '#408829'
			}
		},
		splitArea : {
			show : true,
			areaStyle : {
				color : [ 'rgba(250,250,250,0.1)', 'rgba(200,200,200,0.1)' ]
			}
		},
		splitLine : {
			lineStyle : {
				color : [ '#eee' ]
			}
		}
	},
	timeline : {
		lineStyle : {
			color : '#408829'
		},
		controlStyle : {
			normal : {
				color : '#408829'
			},
			emphasis : {
				color : '#408829'
			}
		}
	},

	k : {
		itemStyle : {
			normal : {
				color : '#68a54a',
				color0 : '#a9cba2',
				lineStyle : {
					width : 1,
					color : '#408829',
					color0 : '#86b379'
				}
			}
		}
	},
	map : {
		itemStyle : {
			normal : {
				areaStyle : {
					color : '#ddd'
				},
				label : {
					textStyle : {
						color : '#c12e34'
					}
				}
			},
			emphasis : {
				areaStyle : {
					color : '#99d2dd'
				},
				label : {
					textStyle : {
						color : '#c12e34'
					}
				}
			}
		}
	},
	force : {
		itemStyle : {
			normal : {
				linkStyle : {
					strokeColor : '#408829'
				}
			}
		}
	},
	chord : {
		padding : 4,
		itemStyle : {
			normal : {
				lineStyle : {
					width : 1,
					color : 'rgba(128, 128, 128, 0.5)'
				},
				chordStyle : {
					lineStyle : {
						width : 1,
						color : 'rgba(128, 128, 128, 0.5)'
					}
				}
			},
			emphasis : {
				lineStyle : {
					width : 1,
					color : 'rgba(128, 128, 128, 0.5)'
				},
				chordStyle : {
					lineStyle : {
						width : 1,
						color : 'rgba(128, 128, 128, 0.5)'
					}
				}
			}
		}
	},
	gauge : {
		startAngle : 225,
		endAngle : -45,
		axisLine : {
			show : true,
			lineStyle : {
				color : [ [ 0.2, '#86b379' ], [ 0.8, '#68a54a' ],
						[ 1, '#408829' ] ],
				width : 8
			}
		},
		axisTick : {
			splitNumber : 10,
			length : 12,
			lineStyle : {
				color : 'auto'
			}
		},
		axisLabel : {
			textStyle : {
				color : 'auto'
			}
		},
		splitLine : {
			length : 18,
			lineStyle : {
				color : 'auto'
			}
		},
		pointer : {
			length : '90%',
			color : 'auto'
		},
		title : {
			textStyle : {
				color : '#333'
			}
		},
		detail : {
			textStyle : {
				color : 'auto'
			}
		}
	},
	textStyle : {
		fontFamily : 'Arial, Verdana, sans-serif'
	}
};
function linechartdns(dns_data, dns_date, ddos_data, ddos_date) {
	if ($('#lineChart-dns').length) {

		var ctx = document.getElementById("lineChart-dns");
		var lineChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : dns_date,
				datasets : [ {
					label : "DNS",
					backgroundColor : "rgba(38, 185, 154, 0.31)",
					borderColor : "rgba(38, 185, 154, 0.7)",
					pointBorderColor : "rgba(38, 185, 154, 0.7)",
					pointBackgroundColor : "rgba(38, 185, 154, 0.7)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(220,220,220,1)",
					pointBorderWidth : 1,
					data : dns_data
				}, {
					label : "DDOS",
					backgroundColor : "rgba(3, 88, 106, 0.3)",
					borderColor : "rgba(3, 88, 106, 0.70)",
					pointBorderColor : "rgba(3, 88, 106, 0.70)",
					pointBackgroundColor : "rgba(3, 88, 106, 0.70)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(151,187,205,1)",
					pointBorderWidth : 1,
					data : ddos_data
				} ]
			},
		});

	}
}
function linechartapp(appCpu, appMem, appDate) {
	var data = appDate;
	var app_data = appCpu;
	var mem_data = appMem;

	if ($('#lineChart-app').length) {

		var ctx = document.getElementById("lineChart-app");
		var lineChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : data,
				datasets : [ {
					label : "CPU",
					backgroundColor : "rgba(50, 115, 154, 0.31)",
					borderColor : "rgba(58, 111, 154, 0.7)",
					pointBorderColor : "rgba(38, 185, 154, 0.7)",
					pointBackgroundColor : "rgba(38, 185, 154, 0.7)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(220,220,220,1)",
					pointBorderWidth : 1,
					data : app_data,
				}, {
					label : "MEMORY",
					backgroundColor : "rgba(113, 88, 106, 0.3)",
					borderColor : "rgba(83, 88, 106, 0.70)",
					pointBorderColor : "rgba(3, 88, 106, 0.70)",
					pointBackgroundColor : "rgba(3, 88, 106, 0.70)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(151,187,205,1)",
					pointBorderWidth : 1,
					data : mem_data,
				} ]
			},
			responsive : true,
			maintainAspectRatio : false,
		});
	}

}
function init_dns_doughnut(data) {

	var domain_data = [];
	var count_data = [];
	var per_data = [];
	var max_value = 5;
	var i = 0;

	if (data.length < max_value) {
		max_value = data.length;
		for (; i < max_value; i++) {
			domain_data[i] = data[i].domain;
			count_data[i] = data[i].count;
			per_data[i] = data[i].percentage;
		}
	} else {
		for (; i < max_value; i++) {
			domain_data[i] = data[i].domain;
			count_data[i] = data[i].count;
			per_data[i] = data[i].percentage;
		}
		count_data[max_value] = 0;
		per_data[max_value] = 0;
		domain_data[max_value] = "Others";
		for (i = max_value; i < data.length; i++) {
			count_data[max_value] = count_data[max_value] + data[i].count;
			per_data[max_value] = per_data[max_value] + data[i].percentage;
		}
	}
	if (typeof (Chart) === 'undefined') {
		return;
	}

	if ($('#dnsDomainDoughnut').length) {

		var chart_doughnut_settings = {
			type : 'doughnut',
			tooltipFillColor : "rgba(51, 51, 51, 0.55)",
			data : {
				labels : domain_data,
				datasets : [ {
					data : per_data,
					backgroundColor : [ "#BDC3C7", "#9B59B6", "#E74C3C",
							"#26B99A", "#3498DB" ],
					hoverBackgroundColor : [ "#CFD4D8", "#B370CF", "#E95E4F",
							"#36CAAB", "#49A9EA" ]
				} ]
			},
			options : {
				legend : false,
				responsive : false
			}
		}

		$('#dnsDomainDoughnut').each(
				function() {

					var chart_element = $(this);
					var chart_doughnut = new Chart(chart_element,
							chart_doughnut_settings);

				});

	}
	var donut_color = [ "aero", "purple", "red", "green", "blue" ];
	var show_dns_domain = document.getElementById("dnsQueryDomainList");
	var domain_html = '';
	for (i = 0; i < max_value + 1; i++) {
		domain_html += "<tr>";
		domain_html += "<td><i class='fa fa-square " + donut_color[i]
				+ "'></i></td>"
		domain_html += "<td>" + domain_data[i] + "</td>";
		domain_html += "<td>" + count_data[i] + "(" + per_data[i]+ "%)</td>";
		domain_html += "</tr>";
	}
	show_dns_domain.innerHTML = domain_html;
}
function init_ddos_doughnut(data) {

	var domain_data = [];
	var count_data = [];
	var per_data = [];
	var max_value = 5;
	var i = 0;

	if (data.length < max_value) {
		max_value = data.length;
		for (; i < max_value; i++) {
			domain_data[i] = data[i].domain;
			count_data[i] = data[i].count;
			per_data[i] = data[i].percentage;
		}
	} else {
		for (; i < max_value; i++) {
			domain_data[i] = data[i].domain;
			count_data[i] = data[i].count;
			per_data[i] = data[i].percentage;
		}
		count_data[max_value] = 0;
		per_data[max_value] = 0;
		domain_data[max_value] = "Others";
		for (i = max_value; i < data.length; i++) {
			count_data[max_value] = count_data[max_value] + data[i].count;
			per_data[max_value] = per_data[max_value] + data[i].percentage;
		}
	}
	if (typeof (Chart) === 'undefined') {
		return;
	}

	if ($('#ddosDomainDoughnut').length) {

		var chart_doughnut_settings = {
			type : 'doughnut',
			tooltipFillColor : "rgba(51, 51, 51, 0.55)",
			data : {
				labels : domain_data,
				datasets : [ {
					data : per_data,
					backgroundColor : [ "#BDC3C7", "#9B59B6", "#E74C3C",
							"#26B99A", "#3498DB" ],
					hoverBackgroundColor : [ "#CFD4D8", "#B370CF", "#E95E4F",
							"#36CAAB", "#49A9EA" ]
				} ]
			},
			options : {
				legend : false,
				responsive : false
			}
		}

		$('#ddosDomainDoughnut').each(
				function() {

					var chart_element = $(this);
					var chart_doughnut = new Chart(chart_element,
							chart_doughnut_settings);

				});

	}
	var donut_color = [ "aero", "purple", "red", "green", "blue" ];
	var show_ddos_domain = document.getElementById("ddosQueryDomainList");
	var domain_html = '';
	for (i = 0; i < max_value + 1; i++) {
		domain_html += "<tr>";
		domain_html += "<td><i class='fa fa-square " + donut_color[i]
				+ "'></i></td>"
		domain_html += "<td>" + domain_data[i] + "</td>";
		domain_html += "<td>" + count_data[i] + "(" + per_data[i]+ "%)</td>";
		domain_html += "</tr>";
	}
	show_ddos_domain.innerHTML = domain_html;
}
function init_dnssrc_progress(data) {
	var src_data = [];
	var count_data = [];
	var per_data = [];
	var max_value = 5;
	var i = 0;

	if (data.length <= max_value) {
		max_value = data.length;
		for (; i < max_value; i++) {
			src_data[i] = data[i].src_ip;
			count_data[i] = data[i].count;
			per_data[i] = data[i].percentage;
		}
	} else {
		for (; i < max_value; i++) {
			src_data[i] = data[i].src_ip;
			count_data[i] = data[i].count;
			per_data[i] = data[i].percentage;
		}
		count_data[max_value] = 0;
		per_data[max_value] = 0;
		domain_data[max_value] = "Others";
		for (i = max_value; i < data.length; i++) {
			count_data[max_value] = count_data[max_value] + data[i].count;
			per_data[max_value] = per_data[max_value] + data[i].percentage;
		}
	}

	var show_dns_src = document.getElementById("dnsQuerySrcList");
	var domain_html = '';
	for (i = 0; i < max_value; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + src_data[i] + '</td>';
		domain_html += '<td><div class="progress progress_sm">';
		domain_html += '<div class="progress-bar bg-green" role="progressbar" data-transitiongoal="100"></div>';
		domain_html += '</div></td>';
		domain_html += '<td>' + per_data[i] + '%</td>';
		domain_html += '</tr>';
	}
	show_dns_src.innerHTML = domain_html;
}
function init_ddossrc_progress(data) {
	var src_data = [];
	var count_data = [];
	var per_data = [];
	var max_value = 5;
	var i = 0;

	if (data.length <= max_value) {
		max_value = data.length;
		for (; i < max_value; i++) {
			src_data[i] = data[i].src_ip;
			count_data[i] = data[i].count;
			per_data[i] = data[i].percentage.toFixed(0);
		}
	} else {
		for (; i < max_value; i++) {
			src_data[i] = data[i].src_ip;
			count_data[i] = data[i].count;
			per_data[i] = data[i].percentage.toFixed(0);
		}
		count_data[max_value] = 0;
		per_data[max_value] = 0;
		domain_data[max_value] = "Others";
		for (i = max_value; i < data.length; i++) {
			count_data[max_value] = count_data[max_value] + data[i].count;
			per_data[max_value] = per_data[max_value] + data[i].percentage;
		}
	}
	var show_ddos_src = document.getElementById("ddosQuerySrcList");
	var domain_html = '';
	for (i = 0; i < max_value; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + src_data[i] + '</td>';
		domain_html += '<td><div class="progress progress_sm">';
		domain_html += '<div class="progress-bar bg-green" role="progressbar" data-transitiongoal="100"></div>';
		domain_html += '</div></td>';
		domain_html += '<td>' + per_data[i] + '%</td>';
		domain_html += '</tr>';
	}
	show_ddos_src.innerHTML = domain_html;
}

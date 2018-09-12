var date_start = '';
var date_end = '';
var limitCount = '';

$(document).ready(function() {
	base_view();
	listCheck();
	$('#search_stat').click(function() {
				if ($(
						'input:radio[name="report_type"]:checked')
						.val() == 'daily') {
					console.log("daily");
					days_view();

				} else if ($(
						'input:radio[name="report_type"]:checked')
						.val() == 'weekly') {
					console.log("weekly");
					var result = $('input:radio[name="report_count_type"]:checked').val() ;
					console.log(result);
				} else if ($(
						'input:radio[name="report_type"]:checked')
						.val() == 'monthly') {
					console.log("monthly");
					var result = $('input:radio[name="report_count_type"]:checked').val() ;
					console.log(result);

				}
			});
});
function listCheck(){
	$("#check_dns_domain").change(function(){
		if ($("#check_dns_domain").is(":checked")){
			$("#dns_domain").fadeIn("slow");
		}else{
			$("#dns_domain").fadeOut("slow");
		}
	});
	$("#check_dns_client").change(function(){
		if ($("#check_dns_client").is(":checked")){
			$("#dns_client").fadeIn("slow");
		}else{
			$("#dns_client").fadeOut("slow");
		}
	});
	$("#check_ddos_domain").change(function(){
		if ($("#check_ddos_domain").is(":checked")){
			$("#ddos_domain").fadeIn("slow");
		}else{
			$("#ddos_domain").fadeOut("slow");
		}
	});
	$("#check_ddos_client").change(function(){
		if ($("#check_ddos_client").is(":checked")){
			$("#ddos_client").fadeIn("slow");
		}else{
			$("#ddos_client").fadeOut("slow");
		}
	});
	$("#check_query_graph").change(function(){
		if ($("#check_query_graph").is(":checked")){
			$("#packet_graph").fadeIn("slow");
		}else{
			$("#packet_graph").fadeOut("slow");
		}
	});
	$("#check_cpu_graph").change(function(){
		if ($("#check_cpu_graph").is(":checked")){
			$("#cpu_graph").fadeIn("slow");
		}else{
			$("#cpu_graph").fadeOut("slow");
		}
	});
	$("#check_memroy_graph").change(function(){
		if ($("#check_memroy_graph").is(":checked")){
			$("#memroy_graph").fadeIn("slow");
		}else{
			$("#memroy_graph").fadeOut("slow");
		}
	});
	$("#check_disk_graph").change(function(){
		if ($("#check_disk_graph").is(":checked")){
			$("#disk_graph").fadeIn("slow");
		}else{
			$("#disk_graph").fadeOut("slow");
		}
	});
}
function base_view() {
	baseAppliance();
	basePacket();
	baseQuery();
};
function days_view(){
//	daysAppliance();
//	daysPacket();
	daysQuery();
}

function baseQuery(){
	var dnsdomainList = [];
	var dnsdomainCount = [];
	var dnsdomainPer = [];
	$.ajax({
		url : '/crocheck/reportBaseDnsDomain',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for(var i =0; i<result.dnsDomainList.length; i++){
					dnsdomainList[i] = result.dnsDomainList[i].domain;
					dnsdomainCount[i] = result.dnsDomainList[i].count;
					dnsdomainPer[i] = result.dnsDomainList[i].percentage;
				}
				dnsDomainList(dnsdomainList, dnsdomainCount, dnsdomainPer);
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
	
	 var ddosdomainList = [];
	 var ddosdomainCount = [];
	 var ddosdomainPer = [];
	$.ajax({
		url : '/crocheck/reportBaseDDosDomain',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for(var i =0; i<result.ddosDomainList.length; i++){
					ddosdomainList[i] = result.ddosDomainList[i].domain;
					ddosdomainCount[i] = result.ddosDomainList[i].count;
					ddosdomainPer[i] = result.ddosDomainList[i].percentage;
				}
				ddosDomainList(ddosdomainList, ddosdomainCount, ddosdomainPer);
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
	
	var dnsSrcList = [];
	var dnsSrcCount = [];
	var dnsSrcPer = [];
	
	$.ajax({
		url : '/crocheck/reportBaseDnsSrc',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
			for(var i =0; i<result.dnsSrcList.length;i++){
				dnsSrcList[i] = result.dnsSrcList[i].src_ip;
				dnsSrcCount[i] = result.dnsSrcList[i].count;
				dnsSrcPer[i] = result.dnsSrcList[i].percentage;
			}
			dnsClientList(dnsSrcList, dnsSrcCount, dnsSrcPer);
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
	var ddosSrcList = [];
	var ddosSrcCount = [];
	var ddosSrcPer = [];	
	$.ajax({
		url : '/crocheck/reportBaseDDosSrc',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for(var i =0; i<result.ddosSrcList.length;i++){
					ddosSrcList[i] = result.ddosSrcList[i].src_ip;
					ddosSrcCount[i] = result.ddosSrcList[i].count;
					ddosSrcPer[i] = result.ddosSrcList[i].percentage;
				}
				ddosClientList(ddosSrcList, ddosSrcCount, ddosSrcPer);
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
function daysQuery(){
	var arrDate = $("#reservation-time").val().split("-");
	var start_date = arrDate[0];
	var end_date = arrDate[1];
	
	var dnsdomainList = [];
	var dnsdomainCount = [];
	var dnsdomainPer = [];
	$.ajax({
		url : '/crocheck/reportdayDnsDomain',
		data : {
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.dnsDomainList);
//				for(var i =0; i<result.dnsDomainList.length; i++){
//					dnsdomainList[i] = result.dnsDomainList[i].domain;
//					dnsdomainCount[i] = result.dnsDomainList[i].count;
//					dnsdomainPer[i] = result.dnsDomainList[i].percentage;
//				}
//				dnsDomainList(dnsdomainList, dnsdomainCount, dnsdomainPer);
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
	
	 var ddosdomainList = [];
	 var ddosdomainCount = [];
	 var ddosdomainPer = [];
	$.ajax({
		url : '/crocheck/reportdayDDosDomain',
		data : {
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.ddosDomainList);
//				for(var i =0; i<result.ddosDomainList.length; i++){
//					ddosdomainList[i] = result.ddosDomainList[i].domain;
//					ddosdomainCount[i] = result.ddosDomainList[i].count;
//					ddosdomainPer[i] = result.ddosDomainList[i].percentage;
//				}
//				ddosDomainList(ddosdomainList, ddosdomainCount, ddosdomainPer);
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
	
	var dnsSrcList = [];
	var dnsSrcCount = [];
	var dnsSrcPer = [];
	
	$.ajax({
		url : '/crocheck/reportdayDnsSrc',
		data : {
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.dnsSrcList);
//			for(var i =0; i<result.dnsSrcList.length;i++){
//				dnsSrcList[i] = result.dnsSrcList[i].src_ip;
//				dnsSrcCount[i] = result.dnsSrcList[i].count;
//				dnsSrcPer[i] = result.dnsSrcList[i].percentage;
//			}
//			dnsClientList(dnsSrcList, dnsSrcCount, dnsSrcPer);
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
	var ddosSrcList = [];
	var ddosSrcCount = [];
	var ddosSrcPer = [];	
	$.ajax({
		url : '/crocheck/reportdayDDosSrc',
		data : {
			"date_start" : start_date,
			"date_end" : end_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.ddosSrcList);
//				for(var i =0; i<result.ddosSrcList.length;i++){
//					ddosSrcList[i] = result.ddosSrcList[i].src_ip;
//					ddosSrcCount[i] = result.ddosSrcList[i].count;
//					ddosSrcPer[i] = result.ddosSrcList[i].percentage;
//				}
//				ddosClientList(ddosSrcList, ddosSrcCount, ddosSrcPer);
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

function dnsDomainList(domainList, domainCount, domainPer){
	if ($('#dns_domain_pie').length) {

		var echartPie = echarts.init(document.getElementById('dns_domain_pie'),
				theme);

		echartPie.setOption({
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)"
			},
			toolbox : {
				show : true,
				feature : {
					magicType : {
						show : true,
						type : [ 'pie', 'funnel' ],
						option : {
							funnel : {
								x : '25%',
								width : '50%',
								funnelAlign : 'left',
								max : 1548
							}
						}
					}
				}
			},
			calculable : true,
			series : [ {
				name : 'donut_title',
				type : 'pie',
				radius : '55%',
				center : [ '50%', '48%' ],
				data : [ {
					value : domainCount[0],
					name : domainList[0]
				}, {
					value : domainCount[1],
					name : domainList[1]
				}, {
					value : domainCount[2],
					name : domainList[2]
				}, {
					value : domainCount[3],
					name : domainList[3]
				}, {
					value : domainCount[4],
					name : domainList[4]
				} ]
			} ]

		});
	}
	var dnsDomainTable = document.getElementById("dnsDomaintableList");
	
	var domain_html ='';
	var domain_length = '';
	if(domainList.length < 7){
		domain_length = domain.length;
	}else{
		domain_length = 7;
	}
	
	for(var i = 0; i< domain_length;i++){
		domain_html += '<tr>';
		domain_html += '<td>' + domainList[i] + '</td>';
		domain_html += '<td>' + domainCount[i] + '</td>';
		domain_html += '<td>' + domainPer[i] + '%</td>';
		domain_html += '</tr>';
	}
	dnsDomainTable.innerHTML = domain_html;
}
function ddosDomainList(domainList, domainCount, domainPer){
	
	if ($('#ddos_domain_pie').length) {
		var echartPie = echarts.init(document.getElementById('ddos_domain_pie'),
				theme);

		echartPie.setOption({
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)"
			},
			toolbox : {
				show : true,
				feature : {
					magicType : {
						show : true,
						type : [ 'pie', 'funnel' ],
						option : {
							funnel : {
								x : '25%',
								width : '50%',
								funnelAlign : 'left',
								max : 1548
							}
						}
					}
				}
			},
			calculable : true,
			series : [ {
				name : 'donut_title',
				type : 'pie',
				radius : '55%',
				center : [ '50%', '48%' ],
				data : [ {
					value : domainCount[0],
					name : domainList[0]
				}, {
					value : domainCount[1],
					name : domainList[1]
				}, {
					value : domainCount[2],
					name : domainList[2]
				}, {
					value : domainCount[3],
					name : domainList[3]
				}, {
					value : domainCount[4],
					name : domainList[4]
				} ]
			} ]

		});
	}
	var dnsDomainTable = document.getElementById("ddosDomaintableList");
	
	var domain_html ='';
	var domain_length = '';
	if(domainList.length < 7){
		domain_length = domain.length;
	}else{
		domain_length = 7;
	}
	
	for(var i = 0; i< domain_length;i++){
		domain_html += '<tr>';
		domain_html += '<td>' + domainList[i] + '</td>';
		domain_html += '<td>' + domainCount[i] + '</td>';
		domain_html += '<td>' + domainPer[i] + '%</td>';
		domain_html += '</tr>';
	}
	dnsDomainTable.innerHTML = domain_html;
}
function dnsClientList(srcList, srcCount, srcPer){
	if ($('#dns_client_pie').length) {
		var echartPie = echarts.init(document.getElementById('dns_client_pie'),
				theme);

		echartPie.setOption({
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)"
			},
			toolbox : {
				show : true,
				feature : {
					magicType : {
						show : true,
						type : [ 'pie', 'funnel' ],
						option : {
							funnel : {
								x : '25%',
								width : '50%',
								funnelAlign : 'left',
								max : 1548
							}
						}
					}
				}
			},
			calculable : true,
			series : [ {
				name : 'donut_title',
				type : 'pie',
				radius : '55%',
				center : [ '50%', '48%' ],
				data : [ {
					value : srcCount[0],
					name : srcList[0]
				}, {
					value : srcCount[1],
					name : srcList[1]
				}, {
					value : srcCount[2],
					name : srcList[2]
				}, {
					value : srcCount[3],
					name : srcList[3]
				}, {
					value : srcCount[4],
					name : srcList[4]
				} ]
			} ]

		});
	}
	var dnsClientTable = document.getElementById("dnsClienttableList");
	
	var domain_html ='';
	var src_length = '';
	if(srcList.length < 7){
		src_length = srcList.length;
	}else{
		src_length = 7;
	}
	
	for(var i = 0; i< src_length;i++){
		domain_html += '<tr>';
		domain_html += '<td>' + srcList[i] + '</td>';
		domain_html += '<td>' + srcCount[i] + '</td>';
		domain_html += '<td>' + srcPer[i] + '%</td>';
		domain_html += '</tr>';
	}
	dnsClientTable.innerHTML = domain_html;
}
function ddosClientList(srcList, srcCount, srcPer){
	if ($('#ddos_client_pie').length) {
		var echartPie = echarts.init(document.getElementById('ddos_client_pie'),
				theme);

		echartPie.setOption({
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)"
			},
			toolbox : {
				show : true,
				feature : {
					magicType : {
						show : true,
						type : [ 'pie', 'funnel' ],
						option : {
							funnel : {
								x : '25%',
								width : '50%',
								funnelAlign : 'left',
								max : 1548
							}
						}
					}
				}
			},
			calculable : true,
			series : [ {
				name : 'donut_title',
				type : 'pie',
				radius : '55%',
				center : [ '50%', '48%' ],
				data : [ {
					value : srcCount[0],
					name : srcList[0]
				}, {
					value : srcCount[1],
					name : srcList[1]
				}, {
					value : srcCount[2],
					name : srcList[2]
				}, {
					value : srcCount[3],
					name : srcList[3]
				}, {
					value : srcCount[4],
					name : srcList[4]
				} ]
			} ]

		});
	}
	var ddosClientTable = document.getElementById("ddosClienttableList");
	
	var domain_html ='';
	var src_length = '';
	if(srcList.length < 7){
		src_length = srcList.length;
	}else{
		src_length = 7;
	}
	
	for(var i = 0; i< src_length;i++){
		domain_html += '<tr>';
		domain_html += '<td>' + srcList[i] + '</td>';
		domain_html += '<td>' + srcCount[i] + '</td>';
		domain_html += '<td>' + srcPer[i] + '%</td>';
		domain_html += '</tr>';
	}
	ddosClientTable.innerHTML = domain_html;
}

function basePacket() {
	var appDnsPacket = [];
	var appDDosPacket = [];
	var appDate = [];

	$.ajax({
		url : '/crocheck/reportBaseDnsPacket',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.dnsPacketList.length; i++) {
					appDnsPacket[i] = result.dnsPacketList[i].count;
					appDate[i] = result.dnsPacketList[i].created_at;
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

	$.ajax({
		url : '/crocheck/reportBaseDDosPacket',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.ddosPacketList.length; i++) {
					appDDosPacket[i] = result.ddosPacketList[i].count;
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
	init_packetChart(appDnsPacket, appDDosPacket, appDate);

}
function init_packetChart(appDnsPacket, appDDosPacket, appDate) {
	if ($('#packetChart').length) {

		var ctx = document.getElementById("packetChart");
		var lineChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : appDate,
				datasets : [ {
					label : "DNS",
					backgroundColor : "rgba(38, 185, 154, 0.31)",
					borderColor : "rgba(38, 185, 154, 0.7)",
					pointBorderColor : "rgba(38, 185, 154, 0.7)",
					pointBackgroundColor : "rgba(38, 185, 154, 0.7)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(220,220,220,1)",
					pointBorderWidth : 1,
					data : appDnsPacket
				}, {
					label : "DDOS",
					backgroundColor : "rgba(3, 88, 106, 0.3)",
					borderColor : "rgba(3, 88, 106, 0.70)",
					pointBorderColor : "rgba(3, 88, 106, 0.70)",
					pointBackgroundColor : "rgba(3, 88, 106, 0.70)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(151,187,205,1)",
					pointBorderWidth : 1,
					data : appDDosPacket
				} ]
			},
		});

	}
}
function baseAppliance() {
	var appCpu = [];
	var appMem = [];
	var appDisk = [];
	var appDate = [];

	$.ajax({
		url : '/crocheck/reportBaseApp',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.applist.length; i++) {
					appCpu[i] = result.applist[i].cpu_pct;
					appMem[i] = result.applist[i].mem_pct;
					appDisk[i] = result.applist[i].disk_vol1_pct;
					appDate[i] = result.applist[i].hhmmss;
				}
				init_applianceChart(appCpu, appMem, appDisk, appDate);
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
function init_applianceChart(appCpu, appMem, appDisk, appDate) {
	if ($('#cpuChart').length) {

		var ctx = document.getElementById("cpuChart");
		var lineChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : appDate,
				datasets : [ {
					label : "CPU",
					backgroundColor : "rgba(38, 185, 154, 0.31)",
					borderColor : "rgba(38, 185, 154, 0.7)",
					pointBorderColor : "rgba(38, 185, 154, 0.7)",
					pointBackgroundColor : "rgba(38, 185, 154, 0.7)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(220,220,220,1)",
					pointBorderWidth : 1,
					data : appCpu
				} ]
			},
		});

	}
	if ($('#memoryChart').length) {

		var ctx = document.getElementById("memoryChart");
		var lineChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : appDate,
				datasets : [ {
					label : "Memory",
					backgroundColor : "rgba(38, 185, 154, 0.31)",
					borderColor : "rgba(38, 185, 154, 0.7)",
					pointBorderColor : "rgba(38, 185, 154, 0.7)",
					pointBackgroundColor : "rgba(38, 185, 154, 0.7)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(220,220,220,1)",
					pointBorderWidth : 1,
					data : appMem
				}, ]
			},
		});

	}
	if ($('#diskChart').length) {

		var ctx = document.getElementById("diskChart");
		var lineChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : appDate,
				datasets : [ {
					label : "Disk",
					backgroundColor : "rgba(38, 185, 154, 0.31)",
					borderColor : "rgba(38, 185, 154, 0.7)",
					pointBorderColor : "rgba(38, 185, 154, 0.7)",
					pointBackgroundColor : "rgba(38, 185, 154, 0.7)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(220,220,220,1)",
					pointBorderWidth : 1,
					data : appDisk
				} ]
			},
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

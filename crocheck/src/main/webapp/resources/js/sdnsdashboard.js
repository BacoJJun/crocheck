$(document).ready(function() {
	statLoop();
	charLoop();
	initLoop();
});

function charLoop() {
	// getSystemInfo();
	getStatList();
	setTimeout(charLoop, 1000);
};
function statLoop() {
	init_echarts();
	getDnsList();
	getDDosList();
	setTimeout(statLoop, 3000);
}
function initLoop() {
	getDnsTodayGraph();
	zoneCount();
	setTimeout(initLoop, 60000);
}
function zoneCount(){
	var zone = document.getElementById("zone_count");
	var sub_domain = document.getElementById("sub_domain_count");
	
	$.ajax({
		url : '/zoneCount',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				zone.innerText = "ZONE : " + result.zoneCount.zone_count;
				sub_domain.innerText = "SUB_DOMAIN : " +result.zoneCount.sub_count;
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


function getStatList() {
	var todayquerystat = document.getElementById("todayquerystat");
	var minquerystat = document.getElementById("minquerystat");
	var nowquerystat = document.getElementById("nowquerystat");
	var todayddosstat = document.getElementById("todayddosstat");
	var minddosstat = document.getElementById("minddosstat");
	var nowddosstat = document.getElementById("nowddosstat");

	$.ajax({
		url : '/ddosStat',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				nowddosstat.innerText = result.ddosStatusList[0].totalcount;
				minddosstat.innerText = result.ddosStatusList[1].totalcount;
				todayddosstat.innerText = result.ddosStatusList[2].totalcount;
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
		url : '/dnsStat',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				todayquerystat.innerText = result.dnsStatusList[0].totalcount;
				minquerystat.innerText = result.dnsStatusList[1].totalcount;
				nowquerystat.innerText = result.dnsStatusList[2].totalcount;
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
function getDnsList() {
	var show_dns = document.getElementById("show_dns");

	$.ajax({
		url : '/alertLiveDns',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				var domain_html = ' ';
				for (var i = 0; i < result.alertLiveDnsList.length; i++) {
					domain_html += '<tr> <td>' + (i + 1) + '</td>';
					domain_html += '<td>' + result.alertLiveDnsList[i].src_ip
							+ '</td>'
					domain_html += '<td>' + result.alertLiveDnsList[i].domain
							+ '</td>';
					domain_html += '<td>' + result.alertLiveDnsList[i].count
							+ '</td></tr>';
				}
				for (; i < 6; i++) {
					domain_html += '<tr> <td>' + (i + 1) + '</td>';
					domain_html += '<td></td>'
					domain_html += '<td></td>';
					domain_html += '<td></td></tr>';
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
function getDDosList() {
	var show_ddos = document.getElementById("show_ddos");

	$.ajax({
		url : '/alertLiveDDos',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				var domain_html = ' ';
				for (var i = 0; i < result.alertLiveDDosList.length; i++) {
					domain_html += '<tr> <td>' + (i + 1) + '</td>';
					domain_html += '<td>' + result.alertLiveDDosList[i].src_ip
							+ '</td>';
					domain_html += '<td>' + result.alertLiveDDosList[i].domain
							+ '</td>';
					domain_html += '<td>' + result.alertLiveDDosList[i].count
							+ '</td></tr>';
				}
				for (; i < 6; i++) {
					domain_html += '<tr> <td>' + (i + 1) + '</td>';
					domain_html += '<td></td>'
					domain_html += '<td></td>';
					domain_html += '<td></td></tr>';
				}
				show_ddos.innerHTML = domain_html;
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

function getDnsTodayGraph() {
	var dns_data = [];
	var jsonData = $.ajax({
		url : '/todayDns',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.todayDnsList.length; i++) {
					dns_data[i] = result.todayDnsList[i].dnsCount;
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

	var yesterday_dns_data = [];
	var jsonData = $.ajax({
		url : '/yesterdayDns',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.yesterDnsList.length; i++) {
					yesterday_dns_data[i] = result.yesterDnsList[i].dnsCount;
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

	var time = [];
	for (var i = 0; i < 24; i++) {
		time[i] = i + 1;
	}
	if ($('#mybarChart_dns').length) {

		var ctx = document.getElementById("mybarChart_dns");
		;
		var mybarChart = new Chart(ctx, {
			type : 'bar',
			data : {
				labels : time,
				datasets : [ {
					label : "today's count",
					backgroundColor : "#26B99A",
					data : dns_data
				}, {
					label : "yesterday's count",
					backgroundColor : "#03586A",
					data : yesterday_dns_data
				} ]
			},
			height : 100,

			options : {
				scales : {
					yAxes : [ {
						ticks : {
							beginAtZero : true
						}
					} ]
				},
				responsive : true,
				maintainAspectRatio : false,
			},

		});

	}
}

function init_echarts() {
	var cpu_pct = '';
	var memory_pct = '';
	var disk_pct = '';

	var jsonData = $
			.ajax({
				url : '/SystemStatus',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						cpu_pct = (100 - result.systemStatus[0].cpu_idle_pct).toFixed(1);
						memory_pct = (result.systemStatus[0].mem_use / result.systemStatus[0].mem_total*100)
								.toFixed(1);
						disk_pct = ((result.systemStatus[0].disk_vol1_usage_byte
								+ result.systemStatus[0].disk_vol2_usage_byte + result.systemStatus[0].disk_vol3_usage_byte) / (result.systemStatus[0].disk_vol1_total_byte
								+ result.systemStatus[0].disk_vol2_total_byte + result.systemStatus[0].disk_vol3_total_byte)*100)
								.toFixed(1);
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

	var theme = {
		color : [ '#26B99A', '#34495E', '#BDC3C7', '#3498DB', '#9B59B6',
				'#8abb6f', '#759c6a', '#bfd3b7' ],
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
	if ($('#echart_gauge_cpu').length) {

		var echartGauge = echarts.init(document
				.getElementById('echart_gauge_cpu'), theme);

		echartGauge.setOption({
			tooltip : {
				formatter : "{a} <br/>{b} : {c}%"
			},
			series : [ {
				type : 'gauge',
				center : [ '40%', '50%' ],
				startAngle : 140,
				endAngle : -140,
				min : 0,
				max : 100,
				precision : 0,
				splitNumber : 10,
				axisLine : {
					show : true,
					lineStyle : {
						color : [ [ 0.2, 'skyblue' ], [ 0.4, 'skyblue' ],
								[ 0.8, 'skyblue' ], [ 1, '#ff4500' ] ],
						width : 30
					}
				},
				axisTick : {
					show : true,
					splitNumber : 5,
					length : 8,
					lineStyle : {
						color : '#eee',
						width : 1,
						type : 'solid'
					}
				},
				axisLabel : {
					show : true,
					formatter : function(v) {
						switch (v + '') {
						case '10':
							return '';
						case '30':
							return '';
						case '60':
							return '';
						case '90':
							return '';
						default:
							return '';
						}
					},
					textStyle : {
						color : '#333'
					}
				},
				splitLine : {
					show : true,
					length : 30,
					lineStyle : {
						color : '#eee',
						width : 2,
						type : 'solid'
					}
				},
				pointer : {
					length : '80%',
					width : 8,
					color : 'auto'
				},
				title : {
					show : true,
					offsetCenter : [ '-65%', -10 ],
					textStyle : {
						color : '#333',
						fontSize : 10
					}
				},
				detail : {
					show : true,
					backgroundColor : 'rgba(0,0,0,0)',
					borderWidth : 0,
					borderColor : '#ccc',
					width : 100,
					height : 40,
					offsetCenter : [ '-60%', 10 ],
					formatter : '{value}%',
					textStyle : {
						color : 'black',
						fontSize : 10
					}
				},
				data : [ {
					value : cpu_pct,
					name : 'CPU'
				} ]
			} ]
		});

	}
	if ($('#echart_gauge_memory').length) {

		var echartGauge = echarts.init(document
				.getElementById('echart_gauge_memory'), theme);

		echartGauge.setOption({
			tooltip : {
				formatter : "{a} <br/>{b} : {c}%"
			},
			series : [ {
				type : 'gauge',
				center : [ '40%', '50%' ],
				startAngle : 140,
				endAngle : -140,
				min : 0,
				max : 100,
				precision : 0,
				splitNumber : 10,
				axisLine : {
					show : true,
					lineStyle : {
						color : [ [ 0.2, 'skyblue' ], [ 0.4, 'skyblue' ],
								[ 0.8, 'skyblue' ], [ 1, '#ff4500' ] ],
						width : 30
					}
				},
				axisTick : {
					show : true,
					splitNumber : 5,
					length : 8,
					lineStyle : {
						color : '#eee',
						width : 1,
						type : 'solid'
					}
				},
				axisLabel : {
					show : true,
					formatter : function(v) {
						switch (v + '') {
						case '10':
							return '';
						case '30':
							return '';
						case '60':
							return '';
						case '90':
							return '';
						default:
							return '';
						}
					},
					textStyle : {
						color : '#333'
					}
				},
				splitLine : {
					show : true,
					length : 30,
					lineStyle : {
						color : '#eee',
						width : 2,
						type : 'solid'
					}
				},
				pointer : {
					length : '80%',
					width : 8,
					color : 'auto'
				},
				title : {
					show : true,
					offsetCenter : [ '-55%', -10 ],
					textStyle : {
						color : '#333',
						fontSize : 10
					}
				},
				detail : {
					show : true,
					backgroundColor : 'rgba(0,0,0,0)',
					borderWidth : 0,
					borderColor : '#ccc',
					width : 100,
					height : 40,
					offsetCenter : [ '-60%', 10 ],
					formatter : '{value}%',
					textStyle : {
						color : 'black',
						fontSize : 10
					}
				},
				data : [ {
					value : memory_pct,
					name : 'MEMORY'
				} ]
			} ]
		});

	}
	if ($('#echart_gauge_disk').length) {

		var echartGauge = echarts.init(document
				.getElementById('echart_gauge_disk'), theme);

		echartGauge.setOption({
			series : [ {
				type : 'gauge',
				center : [ '40%', '50%' ],
				startAngle : 140,
				endAngle : -140,
				min : 0,
				max : 100,
				precision : 0,
				splitNumber : 10,
				axisLine : {
					show : true,
					lineStyle : {
						color : [ [ 0.2, 'skyblue' ], [ 0.4, 'skyblue' ],
								[ 0.8, 'skyblue' ], [ 1, '#ff4500' ] ],
						width : 30
					}
				},
				axisTick : {
					show : true,
					splitNumber : 5,
					length : 8,
					lineStyle : {
						color : '#eee',
						width : 1,
						type : 'solid'
					}
				},
				axisLabel : {
					show : true,
					formatter : function(v) {
						switch (v + '') {
						case '10':
							return '';
						case '30':
							return '';
						case '60':
							return '';
						case '90':
							return '';
						default:
							return '';
						}
					},
					textStyle : {
						color : '#333'
					}
				},
				splitLine : {
					show : true,
					length : 30,
					lineStyle : {
						color : '#eee',
						width : 2,
						type : 'solid'
					}
				},
				pointer : {
					length : '80%',
					width : 8,
					color : 'auto'
				},
				title : {
					show : true,
					offsetCenter : [ '-65%', -10 ],
					textStyle : {
						color : '#333',
						fontSize : 10
					}
				},
				detail : {
					show : true,
					backgroundColor : 'rgba(0,0,0,0)',
					borderWidth : 0,
					borderColor : '#ccc',
					width : 100,
					height : 40,
					offsetCenter : [ '-60%', 10 ],
					formatter : '{value}%',
					textStyle : {
						color : 'black',
						fontSize : 10
					}
				},
				data : [ {
					value : disk_pct,
					name : 'DISK'
				} ]
			} ]
		});

	}
}

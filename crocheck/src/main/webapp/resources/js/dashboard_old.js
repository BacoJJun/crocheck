$(document).ready(function() {
	statLoop();

});

function statLoop() {
	cpuDonutGraph();
	memoryBarGraph();
	diskHorizontal();
	networklinegraph();
	packetlinegraph();
	getDnsList();
	getDDosList();
	setTimeout(statLoop, 3000);
}
function cpuDonutGraph() {
	if ($('#cpu_donut').length) {

		var echartDonut = echarts.init(document.getElementById('cpu_donut'),
				theme);

		echartDonut.setOption({
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)"
			},
			calculable : true,
			legend : {
				x : 'center',
				y : 'bottom',
				data : [ 'Direct Access', 'E-mail Marketing', 'Union Ad',
						'Video Ads', 'Search Engine' ]
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
								funnelAlign : 'center',
								max : 1548
							}
						}
					},
					restore : {
						show : true,
						title : "Restore"
					},
					saveAsImage : {
						show : true,
						title : "Save Image"
					}
				}
			},
			series : [ {
				name : 'Access to the resource',
				type : 'pie',
				radius : [ '35%', '55%' ],
				itemStyle : {
					normal : {
						label : {
							show : true
						},
						labelLine : {
							show : true
						}
					},
					emphasis : {
						label : {
							show : true,
							position : 'center',
							textStyle : {
								fontSize : '14',
								fontWeight : 'normal'
							}
						}
					}
				},
				data : [ {
					value : 335,
					name : 'Direct Access'
				}, {
					value : 310,
					name : 'E-mail Marketing'
				}, {
					value : 234,
					name : 'Union Ad'
				}, {
					value : 135,
					name : 'Video Ads'
				}, {
					value : 1548,
					name : 'Search Engine'
				} ]
			} ]
		});

	}
}
function memoryBarGraph() {
	if ($('#memorygraph').length) {

		var ctx = document.getElementById("memorygraph");
		var mybarChart = new Chart(ctx, {
			type : 'bar',
			data : {
				labels : [ "January", "February", "March", "April", "May",
						"June", "July" ],
				datasets : [ {
					label : '# of Votes',
					backgroundColor : "#26B99A",
					data : [ 51, 30, 40, 28, 92, 50, 45 ]
				}, {
					label : '# of Votes',
					backgroundColor : "#03586A",
					data : [ 41, 56, 25, 48, 72, 34, 12 ]
				} ]
			},

			options : {
				scales : {
					yAxes : [ {
						ticks : {
							beginAtZero : true
						}
					} ]
				}
			}
		});

	}
}
function diskHorizontal() {
	if ($('#disk_bar_horizontal').length) {

		var echartBar = echarts.init(document
				.getElementById('disk_bar_horizontal'), theme);

		echartBar.setOption({
			title : {
				text : 'Bar Graph',
				subtext : 'Graph subtitle'
			},
			tooltip : {
				trigger : 'axis'
			},
			legend : {
				x : 100,
				data : [ '2015', '2016' ]
			},
			toolbox : {
				show : true,
				feature : {
					saveAsImage : {
						show : true,
						title : "Save Image"
					}
				}
			},
			calculable : true,
			xAxis : [ {
				type : 'value',
				boundaryGap : [ 0, 0.01 ]
			} ],
			yAxis : [ {
				type : 'category',
				data : [ 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun' ]
			} ],
			series : [ {
				name : '2015',
				type : 'bar',
				data : [ 18203, 23489, 29034, 104970, 131744, 630230 ]
			}, {
				name : '2016',
				type : 'bar',
				data : [ 19325, 23438, 31000, 121594, 134141, 681807 ]
			} ]
		});

	}
}
function networklinegraph() {
	if ($('#network_line').length) {

		var echartLine = echarts.init(document.getElementById('network_line'),
				theme);

		echartLine.setOption({
			title : {
				text : 'Line Graph',
				subtext : 'Subtitle'
			},
			tooltip : {
				trigger : 'axis'
			},
			legend : {
				x : 220,
				y : 40,
				data : [ 'Intent', 'Pre-order', 'Deal' ]
			},
			toolbox : {
				show : true,
				feature : {
					magicType : {
						show : true,
						title : {
							line : 'Line',
							bar : 'Bar',
							stack : 'Stack',
							tiled : 'Tiled'
						},
						type : [ 'line', 'bar', 'stack', 'tiled' ]
					},
					restore : {
						show : true,
						title : "Restore"
					},
					saveAsImage : {
						show : true,
						title : "Save Image"
					}
				}
			},
			calculable : true,
			xAxis : [ {
				type : 'category',
				boundaryGap : false,
				data : [ 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun' ]
			} ],
			yAxis : [ {
				type : 'value'
			} ],
			series : [ {
				name : 'Deal',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : [ 10, 12, 21, 54, 260, 830, 710 ]
			}, {
				name : 'Pre-order',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : [ 30, 182, 434, 791, 390, 30, 10 ]
			}, {
				name : 'Intent',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : [ 1320, 1132, 601, 234, 120, 90, 20 ]
			} ]
		});

	}
}
function packetlinegraph() {
	if ($('#packet_line').length) {

		var echartLine = echarts.init(document.getElementById('packet_line'),
				theme);

		echartLine.setOption({
			title : {
				text : 'Line Graph',
				subtext : 'Subtitle'
			},
			tooltip : {
				trigger : 'axis'
			},
			legend : {
				x : 220,
				y : 40,
				data : [ 'Intent', 'Pre-order', 'Deal' ]
			},
			toolbox : {
				show : true,
				feature : {
					magicType : {
						show : true,
						title : {
							line : 'Line',
							bar : 'Bar',
							stack : 'Stack',
							tiled : 'Tiled'
						},
						type : [ 'line', 'bar', 'stack', 'tiled' ]
					},
					restore : {
						show : true,
						title : "Restore"
					},
					saveAsImage : {
						show : true,
						title : "Save Image"
					}
				}
			},
			calculable : true,
			xAxis : [ {
				type : 'category',
				boundaryGap : false,
				data : [ 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun' ]
			} ],
			yAxis : [ {
				type : 'value'
			} ],
			series : [ {
				name : 'Deal',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : [ 10, 12, 21, 54, 260, 830, 710 ]
			}, {
				name : 'Pre-order',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : [ 30, 182, 434, 791, 390, 30, 10 ]
			}, {
				name : 'Intent',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : [ 1320, 1132, 601, 234, 120, 90, 20 ]
			} ]
		});

	}
}
function getDnsList() {
	var show_dns = document.getElementById("show_dns");

	$.ajax({
		url : '/crocheck/alertLiveDns',
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
		url : '/crocheck/alertLiveDDos',
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

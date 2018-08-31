$(document).ready(function() {
	$("#reservation-time").value = new Date();
	linechartdns();
	linechartddos();
	piechartdns();
	piechartddos();
});

function init_daterangepicker_reservation() {

	if (typeof ($.fn.daterangepicker) === 'undefined') {
		return;
	}
	// console.log('init_daterangepicker_reservation');

	$('#reservation').daterangepicker(null, function(start, end, label) {
		// console.log(start.toISOString(), end.toISOString(), label);
	});

	$('#reservation-times').daterangepicker({
		timePicker : true,
		timePickerIncrement : 30,
		locale : {
			format : 'YYYY.MM.DD H:mm '
		}
	});

}

function piechartdns() {
	if ($('#echart_pie_dns').length) {

		var echartPie = echarts.init(document.getElementById('echart_pie_dns'),
				theme);

		echartPie.setOption({
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)"
			},
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
								funnelAlign : 'left',
								max : 1548
							}
						}
					},
				}
			},
			calculable : true,
			series : [ {
				name : '访问来源',
				type : 'pie',
				radius : '55%',
				center : [ '50%', '48%' ],
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

		var dataStyle = {
			normal : {
				label : {
					show : false
				},
				labelLine : {
					show : false
				}
			}
		};

		var placeHolderStyle = {
			normal : {
				color : 'rgba(0,0,0,0)',
				label : {
					show : false
				},
				labelLine : {
					show : false
				}
			},
			emphasis : {
				color : 'rgba(0,0,0,0)'
			}
		};

	}
}
var theme = {
		  color: [
			  '#26B99A', '#34495E', '#BDC3C7', '#3498DB',
			  '#9B59B6', '#8abb6f', '#759c6a', '#bfd3b7'
		  ],

		  title: {
			  itemGap: 8,
			  textStyle: {
				  fontWeight: 'normal',
				  color: '#408829'
			  }
		  },

		  dataRange: {
			  color: ['#1f610a', '#97b58d']
		  },

		  toolbox: {
			  color: ['#408829', '#408829', '#408829', '#408829']
		  },

		  tooltip: {
			  backgroundColor: 'rgba(0,0,0,0.5)',
			  axisPointer: {
				  type: 'line',
				  lineStyle: {
					  color: '#408829',
					  type: 'dashed'
				  },
				  crossStyle: {
					  color: '#408829'
				  },
				  shadowStyle: {
					  color: 'rgba(200,200,200,0.3)'
				  }
			  }
		  },

		  dataZoom: {
			  dataBackgroundColor: '#eee',
			  fillerColor: 'rgba(64,136,41,0.2)',
			  handleColor: '#408829'
		  },
		  grid: {
			  borderWidth: 0
		  },

		  categoryAxis: {
			  axisLine: {
				  lineStyle: {
					  color: '#408829'
				  }
			  },
			  splitLine: {
				  lineStyle: {
					  color: ['#eee']
				  }
			  }
		  },

		  valueAxis: {
			  axisLine: {
				  lineStyle: {
					  color: '#408829'
				  }
			  },
			  splitArea: {
				  show: true,
				  areaStyle: {
					  color: ['rgba(250,250,250,0.1)', 'rgba(200,200,200,0.1)']
				  }
			  },
			  splitLine: {
				  lineStyle: {
					  color: ['#eee']
				  }
			  }
		  },
		  timeline: {
			  lineStyle: {
				  color: '#408829'
			  },
			  controlStyle: {
				  normal: {color: '#408829'},
				  emphasis: {color: '#408829'}
			  }
		  },

		  k: {
			  itemStyle: {
				  normal: {
					  color: '#68a54a',
					  color0: '#a9cba2',
					  lineStyle: {
						  width: 1,
						  color: '#408829',
						  color0: '#86b379'
					  }
				  }
			  }
		  },
		  map: {
			  itemStyle: {
				  normal: {
					  areaStyle: {
						  color: '#ddd'
					  },
					  label: {
						  textStyle: {
							  color: '#c12e34'
						  }
					  }
				  },
				  emphasis: {
					  areaStyle: {
						  color: '#99d2dd'
					  },
					  label: {
						  textStyle: {
							  color: '#c12e34'
						  }
					  }
				  }
			  }
		  },
		  force: {
			  itemStyle: {
				  normal: {
					  linkStyle: {
						  strokeColor: '#408829'
					  }
				  }
			  }
		  },
		  chord: {
			  padding: 4,
			  itemStyle: {
				  normal: {
					  lineStyle: {
						  width: 1,
						  color: 'rgba(128, 128, 128, 0.5)'
					  },
					  chordStyle: {
						  lineStyle: {
							  width: 1,
							  color: 'rgba(128, 128, 128, 0.5)'
						  }
					  }
				  },
				  emphasis: {
					  lineStyle: {
						  width: 1,
						  color: 'rgba(128, 128, 128, 0.5)'
					  },
					  chordStyle: {
						  lineStyle: {
							  width: 1,
							  color: 'rgba(128, 128, 128, 0.5)'
						  }
					  }
				  }
			  }
		  },
		  gauge: {
			  startAngle: 225,
			  endAngle: -45,
			  axisLine: {
				  show: true,
				  lineStyle: {
					  color: [[0.2, '#86b379'], [0.8, '#68a54a'], [1, '#408829']],
					  width: 8
				  }
			  },
			  axisTick: {
				  splitNumber: 10,
				  length: 12,
				  lineStyle: {
					  color: 'auto'
				  }
			  },
			  axisLabel: {
				  textStyle: {
					  color: 'auto'
				  }
			  },
			  splitLine: {
				  length: 18,
				  lineStyle: {
					  color: 'auto'
				  }
			  },
			  pointer: {
				  length: '90%',
				  color: 'auto'
			  },
			  title: {
				  textStyle: {
					  color: '#333'
				  }
			  },
			  detail: {
				  textStyle: {
					  color: 'auto'
				  }
			  }
		  },
		  textStyle: {
			  fontFamily: 'Arial, Verdana, sans-serif'
		  }
	  };
function piechartddos() {
	if ($('#echart_pie_ddos').length) {

		var echartPie = echarts.init(
				document.getElementById('echart_pie_ddos'), theme);

		echartPie.setOption({
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)"
			},
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
								funnelAlign : 'left',
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
			calculable : true,
			series : [ {
				name : '访问来源',
				type : 'pie',
				radius : '55%',
				center : [ '50%', '48%' ],
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

		var dataStyle = {
			normal : {
				label : {
					show : false
				},
				labelLine : {
					show : false
				}
			}
		};

		var placeHolderStyle = {
			normal : {
				color : 'rgba(0,0,0,0)',
				label : {
					show : false
				},
				labelLine : {
					show : false
				}
			},
			emphasis : {
				color : 'rgba(0,0,0,0)'
			}
		};

	}
}
function linechartdns() {
	if ($('#lineChart-dns').length) {

		var ctx = document.getElementById("lineChart-dns");
		var lineChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : [ "January", "February", "March", "April", "May",
						"June", "July" ],
				datasets : [ {
					label : "My First dataset",
					backgroundColor : "rgba(38, 185, 154, 0.31)",
					borderColor : "rgba(38, 185, 154, 0.7)",
					pointBorderColor : "rgba(38, 185, 154, 0.7)",
					pointBackgroundColor : "rgba(38, 185, 154, 0.7)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(220,220,220,1)",
					pointBorderWidth : 1,
					data : [ 31, 74, 6, 39, 20, 85, 7 ]
				}, {
					label : "My Second dataset",
					backgroundColor : "rgba(3, 88, 106, 0.3)",
					borderColor : "rgba(3, 88, 106, 0.70)",
					pointBorderColor : "rgba(3, 88, 106, 0.70)",
					pointBackgroundColor : "rgba(3, 88, 106, 0.70)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(151,187,205,1)",
					pointBorderWidth : 1,
					data : [ 82, 23, 66, 9, 99, 4, 2 ]
				} ]
			},
		});

	}
}
function linechartddos() {
	if ($('#lineChart-ddos').length) {

		var ctx = document.getElementById("lineChart-ddos");
		var lineChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : [ "January", "February", "March", "April", "May",
						"June", "July" ],
				datasets : [ {
					label : "My First dataset",
					backgroundColor : "rgba(38, 185, 154, 0.31)",
					borderColor : "rgba(38, 185, 154, 0.7)",
					pointBorderColor : "rgba(38, 185, 154, 0.7)",
					pointBackgroundColor : "rgba(38, 185, 154, 0.7)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(220,220,220,1)",
					pointBorderWidth : 1,
					data : [ 31, 74, 6, 39, 20, 85, 7 ]
				}, {
					label : "My Second dataset",
					backgroundColor : "rgba(3, 88, 106, 0.3)",
					borderColor : "rgba(3, 88, 106, 0.70)",
					pointBorderColor : "rgba(3, 88, 106, 0.70)",
					pointBackgroundColor : "rgba(3, 88, 106, 0.70)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(151,187,205,1)",
					pointBorderWidth : 1,
					data : [ 82, 23, 66, 9, 99, 4, 2 ]
				} ]
			},
		});

	}
}
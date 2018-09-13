$(document).ready(function() {


	$("#comparequery").hide();
	$("#comparednsdomain").hide();
	$("#comparednsclient").hide();
	$("#compareddosdomain").hide();
	$("#compareddosclient").hide();
	buttonClickEvent();
});
function buttonClickEvent() {
	$("#search_btn")
			.click(
					function() {
						if ($('input:radio[name="search_type"]:checked').val() == 'query') {
							console.log("query");
							$("#comparequery").show();
							$("#comparednsdomain").hide();
							$("#comparednsclient").hide();
							$("#compareddosdomain").hide();
							$("#compareddosclient").hide();
							
							comparequery();
							
						} else if ($('input:radio[name="search_type"]:checked')
								.val() == 'dnsdomain') {
							console.log("dnsdomain");
							$("#comparequery").hide();
							$("#comparednsdomain").show();
							$("#comparednsclient").hide();
							$("#compareddosdomain").hide();
							$("#compareddosclient").hide();
							comparednsdomain();
						} else if ($('input:radio[name="search_type"]:checked')
								.val() == 'dnsclient') {
							console.log("dnsclient");
							$("#comparequery").hide();
							$("#comparednsdomain").hide();
							$("#comparednsclient").show();
							$("#compareddosdomain").hide();
							$("#compareddosclient").hide();
							
							comparednsclient();
						} else if ($('input:radio[name="search_type"]:checked')
								.val() == 'ddosdomain') {
							console.log("dnsdomain");
							$("#comparequery").hide();
							$("#comparednsdomain").hide();
							$("#comparednsclient").hide();
							$("#compareddosdomain").show();
							$("#compareddosclient").hide();
							compareddosdomain();
						} else if ($('input:radio[name="search_type"]:checked')
								.val() == 'ddosclient') {
							console.log("ddosclient");
							$("#comparequery").hide();
							$("#comparednsdomain").hide();
							$("#comparednsclient").hide();
							$("#compareddosdomain").hide();
							$("#compareddosclient").show();
							compareddosclient();
						}
					});
}
function comparednsdomain() {
	var first_date = $("#single_cal2").val();
	var second_date = $("#single_cal3").val();
	$
	.ajax({
		url : '/crocheck/comparednsdomain',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.domainList);
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
	
	$
	.ajax({
		url : '/crocheck/comparednsdomain',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.domainList);
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
	if ($('#dnsdomainfirstdonut').length) {

		var echartPie = echarts.init(document
				.getElementById('dnsdomainfirstdonut'), theme);

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
					}
				}
			},
			calculable : true,
			series : [ {
				type : 'pie',
				radius : '55%',
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
	
	if ($('#dnsdomainseconddonut').length) {

		var echartPie = echarts.init(document
				.getElementById('dnsdomainseconddonut'), theme);

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
					}
				}
			},
			calculable : true,
			series : [ {
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
	}
}
function comparednsclient() {
	var first_date = $("#single_cal2").val();
	var second_date = $("#single_cal3").val();
	$
	.ajax({
		url : '/crocheck/comparednsclient',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.srcList);
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
	
	$
	.ajax({
		url : '/crocheck/comparednsclient',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.srcList);
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
	
	if ($('#dnsclientfirstdonut').length) {

		var echartPie = echarts.init(document
				.getElementById('dnsclientfirstdonut'), theme);

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
					}
				}
			},
			calculable : true,
			series : [ {
				type : 'pie',
				radius : '55%',
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
	
	if ($('#dnsclientseconddonut').length) {

		var echartPie = echarts.init(document
				.getElementById('dnsclientseconddonut'), theme);

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
					}
				}
			},
			calculable : true,
			series : [ {
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
	}
}

function compareddosdomain() {
	var first_date = $("#single_cal2").val();
	var second_date = $("#single_cal3").val();
	$
	.ajax({
		url : '/crocheck/compareddosdomain',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.domainList);
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
	
	$
	.ajax({
		url : '/crocheck/compareddosdomain',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.domainList);
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
	
	if ($('#ddosdomainfirstdonut').length) {

		var echartPie = echarts.init(document
				.getElementById('ddosdomainfirstdonut'), theme);

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
					}
				}
			},
			calculable : true,
			series : [ {
				type : 'pie',
				radius : '55%',
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
	
	if ($('#ddosdomainseconddonut').length) {

		var echartPie = echarts.init(document
				.getElementById('ddosdomainseconddonut'), theme);

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
					}
				}
			},
			calculable : true,
			series : [ {
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
	}
}

function compareddosclient() {
	var first_date = $("#single_cal2").val();
	var second_date = $("#single_cal3").val();
	$
	.ajax({
		url : '/crocheck/compareddosclient',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.srcList);
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
	
	$
	.ajax({
		url : '/crocheck/compareddosclient',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.srcList);
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
	if ($('#ddosclientfirstdonut').length) {

		var echartPie = echarts.init(document
				.getElementById('ddosclientfirstdonut'), theme);

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
					}
				}
			},
			calculable : true,
			series : [ {
				type : 'pie',
				radius : '55%',
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
	
	if ($('#ddosclientseconddonut').length) {

		var echartPie = echarts.init(document
				.getElementById('ddosclientseconddonut'), theme);

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
					}
				}
			},
			calculable : true,
			series : [ {
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
	}
}
function comparequery() {
	var first_date = $("#single_cal2").val();
	var second_date = $("#single_cal3").val();
	$
	.ajax({
		url : '/crocheck/comparednsquery',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.queryList);
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
	
	$
	.ajax({
		url : '/crocheck/comparednsquery',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.queryList);
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
	$
	.ajax({
		url : '/crocheck/compareddosquery',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.queryList);
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
	
	$
	.ajax({
		url : '/crocheck/compareddosquery',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.queryList);
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
	
	if ($('#comparequeryline').length) {

		var echartLine = echarts.init(document
				.getElementById('comparequeryline'), theme);

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

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

	var first_domain = [];
	var first_count = [];
	var first_pct = [];
	$.ajax({
		url : '/comparednsdomain',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.domainList);
				for (var i = 0; i < result.domainList.length; i++) {
					first_domain[i] = result.domainList[i].domain;
					first_count[i] = result.domainList[i].count;
					first_pct[i] = result.domainList[i].percentage;
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

	var second_domain = [];
	var second_count = [];
	var second_pct = [];

	$.ajax({
		url : '/comparednsdomain',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.domainList);
				for (var i = 0; i < result.domainList.length; i++) {
					second_domain[i] = result.domainList[i].domain;
					second_count[i] = result.domainList[i].count;
					second_pct[i] = result.domainList[i].percentage;
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
				data : first_domain
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
					value : first_count[0],
					name : first_domain[0]
				}, {
					value : first_count[1],
					name : first_domain[1]
				}, {
					value : first_count[2],
					name : first_domain[2]
				}, {
					value : first_count[3],
					name : first_domain[3]
				}, {
					value : first_count[4],
					name : first_domain[4]
				}, {
					value : first_count[5],
					name : first_domain[5]
				}, {
					value : first_count[6],
					name : first_domain[6]
				}, {
					value : first_count[7],
					name : first_domain[7]
				}, {
					value : first_count[8],
					name : first_domain[8]
				}, {
					value : first_count[9],
					name : first_domain[9]
				} ]
			} ]
		});
	}
	var dnsdomainfirst = document.getElementById("dnsdomainfirstlist");
	var domain_html = '';
	for (var i = 0; i < first_domain.length; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + (i + 1) + '</td>';
		domain_html += '<td>' + first_domain[i] + '</td>';
		domain_html += '<td>' + first_count[i] + '</td>';
		domain_html += '<td>' + first_pct[i] + '%</td>';
		domain_html += '</tr>';
	}
	dnsdomainfirst.innerHTML = domain_html;

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
				data : second_domain
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
					value : second_count[0],
					name : second_domain[0]
				}, {
					value : second_count[1],
					name : second_domain[1]
				}, {
					value : second_count[2],
					name : second_domain[2]
				}, {
					value : second_count[3],
					name : second_domain[3]
				}, {
					value : second_count[4],
					name : second_domain[4]
				}, {
					value : second_count[5],
					name : second_domain[5]
				}, {
					value : second_count[6],
					name : second_domain[6]
				}, {
					value : second_count[7],
					name : second_domain[7]
				}, {
					value : second_count[8],
					name : second_domain[8]
				}, {
					value : second_count[9],
					name : second_domain[9]
				} ]
			} ]
		});
	}
	var dnsdomainsecond = document.getElementById("dnsdomainsecondlist");
	domain_html = '';
	for (var i = 0; i < second_domain.length; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + (i + 1) + '</td>';
		domain_html += '<td>' + second_domain[i] + '</td>';
		domain_html += '<td>' + second_count[i] + '</td>';
		domain_html += '<td>' + second_pct[i] + '%</td>';
		domain_html += '</tr>';
	}
	dnsdomainsecond.innerHTML = domain_html;

}




function comparednsclient() {
	var first_date = $("#single_cal2").val();
	var second_date = $("#single_cal3").val();
	
	var first_src = [];
	var first_count = [];
	var first_pct = [];
	
	$.ajax({
		url : '/comparednsclient',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.srcList);
				for (var i = 0; i < result.srcList.length; i++) {
					first_src[i] = result.srcList[i].src_ip;
					first_count[i] = result.srcList[i].count;
					first_pct[i] = result.srcList[i].percentage;
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

	
	var second_src = [];
	var second_count = [];
	var second_pct = [];
	
	$.ajax({
		url : '/comparednsclient',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.srcList);
				for (var i = 0; i < result.srcList.length; i++) {
					second_src[i] = result.srcList[i].src_ip;
					second_count[i] = result.srcList[i].count;
					second_pct[i] = result.srcList[i].percentage;
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
				data : first_src
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
					value :first_count[0],
					name :first_src[0]
				}, {
					value :first_count[1],
					name :first_src[1]
				}, {
					value :first_count[2],
					name :first_src[2]
				}, {
					value :first_count[3],
					name :first_src[3]
				}, {
					value :first_count[4],
					name :first_src[4]
				}, {
					value :first_count[5],
					name :first_src[5]
				}, {
					value :first_count[6],
					name :first_src[6]
				}, {
					value :first_count[7],
					name :first_src[7]
				}, {
					value :first_count[8],
					name :first_src[8]
				}, {
					value :first_count[9],
					name :first_src[9]
				} ]
			} ]
		});
	}

	var dnsclientfirst = document.getElementById("dnsclientfirstlist");
	var domain_html = '';
	for (var i = 0; i < first_src.length; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + (i + 1) + '</td>';
		domain_html += '<td>' + first_src[i] + '</td>';
		domain_html += '<td>' + first_count[i] + '</td>';
		domain_html += '<td>' + first_pct[i] + '%</td>';
		domain_html += '</tr>';
	}
	dnsclientfirst.innerHTML = domain_html;
	
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
				data : second_src
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
					value : second_count[0],
					name : second_src[0]
				}, {
					value : second_count[1],
					name : second_src[1]
				}, {
					value : second_count[2],
					name : second_src[2]
				}, {
					value : second_count[3],
					name : second_src[3]
				}, {
					value : second_count[4],
					name : second_src[4]
				}, {
					value : second_count[5],
					name : second_src[5]
				}, {
					value : second_count[6],
					name : second_src[6]
				}, {
					value : second_count[7],
					name : second_src[7]
				}, {
					value : second_count[8],
					name : second_src[8]
				}, {
					value : second_count[9],
					name : second_src[9]
				} ]
			} ]
		});
	}
	var dnsclientsecond = document.getElementById("dnsclientsecondlist");
	var domain_html = '';
	for (var i = 0; i < second_src.length; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + (i + 1) + '</td>';
		domain_html += '<td>' + second_src[i] + '</td>';
		domain_html += '<td>' + second_count[i] + '</td>';
		domain_html += '<td>' + second_pct[i] + '%</td>';
		domain_html += '</tr>';
	}
	dnsclientsecond.innerHTML = domain_html;
	
}

function compareddosdomain() {
	var first_date = $("#single_cal2").val();
	var second_date = $("#single_cal3").val();
	
	var first_domain = [];
	var first_count = [];
	var first_pct = [];
	
	
	$.ajax({
		url : '/compareddosdomain',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.domainList.length; i++) {
					first_domain[i] = result.domainList[i].domain;
					first_count[i] = result.domainList[i].count;
					first_pct[i] = result.domainList[i].percentage;
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

	var second_domain = [];
	var second_count = [];
	var second_pct = [];
	
	
	$.ajax({
		url : '/compareddosdomain',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.domainList.length; i++) {
					second_domain[i] = result.domainList[i].domain;
					second_count[i] = result.domainList[i].count;
					second_pct[i] = result.domainList[i].percentage;
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
					value : first_count[0],
					name : first_domain[0]
				}, {
					value : first_count[1],
					name : first_domain[1]
				}, {
					value : first_count[2],
					name : first_domain[2]
				}, {
					value : first_count[3],
					name : first_domain[3]
				}, {
					value : first_count[4],
					name : first_domain[4]
				}, {
					value : first_count[5],
					name : first_domain[5]
				}, {
					value : first_count[6],
					name : first_domain[6]
				}, {
					value : first_count[7],
					name : first_domain[7]
				}, {
					value : first_count[8],
					name : first_domain[8]
				}, {
					value : first_count[9],
					name : first_domain[9]
				} ]
			} ]
		});
	}

	var ddosdomainfirst = document.getElementById("ddosdomainfirstlist");
	var domain_html = '';
	for (var i = 0; i < first_domain.length; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + (i + 1) + '</td>';
		domain_html += '<td>' + first_domain[i] + '</td>';
		domain_html += '<td>' + first_count[i] + '</td>';
		domain_html += '<td>' + first_pct[i] + '%</td>';
		domain_html += '</tr>';
	}
	ddosdomainfirst.innerHTML = domain_html;
	
	
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
					value : second_count[0],
					name : second_domain[0]
				}, {
					value : second_count[1],
					name : second_domain[1]
				}, {
					value : second_count[2],
					name : second_domain[2]
				}, {
					value : second_count[3],
					name : second_domain[3]
				}, {
					value : second_count[4],
					name : second_domain[4]
				}, {
					value : second_count[5],
					name : second_domain[5]
				}, {
					value : second_count[6],
					name : second_domain[6]
				}, {
					value : second_count[7],
					name : second_domain[7]
				}, {
					value : second_count[8],
					name : second_domain[8]
				}, {
					value : second_count[9],
					name : second_domain[9]
				} ]
			} ]
		});
	}
	var ddosdomainsecond = document.getElementById("ddosdomainsecondlist");
	domain_html = '';
	for (var i = 0; i < second_domain.length; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + (i + 1) + '</td>';
		domain_html += '<td>' + second_domain[i] + '</td>';
		domain_html += '<td>' + second_count[i] + '</td>';
		domain_html += '<td>' + second_pct[i] + '%</td>';
		domain_html += '</tr>';
	}
	ddosdomainsecond.innerHTML = domain_html;

}

function compareddosclient() {
	var first_date = $("#single_cal2").val();
	var second_date = $("#single_cal3").val();
	
	var first_src= [];
	var first_count = [];
	var first_pct = [];
	
	$.ajax({
		url : '/compareddosclient',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for (var i = 0; i < result.srcList.length; i++) {
					first_src[i] = result.srcList[i].domain;
					first_count[i] = result.srcList[i].count;
					first_pct[i] = result.srcList[i].percentage;
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

	var second_src = [];
	var second_count = [];
	var second_pct = [];
	
	$.ajax({
		url : '/compareddosclient',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.srcList);
				for (var i = 0; i < result.srcList.length; i++) {
					second_src[i] = result.srcList[i].domain;
					second_count[i] = result.srcList[i].count;
					second_pct[i] = result.srcList[i].percentage;
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
					value : first_count[0],
					name : first_src[0]
				}, {
					value : first_count[1],
					name : first_src[1]
				}, {
					value : first_count[2],
					name : first_src[2]
				}, {
					value : first_count[3],
					name : first_src[3]
				}, {
					value : first_count[4],
					name : first_src[4]
				}, {
					value : first_count[5],
					name : first_src[5]
				}, {
					value : first_count[6],
					name : first_src[6]
				}, {
					value : first_count[7],
					name : first_src[7]
				}, {
					value : first_count[8],
					name : first_src[8]
				}, {
					value : first_count[9],
					name : first_src[9]
				} ]
			} ]
		});
	}
	var ddosclientnfirst = document.getElementById("ddosclientnfirstlist");
	var domain_html = '';
	for (var i = 0; i < first_src.length; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + (i + 1) + '</td>';
		domain_html += '<td>' + first_src[i] + '</td>';
		domain_html += '<td>' + first_count[i] + '</td>';
		domain_html += '<td>' + first_pct[i] + '%</td>';
		domain_html += '</tr>';
	}
	ddosclientnfirst.innerHTML = domain_html;
	
	
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
					value : second_count[0],
					name : second_src[0]
				}, {
					value : second_count[1],
					name : second_src[1]
				}, {
					value : second_count[2],
					name : second_src[2]
				}, {
					value : second_count[3],
					name : second_src[3]
				}, {
					value : second_count[4],
					name : second_src[4]
				}, {
					value : second_count[5],
					name : second_src[5]
				}, {
					value : second_count[6],
					name : second_src[6]
				}, {
					value : second_count[7],
					name : second_src[7]
				}, {
					value : second_count[8],
					name : second_src[8]
				}, {
					value : second_count[9],
					name : second_src[9]
				} ]
			} ]
		});
	}
	var ddosclientsecond = document.getElementById("ddosclientsecondlist");
	domain_html = '';
	for (var i = 0; i < second_src.length; i++) {
		domain_html += '<tr>';
		domain_html += '<td>' + (i + 1) + '</td>';
		domain_html += '<td>' + second_src[i] + '</td>';
		domain_html += '<td>' + second_count[i] + '</td>';
		domain_html += '<td>' + second_pct[i] + '%</td>';
		domain_html += '</tr>';
	}
	ddosclientsecond.innerHTML = domain_html;
}
function comparequery() {
	var first_date = $("#single_cal2").val();
	var second_date = $("#single_cal3").val();
	
	var querydate = [];
	var dnsqueryfirst = [];
	var ddosqueryfirst = [];
	var dnsquerysecond = [];
	var ddosquerysecond = [];
	
	
	$.ajax({
		url : '/comparednsquery',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for(var i =0;i<result.queryList.length; i++){
					dnsqueryfirst[i] = result.queryList[i].count;
					querydate[i] = i;
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
		url : '/comparednsquery',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for(var i =0; i< result.queryList.length; i++){
					dnsquerysecond[i] = result.queryList[i].count;
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
		url : '/compareddosquery',
		data : {
			"date_start" : first_date
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for(var i =0; i<result.queryList.length; i++){
					ddosqueryfirst[i] = result.queryList[i].count;
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
		url : '/compareddosquery',
		data : {
			"date_start" : second_date,
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				for(var i =0; i<result.queryList.length;i++){
					ddosquerysecond[i] = result.queryList[i].count;
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

	if ($('#comparequeryline').length) {

		
		var echartLine = echarts.init(document
				.getElementById('comparequeryline'), theme);

		echartLine.setOption({
			tooltip : {
				trigger : 'axis'
			},
			legend : {
				x : 220,
				y : 40,
				data : [ first_date+'-dns', second_date+'-dns', first_date+'-ddos', second_date+'-ddos' ]
			},
			calculable : true,
			xAxis : [ {
				type : 'category',
				boundaryGap : false,
				data : querydate
			} ],
			yAxis : [ {
				type : 'value'
			} ],
			series : [ {
				name : first_date+'-dns',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : dnsqueryfirst
			}, {
				name : second_date+'-dns',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : dnsquerysecond
			}, {
				name : first_date + '-ddos',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : ddosqueryfirst
			}, {
				name : second_date + '-ddos',
				type : 'line',
				smooth : true,
				itemStyle : {
					normal : {
						areaStyle : {
							type : 'default'
						}
					}
				},
				data : ddosquerysecond
			}  ]
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

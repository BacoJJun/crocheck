var ajaxList = new Array();
var timerIdToast = null;
var waitingTime = 2000;
var loopCheck = 0;


function managementAjax(obj, name) {
    var jqXhr;
    
    if(!$.isArray(ajaxList[name])) {
	ajaxList[name] = new Array();
    }
    
    if(ajaxList[name].length) {
	jqXhr = ajaxList[name].shift();
	jqXhr.abort();
    }
    
    ajaxList[name].push(obj);
}

$(window).on("beforeunload", function() {
    for(var key in ajaxList) {
	for(i=0; i < ajaxList[key].length; i++) {
	    ajaxList[key][i].abort();
	}
    }
});	

function launchToast() {
    $.toast({heading: 'Warning',
	     text: '데이터를 가져오는 중입니다.',
	     position: 'bottom-left',
	     stack: false,
	     hideAfter: 2000});
}


$('body').ready(function() {
    var cpuChart;
    var diskChart;
    var memoryData;
    var packetData;
    var networkData;
    var refreshTime;
    var ajaxObj;
    var oldDate = "00:00:00";
	var oldDateRaw = null;
	
    setHeightForCol();

    timerIdToast = setTimeout(launchToast, waitingTime);
    ajaxObj = $.getJSON("/proc/dashboard.jsp").done(function(data) {
	refreshTime = parseInt(moment(data.sole.hhmmss).format('x')) + 1800000;
	initCPUChart(data.sole);
	initMemoryChart(data.bunch);
	initDiskChart(data.disk, data.sole);
	initPacketChart(data.packet);
	initNetworkChart(data.network);
	chartLoop();
    }).always(function(data){
	clearTimeout(timerIdToast);
    });
    
    managementAjax(ajaxObj, "dashboardJson");

    $(document).on('click', '#pharming-list table tr', function(e) {
	    //console.log("Domain Delete ModalBox");
	    var target = $(this);
	    var seq = target.data('seq');
	    var search = target.data('search');
	    var gubun = target.data('gubun');
	    var f = document.goLink;
	    $('#pharming-list input[name="search"]').val(search);
	    $('#pharming-list input[name="seq"]').val(seq);
	    $('#pharming-list input[name="gubun"]').val(gubun);
	    f.action = "alerts.jsp";
	    f.method = "post";
	    f.submit();

	    e.stopPropagation();
	});

	$(document).on('click', '#pharming-client-list table tr', function(e) {
	    //console.log("Domain Delete ModalBox");
	    var target = $(this);
	    var seq = target.data('seq');
	    var search = target.data('search');
	    var gubun = target.data('gubun');
	    var f = document.goLinks;
	    $('#pharming-client-list input[name="search"]').val(search);
	    $('#pharming-client-list input[name="seq"]').val(seq);
	    $('#pharming-client-list input[name="gubun"]').val(gubun);
	    f.action = "alerts.jsp";
	    f.method = "post";
	    f.submit();

	    e.stopPropagation();
	});

    function initCPUChart(data) {
	var idle_column = ['Idle'],
            iowait_column = ['IOWait'],
            system_column = ['System'],
            user_column = ['User'];

	idle_column.push(data.cpu_idle_pct);
	iowait_column.push(data.cpu_iowait_pct);
	system_column.push(data.cpu_sys_pct);
	user_column.push(data.cpu_user_pct);

	// CPU Chart
	cpuChart = c3.generate({
	    data: {
		columns: [
		    idle_column, iowait_column, system_column, user_column
		],
		order: null,
		type : 'donut'
	    },
	    bindto: '#c3-cpu-chart'
	});

	setHeightForChart(cpuChart);
    }

    function initMemoryChart(data) {
	var date = $.map(data, function (a) {
	    return moment(a.hhmmss).format('HH:mm:ss');
	});
	date.unshift('x');

	var usage = $.map(data, function (a) {
	    return a.mem_use * 0.000000001;
	});
	usage.unshift('사용량');

	var percentage = $.map(data, function (a) {
	    return a.mem_use_pct;
	});

	var memoryChart = c3.generate({
	    data: {
		x: 'x',
		xFormat: '%H:%M:%S',
		columns: [date, usage],
		type: 'bar',
		groups: [['사용량']],
		order: null,
		color: function(color, d) {
		    return colorizeForDiskChart(color, d);
		}
		//labels: {
		//  format: {
		//    사용량: function (v, id, i, j) {
		//      return Math.round(percentage[i]).toString() + '%'
		//    }
		//  }
		//}
	    },
	    bar: {
		width: {
		    ratio: 0.5
		}
	    },
	    color: {
		pattern: ['#2ca02c']
	    },
	    axis: {
		x: {
		    type: 'category',
		    tick: {
			format: '%H:%M:%S',
			centered: true
		    }
		},
		y: {
		    max : Math.round(data[data.length -1].mem_total * 0.000000001),
		    label : '(GB)'
		}
	    },
	    tooltip: {
		format: {
		    value: function (value, ratio, id, d) {
			return numberWithCommas(Math.round(value * 1000)) + 'MB';
		    }
		}
	    },
	    legend: {
		show: false
	    },
	    bindto: '#c3-memory-chart'
	});

	setHeightForChart(memoryChart);
	memoryData = [memoryChart, date, usage];
    }

    function initDiskChart(data, sole) {
	var usage = ['value'];
	$.each(data, function(index, value) {
	    usage.push(value);
	});

	diskChart = c3.generate({
	    bar: {
		width: 30
	    },
	    padding: {
		left: 60
	    },
	    data: {
		x: 'x',
		columns:
		[
		    ['x', sole.disk_vol1_mount, sole.disk_vol2_mount, sole.disk_vol3_mount, sole.disk_vol4_mount], usage
		],
		type: 'bar',
		color: function(color, d) {
		    return colorizeForDiskChart(color, d);
		},
		labels: {
		    format: {
			value: function (v, id, i, j)  {
			    return Math.round(v).toString() + '%'
			}
		    }
		}
	    },
	    axis: {
		rotated: true,
		x: {
		    type: 'category'
		},
		y: {
		    max: 100,
		    tick: {
			values: [0, 25, 50, 75, 100]
		    }
		}
	    },
	    tooltip: {
		grouped: false,
		format: {
		    value: function (value, ratio, id, d) {
			var value1 = numberWithCommas(Math.round(sole.disk_vol1_usage_byte * 0.000001)) + 'MB';
			var value2 = numberWithCommas(Math.round(sole.disk_vol2_usage_byte * 0.000001)) + 'MB';
			var value3 = numberWithCommas(Math.round(sole.disk_vol3_usage_byte * 0.000001)) + 'MB';
			var total1 = '/' + numberWithCommas(Math.round(sole.disk_vol1_total_byte * 0.000001)) + 'MB';
			var total2 = '/' + numberWithCommas(Math.round(sole.disk_vol2_total_byte * 0.000001)) + 'MB';
			var total3 = '/' + numberWithCommas(Math.round(sole.disk_vol3_total_byte * 0.000001)) + 'MB';
			var total = 0;
			if (d == 0) {total = value1.concat(total1);}
			else if (d == 1) {total = value2.concat(total2);}
			else {total = value3.concat(total3);}
			return total;
		    }
		}
	    },
	    legend: {
		show: false
	    },
	    bindto: '#c3-disk-chart'
	});

	setHeightForChart(diskChart);

    }

    function initPacketChart(data) {
	var date, rx, rx_byte;

	date = $.map(data, function (a) {
	    return moment(a.hhmmss*1000).format('HH:mm:ss');
	});
	date.unshift('x');
	
	rx = $.map(data, function (a) {
	    return a.rx;
	});
	rx.unshift('RX(패킷)');

	rx_byte = $.map(data, function (a) {
	    return a.rx_byte;
	});

	rx_byte.unshift('RX(바이트)');

	var packetChart = c3.generate({
	    data: {
		x: 'x',
		xFormat: '%H:%M:%S',
		columns: [date, rx, rx_byte],
		type: 'line',
		types: {
			'RX(MB)': 'bar'
		},
		axes: {
			'RX(1000패킷)': 'y',
			'RX(MB)': 'y2'
		},
		colors: function(color, d) {
		},
		color: function(color, d) {
		    if (d.value == 0) {
			return '#D8241F';
		    } else {
			return d3.rgb(color);
		    }
		}
	    },
	    axis : {
		x : {
		    type : 'category',
		    tick: {
			format: '%H:%M:%S',
			centered: true,
			count: 5,
			culling: {
			    max: 3
			}
		    }
		},
		y : {
			label : '(1000Pkts)'
		},
		y2 : {
			label : '(MB)',
			show: true
		}
	    },
	    /*		
		tooltip: {
			format: {
				value: function(value, ratio, id, d) {
					return numberWithCommas(Math.round(value * 1048576)) + 'MB';
				}
			}
		},
		*/
	    legend: {
		//show: false
		show: true
	    },
	    bindto: '#c3-packet-chart'
	});
	setHeightForChart(packetChart);
	packetData = [packetChart, date, rx, rx_byte];
    }
	
    function initNetworkChart(data) {
	var date, normal, abnormal, block;
	
	date = $.map(data, function(item) {
	    return moment(item.hhmmss * 1000).format('HH:mm:ss');
	});
	date.unshift('x');

	normal = $.map(data, function (a) {
	    return a.normal;
	});
	normal.unshift('정상');

	abnormal = $.map(data, function (a) {
	    return a.abnormal;
	});
	abnormal.unshift('파밍의심');

	block = $.map(data, function (a) {
	    return a.block;
	});
	block.unshift('파밍');
	

	var networkChart = c3.generate({
	    data: {
		x: 'x',
		xFormat: '%H:%M:%S',
		columns: [date, normal, abnormal, block]
	    },
		color: {
			pattern: ['#1f77b4', '#ff7f0e', '#ef1010']
		},
	    axis : {
		x: {
		    type : 'category',
		    tick: {
			format: '%H:%M:%S',
			centered: true
		    }
		}
	    },
	    legend: {
		//show: false
		show: true
	    },
	    bindto: '#c3-network-chart'
	});

	setHeightForChart(networkChart);
	networkData = [networkChart, date, normal, abnormal, block];
    }

    function chartLoop() {
	setTimeout(function () {
    	    timerIdToast = setTimeout(launchToast, waitingTime);
	    ajaxObj = $.getJSON(location.origin + '/proc/dashboard_renew.jsp').done(function(data) {
    		if(refreshTime < moment(data.sole.hhmmss).format('x')){
    		    location.href='/dashboard';
    		}
		chartLoop_cpu(data.sole);
		chartLoop_memory(data.sole);
		chartLoop_disk(data.disk);
		chartLoop_packet(data.packet);
		chartLoop_network(data.network);
		if(loopCheck == 1){
		if($('#pharming-list').length > 0 || $('#warning-list').length > 0) {
		    ajaxObj = $.getScript(location.origin + '/js/dashboard_renew.jsp');
		    managementAjax(ajaxObj, "dashboardHtml");
		}
		}
	    }).always(function(data){
		if(typeof data.sole === 'undefined')
		    location.href='/loginform';
		
		clearTimeout(timerIdToast);
	    });
	    managementAjax(ajaxObj, "dashboardJson");
	    if(loopCheck == 60){
	    	loopCheck =0;
	    }else{
	    	loopCheck++;
	    }
	    chartLoop();
	}, 1000);
    }

    function chartLoop_cpu (data) {
	var idle_column = ['Idle'],
            iowait_column = ['IOWait'],
            system_column = ['System'],
            user_column = ['User'];

	idle_column.splice(1,1,data.cpu_idle_pct);
	iowait_column.splice(1,1,data.cpu_iowait_pct);
	system_column.splice(1,1,data.cpu_sys_pct);
	user_column.splice(1,1,data.cpu_user_pct);

	cpuChart.load({
	    columns: [
		idle_column, iowait_column, system_column, user_column
	    ]
	});
    }

    function chartLoop_memory (data) {
	var chart = memoryData[0];
	var date = memoryData[1];
	var usage = memoryData[2];
	var newDate = moment(data.hhmmss).format('HH:mm:ss');
	var percentage = Math.round(data.mem_use_pct).toString() + '%';
	var newDateRaw = data.hhmmss;
	
	// plus one second to newDate from oldDate(last value).
	if ( newDate <= oldDate ) {
		newDate = moment(oldDateRaw).add(1,'seconds').format('HH:mm:ss');
		//newDateRaw = moment(oldDateRaw,moment.ISO_8601).add(1,'seconds').toString();
		newDateRaw = moment(oldDateRaw).add(1,'seconds').format('YYYY-MM-DD HH:mm:ss.SSSSSSZ');
	}
	oldDate = newDate;
	oldDateRaw = newDateRaw.toString();
	
	date.splice(1,1);
	date.push(newDate);

	usage.splice(1,1);
	usage.push(data.mem_use * 0.000000001);

	chart.load({
	    groups: ['사용량'],
	    columns: [date, usage],
	    color: function(color, d) {
		return colorizeForDiskChart(color, d);
	    }
	});

	memoryData = [chart, date, usage];
    }

    function chartLoop_disk (data) {
	var dataFlow = ['value'];

	$.each(data, function(index, value) {
	    dataFlow.push(value);
	});

	diskChart.load({
	    columns: [dataFlow]
	});
    }

    function chartLoop_packet (data) { //네트워크 차트

	var chart = packetData[0];
	var date = packetData[1];
	var rx = packetData[2];
	//var tx = packetData[3];
	var rx_byte = packetData[3];
	var newDate = moment(data.hhmmss * 1000).format('HH:mm:ss');

	date.splice(1,1);
	date.push(newDate);

	rx.splice(1,1);
	rx.push(data.rx);

	//tx.splice(1,1);
	//tx.push(data.tx);
	
	rx_byte.splice(1,1);
	rx_byte.push(data.rx_byte);
	
	chart.load({
	    columns: [date, rx, rx_byte]
	});
	/*
	chart.flow({
		columns: [
			['x',date[date.length-1]],
			[rx[0],rx[rx.length-1]],
			[rx_byte[0],rx_byte[rx_byte.length-1]]
		],
		duration: 1000
    });
	*/
	
	packetData = [chart, date, rx, rx_byte];
	//packetData = [chart, date[date.length-1], rx[rx.length-1], rx_byte[rx_byte.length-1]];
    }

    function chartLoop_network(data) { //패킷 차트
	var chart = networkData[0];
	var date = networkData[1];
	var normal = networkData[2];
	var abnormal = networkData[3];
	//var harmful = networkData[4];
	//var block = networkData[5];
	var block = networkData[4];
	var newDate = moment(data.hhmmss * 1000).format('HH:mm:ss');

	if (newDate == date[4]) { return false }

	date.splice(1,1);
	date.push(newDate);

	normal.splice(1,1);
	normal.push(data.normal);

	abnormal.splice(1,1);
	abnormal.push(data.abnormal);

	block.splice(1,1);
	block.push(data.block);

	chart.load({
	    columns: [date, normal, abnormal, block]
	});

	networkData = [chart, date, normal, abnormal, block];
    }

    function setHeightForChart(chart) {
	var newHeight = $('.chart.section').height() - $('.chart.section .home-section-title').outerHeight(true) - 15;
	chart.resize({height:newHeight});
    }

    function setHeightForCol() {
	var borderWidth = $('#home-content [class*="col-"].section').css('border-top-width');
	var newHeight = ($(window).height() - $('header').outerHeight(true))/2 - parseInt(borderWidth) * 3;
	$('#home-content [class*="col-"].section').height(newHeight);
    }

    function numberWithCommas(x) {
	return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    }

    // 지금은 용량을 직접 하드코딩함, 추후 데이터 모두 들어오면 비율 계산해서 함.
    function colorizeForDiskChart(color, d) {
	if (d.value >= 90) {
	    return d3.rgb('#D8241F');
	} else if (d.value >= 80) {
	    return d3.rgb('#E44F3B');
	} else if (d.value >= 70) {
	    return d3.rgb('#ED6A51');
	} else if (d.value >= 60) {
	    return d3.rgb('#FDA100');
	} else if (d.value >= 50) {
	    return d3.rgb('#F8DB5A');
	} else {
	    return d3.rgb('#719EA1')
	}
    }
});

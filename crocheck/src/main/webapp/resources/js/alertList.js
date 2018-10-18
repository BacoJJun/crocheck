$(document).ready(function() {
	alertValueList();
	button_event();

});
function init_range(alertList){
	$("#cpu_range").ionRangeSlider({
		hide_min_max : true,
		keyboard : true,
		min : 0,
		max : 100,
		from : alertList.cpu_warning,
		to : alertList.cpu_critical,
		type : 'double',
		step : 5,
		grid : true
	});

	$("#memory_range").ionRangeSlider({
		hide_min_max : true,
		keyboard : true,
		min : 0,
		max : 100,
		from : alertList.memory_warning,
		to : alertList.memory_critical,
		type : 'double',
		step : 5,
		grid : true
	});

	$("#disk_range").ionRangeSlider({
		hide_min_max : true,
		keyboard : true,
		min : 0,
		max : 100,
		from : alertList.disk_warning,
		to : alertList.disk_critical,
		type : 'double',
		step : 5,
		grid : true
	});

	$("#dns_range").ionRangeSlider({
		hide_min_max : true,
		keyboard : true,
		min : 0,
		max : 60000,
		from : alertList.dns_warning,
		to : alertList.dns_critical,
		type : 'double',
		step : 100,
		grid : true
	});

	$("#ddos_range").ionRangeSlider({
		hide_min_max : true,
		keyboard : true,
		min : 0,
		max : 5000,
		from : alertList.ddos_warning,
		to : alertList.ddos_critical,
		type : 'double',
		step : 50,
		grid : true
	});

}


function alertValueList() {
	$.ajax({
		url : '/alertList',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				init_range(result.alertList);
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
function button_event(){
	$("#btn-save").click(function(){
		
		var cpu_warning = document.getElementsByClassName('irs-from')[0].innerText;
		var memory_warning = document.getElementsByClassName('irs-from')[1].innerText;
		var disk_warning = document.getElementsByClassName('irs-from')[2].innerText;
		var dns_warning = document.getElementsByClassName('irs-from')[3].innerText;
		var ddos_warning = document.getElementsByClassName('irs-from')[4].innerText;
		var cpu_critical = document.getElementsByClassName('irs-to')[0].innerText;
		var memory_critical = document.getElementsByClassName('irs-to')[1].innerText;
		var disk_critical = document.getElementsByClassName('irs-to')[2].innerText;
		var dns_critical = document.getElementsByClassName('irs-to')[3].innerText;
		var ddos_critical = document.getElementsByClassName('irs-to')[4].innerText;
		
		console.log(cpu_warning);
		console.log(cpu_critical);
		
		$.ajax({
			url : '/updatealertvalue',
			data : {
				"cpu_warning" : cpu_warning,
				"cpu_critical" : cpu_critical,
				"memory_warning" : memory_warning,
				"memory_critical" : memory_critical,
				"disk_warning" : disk_warning,
				"disk_critical" : disk_critical,
				"dns_warning" : dns_warning,
				"dns_critical" : dns_critical,
				"ddos_warning" : ddos_warning,
				"ddos_critical" : ddos_critical
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					setTimeout(function(){
						location.reload();
					});
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
		
		
	});
	
	
}
$(document).ready(function() {
	alertValueList();
	button_event();
	

});
function alertValueList() {
	
	var cpu_warning = document.getElementById("cpu_warning");
	var memory_warning =  document.getElementById("memory_warning");
	var disk_warning = document.getElementById("disk_warning");
	var dns_warning =  document.getElementById("dns_warning");
	var ddos_warning = document.getElementById("ddos_warning");
	var cpu_critical =  document.getElementById("cpu_critical");
	var memory_critical =  document.getElementById("memory_critical");
	var disk_critical = document.getElementById("disk_critical");
	var dns_critical =  document.getElementById("dns_critical");
	var ddos_critical =  document.getElementById("ddos_critical");
	
	$.ajax({
		url : '/alertList',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.alertList);
				cpu_warning.value = result.alertList.cpu_warning;
				memory_warning.value = result.alertList.memory_warning;
				disk_warning.value = result.alertList.disk_warning;
				dns_warning.value = result.alertList.dns_warning;
				ddos_warning.value = result.alertList.ddos_warning;
				cpu_critical.value = result.alertList.cpu_critical;
				memory_critical.value = result.alertList.memory_critical;
				disk_critical.value = result.alertList.disk_critical;
				dns_critical.value = result.alertList.dns_critical;
				ddos_critical.value = result.alertList.ddos_critical;
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
	$("#alert_save").click(function(){
		
		var cpu_warning = document.getElementById("cpu_warning").value;
		var memory_warning =  document.getElementById("memory_warning").value;
		var disk_warning = document.getElementById("disk_warning").value;
		var dns_warning =  document.getElementById("dns_warning").value;
		var ddos_warning = document.getElementById("ddos_warning").value;
		var cpu_critical =  document.getElementById("cpu_critical").value;
		var memory_critical =  document.getElementById("memory_critical").value;
		var disk_critical = document.getElementById("disk_critical").value;
		var dns_critical =  document.getElementById("dns_critical").value;
		var ddos_critical =  document.getElementById("ddos_critical").value;
		
	
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
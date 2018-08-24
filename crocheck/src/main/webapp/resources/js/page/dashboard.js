$( document ).ready(function() {
	var cpuChart;
	initSystemStatus();
	chartLoop();
});

function chartLoop(){
	initCpuLoop();
	//setTimeout(chartLoop(),1000);
}


function initCpuLoop(){
	var data = [];
	var jsonDate = $.ajax({
		url : '/crocheck/applianceStatus'
			, type : 'post'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
							data[0] = result.applianceStatus[9].cpu_idle_pct;
							data[1] = result.applianceStatus[9].cpu_iowait_pct;
							data[2] = result.applianceStatus[9].cpu_sys_pct;
							data[3] = result.applianceStatus[9].cpu_user_pct;		
							console.log(result.applianceStatus[9].hhmmss);
					}else{
						alert(result.errorMsg);
					}
			}
			, error : function(request){
				alert('error!'); 
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
			}
		});

	cpuChart.load({
	    columns: [
			['Idle', data[0]],
            ['IOWait', data[1]],
            ['System', data[2]],
            ['User',data[3]]
	    ]
	});
}
function initSystemStatus(){
	var data = [];
 
	
	var jsonDate = $.ajax({
		url : '/crocheck/applianceStatus'
			, type : 'post'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
						for(var i =0; i< result.applianceStatus.length;i++){
							data[0] = result.applianceStatus[9].cpu_idle_pct;
							data[1] = result.applianceStatus[9].cpu_iowait_pct;
							data[2] = result.applianceStatus[9].cpu_sys_pct;
							data[3] = result.applianceStatus[9].cpu_user_pct;		
							console.log(result.applianceStatus[9].hhmmss);
							}
					}else{
						alert(result.errorMsg);
					}
			}
			, error : function(request){
				alert('error!'); 
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
			}
		});
	cpuChart = c3.generate({
		 data: {
				columns: [
					['Idle', data[0]],
		            ['IOWait', data[1]],
		            ['System', data[2]],
		            ['User',data[3]]
				],
	       type : 'donut',

	   },
	   donut: {
	   },
	   bindto: '#c3-cpu-chart'
	});	
	
}

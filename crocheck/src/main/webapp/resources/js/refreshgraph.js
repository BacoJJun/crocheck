window.onload = function () {

var dps = [];
var dps2 = [];
var chart = new CanvasJS.Chart("chartContainer", {
	exportEnabled: true,
	axisY: {
		includeZero: false
	},
	data: [{
		type: "spline",
		markerSize: 0,
		dataPoints: dps 
	},{
		type: "spline",
		markerSize: 0,
		dataPoints: dps2
	}]
});

var xVal = 0;
var yVal = 100;
var yVal2 = 150;
var updateInterval = 1000;
var dataLength = 50; // number of dataPoints visible at any point

var updateChart = function (count) {
	count = count || 1;
	// count is number of times loop runs to generate random dataPoints.
		xVal = new Date();
		var jsonData = $.ajax({
			url : '/crocheck/SystemStatus'
				, type : 'post'
				, dataType : 'json'
				, async : false
				, success : function(result){
						if(result.result == 'success'){
							yVal =  result.systemStatus[0].cpu_sys_pct.toFixed(0) * 100;
							yVal2 = result.systemStatus[0].cpu_user_pct.toFixed(0) * 100;
							//cpu_iowait.innerText =  result.systemStatus[0].cpu_iowait_pct.toFixed(1) +"%";

						}else{
							alert(result.errorMsg);
						}
				}
				, error : function(request){
					alert('error!'); 
					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
				}
		});
		dps.push({
			x: xVal,
			y: yVal
		});
      		dps2.push({
			x: xVal,
			y: yVal2
		});
	
	if (dps.length > dataLength) {
		dps.shift();
	}
  	if (dps2.length > dataLength) {
		dps2.shift();
	}
	chart.render();
};

updateChart(dataLength); 
setInterval(function(){ updateChart() }, updateInterval); 

}
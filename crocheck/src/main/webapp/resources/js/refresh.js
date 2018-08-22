$( document ).ready(function() {
	charLoop();
	barLoop();
});
function barLoop(){
	barChart();
	setTimeout(barLoop, 5000);
};
function charLoop() {
	getSystemInfo();
	getPharmingDomain();
	getPharmingDeparture();
	getPharmingNowCount();
	getPharmingDayCount();
// getLiveDomain();
	setTimeout(charLoop, 1000);

};
function getSystemInfo(){
	var cpu_idle = document.getElementById("cpu_idle");
    var cpu_sys = document.getElementById("cpu_sys");
    var cpu_user = document.getElementById("cpu_user");
    var cpu_iowait = document.getElementById("cpu_iowait");
    var mem_percentage = document.getElementById("mem_percentage");
    var mem_total = document.getElementById("mem_total");

  var bytes_rx_total = document.getElementById("bytes_rx_total"); var
  pkts_rx_total = document.getElementById("pkts_rx_total"); var disk1 =
  document.getElementById("disk1"); var disk2 =
  document.getElementById("disk2"); var disk3 =
  document.getElementById("disk3");
 
    
	$.ajax({
		url : '/crocheck/SystemStatus'
			, type : 'post'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
						cpu_idle.innerText = "IDLE : " + result.systemStatus[0].cpu_idle_pct.toFixed(1) + "%";
						cpu_sys.innerText =  result.systemStatus[0].cpu_sys_pct.toFixed(1) + "%";
						cpu_user.innerText = result.systemStatus[0].cpu_user_pct.toFixed(1) + "%";
						cpu_iowait.innerText =  result.systemStatus[0].cpu_iowait_pct.toFixed(1) +"%";
						mem_total.innerHTML =  Math.floor(result.systemStatus[0].mem_use) + '</br>' +"/"+  Math.floor(result.systemStatus[0].mem_total);
						mem_percentage.innerText = ( Math.floor( ( result.systemStatus[0].mem_use/1024/1024/1024) / ( result.systemStatus[0].mem_total /1024/1024/1024) ) * 100)+"%";

						bytes_rx_total.innerText = "rx_byes : " + result.systemStatus[0].bytes_rx_total;
						pkts_rx_total.innerText = "rx : " + result.systemStatus[0].pkts_rx_total; 
						disk1.innerHTML = '<p>' +  result.systemStatus[0].disk_vol1_mount  +' : ' + result.systemStatus[0].disk_vol1_usage_pct.toFixed(1) + "%" + '</p>';
						disk2.innerHTML = '<p>' +  result.systemStatus[0].disk_vol2_mount  +' : ' + result.systemStatus[0].disk_vol2_usage_pct.toFixed(1) + "%" + '</p>';
						disk3.innerHTML = '<p>' +  result.systemStatus[0].disk_vol3_mount  +' : ' + result.systemStatus[0].disk_vol3_usage_pct.toFixed(1) + "%" + '</p>';
 
				
					}else{
						alert(result.errorMsg);
					}
			}
			, error : function(request){
				alert('error!'); 
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
			}
	});
};
function getLiveDomain(){
    $('#userTable').dataTable({
        pageLength: 3,
        bPaginate: true,
        bLengthChange: true,
        lengthMenu : [ [ 3, 5, 10, -1 ], [ 3, 5, 10, "All" ] ],
        bAutoWidth: false,
        processing: true,
        ordering: true,
        serverSide: false,
        searching: true,
        ajax : {
            "url":"/crocheck/alertLiveDomain",
            "type":"POST",
            "data": function (d) {
                d.userStatCd = "NR";
            }
        },
        columns : [
            {data: "email"},
            {data: "fullNmKr"},
            {data: "userStatCd"},
            {data: "superUser"}
        ]

    });
};
function getPharmingNowCount(){
	var nowPharmingList = document.getElementById("nowPharmingList");
	var hourPharmingList = document.getElementById("hourPharmingList");
	
	$.ajax({
		url : '/crocheck/nowPharmingList'
			, type : 'post'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
								nowPharmingList.innerText = result.nowPharmingList[0].min_pharming + " / " + result.nowPharmingList[0].min_suspicion + " / " + result.nowPharmingList[0].min_allcount;
								hourPharmingList.innerText = result.nowPharmingList[0].hour_pharming + " / " + result.nowPharmingList[0].hour_suspicion + " / " + result.nowPharmingList[0].hour_allcount;
					}else{
						alert(result.errorMsg);
					}
			}
			, error : function(request){
				alert('error!'); 
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
			}
	});
};
function getPharmingDayCount(){
	var daypharmingList = document.getElementById("dayPharmingList");
	var yesterdayPharmingList = document.getElementById("yesterdayPharmingList");
	
	$.ajax({
		url : '/crocheck/dayPharmingList'
			, type : 'post'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
						daypharmingList.innerText = result.dayPharmingList[0].pharming + " / " + result.dayPharmingList[0].suspicion + " / " + result.dayPharmingList[0].today_allcount;
						yesterdayPharmingList.innerText = result.dayPharmingList[0].yesterday_pharming + " / " + result.dayPharmingList[0].yesterday_suspicion + " / " + result.dayPharmingList[0].yesterday_allcount;
					}else{
						alert(result.errorMsg);
					}
			}
			, error : function(request){
				alert('error!'); 
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
			}
	});
};
	function getPharmingDomain(){
		var show_Domain = document.getElementById("show_domain");

		$.ajax({
			url : '/crocheck/alertLiveDomain'
				, type : 'post'
				, dataType : 'json'
				, async : false
				, success : function(result){
						if(result.result == 'success'){
							var domain_html = ' ';
								for( var i = 0 ; i< result.pharmingDomainList.length;i++){
									domain_html += '<tr> <td>';
									domain_html += result.pharmingDomainList[i].domain + '</td>';
									domain_html += '<td>' + result.pharmingDomainList[i].count + '</td></tr>'; 
								}
								show_Domain.innerHTML = domain_html;					
						}else{
							alert(result.errorMsg);
						}
				}
				, error : function(request){
					alert('error!'); 
					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
				}
		});
	};
	
	function getPharmingDeparture(){
		var show_Departure = document.getElementById("show_departure");

		$.ajax({
			url : '/crocheck/alertLiveDeparture'
				, type : 'post'
				, dataType : 'json'
				, async : false
				, success : function(result){
						if(result.result == 'success'){
							var departure_html = ' ';
								for( var i = 0 ; i< result.pharmingDepartureList.length;i++){
									departure_html += '<tr> <td>';
									departure_html += result.pharmingDepartureList[i].domain + '</td>';
									departure_html += '<td>' + result.pharmingDepartureList[i].count + '</td></tr>'; 
								}
								show_Departure.innerHTML = departure_html;					
						}else{
							alert(result.errorMsg);
						}
				}
				, error : function(request){
					alert('error!'); 
					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
				}
		});
	};
	
	function barChart(){
	        var data=[];
			$.ajax({
				url : '/crocheck/dayPacketList'
					, type : 'post'
					, dataType : 'json'
					, async : false
					, success : function(result){
							if(result.result == 'success'){
								for( var i = 0 ; i< result.daypacketList.length;i++){
										data[i] = result.daypacketList[i].today_count;
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
		 try {
			    // bar chart
			    var ctx = document.getElementById("barChart");
			    if (ctx) {
			      ctx.height = 200;
			      var myChart = new Chart(ctx, {
			        type: 'bar',
			        defaultFontFamily: 'Poppins',
			        data: {
			          labels: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11","12","13","14","15","16","17","18","19","20","21","22","23","24"],
			          datasets: [
			            {
			              label: "Today Packet",
			              data: data
			              ,borderColor: "rgba(0, 123, 255, 0.9)",
			              borderWidth: "0",
			              backgroundColor: "rgba(0, 123, 255, 0.5)",
			              fontFamily: "Poppins"
			            },
			            {
			              label: "Yesterday Packet",
			              data: [28, 48, 40, 19, 86, 27, 90],
			              borderColor: "rgba(0,0,0,0.09)",
			              borderWidth: "0",
			              backgroundColor: "rgba(0,0,0,0.07)",
			              fontFamily: "Poppins"
			            }
			          ]
			        },
			        options: {
			          legend: {
			            position: 'top',
			            labels: {
			              fontFamily: 'Poppins'
			            }

			          },
			          scales: {
			            xAxes: [{
			              ticks: {
			                fontFamily: "Poppins"

			              }
			            }],
			            yAxes: [{
			              ticks: {
			                beginAtZero: true,
			                fontFamily: "Poppins"
			              }
			            }]
			          }
			        }
			      });
			    }


			  } catch (error) {
			    console.log(error);
			  }

	  }
	
	
	
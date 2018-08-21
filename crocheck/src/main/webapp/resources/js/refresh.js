$( document ).ready(function() {
	charLoop();

});
function charLoop() {
	getSystemInfo();
	getPharmingDomain();
	getPharmingDeparture();
	getPharmingNowCount();
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
	var yesterdayPharmingList = document.getElementById("yesterdayPharmingList");
	
	$.ajax({
		url : '/crocheck/nowPharmingList'
			, type : 'post'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
								nowPharmingList.innerText = result.nowPharmingList[0].min_pharming + " / " + result.nowPharmingList[0].min_suspicion + " / " + result.nowPharmingList[0].min_allcount;
								yesterdayPharmingList.innerText = result.nowPharmingList[0].hour_pharming + " / " + result.nowPharmingList[0].hour_suspicion + " / " + result.nowPharmingList[0].hour_allcount;
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
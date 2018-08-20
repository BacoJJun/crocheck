$( document ).ready(function() {
	charLoop();

});
function charLoop() {
	getSystemInfo();
	getPharmingDomain();
	getPharmingDeparture();
//	getLiveDomain();
	setTimeout(charLoop, 1000);

};
function getSystemInfo(){
	var cpu_idle = document.getElementById("cpu_idle");
    var cpu_sys = document.getElementById("cpu_sys");
    var cpu_user = document.getElementById("cpu_user");
    var cpu_iowait = document.getElementById("cpu_iowait");
    var mem_percentage = document.getElementById("mem_percentage");
    var mem_total = document.getElementById("mem_total");
    
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
						mem_total.innerText =  Math.floor(result.systemStatus[0].mem_use) + "/"+  Math.floor(result.systemStatus[0].mem_total);
						mem_percentage.innerText = ( Math.floor( ( result.systemStatus[0].mem_use/1024/1024/1024) / ( result.systemStatus[0].mem_total /1024/1024/1024) ) * 100)+"%";
				
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
$( document ).ready(function() {
	charLoop();

});
function charLoop() {
	getSystemInfo();
	getPharmingDomain();
	
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
						
						console.log(result.systemStatus[0]);
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
			url : '/crocheck/AlertLiveDomain'
				, type : 'post'
				, dataType : 'json'
				, async : false
				, success : function(result){
						if(result.result == 'success'){
							var domain_html = '';
							alert(result.pharmingDomainList.length);
								for( var i = 0 ; i< result.pharmingDomainList.length;i++){
									domain_html += '<tr> <td>';
									domain_html += result.pharmingDomainList[i].domain + '</td>';
									domain_html += '<td>' + result.pharmingDomainList[i].result2 + '</td>';
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
$(document).ready(function() {
	timecheck();
	alert_view();
});
function alert_view(){
	alertList();
	alert_click_event();
}

function alert_click_event(){
	$("#alertList li").click(function(){
		var alertNo = $(this).attr('value');
		readalertMessage(alertNo);
	});
	$("#allread").click(function(){
		readallMessage();
	});
}
function readalertMessage(alertNo){
	$.ajax({
		url : ' /updatealert',
		data : {
			"seq_no" : alertNo
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				alert_view();
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
function readallMessage(){
	$.ajax({
		url : ' /updateallread',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				alert_view();
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
function timecheck(){
	var Now = new Date();
	var NowMin = Now.getMinutes();
	alert_view();
	setTimeout(timecheck, 10000);
}
function alertList(){
	var Count = document.getElementById("alertCount");
	var List = document.getElementById("alertList");
	
	$.ajax({
		url : ' /alertMessageList',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
			    var list_html = '';
				Count.innerText = result.alertMessageList.length;
				var rowCount = 0;
				if(result.alertMessageList.length > 7){
					rowCount = 7;
				}else {
					rowCount = result.alertMessageList.length;
				}
				for(var i =0; i<rowCount; i++){
					list_html += '<li  value="'+ result.alertMessageList[i].seq_no + '"><a> <span class="image" ></span> <span> <span>System</span>';
					list_html += ' <span class="time">' + result.alertMessageList[i].created_at +'</span>';
					list_html += '</span> <span class="message">' + result.alertMessageList[i].message +'</span>';
					list_html +='</a></li>';
				}
				List.innerHTML = list_html;
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
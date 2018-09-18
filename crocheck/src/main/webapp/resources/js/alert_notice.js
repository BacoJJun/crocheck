$(document).ready(function() {
	alertMessagetable();
});
function alertMessagetable(){
	var messageList = document.getElementById("alertMessageListtable");
	$.ajax({
		url : '/crocheck/alertMessageview',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
			    var list_html = '';
			    console.log(result.alertMessageList);
				for(var i =0; i<result.alertMessageList.length; i++){
					list_html += '<tr>';
					list_html += '<td>' + result.alertMessageList[i].seq_no + '</td>';
					list_html += '<td>' + result.alertMessageList[i].message + '</td>';
					list_html += '<td>' + result.alertMessageList[i].created_at + '</td>';
					list_html += '</tr>';
				}
				messageList.innerHTML = list_html;
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
	
	$('#alertdatatable').dataTable();
}


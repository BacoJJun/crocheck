$(document).ready(function() {

	changevaluelist();
});

function changevaluelist(){
	var changeList  = document.getElementById("changeValueList");
	
	$
	.ajax({
		url : '/crocheck/reportChangeValueList',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.changeValueList);
					var changetable = '';
					for(var i =0; i<result.changeValueList.length;i++){
						changetable += '<tr>';
						changetable += '<td>' + result.changeValueList[i].query_type + '</td>';
						changetable += '<td>' + result.changeValueList[i].title + '</td>';
						changetable += '<td>' + result.changeValueList[i].change_user + '</td>';
						changetable += '<td>' + result.changeValueList[i].user_ip + '</td>';
						changetable += '<td>' + result.changeValueList[i].created_at + '</td>';
						changetable += '</tr>';
					}
					changeList.innerHTML = changetable;
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

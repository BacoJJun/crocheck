$(document).ready(function() {
	callScript();
	//callMakeCsv();
});
function callScript(){
	$.ajax({
		url : '/loginuser',
		data : {
			"username" : 'admin',
			"encrypted_password" : 'roqkftjqj135&('
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				console.log(result.md5);
				console.log(result.base);
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


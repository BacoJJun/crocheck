$(document).ready(
		function() {
			$('button').click(
					function() {
						var data = $('#txt').val();
						if (data == '')
							return;
						$.ajax({
							url : '/zoneCsvMake',
							type : 'post',
							dataType : 'json',
							async : false,
							success : function(result) {
								if (result.result == 'success') {
									console.log(result.file_name);
									filedownload(result.file_name);
								} else {
									alert(result.errorMsg);
								}
							},
							error : function(request) {
								alert('error!');
								alert("code:" + request.status + "\n"
										+ "message:" + request.responseText
										+ "\n");
							}
						});

					});
		});
function filedownload(file_name) {
	$.ajax({
		url : '/fileDown?fileName=' + file_name ,
		 method: 'GET',
	        xhrFields: {
	            responseType: 'blob'
	        },
	        success: function (data) {
	            var a = document.createElement('a');
	            var url = window.URL.createObjectURL(data);
	            a.href = url;
	            a.download = file_name;
	            a.click();
	            window.URL.revokeObjectURL(url);
	        }
	});
}

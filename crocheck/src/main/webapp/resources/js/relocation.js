$(document).ready(function(){

    	$
		.ajax({
			url : '/relocationpost',
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {

					for( var i =0; i< result.postList.length; i++){
						console.log(result.postList[i].id + " / " + result.postList[i].name + " / " + result.postList[i].parent_id + " / " + result.postList[i].flowcount );
					}
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
        
});

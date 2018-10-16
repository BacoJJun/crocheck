$( document ).ready(function() {
	$("#loginsubmit").click(function(){
	//	logincheck( $("#admin_username").val(), $("#admin_password").val());
	})
	
});

function logincheck(username, user_pass){
	$.ajax({
		url : '/logincheck',
		 contentType : 'application/json'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
				
					}else{
						alert(result.errorMsg);
					}
			}
			, error : function(request){
				alert('error!'); 
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
			}
	});
}
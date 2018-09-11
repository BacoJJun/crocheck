$(document).ready(function () {
    $('label.tree-toggler').click(function () {
        $(this).parent().children('ul.tree').toggle(300);
    });
});
function menulist(){
	
	$.ajax({
		url : '/crocheck/postlist'
			, type : 'post'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
						listdraw(result.postList);
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

function listdraw(data){
	var menulist = document.getElementById("menuList");
	
	var domain_html = '';
	
	for( var i =0; i < data.length; i++){
		if(data[i].flowcount == 0){
			domain_html += 	'<li><a href="#" data-toggle="collapse" data-target="#firstMenu" data-parent="#sidenav01" class="collapsed">'+data.name+' <span class="fa fa-sort-down"></span></a>';
		}
		
	}
}
$( document ).ready(function() {
	allmemberList();
	table_click_event();
});
function table_click_event() {
	$('#dep_table button').click(function(){
		var id = $(this).val();
		console.log(id);
		postmemberList(id);
	});

}
function postmemberList(id){
	var memberlist = document.getElementById("post_member_list");

	$.ajax({
		url : '/crocheck/postmemberslist',
			data : {
				"id" : id
			}
			, type : 'post'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
						var member_html = '';
						for(var i =0; i<result.memberList.length;i++){
							member_html += '<tr>';
							member_html += '<td>' + result.memberList[i].post + '</td>';
							member_html += '<td>' + result.memberList[i].name + '</td>';
							member_html += '<td>' + result.memberList[i].ip + '</td>';
							member_html += '<td>' + result.memberList[i].phone + '</td>';
							member_html += '<td>' + result.memberList[i].mobile + '</td>';
							member_html += '<td>' + result.memberList[i].email + '</td>';
							member_html += '<td>' + result.memberList[i].etc + '</td>';
							member_html += '<td><a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i></a> <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i></a></td>';
							member_html += '</tr>';
						}
						memberlist.innerHTML = member_html;
						
					}else{
						alert(result.errorMsg);
					}
			}
			, error : function(request){
				alert('error!'); 
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
			}
	});
	$("#post_datatable").dataTable();
	$("#base_table").hide();
	$("#search_table").show();
	
}
function allmemberList(){
	var memberlist = document.getElementById("member_list");
	$.ajax({
		url : '/crocheck/memberslist'
			, type : 'post'
			, dataType : 'json'
			, async : false
			, success : function(result){
					if(result.result == 'success'){
						var member_html = '';
						for(var i =0; i<result.memberList.length;i++){
							member_html += '<tr>';
							member_html += '<td>' + result.memberList[i].post + '</td>';
							member_html += '<td>' + result.memberList[i].name + '</td>';
							member_html += '<td>' + result.memberList[i].ip + '</td>';
							member_html += '<td>' + result.memberList[i].phone + '</td>';
							member_html += '<td>' + result.memberList[i].mobile + '</td>';
							member_html += '<td>' + result.memberList[i].email + '</td>';
							member_html += '<td>' + result.memberList[i].etc + '</td>';
							member_html += '<td><a href="#" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i></a> <a href="#" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i></a></td>';
							member_html += '</tr>';
						}
						memberlist.innerHTML = member_html;
						
					}else{
						alert(result.errorMsg);
					}
			}
			, error : function(request){
				alert('error!'); 
				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
			}
	});
	$("#member_datatable").dataTable();
	$("#base_table").show();
	$("#search_table").hide();
}
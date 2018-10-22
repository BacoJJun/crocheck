$(document).ready(
		function() {
			$.ajax({
				url : '/postlist',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						menu_list_draw(result.postList);
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

			selectBoxClickEvent();
			post_button_Event();
		});
function post_button_Event(){
	$('#derp_delete').click(function(){
		var edit_modal_id = document.getElementById("organization_id").value;
		console.log(edit_modal_id);
		
		$.ajax({
			url : '/deletepost',
			data : {
				"id" : edit_modal_id
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					setTimeout(function(){
						location.reload();
					})
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
	
	$('#derp_update').click(function(){
		var edit_modal_list =  document.getElementById("displaypost_update").value;
		var edit_modal_text =  document.getElementById("organization_text_update").value;
		var edit_modal_id = document.getElementById("organization_id").value;
		var edit_modal_flowcount = document.getElementById("organization_flowcount").value;
		
		console.log(edit_modal_flowcount);
		
		$.ajax({
			url : '/updatepost',
			data : {
				"id" : edit_modal_id,
				"parent_id" : edit_modal_list,
				"name" : edit_modal_text,
				"flowcount" : edit_modal_flowcount
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					setTimeout(function(){
				//		location.reload();
					})
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
}
function selectBoxClickEvent(){
	$('#organization_list option').click(function(){
		var sub_id = $(this).attr('value');
		postSearchList(sub_id);
	})
}
function postSearchList(id){
	$.ajax({
		url : '/postsearchlist',
		data : {
			"id" : id
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
				distinctpostlist(result.postSearchList);
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
function distinctpostlist(data){
	var edit_modal_list =  document.getElementById("displaypost_update");
	var edit_modal_text =  document.getElementById("organization_text_update");
	var edit_modal_id = document.getElementById("organization_id");
	var edit_modal_flowcount = document.getElementById("organization_flowcount");
	
	if(data.flowcount == 0) {
		$("select[name='displaypost_update']").attr("disabled", true);
		$("#displaypost_insert").val(data.parent_id).prop("selected", true);
		edit_modal_text.value = data.name;

	}else{
		if ( data.flowcount %1000 != 0){
			$("select[name=displaypost_update]").attr("disabled", false);
			$("#displaypost_update").val(data.parent_id).prop("selected", true);

			edit_modal_text.value = data.name;
		}else{ 
		edit_modal_text.value = data.name;
		$("select[name='displaypost_update']").attr("disabled", true);
		$("#displaypost").attr("disable",true);
		}
	}
	console.log(data.id);
	edit_modal_id.value = data.id;
	edit_modal_flowcount.value = data.flowcount;
	
}
function menu_list_draw(data) {
	var organization_first = document.getElementById("organization_first");
	var dep_list = [];
	var dep_flow = [];
	var first_title_count = 0;

	dep_list[0] = document.getElementById("dep_one");
	dep_list[1] = document.getElementById("dep_two");
	dep_list[2] = document.getElementById("dep_three");
	dep_list[3] = document.getElementById("dep_four");
	dep_list[4] = document.getElementById("dep_five");
	dep_list[5] = document.getElementById("dep_six");
	dep_list[6] = document.getElementById("dep_seven");
	dep_list[7] = document.getElementById("dep_eight");
	dep_list[8] = document.getElementById("dep_nine");
	dep_list[9] = document.getElementById("dep_ten");
	
	dep_flow[0] = document.getElementById("dep_one_list");
	dep_flow[1] = document.getElementById("dep_two_list");
	dep_flow[2] = document.getElementById("dep_three_list");
	dep_flow[3] = document.getElementById("dep_four_list");
	dep_flow[4] = document.getElementById("dep_five_list");
	dep_flow[5] = document.getElementById("dep_six_list");
	dep_flow[6] = document.getElementById("dep_seven_list");
	dep_flow[7] = document.getElementById("dep_eight_list");
	dep_flow[8] = document.getElementById("dep_nine_list");
	dep_flow[9] = document.getElementById("dep_ten_list");
	
	var organization_modal_list = document.getElementById("organization_list");
	var edit_modal_list =  document.getElementById("edit_displaypost");
	var insert_modal_list =  document.getElementById("insert_post_list");
	var update_modal_list = document.getElementById("update_post_list");
	var insertmember_modal_list =  document.getElementById("displaypost_insert");
	var updatemember_modal_list =  document.getElementById("displaypost_update");
	
	var modal_list = '';
	var modal_edit = '';
	var post_list = '';
	var modal_insert='';
	var list_html = '';
	var j = 0;
	modal_insert +=  '<option value="new">' + '신규' + '</option>';
	
	for (var i = 0; i < data.length; i++) {
		if( (data[i].flowcount - (data[i].flowcount %1000) / 1000 ) >= first_title_count  && data[i].flowcount % 1000 == 0){
			if(data[i].flowcount == 0) {
				organization_first.innerText = data[i].name;
				modal_list += '<option value="'+data[i].id + '">' + data[i].name + '★</option>';
			}else{
			dep_list[j].innerHTML = data[i].name;
			modal_list += '<option value="'+data[i].id + '">' + data[i].name + '</option>';
			modal_edit += '<option value="'+data[i].id + '">' + data[i].name + '</option>';
			modal_insert += '<option value="'+data[i].id + '">' + data[i].name + '</option>';
			dep_list[j].value = data[i].id;
			first_title_count = data[i].flowcount - (data[i].flowcount %1000) / 1000  ; 
			j = j + 1;
			}
		} else {
			//dep_flow[j-1].innerHTML += '<li ><span value="'+data[i].id+'"></span>' + data[i].name + '</li>';
			dep_flow[j-1].innerHTML += '<li ><button type="button" class="btn btn-xs" value="'+data[i].id +'">'+data[i].name+'</button></li>';
			modal_list += '<option value="'+data[i].id + '"> +' + data[i].name + '</option>';
			post_list +=  '<option value="'+data[i].id + '"> ' + data[i].name + '</option>';
		}
	}
	organization_modal_list.innerHTML = modal_list;
	insert_modal_list.innerHTML = modal_edit;
	update_modal_list.innerHTML = modal_edit;
	insertmember_modal_list.innerHTML = modal_insert;
	updatemember_modal_list.innerHTML = modal_edit;
}

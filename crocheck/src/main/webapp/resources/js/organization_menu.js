$(document).ready(
		function() {
			$.ajax({
				url : '/crocheck/postlist',
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

		});
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

	
	var list_html = '';
	var j = 0;
	for (var i = 0; i < data.length; i++) {
		if( (data[i].flowcount - (data[i].flowcount %1000) / 1000 ) >= first_title_count  && data[i].flowcount % 1000 == 0){
			if(data[i].flowcount == 0) {
				organization_first.innerText = data[i].name;
			}else{
			dep_list[j].innerHTML = data[i].name;
			dep_list[j].value = data[i].id;
			first_title_count = data[i].flowcount - (data[i].flowcount %1000) / 1000  ; 
			j = j + 1;
			}
		} else {
			//dep_flow[j-1].innerHTML += '<li ><span value="'+data[i].id+'"></span>' + data[i].name + '</li>';
			dep_flow[j-1].innerHTML += '<li ><button type="button" class="btn btn-xs" value="'+data[i].id +'">'+data[i].name+'</button></li>';
		}

	}
}

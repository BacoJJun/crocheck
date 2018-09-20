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
	console.log(data);
	var organization_first = document.getElementById("organization_first");
	var first_title_count = 1;
	var second_title_count = 0;
	var menu_list = '';

	for (var i = 0; i < data.length; h++) {
		if (data[i].flowcount == 0) {
			organization_first.innerText =data[i].name;
		} else
			(data[i].flowcount / 1000 == first_title_count)
		{
			if ((data[i].flowcount % 1000) / 100 == second_title_count) {

			}
		}
	}
}

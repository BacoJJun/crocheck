$(document)	.ready(function() {
	dhcptable();
	table_click_event();
});

function dhcptable() {
	var dhcp_zone = document.getElementById("dhcplist");
	$
			.ajax({
				url : '/crocheck/dhcpTableList',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						console.log(result.dhcpTableList);
						for(var i =0; i<result.dhcpTableList.length;i++){
							domain_html += '<tr >';
							domain_html += '<td>' + result.dhcpTableList[i].category1 + '</td>';
							domain_html += '<td>' + result.dhcpTableList[i].category2 + '</td>';
							domain_html += '<td>' + result.dhcpTableList[i].protocol + '</td>';
							domain_html += '<td style="display:none;">' + result.dhcpTableList[i].id + '</td>';
							domain_html += '<td>' + result.dhcpTableList[i].start_ip +'/' + result.dhcpTableList[i].subnet_length + '</td>';
							domain_html += '<td><button type="button"   class="btn btn-success btn-xs fa fa-edit" name="dhcp_edit" value="'+result.dhcpTableList[i].id+'"></button> <button type="button" id="dhcp_delete" class="btn btn-danger btn-xs fa fa-trash" name="dhcp_delete" value="'+result.dhcpTableList[i].id+'"></button></td>';					
						}
						dhcp_zone.innerHTML = domain_html;
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
function table_click_event() {
	function onRowClick(tableId, callback) {
		var table = document.getElementById(tableId), rows = table
				.getElementsByTagName("tr"), i;
		for (i = 0; i < rows.length; i++) {
			table.rows[i].onclick = function(row) {
				return function() {
					callback(row);
				};
			}(table.rows[i]);
		}
	};

	onRowClick("datatable", function(row) {
		var id = row.getElementsByTagName("td")[3].innerText;
		console.log(id);
		subdhcptable(id);
		rentdhcptable(id);
	});

}
function subdhcptable(id){
	var dhcpsublist = document.getElementById("dhcp_sublist");
	$
			.ajax({
				url : '/crocheck/subdhcpList',
				data : {
					"id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						console.log(result.dhcpSubList);
						for(var i =0; i<result.dhcpSubList.length;i++){
							domain_html += '<td><button type="button"   class="btn btn-success btn-xs fa fa-edit" name="dhcp_edit" value="'+result.dhcpTableList[i].id+'"></button> <button type="button" id="dhcp_delete" class="btn btn-danger btn-xs fa fa-trash" name="dhcp_delete" value="'+result.dhcpTableList[i].id+'"></button></td>';					
						}
						dhcpsublist.innerHTML = domain_html;
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
function rentdhcptable(id){
	var dhcprentlist = document.getElementById("dhcp_rentlist");
	$
			.ajax({
				url : '/crocheck/rentdhcpList',
				data : {
					"id" : id
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						console.log(result.dhcpRentList);
						for(var i =0; i<result.dhcpRentList.length;i++){
								domain_html += '<td><button type="button"   class="btn btn-success btn-xs fa fa-edit" name="dhcp_edit" value="'+result.dhcpTableList[i].id+'"></button> <button type="button" id="dhcp_delete" class="btn btn-danger btn-xs fa fa-trash" name="dhcp_delete" value="'+result.dhcpTableList[i].id+'"></button></td>';					
						}
						dhcprentlist.innerHTML = domain_html;
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

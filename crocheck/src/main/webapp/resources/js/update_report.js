$(document).ready(function() {
	changevaluelist();
	searchClickEvent();
	table_click_event();
});

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
	}
	;

	onRowClick("changeValuedatatable", function(row) {
		var seq_no = row.getElementsByTagName("td")[0].innerText;
		
		searchValue(seq_no);

	});

}
function searchValue(seq_no){
	var detailView  = document.getElementById("changeValueDetailView");
	$
	.ajax({
		url : "/reportselectonevalue",
		data : {
			"seq_no" : seq_no		
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.changeValue);
					detailView.innerText = result.changeValue.comment;
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
function searchClickEvent(){
	$("#change_value_search").click(function(){
		refreshPage();
		if($('input:radio[name="check_change_type"]:checked').val() == 'dns'){
			var searchurl = '/reportChangednsSearchList';
			changesearchlist(searchurl);
		}else if($('input:radio[name="check_change_type"]:checked').val() == 'dhcp'){
			var searchurl = '/reportChangedhcpSearchList';
			changesearchlist(searchurl);
		}
	});
}
function changesearchlist(searchurl){
var changeList  = document.getElementById("changeValueList");
var arrDate = $("#reservation-time").val().split("-");
var start_date = arrDate[0];
var end_date = arrDate[1];
	
	$
	.ajax({
		url : searchurl,
		data : {
			"date_start" : start_date,
			"date_end" : end_date			
		},
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.changeValueList);
					var changetable = '';
					for(var i =0; i<result.changeValueList.length;i++){
						changetable += '<tr>';
						changetable += '<td>' + result.changeValueList[i].seq_no + '</td>';
						changetable += '<td>' + result.changeValueList[i].query_type + '</td>';
						changetable += '<td><div class="fa-hover"><a href="#" data-toggle="modal" data-target="#changeValueDetailModal" ><i class="fa fa-plus-square"></i>' + result.changeValueList[i].title + '</a></div></td>';
						changetable += '<td>' + result.changeValueList[i].change_user + '</td>';
						changetable += '<td>' + result.changeValueList[i].user_ip + '</td>';
						changetable += '<td>' + result.changeValueList[i].created_at + '</td>';
						changetable += '</tr>';
					}
					changeList.innerHTML = changetable;
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
	$("#changeValuedatatable").dataTable({
		'order' : [ [ 5, 'desc' ] ],
		'columnDefs' : [ {
			orderable : false,
			targets : [ 0 ]
		} ]
	});
}
function changevaluelist(){
	var changeList  = document.getElementById("changeValueList");
	
	$
	.ajax({
		url : '/reportChangeValueList',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.changeValueList);
					var changetable = '';
					for(var i =0; i<result.changeValueList.length;i++){
						changetable += '<tr>';
						changetable += '<td>' + result.changeValueList[i].seq_no + '</td>';
						changetable += '<td>' + result.changeValueList[i].query_type + '</td>';
						changetable += '<td><div class="fa-hover"><a href="#" data-toggle="modal" data-target="#changeValueDetailModal" ><i class="fa fa-plus-square"></i>' + result.changeValueList[i].title + '</a></div></td>';
						changetable += '<td>' + result.changeValueList[i].change_user + '</td>';
						changetable += '<td>' + result.changeValueList[i].user_ip + '</td>';
						changetable += '<td>' + result.changeValueList[i].created_at + '</td>';
						changetable += '</tr>';
					}
					changeList.innerHTML = changetable;
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
	$("#changeValuedatatable").dataTable({
		'order' : [ [ 5, 'desc' ] ],
		'columnDefs' : [ {
			orderable : false,
			targets : [ 0 ]
		} ]
	});
}
function refreshPage(){
	var changeTable  = document.getElementById("changereportmain");
	changeTable.innerHTML = '';
	var changePage_html = '';
	changePage_html += '<div class="x_panel"><div class="x_title"><h2>DNS update list <small></small></h2><div class="clearfix"></div></div>';
	changePage_html += '<div class="x_content"><table id="changeValuedatatable" class="table table-striped table-bordered"><colgroup><col width="5%" /><col width="15%" /><col width="*" /><col width="10%" /><col width="10%" /><col width="30%" /></colgroup>';
	changePage_html += '<thead><tr><th>No</th><th>type</th><th>title</th><th>user</th><th>ip</th><th>date</th></tr></thead>';
	changePage_html += '<tbody id="changeValueList"></tbody>';
	changePage_html += '</table></div></div>';
	
	changeTable.innerHTML = changePage_html;
}

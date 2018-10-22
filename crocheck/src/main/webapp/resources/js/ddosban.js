$(document).ready(function() {
	table_loop();
	blocklist();
	ddosblock_button_event();
});

function ddosblock_button_event(){
	$("#blockiplist button").click(function(){
		var ip = $(this).attr('value');
		var blockview = document.getElementById("delete_ddosblock_view");
		var blockip = document.getElementById("delete_ddosblock_ip");	
		
		blockview.innerText = ip + "를 삭제하시겠습니까?";
		blockip.value = ip;
	});
	
	$("#ddosblock_delete").click(function(){
		var blockip = document.getElementById("delete_ddosblock_ip").value;	
		$
		.ajax({
			url : '/deleteddosblock',
			data : {
					"ip" : blockip,
			},
			type : 'post',
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					setTimeout(function(){
						location.reload();
					});
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
	
	$("#ddosblock_insert").click(function(){
		var insertblockcomment = document.getElementById("ddosblock_insert_comment").value;	
		var insertblockip = document.getElementById("ddosblock_insert_ip").value;
		var ddoscheckyn = 0;
		
		var regIP = /^(?!0)(?!.*\.$)((1?\d?\d|25[0-5]|2[0-4]\d)(\.|$)){4}$/;
		
		console.log(insertblockip);
		
		$.ajax({
			url : '/ddosblockchecklist',
			type : 'post',
			data : {
				"ip" : insertblockip
			},
			dataType : 'json',
			async : false,
			success : function(result) {
				if (result.result == 'success') {
					ddoscheckyn = result.ddosblockchecklist.length;
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
		
		if(insertblockip == "" || insertblockip == null){
			alert('IP는 필수 입력입니다.');
		}else if(!regIP.test(insertblockip)){
			alert('IP 형식에 맞지 않습니다.');
		}else if(ddoscheckyn > 0){
			alert('중복된 DDoS입니다.');
		}else{
			$
			.ajax({
				url : '/insertddosblock',
				data : {
						"ip" : insertblockip,
						"comment" : insertblockcomment
				},
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						setTimeout(function(){
							location.reload();
						});
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
		});	
}
function table_loop() {
	init_ddos_block_table();
	setTimeout(table_loop, 1000);
}

function blocklist(){
	var blocktable = document.getElementById("blockiplist");
	
	$
	.ajax({
		url : '/ddosblocklist',
		type : 'post',
		dataType : 'json',
		async : false,
		success : function(result) {
			if (result.result == 'success') {
					console.log(result.ddosblockiplist);
					var ddoslist = '';
					
					for(var i =0; i< result.ddosblockiplist.length; i++){
						ddoslist += '<tr>';
						ddoslist += '<td>' + result.ddosblockiplist[i].ip + '</td>';
						ddoslist += '<td>' + result.ddosblockiplist[i].comment + '</td>';
						ddoslist += '<td>' + result.ddosblockiplist[i].created_at + '</td>';
						ddoslist += '<td><button type="button" class="btn btn-danger btn-xs" data-toggle="modal" 	data-target="#ddosblockdeleteModal" value="' + result.ddosblockiplist[i].ip + '"><i class="fa fa-trash-o"></i></button></td>';
						ddoslist += '</tr>';
					}
					blocktable.innerHTML = ddoslist;
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
function init_ddos_block_table() {
	var blocklist = document.getElementById("ddos_block_list");
	var ddos_attacker = document.getElementById("ddos_attacker");
	var ddos_attack_count = document.getElementById("ddos_attack_count");
	$
			.ajax({
				url : '/ddosBlockStatus',
				type : 'post',
				dataType : 'json',
				async : false,
				success : function(result) {
					if (result.result == 'success') {
						var domain_html = '';
						var attack_count = 0;
						for (var i = 0; i < result.ddosBlockList.length; i++) {
							domain_html += '<tr>';
							domain_html += '<td>'
									+ result.ddosBlockList[i].src_ip + '</td>';
							domain_html += '<td>'
									+ result.ddosBlockList[i].domain + '</td>';
							domain_html += '<td>'
									+ result.ddosBlockList[i].count + '</td>';
							domain_html += '<td>'
									+ result.ddosBlockList[i].created_at
									+ '</td>';
							domain_html += '</tr>';
							attack_count = attack_count
									+ result.ddosBlockList[i].count;
						}
						ddos_attacker.innerText = result.ddosBlockList.length;
						ddos_attack_count.innerText = attack_count;
						blocklist.innerHTML = domain_html;
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
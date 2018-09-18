package com.humanstar.crocheck.model.alertmessage.dto;

public class alertMessageVO {
	private int seq_no;
	private String message;
	private int view_check;
	private String created_at;
	
	public int getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getView_check() {
		return view_check;
	}
	public void setView_check(int view_check) {
		this.view_check = view_check;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	
}

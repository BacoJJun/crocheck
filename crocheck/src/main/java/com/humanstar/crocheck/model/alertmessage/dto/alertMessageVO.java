package com.humanstar.crocheck.model.alertmessage.dto;

public class alertMessageVO {
	private int seq_no;
	private String message;
	private int vew_check;
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
	public int getVew_check() {
		return vew_check;
	}
	public void setVew_check(int vew_check) {
		this.vew_check = vew_check;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	
}

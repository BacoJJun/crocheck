package com.humanstar.crocheck.model.user.dto;

public class userVO {
	private int id;
	private String username;
	private String encrypted_password;
	private String reset_password_token;
	private String reset_password_sent_at;
	private String remeber_created_at;
	private int sing_in_count;
	private String last_sign_in_at;
	private String current_sign_in_ip;
	private String last_sign_in_ip;
	private String created_at;
	private String updated_at;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEncrypted_password() {
		return encrypted_password;
	}
	public void setEncrypted_password(String encrypted_password) {
		this.encrypted_password = encrypted_password;
	}
	public String getReset_password_token() {
		return reset_password_token;
	}
	public void setReset_password_token(String reset_password_token) {
		this.reset_password_token = reset_password_token;
	}
	public String getReset_password_sent_at() {
		return reset_password_sent_at;
	}
	public void setReset_password_sent_at(String reset_password_sent_at) {
		this.reset_password_sent_at = reset_password_sent_at;
	}
	public String getRemeber_created_at() {
		return remeber_created_at;
	}
	public void setRemeber_created_at(String remeber_created_at) {
		this.remeber_created_at = remeber_created_at;
	}
	public int getSing_in_count() {
		return sing_in_count;
	}
	public void setSing_in_count(int sing_in_count) {
		this.sing_in_count = sing_in_count;
	}
	public String getLast_sign_in_at() {
		return last_sign_in_at;
	}
	public void setLast_sign_in_at(String last_sign_in_at) {
		this.last_sign_in_at = last_sign_in_at;
	}
	public String getCurrent_sign_in_ip() {
		return current_sign_in_ip;
	}
	public void setCurrent_sign_in_ip(String current_sign_in_ip) {
		this.current_sign_in_ip = current_sign_in_ip;
	}
	public String getLast_sign_in_ip() {
		return last_sign_in_ip;
	}
	public void setLast_sign_in_ip(String last_sign_in_ip) {
		this.last_sign_in_ip = last_sign_in_ip;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	
}

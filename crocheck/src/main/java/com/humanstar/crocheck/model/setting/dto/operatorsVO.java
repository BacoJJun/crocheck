package com.humanstar.crocheck.model.setting.dto;

public class operatorsVO {
	private int id;
	private String name;
	private String email;
	private int mail_yn;
	private int sms_yn;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMail_yn() {
		return mail_yn;
	}
	public void setMail_yn(int mail_yn) {
		this.mail_yn = mail_yn;
	}
	public int getSms_yn() {
		return sms_yn;
	}
	public void setSms_yn(int sms_yn) {
		this.sms_yn = sms_yn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String csvString() {
		String line = "";
		line += "\"name\":\"" +name + "\",";
		line += "\"email\":\"" +email + "\",";
		line += "\"mail_yn\":\"" +mail_yn + "\",";
		line += "\"sms_yn\":\"" +sms_yn + "\",";
		line += "\"phone\":\"" +phone + "\"";
		
		return line;
		
	}
}

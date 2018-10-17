package com.humanstar.crocheck.model.setting.dto;

public class accessorsVO {
	private int id;
	private String name;
	private String ip;
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String csvString() {
		String line = "";
		line += "\"name\":\"" +name + "\",";
		line += "\"email\":\"" +ip + "\"";

		return line;
		
	}
}

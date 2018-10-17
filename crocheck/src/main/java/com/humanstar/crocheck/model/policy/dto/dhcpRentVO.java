package com.humanstar.crocheck.model.policy.dto;

public class dhcpRentVO {
	private String ip;
	private String mac;
	private String host_name;
	private String mid;
	private String rent_at;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getRent_at() {
		return rent_at;
	}
	public void setRent_at(String rent_at) {
		this.rent_at = rent_at;
	}
	
	public String csvString() {
		String line = "";
		line += "\"ip\":\"" +ip + "\",";
		line += "\"mac\":\"" +mac + "\",";
		line += "\"host_name\":\"" +host_name + "\",";
		line += "\"mid\":\"" +mid + "\",";
		line += "\"rent_at\":\"" +rent_at + "\",";
		return line;
	}
}

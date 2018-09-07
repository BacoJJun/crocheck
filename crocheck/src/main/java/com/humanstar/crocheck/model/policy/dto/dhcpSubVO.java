package com.humanstar.crocheck.model.policy.dto;

public class dhcpSubVO {
	private int id;
	private int type;
	private String start_ip;
	private String end_ip;
	private String mac;
	private int mid;
	private String created_at;
	private int ip_count;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getStart_ip() {
		return start_ip;
	}
	public void setStart_ip(String start_ip) {
		this.start_ip = start_ip;
	}
	public String getEnd_ip() {
		return end_ip;
	}
	public void setEnd_ip(String end_ip) {
		this.end_ip = end_ip;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public int getIp_count() {
		return ip_count;
	}
	public void setIp_count(int ip_count) {
		this.ip_count = ip_count;
	}
	
	
}

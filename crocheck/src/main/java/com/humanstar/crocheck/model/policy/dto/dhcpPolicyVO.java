package com.humanstar.crocheck.model.policy.dto;

public class dhcpPolicyVO {
	private int id;
	private String protocol;
	private String start_ip;
	private String end_ip;
	private int bid;
	private String created_at;
	private int day;
	private int hour;
	private int min;
	private String dns1;
	private String dns2;
	private String category1;
	private String category2;
	private int ip_count;
	private String subnet;
	private String gateway;
	private int subnet_length;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
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
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public String getDns1() {
		return dns1;
	}
	public void setDns1(String dns1) {
		this.dns1 = dns1;
	}
	public String getDns2() {
		return dns2;
	}
	public void setDns2(String dns2) {
		this.dns2 = dns2;
	}
	public String getCategory1() {
		return category1;
	}
	public void setCategory1(String category1) {
		this.category1 = category1;
	}
	public String getCategory2() {
		return category2;
	}
	public void setCategory2(String category2) {
		this.category2 = category2;
	}
	public int getIp_count() {
		return ip_count;
	}
	public void setIp_count(int ip_count) {
		this.ip_count = ip_count;
	}
	public String getSubnet() {
		return subnet;
	}
	public void setSubnet(String subnet) {
		this.subnet = subnet;
	}
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	public int getSubnet_length() {
		return subnet_length;
	}
	public void setSubnet_length(int subnet_length) {
		this.subnet_length = subnet_length;
	}
	
	@Override
	public String toString() {
		return "dhcpPolicyVO [id=" + id + ", protocol=" + protocol + ", start_ip=" + start_ip + ", end_ip=" + end_ip
				+ ", bid=" + bid + ", created_at=" + created_at + ", day=" + day + ", hour=" + hour + ", min=" + min
				+ ", dns1=" + dns1 + ", dns2=" + dns2 + ", category1=" + category1 + ", category2=" + category2
				+ ", ip_count=" + ip_count + ", subnet=" + subnet + ", gateway=" + gateway + ", subnet_length="
				+ subnet_length + "]";
	}	
}

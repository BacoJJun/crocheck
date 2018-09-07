package com.humanstar.crocheck.model.policy.dto;

public class ddosBlockStatusVO {
	private String src_ip;
	private String domain;
	private int count;
	private String created_at;
	
	
	public String getSrc_ip() {
		return src_ip;
	}
	public void setSrc_ip(String src_ip) {
		this.src_ip = src_ip;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	
}

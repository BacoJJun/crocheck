package com.humanstar.crocheck.model.organization.dto;

public class postVO {
	private int id;
	private String name;
	private String begin_ip;
	private String end_ip;
	private String description;
	private String created_at;
	private String updated_at;
	private String parent_id;
	private int flowcount;
	
	public int getFlowcount() {
		return flowcount;
	}
	public void setFlowcount(int flowcount) {
		this.flowcount = flowcount;
	}
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
	public String getBegin_ip() {
		return begin_ip;
	}
	public void setBegin_ip(String begin_ip) {
		this.begin_ip = begin_ip;
	}
	public String getEnd_ip() {
		return end_ip;
	}
	public void setEnd_ip(String end_ip) {
		this.end_ip = end_ip;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	
	
}

package com.humanstar.crocheck.model.engine.dto;

public class rolesDhcpVO {
	private boolean dhcp;
	private int day;
	private int hour;
	private int min;
	private String created_at;
	private String updated_at;
	private String primary_dns;
	private String secondary_dns;
	
	public boolean isDhcp() {
		return dhcp;
	}
	public void setDhcp(boolean dhcp) {
		this.dhcp = dhcp;
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
	public String getPrimary_dns() {
		return primary_dns;
	}
	public void setPrimary_dns(String primary_dns) {
		this.primary_dns = primary_dns;
	}
	public String getSecondary_dns() {
		return secondary_dns;
	}
	public void setSecondary_dns(String secondary_dns) {
		this.secondary_dns = secondary_dns;
	}
	
	
}

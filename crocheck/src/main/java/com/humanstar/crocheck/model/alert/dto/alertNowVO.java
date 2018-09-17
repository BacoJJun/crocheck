package com.humanstar.crocheck.model.alert.dto;

public class alertNowVO {
	private double cpu_pct;
	private double memory_pct;
	private double disk_pct;
	private int dns_count;
	private int ddos_count;
	
	public double getCpu_pct() {
		return cpu_pct;
	}
	public void setCpu_pct(double cpu_pct) {
		this.cpu_pct = cpu_pct;
	}
	public double getMemory_pct() {
		return memory_pct;
	}
	public void setMemory_pct(double memory_pct) {
		this.memory_pct = memory_pct;
	}
	public double getDisk_pct() {
		return disk_pct;
	}
	public void setDisk_pct(double disk_pct) {
		this.disk_pct = disk_pct;
	}
	public int getDns_count() {
		return dns_count;
	}
	public void setDns_count(int dns_count) {
		this.dns_count = dns_count;
	}
	public int getDdos_count() {
		return ddos_count;
	}
	public void setDdos_count(int ddos_count) {
		this.ddos_count = ddos_count;
	}
	
	@Override
	public String toString() {
		return "alertNowVO [cpu_pct=" + cpu_pct + ", memory_pct=" + memory_pct + ", disk_pct=" + disk_pct
				+ ", dns_count=" + dns_count + ", ddos_count=" + ddos_count + "]";
	}
	
	
}

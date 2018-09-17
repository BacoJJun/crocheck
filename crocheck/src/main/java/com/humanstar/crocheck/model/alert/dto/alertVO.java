package com.humanstar.crocheck.model.alert.dto;

public class alertVO {
	private int seq_no;
	private int cpu_warning;
	private int cpu_critical;
	private int memory_warning;
	private int memory_critical;
	private int disk_warning;
	private int disk_critical;
	private int dns_warning;
	private int dns_critical;
	private int ddos_warning;
	private int ddos_critical;
	
	public int getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
	}
	public int getCpu_warning() {
		return cpu_warning;
	}
	public void setCpu_warning(int cpu_warning) {
		this.cpu_warning = cpu_warning;
	}
	public int getCpu_critical() {
		return cpu_critical;
	}
	public void setCpu_critical(int cpu_critical) {
		this.cpu_critical = cpu_critical;
	}
	public int getMemory_warning() {
		return memory_warning;
	}
	public void setMemory_warning(int memory_warning) {
		this.memory_warning = memory_warning;
	}
	public int getMemory_critical() {
		return memory_critical;
	}
	public void setMemory_critical(int memory_critical) {
		this.memory_critical = memory_critical;
	}
	public int getDisk_warning() {
		return disk_warning;
	}
	public void setDisk_warning(int disk_warning) {
		this.disk_warning = disk_warning;
	}
	public int getDisk_critical() {
		return disk_critical;
	}
	public void setDisk_critical(int disk_critical) {
		this.disk_critical = disk_critical;
	}
	public int getDns_warning() {
		return dns_warning;
	}
	public void setDns_warning(int dns_warning) {
		this.dns_warning = dns_warning;
	}
	public int getDns_critical() {
		return dns_critical;
	}
	public void setDns_critical(int dns_critical) {
		this.dns_critical = dns_critical;
	}
	public int getDdos_warning() {
		return ddos_warning;
	}
	public void setDdos_warning(int ddos_warning) {
		this.ddos_warning = ddos_warning;
	}
	public int getDdos_critical() {
		return ddos_critical;
	}
	public void setDdos_critical(int ddos_critical) {
		this.ddos_critical = ddos_critical;
	}
	
	
}

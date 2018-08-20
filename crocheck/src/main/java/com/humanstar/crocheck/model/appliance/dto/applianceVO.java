package com.humanstar.crocheck.model.appliance.dto;

public class applianceVO {
	private double cpu_idle_pct;
	private double cpu_sys_pct;
	private double cpu_user_pct;
	private double cpu_iowait_pct;
	private double mem_use;
	private double mem_total;
	private double bytes_rx_total;
	private double pkts_rx_total;
	private String disk_vol1_mount;
	private double disk_vol1_usage_byte;
	private double disk_vol1_total_byte;
	private double disk_vol1_usage_pct;
	private String  disk_vol2_mount;
	private double disk_vol2_usage_byte;
	private double disk_vol2_total_byte;
	private double disk_vol2_usage_pct;
	private String disk_vol3_mount;
	private double disk_vol3_usage_byte;
	private double disk_vol3_total_byte;
	private double disk_vol3_usage_pct;
	
	public double getCpu_idle_pct() {
		return cpu_idle_pct;
	}
	public double getCpu_sys_pct() {
		return cpu_sys_pct;
	}
	public double getCpu_user_pct() {
		return cpu_user_pct;
	}
	public double getCpu_iowait_pct() {
		return cpu_iowait_pct;
	}
	public double getMem_use() {
		return mem_use;
	}
	public double getMem_total() {
		return mem_total;
	}
	public double getBytes_rx_total() {
		return bytes_rx_total;
	}
	public double getPkts_rx_total() {
		return pkts_rx_total;
	}
	public String getDisk_vol1_mount() {
		return disk_vol1_mount;
	}
	public double getDisk_vol1_usage_byte() {
		return disk_vol1_usage_byte;
	}
	public double getDisk_vol1_total_byte() {
		return disk_vol1_total_byte;
	}
	public double getDisk_vol1_usage_pct() {
		return disk_vol1_usage_pct;
	}
	public String getDisk_vol2_mount() {
		return disk_vol2_mount;
	}
	public double getDisk_vol2_usage_byte() {
		return disk_vol2_usage_byte;
	}
	public double getDisk_vol2_total_byte() {
		return disk_vol2_total_byte;
	}
	public double getDisk_vol2_usage_pct() {
		return disk_vol2_usage_pct;
	}
	public String getDisk_vol3_mount() {
		return disk_vol3_mount;
	}
	public double getDisk_vol3_usage_byte() {
		return disk_vol3_usage_byte;
	}
	public double getDisk_vol3_total_byte() {
		return disk_vol3_total_byte;
	}
	public double getDisk_vol3_usage_pct() {
		return disk_vol3_usage_pct;
	}



}

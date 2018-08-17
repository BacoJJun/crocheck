package com.humanstar.crocheck.model.appliance.dto;

public class applianceVO {
	private double cpu_idle_pct;
	private double cpu_sys_pct;
	private double cpu_user_pct;
	private double cpu_iowait_pct;
	private double mem_use;
	private double mem_total;
	
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
	
	
}

package com.humanstar.crocheck.model.report.dto;

public class reportApplianceVO {
	private double cpu_pct;
	private double mem_pct;
	private double disk_vol1_pct;
	private String hhmmss;
	
	public double getCpu_pct() {
		return cpu_pct;
	}
	public void setCpu_pct(double cpu_pct) {
		this.cpu_pct = cpu_pct;
	}
	public double getMem_pct() {
		return mem_pct;
	}
	public void setMem_pct(double mem_pct) {
		this.mem_pct = mem_pct;
	}
	public double getDisk_vol1_pct() {
		return disk_vol1_pct;
	}
	public void setDisk_vol1_pct(double disk_vol1_pct) {
		this.disk_vol1_pct = disk_vol1_pct;
	}
	public String getHhmmss() {
		return hhmmss;
	}
	public void setHhmmss(String hhmmss) {
		this.hhmmss = hhmmss;
	}
	
	
}

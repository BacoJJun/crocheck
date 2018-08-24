package com.humanstar.crocheck.model.dashboard.dto;

import java.sql.Date;

public class applianceStatusVO {
	private  int seq;
	private Date hhmmss;
	private double cpu_sys_pct;
	private double cpu_iowait_pct;
	private double cpu_idle_pct;
	private double cpu_user_pct;
	private double mem_total;
	private double mem_use;
	private double mem_use_pct;
	private double mem_shared;
	private double mem_shared_pct;
	private double mem_buffer;
	private double mem_buffer_pct;
	private double mem_cache;
	private double mem_cache_pct;
	private double mem_free;
	private double mem_free_pct;
	private double swap_total;
	private double swap_use;
	private double swap_use_pct;
	private double swap_free;
	private double  unixtimestamp;
	private double disk_vol1_usage_pct;
	private double disk_vol2_usage_pct;
	private double disk_vol3_usage_pct;
	private double disk_vol4_usage_pct;
	
	public int getSeq() {
		return seq;
	}
	public Date getHhmmss() {
		return hhmmss;
	}
	public double getCpu_sys_pct() {
		return cpu_sys_pct;
	}
	public double getCpu_iowait_pct() {
		return cpu_iowait_pct;
	}
	public double getCpu_idle_pct() {
		return cpu_idle_pct;
	}
	public double getCpu_user_pct() {
		return cpu_user_pct;
	}
	public double getMem_total() {
		return mem_total;
	}
	public double getMem_use() {
		return mem_use;
	}
	public double getMem_use_pct() {
		return mem_use_pct;
	}
	public double getMem_shared() {
		return mem_shared;
	}
	public double getMem_shared_pct() {
		return mem_shared_pct;
	}
	public double getMem_buffer() {
		return mem_buffer;
	}
	public double getMem_buffer_pct() {
		return mem_buffer_pct;
	}
	public double getMem_cache() {
		return mem_cache;
	}
	public double getMem_cache_pct() {
		return mem_cache_pct;
	}
	public double getMem_free() {
		return mem_free;
	}
	public double getMem_free_pct() {
		return mem_free_pct;
	}
	public double getSwap_total() {
		return swap_total;
	}
	public double getSwap_use() {
		return swap_use;
	}
	public double getSwap_use_pct() {
		return swap_use_pct;
	}
	public double getSwap_free() {
		return swap_free;
	}
	public double getUnixtimestamp() {
		return unixtimestamp;
	}
	public double getDisk_vol1_usage_pct() {
		return disk_vol1_usage_pct;
	}
	public double getDisk_vol2_usage_pct() {
		return disk_vol2_usage_pct;
	}
	public double getDisk_vol3_usage_pct() {
		return disk_vol3_usage_pct;
	}
	public double getDisk_vol4_usage_pct() {
		return disk_vol4_usage_pct;
	}
	@Override
	public String toString() {
		return "applianceStatusVO [seq=" + seq + ", hhmmss=" + hhmmss + ", cpu_sys_pct=" + cpu_sys_pct
				+ ", cpu_iowait_pct=" + cpu_iowait_pct + ", cpu_idle_pct=" + cpu_idle_pct + ", cpu_user_pct="
				+ cpu_user_pct + ", mem_total=" + mem_total + ", mem_use=" + mem_use + ", mem_use_pct=" + mem_use_pct
				+ ", mem_shared=" + mem_shared + ", mem_shared_pct=" + mem_shared_pct + ", mem_buffer=" + mem_buffer
				+ ", mem_buffer_pct=" + mem_buffer_pct + ", mem_cache=" + mem_cache + ", mem_cache_pct=" + mem_cache_pct
				+ ", mem_free=" + mem_free + ", mem_free_pct=" + mem_free_pct + ", swap_total=" + swap_total
				+ ", swap_use=" + swap_use + ", swap_use_pct=" + swap_use_pct + ", swap_free=" + swap_free
				+ ", unixtimestamp=" + unixtimestamp + ", disk_vol1_usage_pct=" + disk_vol1_usage_pct
				+ ", disk_vol2_usage_pct=" + disk_vol2_usage_pct + ", disk_vol3_usage_pct=" + disk_vol3_usage_pct
				+ ", disk_vol4_usage_pct=" + disk_vol4_usage_pct + "]";
	}
	
	
}

package com.humanstar.crocheck.model.dashboard.dto;

public class dayPharmingVO {
	private int today_pharming;
	private int yesterday_pharming;
	private int today_suspicion;
	private int yesterday_suspicion;
	private int today_allcount;
	private int yesterday_allcount;
	
	public int getPharming() {
		return today_pharming;
	}
	public int getYesterday_pharming() {
		return yesterday_pharming;
	}
	public int getSuspicion() {
		return today_suspicion;
	}
	public int getYesterday_suspicion() {
		return yesterday_suspicion;
	}
	public int getToday_allcount() {
		return today_allcount;
	}
	public int getYesterday_allcount() {
		return yesterday_allcount;
	}
	
	
	
}

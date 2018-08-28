package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.todayDnsVO;

public interface todayDnsDAO {
	public List<todayDnsVO> todayDnsList() throws Exception;
	public List<todayDnsVO> yesterdayDnsList() throws Exception;
	
}

package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.todayDnsVO;

public interface todayDnsService {
	public List<todayDnsVO> todayDnsList() throws Exception;
	public List<todayDnsVO> yesterdayDnsList() throws Exception;
}

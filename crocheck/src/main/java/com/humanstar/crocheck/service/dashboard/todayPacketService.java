package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.todayPacketVO;

public interface todayPacketService {
	public List<todayPacketVO> todayPacketList() throws Exception;
}

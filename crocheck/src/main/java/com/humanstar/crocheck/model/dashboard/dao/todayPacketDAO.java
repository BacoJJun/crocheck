package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.todayPacketVO;

public interface todayPacketDAO {
	public List<todayPacketVO> todayPacketList() throws Exception;
}

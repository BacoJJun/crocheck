package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.yesterdayPacketVO;

public interface yesterdayPacketService {
	public List<yesterdayPacketVO> yesterdayPacketList() throws Exception;
}

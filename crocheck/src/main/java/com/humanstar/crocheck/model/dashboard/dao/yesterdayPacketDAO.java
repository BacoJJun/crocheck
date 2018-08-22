package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.yesterdayPacketVO;

public interface yesterdayPacketDAO {
	List<yesterdayPacketVO> yesterdayPacketList() throws Exception;
}

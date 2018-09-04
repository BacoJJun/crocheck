package com.humanstar.crocheck.model.statistics.dao;

import java.util.List;

import com.humanstar.crocheck.model.statistics.dto.statPacketVO;

public interface statisticsPacketDAO {
	public List<statPacketVO> lastDnsPacket() throws Exception;
	public List<statPacketVO> lastDDosPacket() throws Exception;
}

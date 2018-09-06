package com.humanstar.crocheck.model.statistics.dao;

import java.util.List;

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.model.statistics.dto.statPacketVO;

public interface statisticsPacketDAO {
	public List<statPacketVO> lastDnsPacket() throws Exception;
	public List<statPacketVO> lastDDosPacket() throws Exception;
	public List<statPacketVO> minDnsPacket(searchTypeVO vo) throws Exception;
	public List<statPacketVO> minDDosPacket(searchTypeVO vo) throws Exception;
	public List<statPacketVO> hourDnsPacket(searchTypeVO vo) throws Exception;
	public List<statPacketVO> hourDDosPacket(searchTypeVO vo) throws Exception;
}

package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportPacketVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

public interface reportPacketDAO {
	public List<reportPacketVO> mainReportDnsPacket() throws Exception;
	public List<reportPacketVO> mainReportDDosPacket() throws Exception;
	public List<reportPacketVO> dailyReportDnsPacket(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> dailyReportDDosPacket(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> weeklyReportDnsPacket(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> weeklyReportDDosPacket(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> monthlyReportDnsPacket(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> monthlyReportDDosPacket(searchTypeVO vo) throws Exception;
}

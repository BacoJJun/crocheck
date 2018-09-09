package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportPacketVO;

public interface reportPacketDAO {
	public List<reportPacketVO> mainReportDnsPacket() throws Exception;
	public List<reportPacketVO> mainReportDDosPacket() throws Exception;
}

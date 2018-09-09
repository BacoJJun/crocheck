package com.humanstar.crocheck.service.report;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportApplianceVO;
import com.humanstar.crocheck.model.report.dto.reportDomainQueryVO;
import com.humanstar.crocheck.model.report.dto.reportPacketVO;
import com.humanstar.crocheck.model.report.dto.reportSrcQueryVO;

public interface reportMainService {
	public List<reportApplianceVO> reportMainApp() throws Exception;
	public List<reportPacketVO> reportMainDnsPacket() throws Exception;
	public List<reportPacketVO> reportMainDDosPacket() throws Exception;
	public List<reportDomainQueryVO> reportMainDnsDomain() throws Exception;
	public List<reportDomainQueryVO> reportMainDDosDomain() throws Exception;
	public List<reportSrcQueryVO> reportMainDnsSrc() throws Exception;
	public List<reportSrcQueryVO> reportMainDDosSrc() throws Exception;
}

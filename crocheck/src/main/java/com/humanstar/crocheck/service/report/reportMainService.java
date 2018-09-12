package com.humanstar.crocheck.service.report;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportApplianceVO;
import com.humanstar.crocheck.model.report.dto.reportDomainQueryVO;
import com.humanstar.crocheck.model.report.dto.reportPacketVO;
import com.humanstar.crocheck.model.report.dto.reportSrcQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

public interface reportMainService {
	public List<reportApplianceVO> reportMainApp() throws Exception;
	public List<reportPacketVO> reportMainDnsPacket() throws Exception;
	public List<reportPacketVO> reportMainDDosPacket() throws Exception;
	public List<reportDomainQueryVO> reportMainDnsDomain() throws Exception;
	public List<reportDomainQueryVO> reportMainDDosDomain() throws Exception;
	public List<reportSrcQueryVO> reportMainDnsSrc() throws Exception;
	public List<reportSrcQueryVO> reportMainDDosSrc() throws Exception;
	
	public List<reportApplianceVO> dailyMainApp(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> dailyMainDnsPacket(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> dailyMainDDosPacket(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> dailyMainDnsDomain(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> dailyMainDDosDomain(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> dailyMainDnsSrc(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> dailyMainDDosSrc(searchTypeVO vo) throws Exception;
	
	public List<reportApplianceVO> weeklyMainApp(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> weeklyMainDnsPacket(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> weeklyMainDDosPacket(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> weeklyMainDnsDomain(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> weeklyMainDDosDomain(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> weeklyMainDnsSrc(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> weeklyMainDDosSrc(searchTypeVO vo) throws Exception;
	
	public List<reportApplianceVO> monthlyMainApp(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> monthlyMainDnsPacket(searchTypeVO vo) throws Exception;
	public List<reportPacketVO> monthlyMainDDosPacket(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> monthlyMainDnsDomain(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> monthlyMainDDosDomain(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> monthlyMainDnsSrc(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> monthlyMainDDosSrc(searchTypeVO vo) throws Exception;
}

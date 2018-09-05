package com.humanstar.crocheck.service.statistics;

import java.util.List;

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.model.statistics.dto.domainQueryVO;
import com.humanstar.crocheck.model.statistics.dto.srcQueryVO;
import com.humanstar.crocheck.model.statistics.dto.statApplianceVO;
import com.humanstar.crocheck.model.statistics.dto.statPacketVO;

public interface statisticsService {
	public List<statApplianceVO> lastApplianceStat() throws Exception;
	public List<statPacketVO> lastDnsPacket() throws Exception;
	public List<statPacketVO> lastDDosPacket() throws Exception;
	public List<domainQueryVO> lastDnsDomain() throws Exception;
	public List<domainQueryVO> lastDDosDomain() throws Exception;
	public List<srcQueryVO> lastDnsSrc() throws Exception;
	public List<srcQueryVO> lastDDosSrc() throws Exception;
	
	public List<statApplianceVO> searchMinApplianceStat(searchTypeVO vo) throws Exception;
	public List<statApplianceVO> searchHourApplianceStat(searchTypeVO vo) throws Exception;
}

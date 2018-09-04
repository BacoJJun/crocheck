package com.humanstar.crocheck.service.statistics;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.statistics.dao.statisticsAppDAOImpl;
import com.humanstar.crocheck.model.statistics.dao.statisticsPacketDAOImpl;
import com.humanstar.crocheck.model.statistics.dao.statisticsQueryStatDAOImpl;
import com.humanstar.crocheck.model.statistics.dto.statApplianceVO;
import com.humanstar.crocheck.model.statistics.dto.domainQueryVO;
import com.humanstar.crocheck.model.statistics.dto.statPacketVO;
import com.humanstar.crocheck.model.statistics.dto.srcQueryVO;

@Service
public class statisticsServiceImpl implements statisticsService{

	@Inject
	statisticsAppDAOImpl statisticsAppDAO;
	statisticsPacketDAOImpl statisticsPacketDAO;
	statisticsQueryStatDAOImpl statisticsQueryStatDAO;
	
	@Override
	public List<statApplianceVO> lastApplianceStat() throws Exception {
		// TODO Auto-generated method stub
		return statisticsAppDAO.lastApplianceStat();
	}
	@Override
	public List<statPacketVO> lastDnsPacket() throws Exception {
		// TODO Auto-generated method stub
		return statisticsPacketDAO.lastDnsPacket();
	}
	@Override
	public List<statPacketVO> lastDDosPacket() throws Exception {
		// TODO Auto-generated method stub
		return statisticsPacketDAO.lastDDosPacket();
	}
	@Override
	public List<domainQueryVO> lastDnsDomain() throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.lastDnsDomain();
	}
	@Override
	public List<domainQueryVO> lastDDosDomain() throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.lastDDosDomain();
	}
	@Override
	public List<srcQueryVO> lastDnsSrc() throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.lastDnsSrc();
	}
	@Override
	public List<srcQueryVO> lastDDosSrc() throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.lastDDosSrc();
	}
	
	
}

package com.humanstar.crocheck.service.statistics;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
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
	@Inject
	statisticsPacketDAOImpl statisticsPacketDAO;
	@Inject
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
	@Override
	public List<statApplianceVO> searchMinApplianceStat(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsAppDAO.searchMinApplianceStat(vo);
	}
	@Override
	public List<statApplianceVO> searchHourApplianceStat(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsAppDAO.searchHourApplianceStat(vo);
	}
	@Override
	public List<statPacketVO> searchMinDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsPacketDAO.minDnsPacket(vo);
	}
	@Override
	public List<statPacketVO> searchMinDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsPacketDAO.minDDosPacket(vo);
	}
	@Override
	public List<domainQueryVO> searchMinDnsDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.minDnsDomain(vo);
	}
	@Override
	public List<domainQueryVO> searchMinDDosDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.minDDosDomain(vo);
	}
	@Override
	public List<srcQueryVO> searchMinDnsSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.minDnsSrc(vo);
	}
	@Override
	public List<srcQueryVO> searchMinDDosSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.minDDosSrc(vo);
	}
	@Override
	public List<statPacketVO> searchHourDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsPacketDAO.hourDnsPacket(vo);
	}
	@Override
	public List<statPacketVO> searchHourDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsPacketDAO.hourDDosPacket(vo);
	}
	@Override
	public List<domainQueryVO> searchHourDnsDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.hourDnsDomain(vo);
	}
	@Override
	public List<domainQueryVO> searchHourDDosDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.hourDDosDomain(vo);
	}
	@Override
	public List<srcQueryVO> searchHourDnsSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.hourDnsSrc(vo);
	}
	@Override
	public List<srcQueryVO> searchHourDDosSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return statisticsQueryStatDAO.hourDDosSrc(vo);
	}
	
	
}

package com.humanstar.crocheck.service.report;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.report.dao.reportAppDAOImpl;
import com.humanstar.crocheck.model.report.dao.reportDomainQueryDAOImpl;
import com.humanstar.crocheck.model.report.dao.reportPacketDAOImpl;
import com.humanstar.crocheck.model.report.dao.reportSrcQueryDAOImpl;
import com.humanstar.crocheck.model.report.dto.reportApplianceVO;
import com.humanstar.crocheck.model.report.dto.reportDomainQueryVO;
import com.humanstar.crocheck.model.report.dto.reportPacketVO;
import com.humanstar.crocheck.model.report.dto.reportSrcQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

@Service
public class reportMainServiceImpl implements reportMainService{

	@Inject 
	reportAppDAOImpl reportAppDAO;
	@Inject 
	reportPacketDAOImpl reportPacketDAO;
	@Inject
	reportDomainQueryDAOImpl reportDomainQueryDAO;
	@Inject
	reportSrcQueryDAOImpl reportSrcQueryDAO;
	
	@Override
	public List<reportApplianceVO> reportMainApp() throws Exception {
		// TODO Auto-generated method stub
		return reportAppDAO.mainReportApp();
	}
	@Override
	public List<reportPacketVO> reportMainDnsPacket() throws Exception {
		// TODO Auto-generated method stub
		return reportPacketDAO.mainReportDnsPacket();
	}
	@Override
	public List<reportPacketVO> reportMainDDosPacket() throws Exception {
		// TODO Auto-generated method stub
		return reportPacketDAO.mainReportDDosPacket();
	}
	@Override
	public List<reportDomainQueryVO> reportMainDnsDomain() throws Exception {
		// TODO Auto-generated method stub
		return reportDomainQueryDAO.reportMainDnsDoaminQuery();
	}
	@Override
	public List<reportDomainQueryVO> reportMainDDosDomain() throws Exception {
		// TODO Auto-generated method stub
		return reportDomainQueryDAO.reportMainDDosDomainQuery();
	}
	@Override
	public List<reportSrcQueryVO> reportMainDnsSrc() throws Exception {
		// TODO Auto-generated method stub
		return reportSrcQueryDAO.reportMainDnsSrcQuery();
	}
	@Override
	public List<reportSrcQueryVO> reportMainDDosSrc() throws Exception {
		// TODO Auto-generated method stub
		return reportSrcQueryDAO.reportMainDDosSrcQuery();
	}
	@Override
	public List<reportApplianceVO> dailyMainApp(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportAppDAO.dailyReportApp(vo);
	}
	@Override
	public List<reportPacketVO> dailyMainDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportPacketDAO.dailyReportDnsPacket(vo);
	}
	@Override
	public List<reportPacketVO> dailyMainDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportPacketDAO.dailyReportDDosPacket(vo);
	}
	@Override
	public List<reportDomainQueryVO> dailyMainDnsDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportDomainQueryDAO.dailyMainDnsDoaminQuery(vo);
	}
	@Override
	public List<reportDomainQueryVO> dailyMainDDosDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportDomainQueryDAO.dailyMainDDosDomainQuery(vo);
	}
	@Override
	public List<reportSrcQueryVO> dailyMainDnsSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportSrcQueryDAO.dailyMainDnsSrcQuery(vo);
	}
	@Override
	public List<reportSrcQueryVO> dailyMainDDosSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportSrcQueryDAO.dailyMainDDosSrcQuery(vo);
	}
	@Override
	public List<reportApplianceVO> weeklyMainApp(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportAppDAO.weeklyReportApp(vo);
	}
	@Override
	public List<reportPacketVO> weeklyMainDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportPacketDAO.weeklyReportDnsPacket(vo);
	}
	@Override
	public List<reportPacketVO> weeklyMainDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportPacketDAO.weeklyReportDDosPacket(vo);
	}
	@Override
	public List<reportDomainQueryVO> weeklyMainDnsDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportDomainQueryDAO.weeklyMainDnsDoaminQuery(vo);
	}
	@Override
	public List<reportDomainQueryVO> weeklyMainDDosDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportDomainQueryDAO.weeklyMainDDosDomainQuery(vo);
	}
	@Override
	public List<reportSrcQueryVO> weeklyMainDnsSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportSrcQueryDAO.weeklyMainDnsSrcQuery(vo);
	}
	@Override
	public List<reportSrcQueryVO> weeklyMainDDosSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportSrcQueryDAO.weeklyMainDDosSrcQuery(vo);
	}
	@Override
	public List<reportApplianceVO> monthlyMainApp(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportAppDAO.monthlyReportApp(vo);
	}
	@Override
	public List<reportPacketVO> monthlyMainDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportPacketDAO.monthlyReportDnsPacket(vo);
	}
	@Override
	public List<reportPacketVO> monthlyMainDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportPacketDAO.monthlyReportDDosPacket(vo);
	}
	@Override
	public List<reportDomainQueryVO> monthlyMainDnsDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportDomainQueryDAO.monthlyMainDnsDoaminQuery(vo);
	}
	@Override
	public List<reportDomainQueryVO> monthlyMainDDosDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportDomainQueryDAO.monthlyMainDDosDomainQuery(vo);
	}
	@Override
	public List<reportSrcQueryVO> monthlyMainDnsSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportSrcQueryDAO.dailyMainDnsSrcQuery(vo);
	}
	@Override
	public List<reportSrcQueryVO> monthlyMainDDosSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return reportSrcQueryDAO.monthlyMainDDosSrcQuery(vo);
	}
	
}

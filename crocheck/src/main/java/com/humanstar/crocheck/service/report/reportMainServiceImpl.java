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
	
}

package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.report.dto.reportPacketVO;

@Repository
public class reportPacketDAOImpl implements reportPacketDAO{

	@Inject
	SqlSession SqlSession;

	@Override
	public List<reportPacketVO> mainReportDnsPacket() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportPacket.basedns");
	}

	@Override
	public List<reportPacketVO> mainReportDDosPacket() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportPacket.baseddos");
	}

}

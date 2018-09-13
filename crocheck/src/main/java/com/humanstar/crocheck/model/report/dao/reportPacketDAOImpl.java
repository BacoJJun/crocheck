package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.report.dto.reportPacketVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

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

	@Override
	public List<reportPacketVO> dailyReportDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportPacket.dailydns",vo);
	}

	@Override
	public List<reportPacketVO> dailyReportDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportPacket.dailyddos", vo);
	}

	@Override
	public List<reportPacketVO> weeklyReportDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportPacket.weekdns", vo);
	}

	@Override
	public List<reportPacketVO> weeklyReportDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportPacket.weekddos", vo);
	}

	@Override
	public List<reportPacketVO> monthlyReportDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportPacket.monthdns", vo);
	}

	@Override
	public List<reportPacketVO> monthlyReportDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportPacket.monthddos", vo);
	}

}

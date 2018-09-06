package com.humanstar.crocheck.model.statistics.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.model.statistics.dto.statPacketVO;

@Repository
public class statisticsPacketDAOImpl implements statisticsPacketDAO{

	@Inject
	SqlSession SqlSession;

	@Override
	public List<statPacketVO> lastDnsPacket() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("statPacket.lastdns");
	}

	@Override
	public List<statPacketVO> lastDDosPacket() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("statPacket.lastddos");
	}

	@Override
	public List<statPacketVO> minDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("statPacket.mindns", vo);
	}

	@Override
	public List<statPacketVO> minDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("statPacket.minddos", vo);
	}

	@Override
	public List<statPacketVO> hourDnsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("statPacket.hourdns", vo);
	}

	@Override
	public List<statPacketVO> hourDDosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("statPacket.hourdns", vo);
	}
	
	
}

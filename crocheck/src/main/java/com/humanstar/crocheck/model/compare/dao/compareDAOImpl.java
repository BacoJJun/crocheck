package com.humanstar.crocheck.model.compare.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.compare.dto.compareDomainQueryVO;
import com.humanstar.crocheck.model.compare.dto.comparePacketVO;
import com.humanstar.crocheck.model.compare.dto.compareSrcQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

@Repository
public class compareDAOImpl implements compareDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<comparePacketVO> comparednsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("compare.packetdnscompare", vo);
	}

	@Override
	public List<comparePacketVO> compareddosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("compare.packetddoscompare", vo);
	}

	@Override
	public List<compareDomainQueryVO> comparednsDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("compare.dnsdomaincompare", vo);
	}

	@Override
	public List<compareDomainQueryVO> compareddosDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("compare.ddosdomaincompare", vo);
	}

	@Override
	public List<compareSrcQueryVO> comparednsClient(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("compare.dnssrccompare", vo);
	}

	@Override
	public List<compareSrcQueryVO> compareddosClient(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("compare.ddossrccompare", vo);
	}

}

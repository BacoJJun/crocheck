package com.humanstar.crocheck.model.statistics.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.statistics.dto.domainQueryVO;
import com.humanstar.crocheck.model.statistics.dto.srcQueryVO;

@Repository
public class statisticsQueryStatDAOImpl implements statisticsQueryStatDAO{

	@Inject 
	SqlSession SqlSession;

	@Override
	public List<domainQueryVO> lastDnsDomain() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.lastdnsdomain");
	}

	@Override
	public List<domainQueryVO> lastDDosDomain() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.lastddosdomain");
	}

	@Override
	public List<srcQueryVO> lastDnsSrc() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.lastdnssrc");
	}

	@Override
	public List<srcQueryVO> lastDDosSrc() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.lastddossrc");
	}
	
}

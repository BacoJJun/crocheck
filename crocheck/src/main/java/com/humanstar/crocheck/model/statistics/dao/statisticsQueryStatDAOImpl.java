package com.humanstar.crocheck.model.statistics.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
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

	@Override
	public List<domainQueryVO> minDnsDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.mindnsdomain", vo);
	}

	@Override
	public List<domainQueryVO> minDDosDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.minddosdomain",vo);
	}

	@Override
	public List<srcQueryVO> minDnsSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.mindnssrc",vo);
	}

	@Override
	public List<srcQueryVO> minDDosSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.minddossrc",vo);
	}

	@Override
	public List<domainQueryVO> hourDnsDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.hourdnsdomain",vo);
	}

	@Override
	public List<domainQueryVO> hourDDosDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.hourddosdomain",vo);
	}

	@Override
	public List<srcQueryVO> hourDnsSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.hourdnssrc",vo);
	}

	@Override
	public List<srcQueryVO> hourDDosSrc(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("querystatus.hourddossrc",vo);
	}
	
}

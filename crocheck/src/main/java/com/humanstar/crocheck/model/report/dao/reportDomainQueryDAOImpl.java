package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.report.dto.reportDomainQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

@Repository
public class reportDomainQueryDAOImpl implements reportDomainQueryDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<reportDomainQueryVO> reportMainDnsDoaminQuery() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.basednsdomain");
	}

	@Override
	public List<reportDomainQueryVO> reportMainDDosDomainQuery() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.baseddosdomain");
	}

	@Override
	public List<reportDomainQueryVO> dailyMainDnsDoaminQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.dailydns");
	}

	@Override
	public List<reportDomainQueryVO> dailyMainDDosDomainQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.dailyddos");
	}

	@Override
	public List<reportDomainQueryVO> weeklyMainDnsDoaminQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.weekdns");
	}

	@Override
	public List<reportDomainQueryVO> weeklyMainDDosDomainQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.weekddos");
	}

	@Override
	public List<reportDomainQueryVO> monthlyMainDnsDoaminQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.monthdns");
	}

	@Override
	public List<reportDomainQueryVO> monthlyMainDDosDomainQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.monthddos");
	}

}

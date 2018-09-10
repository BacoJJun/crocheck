package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.report.dto.reportDomainQueryVO;

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

}

package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.report.dto.reportSrcQueryVO;

@Repository
public class reportSrcQueryDAOImpl implements reportSrcQueryDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<reportSrcQueryVO> reportMainDnsSrcQuery() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.basednssrc");
	}

	@Override
	public List<reportSrcQueryVO> reportMainDDosSrcQuery() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.baseddossrc");
	}
	
}

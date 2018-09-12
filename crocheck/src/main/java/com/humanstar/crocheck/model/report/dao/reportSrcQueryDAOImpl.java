package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.report.dto.reportSrcQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

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

	@Override
	public List<reportSrcQueryVO> dailyMainDnsSrcQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.daysdnssrc");
	}

	@Override
	public List<reportSrcQueryVO> dailyMainDDosSrcQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.daysddossrc");
	}

	@Override
	public List<reportSrcQueryVO> weeklyMainDnsSrcQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.weeksdnsdomain");
	}

	@Override
	public List<reportSrcQueryVO> weeklyMainDDosSrcQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.weeksddosdomain");
	}

	@Override
	public List<reportSrcQueryVO> monthlyMainDnsSrcQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.monthdnssrc");
	}

	@Override
	public List<reportSrcQueryVO> monthlyMainDDosSrcQuery(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportQuery.monthddossrc");
	}
	
}

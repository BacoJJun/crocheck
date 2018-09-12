package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.report.dto.reportApplianceVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

@Repository
public class reportAppDAOImpl implements reportAppDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<reportApplianceVO> mainReportApp() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportApp.basehour");
	}

	@Override
	public List<reportApplianceVO> dailyReportApp(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportApp.daysApp");
	}

	@Override
	public List<reportApplianceVO> weeklyReportApp(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportApp.weeksApp");
	}

	@Override
	public List<reportApplianceVO> monthlyReportApp(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportApp.monthApp");
	}

}

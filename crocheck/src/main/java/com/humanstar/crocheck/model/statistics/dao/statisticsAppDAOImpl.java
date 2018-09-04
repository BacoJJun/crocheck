package com.humanstar.crocheck.model.statistics.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.statistics.dto.statApplianceVO;

@Repository
public class statisticsAppDAOImpl implements statisticsAppDAO{

	@Inject
	SqlSession SqlSession;

	@Override
	public List<statApplianceVO> lastApplianceStat() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("statApp.last");
	}
	
}

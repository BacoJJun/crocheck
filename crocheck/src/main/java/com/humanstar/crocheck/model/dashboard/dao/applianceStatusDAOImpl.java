package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dto.applianceStatusVO;

@Repository
public class applianceStatusDAOImpl implements applianceStatusDAO{
	
	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<applianceStatusVO> applianceStatus() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dashboard.applianceStatus");
	}

}

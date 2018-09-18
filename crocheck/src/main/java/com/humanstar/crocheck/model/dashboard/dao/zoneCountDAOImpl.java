package com.humanstar.crocheck.model.dashboard.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.dashboard.dto.zoneCountVO;

@Repository
public class zoneCountDAOImpl implements zoneCountDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public zoneCountVO zoneCount() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("dashboard.zonecount");
	}
	

}

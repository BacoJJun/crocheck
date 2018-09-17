package com.humanstar.crocheck.model.alert.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.alert.dto.alertNowVO;

@Repository
public class alertNowDAOImpl implements alertNowDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public alertNowVO alertNow() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("alertList.nowstat");
	}

}

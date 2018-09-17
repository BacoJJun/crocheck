package com.humanstar.crocheck.model.alert.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.alert.dto.alertVO;

@Repository
public class alertDAOImpl implements alertDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public alertVO alertList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("alertList.baseList");
	}

	@Override
	public void alertUpdate(alertVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("alertList.alertupdate", vo);
	}

}

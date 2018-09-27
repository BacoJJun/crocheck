package com.humanstar.crocheck.model.setting.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.setting.dto.systemVO;

@Repository
public class systemDAOImpl implements systemDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public systemVO systemInfo() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("setting.system");
	}

}

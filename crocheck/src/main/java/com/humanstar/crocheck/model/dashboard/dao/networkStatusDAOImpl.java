package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dto.networkStatusVO;

@Repository
public class networkStatusDAOImpl implements networkStatusDAO{

	@Inject 
	SqlSession Sqlsession;
	
	@Override
	public List<networkStatusVO> networkStatus() throws Exception {
		// TODO Auto-generated method stub
		return Sqlsession.selectList("dashboard.networkStatus");
	}
	
}

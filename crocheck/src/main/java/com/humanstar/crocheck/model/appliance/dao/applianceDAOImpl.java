package com.humanstar.crocheck.model.appliance.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.appliance.dto.applianceVO;
import com.humanstar.crocheck.model.list.dao.listDAOImpl;

@Repository
public class applianceDAOImpl implements applianceDAO {
	private static final Logger logger = LoggerFactory.getLogger(listDAOImpl.class);
	
	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<applianceVO> applianceStatus() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("appliance.nowStatus");
	}

}

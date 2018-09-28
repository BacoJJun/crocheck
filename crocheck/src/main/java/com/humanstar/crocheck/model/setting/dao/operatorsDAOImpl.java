package com.humanstar.crocheck.model.setting.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.setting.dto.operatorsVO;
import com.humanstar.crocheck.service.setting.settingServiceImpl;


@Repository
public class operatorsDAOImpl implements operatorsDAO{
	private static final Logger logger = LoggerFactory.getLogger(operatorsDAOImpl.class);
	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<operatorsVO> operatorList() throws Exception {
		// TODO Auto-generated method stub
		logger.info("DAO call");
		return SqlSession.selectList("setting.operators");
	}
	
	@Override
	public operatorsVO searchOperator(operatorsVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("setting.searchoperator",vo);
	}
	
	@Override
	public void deleteOperator(operatorsVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.delete("setting.deleteoperator", vo);
	}



}

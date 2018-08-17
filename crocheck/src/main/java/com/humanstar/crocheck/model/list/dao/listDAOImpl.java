package com.humanstar.crocheck.model.list.dao;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.list.dto.listVO;

@Repository
public class listDAOImpl implements listDAO {
	private static final Logger logger = LoggerFactory.getLogger(listDAOImpl.class);

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<listVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("list.listAll");
	}
	
	
}

package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.policy.dto.ddosBlockStatusVO;

@Repository
public class ddosBlockStatusDAOImpl implements ddosBlockStatusDAO{

	@Inject
	SqlSession SqlSession;

	@Override
	public List<ddosBlockStatusVO> ddosBlockStatus() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnspolicy.ddosblockstatus");
	}
	
}

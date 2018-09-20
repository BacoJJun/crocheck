package com.humanstar.crocheck.model.policy.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.policy.dto.dhcpCountVO;
import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;

@Repository
public class dhcpCountDAOImpl implements dhcpCountDAO{

	@Inject 
	SqlSession SqlSession;
	
	@Override
	public dhcpCountVO dhcpCountValue() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("dhcppolicy.dhcpcount");
	}

	@Override
	public dhcpCountVO dhcpsubCountValue(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("dhcppolicy.dhcpcount", vo);
	}
	

}

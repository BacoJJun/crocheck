package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.dashboard.dto.dnsStatVO;

@Repository
public class dnsStatDAOImpl implements dnsStatDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<dnsStatVO> dnsStatusList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnsstatus.dnsstat");
	}

	@Override
	public List<dnsStatVO> ddosStatusList() throws Exception {
		// TODO Auto-generated method stub
		return  SqlSession.selectList("dnsstatus.ddosstat");
	}

}

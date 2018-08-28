package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.dashboard.dto.todayDnsVO;

@Repository
public class todayDnsDAOImpl implements todayDnsDAO{

	@Inject 
	SqlSession SqlSession;
	
	@Override
	public List<todayDnsVO> todayDnsList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("DnsGraph.today");
	}

	@Override
	public List<todayDnsVO> yesterdayDnsList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("DnsGraph.yesterday");
	}

	
}

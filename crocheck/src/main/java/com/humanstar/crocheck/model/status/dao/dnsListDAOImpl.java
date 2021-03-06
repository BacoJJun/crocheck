package com.humanstar.crocheck.model.status.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.model.status.dto.dnsListVO;

@Repository
public class dnsListDAOImpl implements dnsListDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<dnsListVO> dnsNowList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnsstatus.dnsnowlist");
	}

	@Override
	public List<dnsListVO> dnsSearchList(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnsstatus.searchdns", vo);
	}

	
}

package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

@Repository
public class dnspolicyDAOImpl implements dnspolicyDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<dnspolicyVO> dnsTableList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnspolicy.dnstable");
	}

	@Override
	public List<dnspolicyVO> subDnsList(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnspolicy.subdnstable", vo);
	}

	@Override
	public List<dnspolicyVO> searchDnsDomain(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return  SqlSession.selectList("dnspolicy.searchdnsdomain", vo);
	}

}

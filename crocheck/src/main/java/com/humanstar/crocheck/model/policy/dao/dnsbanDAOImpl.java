package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;
import com.humanstar.crocheck.service.policy.dnsbanServiceImpl;

@Repository
public class dnsbanDAOImpl implements dnsbanDAO {
	private static final Logger logger = LoggerFactory.getLogger(dnsbanDAOImpl.class);

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<dnspolicyVO> dnsbanlist() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnspolicy.dnsblock");
	}

	@Override
	public void insertDnsBan(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("dnspolicy.insertdnsban", vo);
	}

	@Override
	public void deleteDnsBan(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.delete("dnspolicy.deletednsban", vo);
	}

	@Override
	public dnspolicyVO dnsbanSearch(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("dnspolicy.dnsblocksearch", vo);
	}

	@Override
	public void insertDnsSOABan(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("dnspolicy.insertdnsbansoa",vo);
	}
	
}

package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

@Repository
public class dnsbanDAOImpl implements dnsbanDAO {

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
	
}

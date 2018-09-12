package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;
import com.humanstar.crocheck.service.policy.dnspolicyServiceImpl;

@Repository
public class dnspolicyDAOImpl implements dnspolicyDAO{
	private static final Logger logger = LoggerFactory.getLogger(dnspolicyDAOImpl.class);

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

	@Override
	public List<dnspolicyVO> catchDnsDomain(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnspolicy.dnscatch",vo);
	}

	@Override
	public List<dnspolicyVO> zonelist() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnspolicy.zonelist");
	}

	@Override
	public void insertdns(dnspolicyVO vo) throws Exception {
		logger.info(vo.toString());
		SqlSession.insert("dnspolicy.dnsinsert");
		
	}

	@Override
	public void updatedns(dnspolicyVO vo) throws Exception {
		SqlSession.update("dnspolicy.dnsupdate");
		
	}

	@Override
	public void delete(dnspolicyVO vo) throws Exception {
		SqlSession.delete("dnspolicy.dnsdelete");
		
	}

	@Override
	public void insertsubdomain(dnspolicyVO vo) throws Exception {
		SqlSession.insert("dnspolicy.subdomaininsert");
		
	}

	@Override
	public void updatesubdomain(dnspolicyVO vo) throws Exception {
		SqlSession.update("dnspolicyu.subdomainupdate");
		
	}

	@Override
	public void deletesubdomain(dnspolicyVO vo) throws Exception {
		SqlSession.delete("dnspolicy.dnsdelete");
		
	}

}

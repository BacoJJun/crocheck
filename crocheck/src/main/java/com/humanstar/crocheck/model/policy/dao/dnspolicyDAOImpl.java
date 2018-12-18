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
	public List<dnspolicyVO> zonechecklist(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnspolicy.zonechecklist", vo);
	}

	@Override
	public void insertdns(dnspolicyVO vo) throws Exception {
		SqlSession.insert("dnspolicy.dnsinsert", vo);
		
	}

	@Override
	public void updatedns(dnspolicyVO vo) throws Exception {
		SqlSession.update("dnspolicy.dnsupdate", vo);
		
	}

	@Override
	public void delete(dnspolicyVO vo) throws Exception {
		SqlSession.delete("dnspolicy.dnsdelete", vo);
		
	}

	@Override
	public void insertsubdomain(dnspolicyVO vo) throws Exception {
		SqlSession.insert("dnspolicy.subdomaininsert", vo);
		
	}

	@Override
	public void updatesubdomain(dnspolicyVO vo) throws Exception {
		SqlSession.update("dnspolicy.subdomainupdate", vo);
		
	}

	@Override
	public void deletesubdomain(dnspolicyVO vo) throws Exception {
		SqlSession.delete("dnspolicy.subdomaindelete", vo);
		
	}

	@Override
	public dnspolicyVO idsearchDns(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("dnspolicy.idsearchdns", vo);
	}

	@Override
	public List<dnspolicyVO> zonesearhDns(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnspolicy.zonesearchdns", vo);
	}

	@Override
	public List<dnspolicyVO> dnsBackupData() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dnspolicy.dnsbackup");
	}

	@Override
	public void updatesubdomainlist(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("dnspolicy.subdomainlistupdate",vo);
	}

	@Override
	public void insertmxsubdomain(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("dnspolicy.subdomainmxinsert",vo);
	}

	@Override
	public void updatemxsubdomain(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("dnspolicy.subdomainmxupdate",vo);
	}

}

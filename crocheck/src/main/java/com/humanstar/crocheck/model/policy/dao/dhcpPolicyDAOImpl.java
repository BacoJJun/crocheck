package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;
import com.humanstar.crocheck.model.policy.dto.dhcpRentVO;
import com.humanstar.crocheck.model.policy.dto.dhcpSubVO;

@Repository
public class dhcpPolicyDAOImpl implements dhcpPolicyDAO{

	@Inject
	SqlSession SqlSession;

	@Override
	public List<dhcpPolicyVO> dhcpPolicyList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dhcppolicy.dhcptable");
	}

	@Override
	public List<dhcpSubVO> dhcpSubList(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dhcppolicy.dhcpsubtable",vo);
	}

	@Override
	public List<dhcpRentVO> dhcpRentList(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dhcppolicy.dhcprenttable",vo);
	}

	@Override
	public void insertDhcp(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("dhcppolicy.insertdhcp",vo);
	}

	@Override
	public dhcpPolicyVO catchDhcp(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("dhcppolicy.catchdhcp",vo);
	}
	
	@Override
	public void updateDhcp(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("dhcppolicy.updatedhcp",vo);
	}

	@Override
	public void deleteDhcp(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.delete("dhcppolicy.deletedhcp",vo);
	}

	@Override
	public dhcpSubVO catchsubDhcp(dhcpSubVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("dhcppolicy.catchsubdhcp",vo);
	}

	@Override
	public void insertSubDhcp(dhcpSubVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("dhcppolicy.insertsubdhcp",vo);
	}

	@Override
	public void updateSubDhcp(dhcpSubVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("dhcppolicy.updatesubdhcp",vo);
	}

	@Override
	public void deleteSubDhcp(dhcpSubVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.delete("dhcppolicy.deletesubdhcp",vo);
	}


}

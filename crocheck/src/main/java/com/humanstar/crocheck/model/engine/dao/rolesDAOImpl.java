package com.humanstar.crocheck.model.engine.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.engine.dto.ntpVO;
import com.humanstar.crocheck.model.engine.dto.rolesDhcpVO;
import com.humanstar.crocheck.model.engine.dto.rolesVO;

@Repository
public class rolesDAOImpl implements rolesDAO{

	@Inject 
	SqlSession SqlSession;
	
	@Override
	public rolesVO basicRoles() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("roles.basicroles");
	}

	@Override
	public List<ntpVO> ntpList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("roles.ntpserver");
	}

	@Override
	public rolesDhcpVO basicDhcpRoles() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("roles.dhcproles");
	}

	@Override
	public void insertNtp(ntpVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("roles.insertntp",vo);
	}

	@Override
	public void deleteNtp(ntpVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.delete("roles.deletentp",vo);
	}

	@Override
	public void updateDnsRoles(rolesVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("roles.updatednsroles", vo);
	}

	@Override
	public void updateNtpRoles(rolesVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("roles.updatentproles", vo);
	}

	@Override
	public void updateDhcp(rolesDhcpVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("roles.updatedhcp",vo);
	}

	@Override
	public void updateDhcpRoles(rolesDhcpVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("roles.updatedhcproles",vo);
	}

}

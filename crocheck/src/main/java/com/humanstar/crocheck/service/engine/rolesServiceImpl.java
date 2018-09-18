package com.humanstar.crocheck.service.engine;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.engine.dao.rolesDAOImpl;
import com.humanstar.crocheck.model.engine.dto.ntpVO;
import com.humanstar.crocheck.model.engine.dto.rolesDhcpVO;
import com.humanstar.crocheck.model.engine.dto.rolesVO;

@Service
public class rolesServiceImpl implements rolesService{

	@Inject
	rolesDAOImpl rolesDAO;
	
	@Override
	public rolesVO basicRoles() throws Exception {
		// TODO Auto-generated method stub
		return rolesDAO.basicRoles();
	}

	@Override
	public List<ntpVO> ntpList() throws Exception {
		// TODO Auto-generated method stub
		return rolesDAO.ntpList();
	}

	@Override
	public rolesDhcpVO basicDhcpRoles() throws Exception {
		// TODO Auto-generated method stub
		return rolesDAO.basicDhcpRoles();
	}

	@Override
	public void insertNtp(ntpVO vo) throws Exception {
		// TODO Auto-generated method stub
		rolesDAO.insertNtp(vo);
	}

	@Override
	public void deleteNtp(ntpVO vo) throws Exception {
		// TODO Auto-generated method stub
		rolesDAO.deleteNtp(vo);
	}

	@Override
	public void updateDhcpRolse(rolesDhcpVO vo) throws Exception {
		// TODO Auto-generated method stub
		rolesDAO.updateDhcpRoles(vo);
	}

	@Override
	public void updateDnsRolse(rolesVO vo) throws Exception {
		// TODO Auto-generated method stub
		rolesDAO.updateDnsRoles(vo);
	}

	@Override
	public void updateNtpRolse(rolesVO vo) throws Exception {
		// TODO Auto-generated method stub
		rolesDAO.updateNtpRoles(vo);
	}

	@Override
	public void updateDhcp(rolesDhcpVO vo) throws Exception {
		// TODO Auto-generated method stub
		rolesDAO.updateDhcp(vo);
	}

}

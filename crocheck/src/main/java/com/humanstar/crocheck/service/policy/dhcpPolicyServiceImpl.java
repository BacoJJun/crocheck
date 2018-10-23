package com.humanstar.crocheck.service.policy;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.policy.dao.dhcpPolicyDAOImpl;
import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;
import com.humanstar.crocheck.model.policy.dto.dhcpRentVO;
import com.humanstar.crocheck.model.policy.dto.dhcpSubVO;

@Service
public class dhcpPolicyServiceImpl implements dhcpPolicyService{

	@Inject 
	dhcpPolicyDAOImpl dhcpPolicyDAO;

	@Override
	public List<dhcpPolicyVO> dhcpTableList() throws Exception {
		// TODO Auto-generated method stub
		return dhcpPolicyDAO.dhcpPolicyList();
	}

	@Override
	public List<dhcpSubVO> dhcpSubList(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dhcpPolicyDAO.dhcpSubList(vo);
	}

	@Override
	public List<dhcpRentVO> dhcpRentList(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dhcpPolicyDAO.dhcpRentList(vo);
	}

	@Override
	public void insertDhcp(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dhcpPolicyDAO.insertDhcp(vo);
	}
	
	@Override
	public dhcpPolicyVO catchDhcp(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return 	dhcpPolicyDAO.catchDhcp(vo);
	}
	
	@Override
	public List<dhcpPolicyVO> dhcpchecklist(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return 	dhcpPolicyDAO.dhcpchecklist(vo);
	}
	
	@Override
	public void updateDhcp(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dhcpPolicyDAO.updateDhcp(vo);
	}

	@Override
	public void deleteDhcp(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dhcpPolicyDAO.deleteDhcp(vo);
	}

	@Override
	public dhcpSubVO catchsubDhcp(dhcpSubVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dhcpPolicyDAO.catchsubDhcp(vo);
	}

	@Override
	public void insertSubDhcp(dhcpSubVO vo) throws Exception {
		// TODO Auto-generated method stub
		dhcpPolicyDAO.insertSubDhcp(vo);
	}

	@Override
	public void updateSubDhcp(dhcpSubVO vo) throws Exception {
		// TODO Auto-generated method stub
		dhcpPolicyDAO.updateSubDhcp(vo);
	}

	@Override
	public void deleteSubDhcp(dhcpSubVO vo) throws Exception {
		// TODO Auto-generated method stub
		dhcpPolicyDAO.deleteSubDhcp(vo);
	}


	
}

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
	
	
}

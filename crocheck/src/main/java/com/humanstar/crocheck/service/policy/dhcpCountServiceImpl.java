package com.humanstar.crocheck.service.policy;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.policy.dao.dhcpCountDAOImpl;
import com.humanstar.crocheck.model.policy.dto.dhcpCountVO;
import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;

@Service
public class dhcpCountServiceImpl implements dhcpCountService{

	@Inject
	dhcpCountDAOImpl dhcpCountDAO;
	
	@Override
	public dhcpCountVO dhcoCountValue() throws Exception {
		// TODO Auto-generated method stub
		return dhcpCountDAO.dhcpCountValue();
	}

	@Override
	public dhcpCountVO dhcpsubCountValue(dhcpPolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dhcpCountDAO.dhcpsubCountValue(vo);
	}

}

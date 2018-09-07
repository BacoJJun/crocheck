package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;
import com.humanstar.crocheck.model.policy.dto.dhcpRentVO;
import com.humanstar.crocheck.model.policy.dto.dhcpSubVO;

public interface dhcpPolicyDAO {
	public List<dhcpPolicyVO> dhcpPolicyList() throws Exception;
	public List<dhcpSubVO> dhcpSubList(dhcpPolicyVO vo) throws Exception;
	public List<dhcpRentVO> dhcpRentList(dhcpPolicyVO vo) throws Exception;
}

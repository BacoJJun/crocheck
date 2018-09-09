package com.humanstar.crocheck.service.policy;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;
import com.humanstar.crocheck.model.policy.dto.dhcpRentVO;
import com.humanstar.crocheck.model.policy.dto.dhcpSubVO;

public interface dhcpPolicyService {
	public List<dhcpPolicyVO> dhcpTableList() throws Exception;
	public List<dhcpSubVO> dhcpSubList(dhcpPolicyVO vo) throws Exception;
	public List<dhcpRentVO> dhcpRentList(dhcpPolicyVO vo) throws Exception;
}
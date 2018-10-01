package com.humanstar.crocheck.service.policy;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;
import com.humanstar.crocheck.model.policy.dto.dhcpRentVO;
import com.humanstar.crocheck.model.policy.dto.dhcpSubVO;

public interface dhcpPolicyService {
	public List<dhcpPolicyVO> dhcpTableList() throws Exception;
	public List<dhcpSubVO> dhcpSubList(dhcpPolicyVO vo) throws Exception;
	public List<dhcpRentVO> dhcpRentList(dhcpPolicyVO vo) throws Exception;
	public void insertDhcp(dhcpPolicyVO vo) throws Exception;
	public dhcpPolicyVO catchDhcp(dhcpPolicyVO vo) throws Exception;
	public void updateDhcp(dhcpPolicyVO vo) throws Exception;
	public void deleteDhcp(dhcpPolicyVO vo) throws Exception;
	public dhcpSubVO catchsubDhcp(dhcpSubVO vo) throws Exception;
	public void insertSubDhcp(dhcpSubVO vo) throws Exception;
	public void updateSubDhcp(dhcpSubVO vo) throws Exception;
	public void deleteSubDhcp(dhcpSubVO vo) throws Exception;
}

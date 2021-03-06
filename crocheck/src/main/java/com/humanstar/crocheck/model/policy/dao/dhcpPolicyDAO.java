package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;
import com.humanstar.crocheck.model.policy.dto.dhcpRentVO;
import com.humanstar.crocheck.model.policy.dto.dhcpSubVO;

public interface dhcpPolicyDAO {
	public List<dhcpPolicyVO> dhcpPolicyList() throws Exception;
	public List<dhcpSubVO> dhcpSubList(dhcpPolicyVO vo) throws Exception;
	public List<dhcpRentVO> dhcpRentList(dhcpPolicyVO vo) throws Exception;
	public void insertDhcp(dhcpPolicyVO vo) throws Exception;
	public dhcpPolicyVO catchDhcp(dhcpPolicyVO vo) throws Exception;
	public List<dhcpPolicyVO> dhcpchecklist(dhcpPolicyVO vo) throws Exception;
	public void updateDhcp(dhcpPolicyVO vo) throws Exception;
	public void deleteDhcp(dhcpPolicyVO vo) throws Exception;
	public dhcpSubVO catchsubDhcp(dhcpSubVO vo) throws Exception;
	
	public void insertSubDhcp(dhcpSubVO vo) throws Exception;
	public void updateSubDhcp(dhcpSubVO vo) throws Exception;
	public void deleteSubDhcp(dhcpSubVO vo) throws Exception;
	
	public List<dhcpSubVO> backupDhcpSub() throws Exception;
	public List<dhcpRentVO> backupDhcpRent() throws Exception;
}

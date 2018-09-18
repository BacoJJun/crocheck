package com.humanstar.crocheck.model.engine.dao;

import java.util.List;

import com.humanstar.crocheck.model.engine.dto.ntpVO;
import com.humanstar.crocheck.model.engine.dto.rolesDhcpVO;
import com.humanstar.crocheck.model.engine.dto.rolesVO;

public interface rolesDAO {
	public rolesVO basicRoles() throws Exception;
	public List<ntpVO> ntpList() throws Exception;
	public rolesDhcpVO basicDhcpRoles() throws Exception;
	
	public void updateDnsRoles(rolesVO vo) throws Exception;
	public void updateNtpRoles(rolesVO vo) throws Exception;
	public void updateDhcp(rolesDhcpVO vo) throws Exception;
	
	public void insertNtp(ntpVO vo) throws Exception;
	public void deleteNtp(ntpVO vo) throws Exception;
	public void updateDhcpRoles(rolesDhcpVO vo) throws Exception;
}

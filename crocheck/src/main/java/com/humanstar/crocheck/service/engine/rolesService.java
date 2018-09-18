package com.humanstar.crocheck.service.engine;

import java.util.List;

import com.humanstar.crocheck.model.engine.dto.ntpVO;
import com.humanstar.crocheck.model.engine.dto.rolesDhcpVO;
import com.humanstar.crocheck.model.engine.dto.rolesVO;

public interface rolesService {
	public rolesVO basicRoles() throws Exception;
	public List<ntpVO> ntpList() throws Exception;
	public rolesDhcpVO basicDhcpRoles() throws Exception;
	
	public void updateDnsRolse(rolesVO vo) throws Exception;
	public void updateNtpRolse(rolesVO vo) throws Exception;
	public void updateDhcp(rolesDhcpVO vo) throws Exception;
	public void insertNtp(ntpVO vo) throws Exception;
	public void deleteNtp(ntpVO vo) throws Exception;
	public void updateDhcpRolse(rolesDhcpVO vo) throws Exception;
}

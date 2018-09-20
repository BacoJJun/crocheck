package com.humanstar.crocheck.model.policy.dao;

import com.humanstar.crocheck.model.policy.dto.dhcpCountVO;
import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;

public interface dhcpCountDAO {
	public dhcpCountVO dhcpCountValue() throws Exception;
	public dhcpCountVO dhcpsubCountValue(dhcpPolicyVO vo ) throws Exception;
}

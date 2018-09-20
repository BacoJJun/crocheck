package com.humanstar.crocheck.service.policy;

import com.humanstar.crocheck.model.policy.dto.dhcpCountVO;
import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;

public interface dhcpCountService {
	public dhcpCountVO dhcoCountValue() throws Exception;
	public dhcpCountVO dhcpsubCountValue(dhcpPolicyVO vo) throws Exception;
}

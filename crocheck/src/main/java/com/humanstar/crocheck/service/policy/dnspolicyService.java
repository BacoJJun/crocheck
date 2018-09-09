package com.humanstar.crocheck.service.policy;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

public interface dnspolicyService {
	public List<dnspolicyVO> dnsTableList() throws Exception;
	public List<dnspolicyVO> subDnsList(dnspolicyVO vo) throws Exception;
	public List<dnspolicyVO> searchDnsDomain(dnspolicyVO vo) throws Exception;
}
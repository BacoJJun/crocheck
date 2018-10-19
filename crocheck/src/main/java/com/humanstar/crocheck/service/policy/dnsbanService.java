package com.humanstar.crocheck.service.policy;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

public interface dnsbanService {
	public List<dnspolicyVO> dnsbanlist() throws Exception;
	public void insertDnsBan(dnspolicyVO vo) throws Exception;
	public void deleteDnsBan(dnspolicyVO vo) throws Exception;
	public dnspolicyVO dnsbanSearch(dnspolicyVO vo) throws Exception;
	public void insertDnsSOABan(dnspolicyVO vo) throws Exception;
}

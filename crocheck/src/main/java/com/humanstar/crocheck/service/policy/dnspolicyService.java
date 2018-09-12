package com.humanstar.crocheck.service.policy;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

public interface dnspolicyService {
	public List<dnspolicyVO> dnsTableList() throws Exception;
	public List<dnspolicyVO> subDnsList(dnspolicyVO vo) throws Exception;
	public List<dnspolicyVO> searchDnsDomain(dnspolicyVO vo) throws Exception;
	public List<dnspolicyVO> catchDnsDomain(dnspolicyVO vo) throws Exception;
	public List<dnspolicyVO> zonelist() throws Exception;
	
	public void insertdns(dnspolicyVO vo) throws Exception;
	public void updatedns(dnspolicyVO vo) throws Exception;
	public void delete(dnspolicyVO vo) throws Exception;
	
	public void insertsubdomain(dnspolicyVO vo) throws Exception;
	public void updatesubdomain(dnspolicyVO vo) throws Exception;
	public void deletesubdomain(dnspolicyVO vo) throws Exception;
}

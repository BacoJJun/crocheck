package com.humanstar.crocheck.service.policy;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

public interface dnspolicyService {
	public List<dnspolicyVO> dnsTableList() throws Exception;
	public List<dnspolicyVO> subDnsList(dnspolicyVO vo) throws Exception;
	public List<dnspolicyVO> searchDnsDomain(dnspolicyVO vo) throws Exception;
	public List<dnspolicyVO> catchDnsDomain(dnspolicyVO vo) throws Exception;
	public List<dnspolicyVO> zonelist() throws Exception;
	public List<dnspolicyVO> zonechecklist(dnspolicyVO vo) throws Exception;
	
	public void insertdns(dnspolicyVO vo) throws Exception;
	public void updatedns(dnspolicyVO vo) throws Exception;
	public void delete(dnspolicyVO vo) throws Exception;
	
	public void insertsubdomain(dnspolicyVO vo) throws Exception;
	public void insertmxsubdomain(dnspolicyVO vo) throws Exception;
	public void updatesubdomain(dnspolicyVO vo) throws Exception;
	public void updatesubdomainmx(dnspolicyVO vo) throws Exception;
	public void updatesubdomainlist(dnspolicyVO vo) throws Exception;
	public void deletesubdomain(dnspolicyVO vo) throws Exception;
	
	public dnspolicyVO idsearchDns(dnspolicyVO vo) throws Exception;
	public List<dnspolicyVO> zonesearchDns(dnspolicyVO vo) throws Exception;
}

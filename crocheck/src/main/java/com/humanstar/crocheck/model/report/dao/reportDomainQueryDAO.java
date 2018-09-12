package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportDomainQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

public interface reportDomainQueryDAO {
	public List<reportDomainQueryVO> reportMainDnsDoaminQuery() throws Exception;
	public List<reportDomainQueryVO> reportMainDDosDomainQuery() throws Exception;
	public List<reportDomainQueryVO> dailyMainDnsDoaminQuery(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> dailyMainDDosDomainQuery(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> weeklyMainDnsDoaminQuery(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> weeklyMainDDosDomainQuery(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> monthlyMainDnsDoaminQuery(searchTypeVO vo) throws Exception;
	public List<reportDomainQueryVO> monthlyMainDDosDomainQuery(searchTypeVO vo) throws Exception;
}

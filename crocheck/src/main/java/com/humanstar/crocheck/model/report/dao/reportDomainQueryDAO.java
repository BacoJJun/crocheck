package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportDomainQueryVO;

public interface reportDomainQueryDAO {
	public List<reportDomainQueryVO> reportMainDnsDoaminQuery() throws Exception;
	public List<reportDomainQueryVO> reportMainDDosDomainQuery() throws Exception;
}

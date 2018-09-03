package com.humanstar.crocheck.service.report;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.dnsDomainCountVO;

public interface dnsDomainCountService {
	public List<dnsDomainCountVO> dnsDomainCountList(dnsDomainCountVO vo) throws Exception;
}

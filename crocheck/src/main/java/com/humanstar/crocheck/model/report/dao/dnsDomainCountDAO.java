package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.dnsDomainCountVO;

public interface dnsDomainCountDAO {
	public List<dnsDomainCountVO> dnsDomainCountList(dnsDomainCountVO vo) throws Exception;
}

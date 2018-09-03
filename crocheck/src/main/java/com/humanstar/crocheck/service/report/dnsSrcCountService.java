package com.humanstar.crocheck.service.report;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.dnsSrcCountVO;

public interface dnsSrcCountService {
	public List<dnsSrcCountVO> dnsSrcCountList(dnsSrcCountVO vo) throws Exception;
}

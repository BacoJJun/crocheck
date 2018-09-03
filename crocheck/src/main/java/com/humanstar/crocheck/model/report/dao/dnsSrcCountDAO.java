package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.dnsSrcCountVO;

public interface dnsSrcCountDAO {
	public List<dnsSrcCountVO> dnsSrcCountList(dnsSrcCountVO vo) throws Exception;
}

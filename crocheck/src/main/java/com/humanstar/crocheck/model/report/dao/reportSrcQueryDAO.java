package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportSrcQueryVO;

public interface reportSrcQueryDAO {
	public List<reportSrcQueryVO> reportMainDnsSrcQuery() throws Exception;
	public List<reportSrcQueryVO> reportMainDDosSrcQuery() throws Exception;
}

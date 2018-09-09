package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportApplianceVO;

public interface reportAppDAO {
	public List<reportApplianceVO> mainReportApp() throws Exception;
}

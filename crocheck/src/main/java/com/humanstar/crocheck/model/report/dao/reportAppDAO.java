package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportApplianceVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

public interface reportAppDAO {
	public List<reportApplianceVO> mainReportApp() throws Exception;
	public List<reportApplianceVO> dailyReportApp(searchTypeVO vo) throws Exception;
	public List<reportApplianceVO> weeklyReportApp(searchTypeVO vo) throws Exception;
	public List<reportApplianceVO> monthlyReportApp(searchTypeVO vo) throws Exception;
}

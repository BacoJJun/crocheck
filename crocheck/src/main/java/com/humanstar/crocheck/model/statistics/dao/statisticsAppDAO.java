package com.humanstar.crocheck.model.statistics.dao;

import java.util.List;

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.model.statistics.dto.statApplianceVO;

public interface statisticsAppDAO {
	public List<statApplianceVO> lastApplianceStat() throws Exception;
	public List<statApplianceVO> searchMinApplianceStat(searchTypeVO vo) throws Exception;
	public List<statApplianceVO> searchHourApplianceStat(searchTypeVO vo) throws Exception;
}

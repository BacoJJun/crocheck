package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import com.humanstar.crocheck.model.report.dto.reportSrcQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

public interface reportSrcQueryDAO {
	public List<reportSrcQueryVO> reportMainDnsSrcQuery() throws Exception;
	public List<reportSrcQueryVO> reportMainDDosSrcQuery() throws Exception;
	public List<reportSrcQueryVO> dailyMainDnsSrcQuery(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> dailyMainDDosSrcQuery(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> weeklyMainDnsSrcQuery(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> weeklyMainDDosSrcQuery(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> monthlyMainDnsSrcQuery(searchTypeVO vo) throws Exception;
	public List<reportSrcQueryVO> monthlyMainDDosSrcQuery(searchTypeVO vo) throws Exception;
}

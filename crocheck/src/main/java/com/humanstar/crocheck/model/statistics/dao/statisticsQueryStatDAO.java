package com.humanstar.crocheck.model.statistics.dao;

import java.util.List;

import com.humanstar.crocheck.model.statistics.dto.domainQueryVO;
import com.humanstar.crocheck.model.statistics.dto.srcQueryVO;

public interface statisticsQueryStatDAO {
	public List<domainQueryVO> lastDnsDomain() throws Exception;
	public List<domainQueryVO> lastDDosDomain() throws Exception;
	public List<srcQueryVO> lastDnsSrc() throws Exception;
	public List<srcQueryVO> lastDDosSrc() throws Exception;
}

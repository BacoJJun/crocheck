package com.humanstar.crocheck.model.statistics.dao;

import java.util.List;

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.model.statistics.dto.domainQueryVO;
import com.humanstar.crocheck.model.statistics.dto.srcQueryVO;

public interface statisticsQueryStatDAO {
	public List<domainQueryVO> lastDnsDomain() throws Exception;
	public List<domainQueryVO> lastDDosDomain() throws Exception;
	public List<srcQueryVO> lastDnsSrc() throws Exception;
	public List<srcQueryVO> lastDDosSrc() throws Exception;
	public List<domainQueryVO> minDnsDomain(searchTypeVO vo) throws Exception;
	public List<domainQueryVO> minDDosDomain(searchTypeVO vo) throws Exception;
	public List<srcQueryVO> minDnsSrc(searchTypeVO vo) throws Exception;
	public List<srcQueryVO> minDDosSrc(searchTypeVO vo) throws Exception;
	public List<domainQueryVO> hourDnsDomain(searchTypeVO vo) throws Exception;
	public List<domainQueryVO> hourDDosDomain(searchTypeVO vo) throws Exception;
	public List<srcQueryVO> hourDnsSrc(searchTypeVO vo) throws Exception;
	public List<srcQueryVO> hourDDosSrc(searchTypeVO vo) throws Exception;
}

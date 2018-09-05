package com.humanstar.crocheck.service.status;

import java.util.List;

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.model.status.dto.dnsListVO;

public interface dnsListService {
	public List<dnsListVO> dnsNowList() throws Exception;
	public List<dnsListVO> dnsSearchList(searchTypeVO vo) throws Exception;
}

package com.humanstar.crocheck.model.status.dao;

import java.util.List;

import com.humanstar.crocheck.model.status.dto.dnsListVO;

public interface dnsListDAO {
	public List<dnsListVO> dnsNowList() throws Exception;
	public List<dnsListVO> dnsSearchList(dnsListVO vo) throws Exception;
}

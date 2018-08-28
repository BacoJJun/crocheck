package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.dnsStatVO;

public interface dnsStatDAO {
	public List<dnsStatVO> dnsStatusList() throws Exception;
	public List<dnsStatVO> ddosStatusList() throws Exception;
}

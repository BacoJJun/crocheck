package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.dnsStatVO;

public interface dnsStatService {
	public List<dnsStatVO> dnsStatusList() throws Exception;
	public List<dnsStatVO> ddosStatusList() throws Exception;
}

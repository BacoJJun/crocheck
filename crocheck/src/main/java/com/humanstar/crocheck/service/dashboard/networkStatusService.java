package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.networkStatusVO;

public interface networkStatusService {
	public List<networkStatusVO> networkStatusList() throws Exception;
}

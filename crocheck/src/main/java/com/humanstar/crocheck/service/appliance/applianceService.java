package com.humanstar.crocheck.service.appliance;

import java.util.List;

import com.humanstar.crocheck.model.appliance.dto.applianceVO;

public interface applianceService {
	public List<applianceVO> nowStatus() throws Exception;
}

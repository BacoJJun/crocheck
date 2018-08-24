package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dto.applianceStatusVO;

@Service
public interface applianceService {
	public List<applianceStatusVO> applianceStatusList() throws Exception;
}

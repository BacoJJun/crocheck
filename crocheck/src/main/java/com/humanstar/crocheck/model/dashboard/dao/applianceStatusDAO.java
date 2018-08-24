package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.applianceStatusVO;

public interface applianceStatusDAO {
	public List<applianceStatusVO> applianceStatus() throws Exception;
}

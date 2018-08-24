package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.networkStatusVO;

public interface networkStatusDAO {
	public List<networkStatusVO> networkStatus() throws Exception;
}

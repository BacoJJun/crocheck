package com.humanstar.crocheck.model.setting.dao;

import java.util.List;

import com.humanstar.crocheck.model.setting.dto.operatorsVO;

public interface operatorsDAO {
	public List<operatorsVO> operatorList() throws Exception;
}

package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.ddosBlockStatusVO;

public interface ddosBlockStatusDAO {
	public List<ddosBlockStatusVO> ddosBlockStatus() throws Exception;
}

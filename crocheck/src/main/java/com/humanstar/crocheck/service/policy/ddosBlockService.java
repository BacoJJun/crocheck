package com.humanstar.crocheck.service.policy;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.ddosBlockStatusVO;

public interface ddosBlockService {
	public List<ddosBlockStatusVO> ddosBlocklist() throws Exception;
}

package com.humanstar.crocheck.service.policy;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dhcpCategoryVO;

public interface dhcpCategoryService {
	public List<dhcpCategoryVO> categoryList() throws Exception;
	public List<dhcpCategoryVO> categoryGroupList() throws Exception;
}

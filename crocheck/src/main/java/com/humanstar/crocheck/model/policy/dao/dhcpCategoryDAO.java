package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.dhcpCategoryVO;

public interface dhcpCategoryDAO {
	public List<dhcpCategoryVO> categoryList() throws Exception;
	public List<dhcpCategoryVO> categoryGroupList() throws Exception;
}

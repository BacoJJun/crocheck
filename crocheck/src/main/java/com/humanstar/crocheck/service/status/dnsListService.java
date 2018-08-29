package com.humanstar.crocheck.service.status;

import java.util.List;

import com.humanstar.crocheck.model.status.dto.dnsListVO;

public interface dnsListService {
	public List<dnsListVO> dnsNowList() throws Exception;
}

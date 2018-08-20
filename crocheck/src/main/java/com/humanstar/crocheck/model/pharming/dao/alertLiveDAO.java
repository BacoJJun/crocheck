package com.humanstar.crocheck.model.pharming.dao;

import java.util.List;

import com.humanstar.crocheck.model.pharming.dto.alertLiveDepartVO;
import com.humanstar.crocheck.model.pharming.dto.alertLiveDomainVO;

public interface alertLiveDAO {
	public List<alertLiveDomainVO> alertLiveDomain() throws Exception;
}

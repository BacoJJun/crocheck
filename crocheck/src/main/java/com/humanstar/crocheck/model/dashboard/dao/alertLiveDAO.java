package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.alertLiveDepartureVO;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDomainVO;

public interface alertLiveDAO {
	public List<alertLiveDomainVO> alertLiveDomain() throws Exception;
	public List<alertLiveDepartureVO> alertLiveDeparture() throws Exception;
}

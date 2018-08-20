package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.alertLiveDepartureVO;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDomainVO;

public interface alertLiveService {
	public List<alertLiveDomainVO> alertLiveDomain() throws Exception;
	public List<alertLiveDepartureVO> alertLiveDeparture() throws Exception;
}

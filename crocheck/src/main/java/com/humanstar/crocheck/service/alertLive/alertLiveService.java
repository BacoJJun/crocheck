package com.humanstar.crocheck.service.alertLive;

import java.util.List;

import com.humanstar.crocheck.model.pharming.dto.alertLiveDepartVO;
import com.humanstar.crocheck.model.pharming.dto.alertLiveDomainVO;

public interface alertLiveService {
	public List<alertLiveDepartVO> alertLiveDepart() throws Exception;
	public List<alertLiveDomainVO> alertLiveDomain() throws Exception;
}

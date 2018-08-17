package com.humanstar.crocheck.service.alertLive;

import java.util.List;

import javax.inject.Inject;

import com.humanstar.crocheck.model.pharming.dao.alertLiveDAOImpl;
import com.humanstar.crocheck.model.pharming.dto.alertLiveDepartVO;
import com.humanstar.crocheck.model.pharming.dto.alertLiveDomainVO;

public class alertLiveServiceImpl implements alertLiveService{

	@Inject 
	alertLiveDAOImpl alertLiveDAO;
	
	@Override
	public List<alertLiveDepartVO> alertLiveDepart() throws Exception {
		return alertLiveDAO.alertLiveDepart();
	}

	@Override
	public List<alertLiveDomainVO> alertLiveDomain() throws Exception {
		return alertLiveDAO.alertLiveDomain();
	}

}

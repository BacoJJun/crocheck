package com.humanstar.crocheck.service.alertLive;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.humanstar.crocheck.HomeController;
import com.humanstar.crocheck.model.pharming.dao.alertLiveDAOImpl;
import com.humanstar.crocheck.model.pharming.dto.alertLiveDepartVO;
import com.humanstar.crocheck.model.pharming.dto.alertLiveDomainVO;

public class alertLiveServiceImpl implements alertLiveService{

	@Inject 
	alertLiveDAOImpl alertLiveDAO;
	
	@Override
	public List<alertLiveDomainVO> alertLiveDomain() throws Exception {
		return alertLiveDAO.alertLiveDomain();
	}

}

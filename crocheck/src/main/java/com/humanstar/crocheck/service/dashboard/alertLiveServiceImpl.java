package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.alertLiveDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDepartureVO;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDomainVO;

@Service
public class alertLiveServiceImpl implements alertLiveService{

	@Inject
	alertLiveDAOImpl alertLiveDAO;
	
	@Override
	public List<alertLiveDomainVO> alertLiveDomain() throws Exception {
		// TODO Auto-generated method stub
		return alertLiveDAO.alertLiveDomain();
	}

	@Override
	public List<alertLiveDepartureVO> alertLiveDeparture() throws Exception {
		// TODO Auto-generated method stub
		return alertLiveDAO.alertLiveDeparture();
	}
	
}

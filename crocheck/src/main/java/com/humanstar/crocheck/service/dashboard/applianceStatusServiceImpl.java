package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.applianceStatusDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.applianceStatusVO;

@Service
public class applianceStatusServiceImpl implements applianceService{
	
	@Inject 
	applianceStatusDAOImpl applianceStatusDAO;

	@Override
	public List<applianceStatusVO> applianceStatusList() throws Exception {
		// TODO Auto-generated method stub
		return applianceStatusDAO.applianceStatus();
	}
	

}

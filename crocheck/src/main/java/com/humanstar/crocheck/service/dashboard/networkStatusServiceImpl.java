package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.networkStatusDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.networkStatusVO;

@Service
public class networkStatusServiceImpl implements networkStatusService{

	@Inject 
	networkStatusDAOImpl networkStatusDAO;

	@Override
	public List<networkStatusVO> networkStatusList() throws Exception {
		// TODO Auto-generated method stub
		return networkStatusDAO.networkStatus();
	}
	
	
}

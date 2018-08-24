package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.dashboard.dao.networkStatusDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.networkStatusVO;

@Repository
public class networkStatusServiceImpl implements networkStatusService{

	@Inject 
	networkStatusDAOImpl networkStatusDAO;

	@Override
	public List<networkStatusVO> networkStatusList() throws Exception {
		// TODO Auto-generated method stub
		return networkStatusDAO.networkStatus();
	}
	
	
}

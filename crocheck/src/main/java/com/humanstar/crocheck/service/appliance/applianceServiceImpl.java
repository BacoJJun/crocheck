package com.humanstar.crocheck.service.appliance;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.appliance.dao.applianceDAOImpl;
import com.humanstar.crocheck.model.appliance.dto.applianceVO;

@Service
public class applianceServiceImpl implements applianceService {

	@Inject
	applianceDAOImpl applianceDAO;
	
	@Override
	public List<applianceVO> nowStatus() throws Exception {
		return applianceDAO.applianceStatus();
	}

}

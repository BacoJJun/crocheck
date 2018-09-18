package com.humanstar.crocheck.service.dashboard;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.zoneCountDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.zoneCountVO;

@Service
public class zoneCountServiceImpl implements zoneCountService{

	@Inject
	zoneCountDAOImpl zoneCountDAO;
	
	@Override
	public zoneCountVO zoneCount() throws Exception {
		// TODO Auto-generated method stub
		return zoneCountDAO.zoneCount();
	}
	
}

package com.humanstar.crocheck.service.alert;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.alert.dao.alertNowDAOImpl;
import com.humanstar.crocheck.model.alert.dto.alertNowVO;

@Service
public class alertNowServiceImpl implements alertNowService{

	@Inject
	alertNowDAOImpl alertNowDAO;
	
	@Override
	public alertNowVO alertNow() throws Exception {
		// TODO Auto-generated method stub
		return alertNowDAO.alertNow();
		}
}

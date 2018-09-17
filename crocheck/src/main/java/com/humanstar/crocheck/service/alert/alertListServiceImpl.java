package com.humanstar.crocheck.service.alert;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.alert.dao.alertDAOImpl;
import com.humanstar.crocheck.model.alert.dto.alertVO;

@Service
public class alertListServiceImpl implements alertListService{

	@Inject
	alertDAOImpl alertDAO;
	
	@Override
	public alertVO alertList() throws Exception {
		// TODO Auto-generated method stub
		return alertDAO.alertList();
	}

	@Override
	public void alertUpdate(alertVO vo) throws Exception {
		// TODO Auto-generated method stub
		alertDAO.alertUpdate(vo);
	}

	
}

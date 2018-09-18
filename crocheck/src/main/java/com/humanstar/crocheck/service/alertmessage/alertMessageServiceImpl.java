package com.humanstar.crocheck.service.alertmessage;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.alertmessage.dao.alertMessageDAOImpl;
import com.humanstar.crocheck.model.alertmessage.dto.alertMessageVO;

@Service
public class alertMessageServiceImpl implements alertMessageService{

	@Inject
	alertMessageDAOImpl alertMessageDAO;
	
	@Override
	public List<alertMessageVO> alertMessageList() throws Exception {
		// TODO Auto-generated method stub
		return alertMessageDAO.alertMessageList();
	}

	@Override
	public void insertMessage(alertMessageVO vo) throws Exception {
		// TODO Auto-generated method stub
		alertMessageDAO.insertMessage(vo);
	}

	@Override
	public List<alertMessageVO> dashboardalert() throws Exception {
		// TODO Auto-generated method stub
		return alertMessageDAO.dashboardalert();
	}

	@Override
	public void updateMessage(alertMessageVO vo) throws Exception {
		// TODO Auto-generated method stub
		alertMessageDAO.updateMessage(vo);
	}

	@Override
	public void updateAllReadMessage() throws Exception {
		// TODO Auto-generated method stub
		alertMessageDAO.updateAllReadMessage();
	}

}

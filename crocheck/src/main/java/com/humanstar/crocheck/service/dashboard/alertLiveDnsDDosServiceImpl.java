package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.alertLiveDnsDDosDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDnsDDosVO;

@Service
public class alertLiveDnsDDosServiceImpl implements alertLiveDnsDDosService{

	@Inject 
	alertLiveDnsDDosDAOImpl alertLiveDnsDDosDAO;
	
	@Override
	public List<alertLiveDnsDDosVO> alertLiveDnsList() throws Exception {
		// TODO Auto-generated method stub
		return alertLiveDnsDDosDAO.alertListDnsList();
	}

	@Override
	public List<alertLiveDnsDDosVO> alertLiveDDosList() throws Exception {
		// TODO Auto-generated method stub
		return alertLiveDnsDDosDAO.alertListDDosList();
	}
	
}

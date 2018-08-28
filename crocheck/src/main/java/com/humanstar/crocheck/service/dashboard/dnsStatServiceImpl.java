package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.dnsStatDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.dnsStatVO;

@Service
public class dnsStatServiceImpl implements dnsStatService{

	@Inject 
	dnsStatDAOImpl dnsStatDAO;
	
	@Override
	public List<dnsStatVO> dnsStatusList() throws Exception {
		// TODO Auto-generated method stub
		return dnsStatDAO.dnsStatusList();
	}

	@Override
	public List<dnsStatVO> ddosStatusList() throws Exception {
		// TODO Auto-generated method stub
		return dnsStatDAO.ddosStatusList();
	}

}

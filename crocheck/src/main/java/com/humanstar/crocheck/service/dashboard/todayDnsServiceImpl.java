package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.todayDnsDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.todayDnsVO;

@Service
public class todayDnsServiceImpl implements todayDnsService{

	@Inject
	todayDnsDAOImpl todayDnsDAO;
	
	@Override
	public List<todayDnsVO> todayDnsList() throws Exception {
		// TODO Auto-generated method stub
		return todayDnsDAO.todayDnsList();
	}

	@Override
	public List<todayDnsVO> yesterdayDnsList() throws Exception {
		// TODO Auto-generated method stub
		return todayDnsDAO.yesterdayDnsList();
	}

}

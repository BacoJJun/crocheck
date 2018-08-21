package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.pharmingDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.dayPharmingVO;
import com.humanstar.crocheck.model.dashboard.dto.nowPharmingVO;

@Service
public class pharmingServiceImpl implements pharmingService{

	@Inject
	pharmingDAOImpl pharmingDAO;
	
	@Override
	public List<nowPharmingVO> nowPharmingList() throws Exception {
		// TODO Auto-generated method stub
		return pharmingDAO.nowPharmingList();
	}

	@Override
	public List<dayPharmingVO> dayPharmingList() throws Exception {
		// TODO Auto-generated method stub
		return  pharmingDAO.dayPharmingList();
	}
	
}

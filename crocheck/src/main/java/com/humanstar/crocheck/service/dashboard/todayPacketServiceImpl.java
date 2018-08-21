package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.todayPacketDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.todayPacketVO;

@Service
public class todayPacketServiceImpl implements todayPacketService{

	@Inject 
	todayPacketDAOImpl todayPacketDAO;

	@Override
	public List<todayPacketVO> todayPacketList() throws Exception {
		// TODO Auto-generated method stub
		return todayPacketDAO.todayPacketList();
	}
	
}

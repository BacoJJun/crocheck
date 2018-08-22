package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dao.yesterdayPacketDAOImpl;
import com.humanstar.crocheck.model.dashboard.dto.yesterdayPacketVO;

@Service
public class yesterdayPacketServiceImpl implements yesterdayPacketService {

	@Inject
	yesterdayPacketDAOImpl yesterdayPacketDAO;
	
	@Override
	public List<yesterdayPacketVO> yesterdayPacketList() throws Exception {
		// TODO Auto-generated method stub
		return yesterdayPacketDAO.yesterdayPacketList();
	}

}

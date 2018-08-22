package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.dashboard.dto.yesterdayPacketVO;

@Service
public class yesterdayPacketDAOImpl implements yesterdayPacketDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<yesterdayPacketVO> yesterdayPacketList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("packet.yesterday");
	}
	
}

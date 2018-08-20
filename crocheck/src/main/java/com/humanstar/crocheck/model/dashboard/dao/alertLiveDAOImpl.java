package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.dashboard.dto.alertLiveDepartureVO;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDomainVO;

@Repository
public class alertLiveDAOImpl implements alertLiveDAO{

	@Inject 
	SqlSession SqlSession;
	
	@Override
	public List<alertLiveDomainVO> alertLiveDomain() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("alertLive.Domain");
	}

	@Override
	public List<alertLiveDepartureVO> alertLiveDeparture() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("alertLive.Departure");
	}

}

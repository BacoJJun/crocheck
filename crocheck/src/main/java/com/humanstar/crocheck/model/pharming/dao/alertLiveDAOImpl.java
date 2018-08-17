package com.humanstar.crocheck.model.pharming.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.humanstar.crocheck.model.pharming.dto.alertLiveDepartVO;
import com.humanstar.crocheck.model.pharming.dto.alertLiveDomainVO;

public class alertLiveDAOImpl implements alertLiveDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<alertLiveDepartVO> alertLiveDepart() throws Exception {
		return SqlSession.selectList("alertLive.Depart");
	}

	@Override
	public List<alertLiveDomainVO> alertLiveDomain() throws Exception {
		return SqlSession.selectList("alertLive.Domain");
	}
	

}

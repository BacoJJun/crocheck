package com.humanstar.crocheck.model.dashboard.pharming.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.dashboard.pharming.dto.dayPharmingVO;
import com.humanstar.crocheck.model.dashboard.pharming.dto.nowPharmingVO;

@Repository
public class pharmingDAOImpl implements pharmingDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<dayPharmingVO> dayPharmingList() throws Exception {
		return SqlSession.selectList("pharming.allday");
	}

	@Override
	public List<nowPharmingVO> nowPharmingList() throws Exception {
		return SqlSession.selectList("pharming.now");
	}

}

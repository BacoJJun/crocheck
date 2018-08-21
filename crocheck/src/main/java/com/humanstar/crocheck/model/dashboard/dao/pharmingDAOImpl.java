package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.dashboard.dto.dayPharmingVO;
import com.humanstar.crocheck.model.dashboard.dto.nowPharmingVO;

@Repository
public class pharmingDAOImpl implements pharmingDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<dayPharmingVO> dayPharmingList() throws Exception {
		return SqlSession.selectList("pharming.day");
	}

	@Override
	public List<nowPharmingVO> nowPharmingList() throws Exception {
		return SqlSession.selectList("pharming.now");
	}

}

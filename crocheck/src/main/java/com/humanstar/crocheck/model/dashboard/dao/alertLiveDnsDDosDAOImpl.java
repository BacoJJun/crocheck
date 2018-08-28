package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.dashboard.dto.alertLiveDnsDDosVO;

@Repository
public class alertLiveDnsDDosDAOImpl implements alertLiveDnsDDosDAO{

	@Inject
	SqlSession SqlSession;

	@Override
	public List<alertLiveDnsDDosVO> alertListDnsList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("alertLive.dnsList");
	}

	@Override
	public List<alertLiveDnsDDosVO> alertListDDosList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("alertLive.ddosList");
	}

}

package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.report.dto.dnsSrcCountVO;

@Repository
public class dnsSrcCountDAOImpl implements dnsSrcCountDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<dnsSrcCountVO> dnsSrcCountList(dnsSrcCountVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportDns.srcCount", vo);
	}

}

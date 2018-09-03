package com.humanstar.crocheck.model.report.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.report.dto.dnsDomainCountVO;


@Repository
public class dnsDomainCountDAOImpl implements dnsDomainCountDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<dnsDomainCountVO> dnsDomainCountList(dnsDomainCountVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("reportDns.domainCount", vo);
	}

}

package com.humanstar.crocheck.model.user.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.user.dto.userVO;

@Repository
public class userDAOImpl implements userDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public userVO selectMember(userVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("member.selectuser", vo );
	}

	@Override
	public void updateMember(userVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("member.updateuser", vo );
	}

}

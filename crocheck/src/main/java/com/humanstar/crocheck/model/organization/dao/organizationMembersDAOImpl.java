package com.humanstar.crocheck.model.organization.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.organization.dto.memberVO;
import com.humanstar.crocheck.model.organization.dto.postVO;

@Repository
public class organizationMembersDAOImpl implements organizationMembersDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<memberVO> memberList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("organization.memberlist");
	}

	@Override
	public List<postVO> postList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("organization.postlist");
	}

	@Override
	public List<memberVO> postMemberList(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("organization.postmembers");
	}

}

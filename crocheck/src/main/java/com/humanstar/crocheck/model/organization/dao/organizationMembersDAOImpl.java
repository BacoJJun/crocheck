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
		return SqlSession.selectList("organization.postmembers",vo);
	}

	@Override
	public postVO postSearchList(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("organization.postsearchlist", vo);
	}

	@Override
	public void insertMember(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("organization.insertmember", vo);
	}

	@Override
	public void updateMember(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("organization.updatemember", vo);
	}

	@Override
	public void deleteMember(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.delete("organization.deletemember", vo);
	}

	@Override
	public memberVO selectMember(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("organization.selectmember", vo);
	}

}

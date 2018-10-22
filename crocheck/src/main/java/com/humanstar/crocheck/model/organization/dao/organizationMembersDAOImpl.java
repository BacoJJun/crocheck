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

	@Override
	public void insertPost(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("organization.insertpost",vo);
	}

	@Override
	public void updatePost(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("organization.updatepost",vo);
	}

	@Override
	public void deletePost(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.delete("organization.deletepost",vo);
	}

	@Override
	public postVO selectPost(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("organization.selectpost", vo);
	}

	@Override
	public List<postVO> relocationPost() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("organization.relocation");
	}

}

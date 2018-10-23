package com.humanstar.crocheck.service.organization;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.organization.dao.organizationMembersDAOImpl;
import com.humanstar.crocheck.model.organization.dto.memberVO;
import com.humanstar.crocheck.model.organization.dto.postVO;

@Service
public class organizationServiceImpl implements organizationService{

	@Inject
	organizationMembersDAOImpl organizationMembersDAO;
	
	@Override
	public List<memberVO> memberList() throws Exception {
		// TODO Auto-generated method stub
		return organizationMembersDAO.memberList();
	}

	@Override
	public List<memberVO> postMemberList(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return organizationMembersDAO.postMemberList(vo);
	}

	@Override
	public List<postVO> postList() throws Exception {
		// TODO Auto-generated method stub
		return organizationMembersDAO.postList();
	}

	@Override
	public postVO postSearchList(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		return organizationMembersDAO.postSearchList(vo);
	}

	@Override
	public void insertMember(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		organizationMembersDAO.insertMember(vo);
	}

	@Override
	public void updateMember(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		organizationMembersDAO.updateMember(vo);
	}

	@Override
	public void deleteMember(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		organizationMembersDAO.deleteMember(vo);
	}

	@Override
	public memberVO selectMember(memberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return organizationMembersDAO.selectMember(vo);
	}

	@Override
	public void insertPost(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		organizationMembersDAO.insertPost(vo);
	}

	@Override
	public void updatePost(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		organizationMembersDAO.updatePost(vo);
	}

	@Override
	public void deletePost(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		organizationMembersDAO.deletePost(vo);
	}

	@Override
	public postVO selectPost(postVO vo) throws Exception {
		// TODO Auto-generated method stub
		return organizationMembersDAO.selectPost(vo);
	}

	@Override
	public List<postVO> relocationPost() throws Exception {
		// TODO Auto-generated method stub
		return organizationMembersDAO.relocationPost();
	}

}

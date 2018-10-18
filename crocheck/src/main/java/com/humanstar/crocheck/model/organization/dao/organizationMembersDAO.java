package com.humanstar.crocheck.model.organization.dao;

import java.util.List;

import com.humanstar.crocheck.model.organization.dto.memberVO;
import com.humanstar.crocheck.model.organization.dto.postVO;

public interface organizationMembersDAO {
	public List<memberVO> memberList() throws Exception;
	public List<postVO> postList() throws Exception;
	public List<memberVO> postMemberList(memberVO vo) throws Exception;
	public postVO postSearchList(postVO vo) throws Exception;
	public void insertMember(memberVO vo) throws Exception;
	public void updateMember(memberVO vo) throws Exception;
	public void deleteMember(memberVO vo) throws Exception;
	public memberVO selectMember(memberVO vo) throws Exception;
	public void insertPost(postVO vo) throws Exception;
	public void updatePost(postVO vo) throws Exception;
	public void deletePost(postVO vo) throws Exception;
	}

package com.humanstar.crocheck.model.organization.dao;

import java.util.List;

import com.humanstar.crocheck.model.organization.dto.memberVO;
import com.humanstar.crocheck.model.organization.dto.postVO;

public interface organizationMembersDAO {
	public List<memberVO> memberList() throws Exception;
	public List<postVO> postList() throws Exception;
	public List<memberVO> postMemberList(memberVO vo) throws Exception;
	public postVO postSearchList(postVO vo) throws Exception;
	}

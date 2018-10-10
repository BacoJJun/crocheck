package com.humanstar.crocheck.service.organization;

import java.util.List;

import com.humanstar.crocheck.model.organization.dto.memberVO;
import com.humanstar.crocheck.model.organization.dto.postVO;

public interface organizationService {
	public List<memberVO> memberList() throws Exception;
	public List<memberVO> postMemberList(memberVO vo) throws Exception;
	public List<postVO> postList() throws Exception;
	public postVO postSearchList(postVO vo) throws Exception;
	public void insertMember(memberVO vo) throws Exception;
	public void updateMember(memberVO vo) throws Exception;
	public void deleteMember(memberVO vo) throws Exception;
	public memberVO selectMember(memberVO vo) throws Exception;
}

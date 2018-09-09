package com.humanstar.crocheck.service.organization;

import java.util.List;

import com.humanstar.crocheck.model.organization.dto.memberVO;
import com.humanstar.crocheck.model.organization.dto.postVO;

public interface organizationService {
	public List<memberVO> memberList() throws Exception;
	public List<memberVO> postMemberList(memberVO vo) throws Exception;
	public List<postVO> postList() throws Exception;
}

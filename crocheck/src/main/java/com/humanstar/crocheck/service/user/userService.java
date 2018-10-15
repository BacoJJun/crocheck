package com.humanstar.crocheck.service.user;

import com.humanstar.crocheck.model.user.dto.userVO;

public interface userService {
	public userVO selectMember(userVO vo) throws Exception;
	public void updateMember(userVO vo) throws Exception;
}

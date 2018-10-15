package com.humanstar.crocheck.model.user.dao;

import com.humanstar.crocheck.model.user.dto.userVO;

public interface userDAO {
	public userVO selectMember(userVO vo) throws Exception;
	public void updateMember(userVO vo) throws Exception;
}

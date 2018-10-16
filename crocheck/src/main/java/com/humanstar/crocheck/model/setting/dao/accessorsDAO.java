package com.humanstar.crocheck.model.setting.dao;

import java.util.List;

import com.humanstar.crocheck.model.setting.dto.accessorsVO;

public interface accessorsDAO {
	public List<accessorsVO> accessList() throws Exception;
	public accessorsVO searchAccess(accessorsVO vo) throws Exception;
	public void deleteAccess(accessorsVO vo) throws Exception;
	public void insertAccess(accessorsVO vo) throws Exception;
	public void updateAccess(accessorsVO vo) throws Exception;
}

package com.humanstar.crocheck.model.setting.dao;

import java.util.List;

import com.humanstar.crocheck.model.setting.dto.operatorsVO;

public interface operatorsDAO {
	public List<operatorsVO> operatorList() throws Exception;
	public operatorsVO searchOperator(operatorsVO vo) throws Exception;
	public void deleteOperator(operatorsVO vo) throws Exception;
	public void insertOperator(operatorsVO vo) throws Exception;
	public void updateOperator(operatorsVO vo) throws Exception;
}

package com.humanstar.crocheck.service.setting;

import java.util.List;

import com.humanstar.crocheck.model.setting.dto.accessorsVO;
import com.humanstar.crocheck.model.setting.dto.operatorsVO;
import com.humanstar.crocheck.model.setting.dto.systemVO;

public interface settingService {
	public systemVO systemInfo() throws Exception;
	public List<operatorsVO> operatorList() throws Exception;
	public operatorsVO searhOperator(operatorsVO vo) throws Exception;
	public void deleteOperator(operatorsVO vo) throws Exception;
	public List<accessorsVO> accessList() throws Exception;
	public accessorsVO searchAccess(accessorsVO vo) throws Exception;
	public void deleteAccess(accessorsVO vo) throws Exception;
}

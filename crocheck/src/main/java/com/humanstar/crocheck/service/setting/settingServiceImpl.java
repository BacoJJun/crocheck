package com.humanstar.crocheck.service.setting;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.setting.dao.accessorsDAOImpl;
import com.humanstar.crocheck.model.setting.dao.operatorsDAOImpl;
import com.humanstar.crocheck.model.setting.dao.systemDAOImpl;
import com.humanstar.crocheck.model.setting.dto.accessorsVO;
import com.humanstar.crocheck.model.setting.dto.operatorsVO;
import com.humanstar.crocheck.model.setting.dto.systemVO;

@Service
public class settingServiceImpl implements settingService{
	private static final Logger logger = LoggerFactory.getLogger(settingServiceImpl.class);
	
	@Inject
	systemDAOImpl systemDAO;
	@Inject
	operatorsDAOImpl operatorsDAO;
	@Inject
	accessorsDAOImpl accessorsDAO;
	
	@Override
	public systemVO systemInfo() throws Exception {
		// TODO Auto-generated method stub
		return systemDAO.systemInfo();
	}

	@Override
	public List<operatorsVO> operatorList() throws Exception {
		// TODO Auto-generated method stub
		logger.info("service call");
		return operatorsDAO.operatorList();
	}

	@Override
	public List<accessorsVO> accessList() throws Exception {
		// TODO Auto-generated method stub
		return accessorsDAO.accessList();
	}

}

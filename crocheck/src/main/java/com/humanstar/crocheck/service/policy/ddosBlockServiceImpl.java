package com.humanstar.crocheck.service.policy;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.policy.dao.ddosBlockStatusDAOImpl;
import com.humanstar.crocheck.model.policy.dto.ddosBlockStatusVO;

@Service
public class ddosBlockServiceImpl implements ddosBlockService{

	@Inject
	ddosBlockStatusDAOImpl ddosBlockStatusDAO;

	@Override
	public List<ddosBlockStatusVO> ddosBlocklist() throws Exception {
		// TODO Auto-generated method stub
		return ddosBlockStatusDAO.ddosBlockStatus();
	}
	
}

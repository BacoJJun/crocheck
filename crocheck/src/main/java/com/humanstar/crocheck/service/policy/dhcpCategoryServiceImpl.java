package com.humanstar.crocheck.service.policy;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.policy.dao.dhcpCategoryDAOImpl;
import com.humanstar.crocheck.model.policy.dto.dhcpCategoryVO;

@Service
public class dhcpCategoryServiceImpl implements dhcpCategoryService{

	@Inject
	dhcpCategoryDAOImpl dhcpCategoryDAO;
	
	@Override
	public List<dhcpCategoryVO> categoryList() throws Exception {
		// TODO Auto-generated method stub
		return dhcpCategoryDAO.categoryList();
	}

	@Override
	public List<dhcpCategoryVO> categoryGroupList() throws Exception {
		// TODO Auto-generated method stub
		return dhcpCategoryDAO.categoryGroupList();
	}

}

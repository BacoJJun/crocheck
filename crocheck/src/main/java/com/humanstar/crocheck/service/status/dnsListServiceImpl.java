package com.humanstar.crocheck.service.status;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.status.dao.dnsListDAOImpl;
import com.humanstar.crocheck.model.status.dto.dnsListVO;

@Service
public class dnsListServiceImpl implements dnsListService{

	@Inject 
	dnsListDAOImpl dnsListDAO;
	
	@Override
	public List<dnsListVO> dnsNowList() throws Exception {
		// TODO Auto-generated method stub
		return dnsListDAO.dnsNowList();
	}
	
}

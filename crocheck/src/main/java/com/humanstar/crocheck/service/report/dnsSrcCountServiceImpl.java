package com.humanstar.crocheck.service.report;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.report.dao.dnsSrcCountDAOImpl;
import com.humanstar.crocheck.model.report.dto.dnsSrcCountVO;

@Service
public class dnsSrcCountServiceImpl implements dnsSrcCountService{

	@Inject
	dnsSrcCountDAOImpl dnsSrcCountDAO;

	@Override
	public List<dnsSrcCountVO> dnsSrcCountList(dnsSrcCountVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dnsSrcCountDAO.dnsSrcCountList(vo);
	}
	
}

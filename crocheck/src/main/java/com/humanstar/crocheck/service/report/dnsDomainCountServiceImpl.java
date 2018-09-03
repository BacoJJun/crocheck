package com.humanstar.crocheck.service.report;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.report.dao.dnsDomainCountDAOImpl;
import com.humanstar.crocheck.model.report.dto.dnsDomainCountVO;

@Service
public class dnsDomainCountServiceImpl implements dnsDomainCountService{

	@Inject
	dnsDomainCountDAOImpl dnsDomainCountDAO;

	@Override
	public List<dnsDomainCountVO> dnsDomainCountList(dnsDomainCountVO vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(vo.toString());
		return dnsDomainCountDAO.dnsDomainCountList(vo);
	}
	
}

package com.humanstar.crocheck.service.policy;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.policy.dao.dnsbanDAOImpl;
import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

@Service
public class dnsbanServiceImpl implements dnsbanService{

	@Inject
	dnsbanDAOImpl dnsbanDAO;
	
	@Override
	public List<dnspolicyVO> dnsbanlist() throws Exception {
		// TODO Auto-generated method stub
		return dnsbanDAO.dnsbanlist();
	}

	@Override
	public void insertDnsBan(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dnsbanDAO.insertDnsBan(vo);
	}

	@Override
	public void deleteDnsBan(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dnsbanDAO.deleteDnsBan(vo);
	}

	@Override
	public dnspolicyVO dnsbanSearch(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dnsbanDAO.dnsbanSearch(vo);
	}

}

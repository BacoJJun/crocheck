package com.humanstar.crocheck.service.policy;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.policy.dao.dnspolicyDAOImpl;
import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

@Service
public class dnspolicyServiceImpl implements dnspolicyService{

	@Inject
	dnspolicyDAOImpl dnspolicyDAO;

	@Override
	public List<dnspolicyVO> dnsTableList() throws Exception {
		// TODO Auto-generated method stub
		return dnspolicyDAO.dnsTableList();
	}

	@Override
	public List<dnspolicyVO> subDnsList(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dnspolicyDAO.subDnsList(vo);
	}

	@Override
	public List<dnspolicyVO> searchDnsDomain(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dnspolicyDAO.searchDnsDomain(vo);
	}
}


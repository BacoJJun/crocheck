package com.humanstar.crocheck.service.policy;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.humanstar.crocheck.controller.policy.policyController;
import com.humanstar.crocheck.model.policy.dao.dnspolicyDAOImpl;
import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

@Service
public class dnspolicyServiceImpl implements dnspolicyService{
	private static final Logger logger = LoggerFactory.getLogger(dnspolicyServiceImpl.class);
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

	@Override
	public List<dnspolicyVO> catchDnsDomain(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dnspolicyDAO.catchDnsDomain(vo);
	}

	@Override
	public List<dnspolicyVO> zonelist() throws Exception {
		// TODO Auto-generated method stub
		return dnspolicyDAO.zonelist();
	}

	@Override
	public void insertdns(dnspolicyVO vo) throws Exception {
		dnspolicyDAO.insertdns(vo);
		
	}

	@Override
	public void updatedns(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dnspolicyDAO.updatedns(vo);
	}

	@Override
	public void delete(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dnspolicyDAO.delete(vo);
	}

	@Override
	public void insertsubdomain(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dnspolicyDAO.insertsubdomain(vo);
	}

	@Override
	public void updatesubdomain(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dnspolicyDAO.updatesubdomain(vo);
	}

	@Override
	public void deletesubdomain(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dnspolicyDAO.deletesubdomain(vo);	}

	@Override
	public List<dnspolicyVO> idsearchDns(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dnspolicyDAO.idsearchDns(vo);
	}

	@Override
	public List<dnspolicyVO> zonesearchDns(dnspolicyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dnspolicyDAO.zonesearhDns(vo);
	}
}


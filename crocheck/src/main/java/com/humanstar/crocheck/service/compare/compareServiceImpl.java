package com.humanstar.crocheck.service.compare;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.compare.dao.compareDAOImpl;
import com.humanstar.crocheck.model.compare.dto.compareDomainQueryVO;
import com.humanstar.crocheck.model.compare.dto.comparePacketVO;
import com.humanstar.crocheck.model.compare.dto.compareSrcQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

@Service
public class compareServiceImpl implements compareService{

	@Inject 
	compareDAOImpl compareDAO;
	
	@Override
	public List<comparePacketVO> comparednsPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return compareDAO.comparednsPacket(vo);
	}

	@Override
	public List<comparePacketVO> compareddosPacket(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return compareDAO.compareddosPacket(vo);
	}

	@Override
	public List<compareDomainQueryVO> comparednsDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return compareDAO.comparednsDomain(vo);
	}

	@Override
	public List<compareDomainQueryVO> compareddosDomain(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return compareDAO.compareddosDomain(vo);
	}

	@Override
	public List<compareSrcQueryVO> comparednsClient(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return compareDAO.comparednsClient(vo);
	}

	@Override
	public List<compareSrcQueryVO> compareddosClient(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return compareDAO.compareddosClient(vo);
	}

}

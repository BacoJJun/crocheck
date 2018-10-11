package com.humanstar.crocheck.service.policy;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.policy.dao.ddosblockipDAOImpl;
import com.humanstar.crocheck.model.policy.dto.ddosblockipVO;

@Service
public class ddosblockipServiceImpl implements ddosblockipService{

	@Inject
	ddosblockipDAOImpl ddosblockipDAO;
	
	@Override
	public List<ddosblockipVO> ddosBlockList() throws Exception {
		// TODO Auto-generated method stub
		return ddosblockipDAO.ddosBlockList();
	}

	@Override
	public void insertDdosBlock(ddosblockipVO vo) throws Exception {
		// TODO Auto-generated method stub
		ddosblockipDAO.insertDdosBlock(vo);
	}

	@Override
	public void deleteDdosBlock(ddosblockipVO vo) throws Exception {
		// TODO Auto-generated method stub
		ddosblockipDAO.deleteDdosBlock(vo);
	}

	@Override
	public ddosblockipVO selectDdosBlock(ddosblockipVO vo) throws Exception {
		// TODO Auto-generated method stub
		return ddosblockipDAO.selectDdosBlock(vo);
	}

}

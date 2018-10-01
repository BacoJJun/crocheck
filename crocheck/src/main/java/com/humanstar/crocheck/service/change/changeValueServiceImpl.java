package com.humanstar.crocheck.service.change;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.change.dao.changeValueDAOImpl;
import com.humanstar.crocheck.model.change.dto.changeValueVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

@Service
public class changeValueServiceImpl implements changeValueService{

	@Inject
	changeValueDAOImpl changeValueDAO;
	
	@Override
	public List<changeValueVO> changeValueList() throws Exception {
		// TODO Auto-generated method stub
		return changeValueDAO.changeValueList();
	}

	@Override
	public List<changeValueVO> searchChangeDnsList(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return changeValueDAO.searchChangeDnsList(vo);
	}
	
	@Override
	public List<changeValueVO> searchChangeDhcpList(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return changeValueDAO.searchChangeDhcpList(vo);
	}


	@Override
	public void insertChangeValue(changeValueVO vo) throws Exception {
		// TODO Auto-generated method stub
		changeValueDAO.insertChangeValue(vo);
	}

	@Override
	public changeValueVO selectOneValue(changeValueVO vo) throws Exception {
		// TODO Auto-generated method stub
		return changeValueDAO.selectOneValue(vo);
	}

}

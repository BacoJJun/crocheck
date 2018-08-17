package com.humanstar.crocheck.service.list;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.list.dao.listDAOImpl;
import com.humanstar.crocheck.model.list.dto.listVO;

@Service
public class listServiceImpl implements listService{

	@Inject
	listDAOImpl listDAO;
	
	@Override
	public List<listVO> listAll() throws Exception{
			return listDAO.listAll();
	}
}

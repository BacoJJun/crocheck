package com.humanstar.crocheck.service.user;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.user.dao.userDAOImpl;
import com.humanstar.crocheck.model.user.dto.userVO;

@Service
public class userServiceImpl implements userService{

	@Inject
	userDAOImpl userDAO;
	
	@Override
	public userVO selectMember(userVO vo) throws Exception {
		// TODO Auto-generated method stub
		return userDAO.selectMember(vo);
	}

	@Override
	public void updateMember(userVO vo) throws Exception {
		// TODO Auto-generated method stub
		userDAO.updateMember(vo);
	}
}

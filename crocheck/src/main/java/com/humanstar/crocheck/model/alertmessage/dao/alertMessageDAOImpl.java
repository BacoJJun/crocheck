package com.humanstar.crocheck.model.alertmessage.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.alertmessage.dto.alertMessageVO;

@Repository
public class alertMessageDAOImpl implements alertMessageDAO {

	@Inject
	SqlSession SqlSession;

	@Override
	public List<alertMessageVO> alertMessageList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("alertMessage.messageList");
	}

	@Override
	public void insertMessage(alertMessageVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("alertMessage.insertMessage", vo);
	}

	@Override
	public List<alertMessageVO> dashboardalert() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("alertMessage.dashboardalert");
	}

	@Override
	public void updateMessage(alertMessageVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("alertMessage.alertcheck", vo);
	}

	@Override
	public void updateAllReadMessage() throws Exception {
		SqlSession.update("alertMessage.allread");
		
	}
}

package com.humanstar.crocheck.model.alertmessage.dao;

import java.util.List;

import com.humanstar.crocheck.model.alertmessage.dto.alertMessageVO;

public interface alertMessageDAO {
	public List<alertMessageVO> alertMessageList() throws Exception;
	public void insertMessage(alertMessageVO vo) throws Exception;
}

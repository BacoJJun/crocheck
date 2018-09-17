package com.humanstar.crocheck.service.alertmessage;

import java.util.List;

import com.humanstar.crocheck.model.alertmessage.dto.alertMessageVO;

public interface alertMessageService {
	public List<alertMessageVO> alertMessageList() throws Exception;
	public void insertMessage(alertMessageVO vo) throws Exception;
}

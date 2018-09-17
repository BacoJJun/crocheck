package com.humanstar.crocheck.service.alert;

import com.humanstar.crocheck.model.alert.dto.alertVO;

public interface alertListService {
	public alertVO alertList() throws Exception;
	public void alertUpdate(alertVO vo) throws Exception;
}

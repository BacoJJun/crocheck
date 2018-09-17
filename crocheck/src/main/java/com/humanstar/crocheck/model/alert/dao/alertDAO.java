package com.humanstar.crocheck.model.alert.dao;

import com.humanstar.crocheck.model.alert.dto.alertVO;

public interface alertDAO {
	public alertVO alertList() throws Exception;
	public void alertUpdate(alertVO vo) throws Exception;
}

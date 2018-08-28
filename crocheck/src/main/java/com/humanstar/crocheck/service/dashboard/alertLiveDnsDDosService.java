package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.alertLiveDnsDDosVO;

public interface alertLiveDnsDDosService {
	public List<alertLiveDnsDDosVO> alertLiveDnsList() throws Exception;
	public List<alertLiveDnsDDosVO> alertLiveDDosList() throws Exception;
}

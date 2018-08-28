package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.alertLiveDnsDDosVO;

public interface alertLiveDnsDDosDAO {
	public List<alertLiveDnsDDosVO> alertListDnsList() throws Exception;
	public List<alertLiveDnsDDosVO> alertListDDosList() throws Exception;
}

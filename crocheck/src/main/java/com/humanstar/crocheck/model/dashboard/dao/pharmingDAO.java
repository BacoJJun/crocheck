package com.humanstar.crocheck.model.dashboard.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.dayPharmingVO;
import com.humanstar.crocheck.model.dashboard.dto.nowPharmingVO;

public interface pharmingDAO {
	public List<dayPharmingVO> dayPharmingList() throws Exception;
	public List<nowPharmingVO> nowPharmingList() throws Exception;
}

package com.humanstar.crocheck.model.dashboard.pharming.dao;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.pharming.dto.dayPharmingVO;
import com.humanstar.crocheck.model.dashboard.pharming.dto.nowPharmingVO;

public interface pharmingDAO {
	public List<dayPharmingVO> dayPharmingList() throws Exception;
	public List<nowPharmingVO> nowPharmingList() throws Exception;
}

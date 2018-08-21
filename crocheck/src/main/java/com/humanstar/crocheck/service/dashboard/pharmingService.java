package com.humanstar.crocheck.service.dashboard;

import java.util.List;

import com.humanstar.crocheck.model.dashboard.dto.dayPharmingVO;
import com.humanstar.crocheck.model.dashboard.dto.nowPharmingVO;

public interface pharmingService {
	public List<nowPharmingVO> nowPharmingList() throws Exception;
	public List<dayPharmingVO> dayPharmingList() throws Exception;
}

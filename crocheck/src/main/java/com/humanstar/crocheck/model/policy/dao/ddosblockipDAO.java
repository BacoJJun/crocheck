package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.ddosblockipVO;

public interface ddosblockipDAO {
	public List<ddosblockipVO> ddosBlockList() throws Exception;
	public void insertDdosBlock(ddosblockipVO vo) throws Exception;
	public void deleteDdosBlock(ddosblockipVO vo) throws Exception;
	public ddosblockipVO selectDdosBlock(ddosblockipVO vo) throws Exception;
}

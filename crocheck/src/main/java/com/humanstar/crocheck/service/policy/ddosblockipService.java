package com.humanstar.crocheck.service.policy;

import java.util.List;

import com.humanstar.crocheck.model.policy.dto.ddosblockipVO;

public interface ddosblockipService {
	public List<ddosblockipVO> ddosBlockList() throws Exception;
	public List<ddosblockipVO> ddosblockchecklist(ddosblockipVO vo) throws Exception;
	public void insertDdosBlock(ddosblockipVO vo) throws Exception;
	public void deleteDdosBlock(ddosblockipVO vo) throws Exception;
	public ddosblockipVO selectDdosBlock(ddosblockipVO vo) throws Exception;
}

package com.humanstar.crocheck.model.change.dao;



import java.util.List;

import com.humanstar.crocheck.model.change.dto.changeValueVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

public interface changeValueDAO {
	public List<changeValueVO> changeValueList() throws Exception;
	public List<changeValueVO> searchChangeDnsList(searchTypeVO vo) throws Exception;
	public List<changeValueVO> searchChangeDhcpList(searchTypeVO vo) throws Exception;
	public void insertChangeValue(changeValueVO vo) throws Exception;
	public changeValueVO selectOneValue(changeValueVO vo) throws Exception;
}

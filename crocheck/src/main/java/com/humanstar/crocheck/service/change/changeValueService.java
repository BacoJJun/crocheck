package com.humanstar.crocheck.service.change;

import java.util.List;

import com.humanstar.crocheck.model.change.dto.changeValueVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

public interface changeValueService {
	public List<changeValueVO> changeValueList() throws Exception;
	public List<changeValueVO> searchChangeValueList(searchTypeVO vo) throws Exception;
	public void insertChangeValue(changeValueVO vo) throws Exception;
}

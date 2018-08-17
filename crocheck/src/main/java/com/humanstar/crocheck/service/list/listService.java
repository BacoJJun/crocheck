package com.humanstar.crocheck.service.list;

import java.util.List;

import com.humanstar.crocheck.model.list.dto.listVO;

public interface listService {
	public List<listVO> listAll() throws Exception;
}

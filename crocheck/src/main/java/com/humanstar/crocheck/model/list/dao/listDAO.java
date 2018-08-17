package com.humanstar.crocheck.model.list.dao;

import java.util.List;
import java.util.Map;

import com.humanstar.crocheck.model.list.dto.listVO;

public interface listDAO {
	public  List<listVO> listAll() throws Exception;
}

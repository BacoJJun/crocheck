package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.policy.dto.dhcpCategoryVO;

@Repository
public class dhcpCategoryDAOImpl implements dhcpCategoryDAO{

	@Inject
	SqlSession SqlSession;
	@Override
	public List<dhcpCategoryVO> categoryList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dhcppolicy.category");
	}

	@Override
	public List<dhcpCategoryVO> categoryGroupList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("dhcppolicy.category_group");
	}

}

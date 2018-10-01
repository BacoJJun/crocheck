package com.humanstar.crocheck.model.change.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.change.dto.changeValueVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

@Repository
public class changeValueDAOImpl implements changeValueDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<changeValueVO> changeValueList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("changevalue.changevaluelist");
	}

	@Override
	public List<changeValueVO> searchChangeDnsList(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return  SqlSession.selectList("changevalue.searchdnslist", vo);
	}
	
	@Override
	public List<changeValueVO> searchChangeDhcpList(searchTypeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return  SqlSession.selectList("changevalue.searchdhcplist", vo);
	}

	@Override
	public void insertChangeValue(changeValueVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("changevalue.insertchangevalue", vo);
	}

	@Override
	public changeValueVO selectOneValue(changeValueVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("changevalue.selectOneValue", vo);
	}

}

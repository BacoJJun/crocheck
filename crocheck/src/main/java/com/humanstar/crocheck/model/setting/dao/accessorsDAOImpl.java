package com.humanstar.crocheck.model.setting.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.setting.dto.accessorsVO;

@Repository
public class accessorsDAOImpl implements accessorsDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<accessorsVO> accessList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("setting.accessors");
	}
	@Override
	public accessorsVO searchAccess(accessorsVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectOne("setting.searchacessor", vo);
	}
	@Override
	public void deleteAccess(accessorsVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.delete("setting.deleteaccess", vo);
	}
	@Override
	public void insertAccess(accessorsVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.insert("setting.insertaccess", vo);
	}
	@Override
	public void updateAccess(accessorsVO vo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession.update("setting.updateaccess", vo);
	}

}

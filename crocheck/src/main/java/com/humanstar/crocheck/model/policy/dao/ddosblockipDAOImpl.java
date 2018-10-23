package com.humanstar.crocheck.model.policy.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.humanstar.crocheck.model.policy.dto.ddosblockipVO;

@Repository
public class ddosblockipDAOImpl implements ddosblockipDAO{

	@Inject
	SqlSession SqlSession;
	
	@Override
	public List<ddosblockipVO> ddosBlockList() throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("ddospolicy.ddosbanlist");
	}
	
	@Override
	public List<ddosblockipVO> ddosblockchecklist(ddosblockipVO vo) throws Exception {
		// TODO Auto-generated method stub
		return SqlSession.selectList("ddospolicy.ddosblockchecklist", vo);
	}


	@Override
	public void insertDdosBlock(ddosblockipVO vo) throws Exception {
		// TODO Auto-generated method stub
		 SqlSession.insert("ddospolicy.insertddosblock", vo );
	}

	@Override
	public void deleteDdosBlock(ddosblockipVO vo) throws Exception {
		// TODO Auto-generated method stub
		 SqlSession.delete("ddospolicy.deleteddosblock", vo);
	}

	@Override
	public ddosblockipVO selectDdosBlock(ddosblockipVO vo) throws Exception {
		// TODO Auto-generated method stub
		return  SqlSession.selectOne("ddospolicy.selectddosblock", vo);
	}
	
}

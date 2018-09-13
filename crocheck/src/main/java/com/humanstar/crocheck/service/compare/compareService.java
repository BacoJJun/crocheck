package com.humanstar.crocheck.service.compare;

import java.util.List;

import com.humanstar.crocheck.model.compare.dto.compareDomainQueryVO;
import com.humanstar.crocheck.model.compare.dto.comparePacketVO;
import com.humanstar.crocheck.model.compare.dto.compareSrcQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;

public interface compareService {
	public List<comparePacketVO> comparednsPacket(searchTypeVO vo) throws Exception;
	public List<comparePacketVO> compareddosPacket(searchTypeVO vo) throws Exception;
	
	public List<compareDomainQueryVO> comparednsDomain(searchTypeVO vo) throws Exception;
	public List<compareDomainQueryVO> compareddosDomain(searchTypeVO vo) throws Exception;
	public List<compareSrcQueryVO> comparednsClient(searchTypeVO vo) throws Exception;
	public List<compareSrcQueryVO> compareddosClient(searchTypeVO vo) throws Exception;
}

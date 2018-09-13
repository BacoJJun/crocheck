package com.humanstar.crocheck.controller.compare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.humanstar.crocheck.model.compare.dto.compareDomainQueryVO;
import com.humanstar.crocheck.model.compare.dto.comparePacketVO;
import com.humanstar.crocheck.model.compare.dto.compareSrcQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.service.compare.compareServiceImpl;

@Controller
public class compareController {
	private static final Logger logger = LoggerFactory.getLogger(compareController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";
	
	@Inject
	compareServiceImpl compareService;
	
	
	
	@RequestMapping(value = "/comparednsquery", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> comparednsquery(@ModelAttribute  searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<comparePacketVO> queryList = new ArrayList<comparePacketVO>();

		try {
			queryList = compareService.comparednsPacket(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("queryList", queryList);

		return resultMap;
	}
	
	@RequestMapping(value = "/compareddosquery", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> compareddosquery(@ModelAttribute  searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<comparePacketVO> queryList = new ArrayList<comparePacketVO>();

		try {
			queryList = compareService.compareddosPacket(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("queryList", queryList);

		return resultMap;
	}
	
	@RequestMapping(value = "/comparednsdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> comparednsdomain(@ModelAttribute  searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<compareDomainQueryVO> domainList = new ArrayList<compareDomainQueryVO>();

		try {
			domainList = compareService.comparednsDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("domainList", domainList);

		return resultMap;
	}
	@RequestMapping(value = "/compareddosdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> compareddosdomain(@ModelAttribute  searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<compareDomainQueryVO> domainList = new ArrayList<compareDomainQueryVO>();

		try {
			domainList = compareService.compareddosDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("domainList", domainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/comparednsclient", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> comparednsclient(@ModelAttribute  searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<compareSrcQueryVO> srcList = new ArrayList<compareSrcQueryVO>();

		try {
			srcList = compareService.comparednsClient(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("srcList", srcList);

		return resultMap;
	}
	
	@RequestMapping(value = "/compareddosclient", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> comparedosclient(@ModelAttribute  searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<compareSrcQueryVO> srcList = new ArrayList<compareSrcQueryVO>();

		try {
			srcList = compareService.compareddosClient(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("srcList", srcList);

		return resultMap;
	}
}

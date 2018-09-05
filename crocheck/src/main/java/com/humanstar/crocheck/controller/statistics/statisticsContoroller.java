package com.humanstar.crocheck.controller.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.humanstar.crocheck.model.statistics.dto.domainQueryVO;
import com.humanstar.crocheck.model.statistics.dto.srcQueryVO;
import com.humanstar.crocheck.model.statistics.dto.statApplianceVO;
import com.humanstar.crocheck.model.statistics.dto.statPacketVO;
import com.humanstar.crocheck.service.statistics.statisticsServiceImpl;

@Controller
public class statisticsContoroller {
	private static final Logger logger = LoggerFactory.getLogger(statisticsContoroller.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";

	@Inject 
	statisticsServiceImpl statisticsService;
	
	@RequestMapping(value = "/statLastApp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statLastData() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<statApplianceVO> lastApplist = new ArrayList<statApplianceVO>();

		try {
			lastApplist = statisticsService.lastApplianceStat();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastApplist", lastApplist);

		return resultMap;
	}
	
	@RequestMapping(value = "/statLastPacketDns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statLastPacketDns() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<statPacketVO> lastPacketDnsList = new ArrayList<statPacketVO>();

		try {
			lastPacketDnsList = statisticsService.lastDnsPacket();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.info(e.toString());

		}

		resultMap.put("lastPacketDnsList", lastPacketDnsList);

		return resultMap;
	}
	
	@RequestMapping(value = "/statLastPacketDDos", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statLastPacketDDos() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<statPacketVO> lastPacketDDosList = new ArrayList<statPacketVO>();

		try {
			lastPacketDDosList = statisticsService.lastDDosPacket();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastPacketDDosList", lastPacketDDosList);

		return resultMap;
	}
	
	@RequestMapping(value = "/statlastdnsdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statlastdnsdomain() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<domainQueryVO> lastdnsdomainList = new ArrayList<domainQueryVO>();

		try {
			lastdnsdomainList = statisticsService.lastDnsDomain();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastdnsdomainList", lastdnsdomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/statlastddosdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statlastddosdomain() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<domainQueryVO> lastddosdomainList = new ArrayList<domainQueryVO>();

		try {
			lastddosdomainList = statisticsService.lastDDosDomain();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastddosdomainList", lastddosdomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/statlastdnssrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statlastdnssrc() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<srcQueryVO> lastdnssrcList = new ArrayList<srcQueryVO>();

		try {
			lastdnssrcList = statisticsService.lastDnsSrc();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastdnssrcList", lastdnssrcList);

		return resultMap;
	}
	
	@RequestMapping(value = "/statlastddossrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statlastddossrc() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<srcQueryVO> lastddossrcList = new ArrayList<srcQueryVO>();


		try {
			lastddossrcList = statisticsService.lastDDosSrc();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastddossrcList", lastddossrcList);

		return resultMap;
	}
}

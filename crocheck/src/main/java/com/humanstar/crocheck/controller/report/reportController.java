package com.humanstar.crocheck.controller.report;

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

import com.humanstar.crocheck.model.report.dto.reportApplianceVO;
import com.humanstar.crocheck.model.report.dto.reportPacketVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.service.report.reportMainServiceImpl;

@Controller
public class reportController {
	private static final Logger logger = LoggerFactory.getLogger(reportController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";


	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws Exception
	 */
	@Inject
	reportMainServiceImpl reportMainService;

	@RequestMapping(value = "/reportBaseApp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseApp() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportApplianceVO> applist = new ArrayList<reportApplianceVO>();


		try {
			applist = reportMainService.reportMainApp();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("applist", applist);

		return resultMap;
	}
	@RequestMapping(value = "/reportBaseDnsPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseDnsPacket() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> dnsPacketList = new ArrayList<reportPacketVO>();


		try {
			dnsPacketList = reportMainService.reportMainDnsPacket();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsPacketList", dnsPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportBaseDDosPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseDDosPacket() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> ddosPacketList = new ArrayList<reportPacketVO>();


		try {
			ddosPacketList = reportMainService.reportMainDDosPacket();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosPacketList", ddosPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/searchReportAppDays", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchReportAppDays(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
//		List<dnsDomainCountVO> dnsDomainCountList = new ArrayList<dnsDomainCountVO>();
//
//
//		try {
//			dnsDomainCountList = dnsDomainCountService.dnsDomainCountList(vo);
//			resultMap.put(RESULT, RESULT_SUCCESS);
//			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
//		} catch (Exception e) {
//			resultMap.put(RESULT, RESULT_ERROR);
//			resultMap.put(ERROR_MESSAGE, "connect_faled!");
//			logger.error(e.toString());
//
//		}
//		resultMap.put("dnsDomainCountList", dnsDomainCountList);
//
		return resultMap;
	}

}

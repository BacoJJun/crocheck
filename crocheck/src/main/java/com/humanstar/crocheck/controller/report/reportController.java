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

import com.humanstar.crocheck.model.report.dto.dnsDomainCountVO;
import com.humanstar.crocheck.model.report.dto.dnsSrcCountVO;
import com.humanstar.crocheck.service.report.dnsDomainCountServiceImpl;
import com.humanstar.crocheck.service.report.dnsSrcCountServiceImpl;

@Controller
public class reportController {
	private static final Logger logger = LoggerFactory.getLogger(reportController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";

	@Inject
	dnsDomainCountServiceImpl dnsDomainCountService;
	@Inject
	dnsSrcCountServiceImpl dnsSrcCountService;

	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws Exception
	 */

	@RequestMapping(value = "/dnsDomainCount", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnsDomainCount(@ModelAttribute dnsDomainCountVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dnsDomainCountVO> dnsDomainCountList = new ArrayList<dnsDomainCountVO>();
		logger.info(vo.getDate_start());
		logger.info(vo.getTable_name());
		logger.info(vo.getDate_end());

		try {
			dnsDomainCountList = dnsDomainCountService.dnsDomainCountList(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsDomainCountList", dnsDomainCountList);

		return resultMap;
	}

	@RequestMapping(value = "/dnsSrcCount", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnsSrcCount(@ModelAttribute dnsSrcCountVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dnsSrcCountVO> dnsSrcCountList = new ArrayList<dnsSrcCountVO>();
		logger.info(vo.getDate_start());
		logger.info(vo.getTable_name());
		logger.info(vo.getDate_end());

		try {
			dnsSrcCountList = dnsSrcCountService.dnsSrcCountList(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsSrcCountList", dnsSrcCountList);

		
		return resultMap;
	}
}

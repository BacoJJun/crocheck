package com.humanstar.crocheck.controller.setting;

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

import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;
import com.humanstar.crocheck.model.setting.dto.accessorsVO;
import com.humanstar.crocheck.model.setting.dto.operatorsVO;
import com.humanstar.crocheck.model.setting.dto.systemVO;
import com.humanstar.crocheck.service.setting.settingServiceImpl;

@Controller
public class settingController {

	private static final Logger logger = LoggerFactory.getLogger(settingController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";

	
	@Inject
	settingServiceImpl settingService;

	@RequestMapping(value = "/systemInfo", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> systemInfo() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		systemVO  systemInfo = new systemVO();

		try {
			systemInfo = settingService.systemInfo();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {

			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}
		resultMap.put("systemInfo", systemInfo);

		return resultMap;
	}
	
	@RequestMapping(value = "/operatorList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> operatorList() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<operatorsVO> operatorList = new ArrayList<operatorsVO>();

		logger.info("operatorList call");
		
		try {
			operatorList = settingService.operatorList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {

			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
		}
		resultMap.put("operatorList", operatorList);
		return resultMap;
	}
	
	@RequestMapping(value = "/deleteoperator", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteoperator(@ModelAttribute  operatorsVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			settingService.deleteOperator(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}

		return resultMap;
	}
	
	@RequestMapping(value = "/searchoperator", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchoperator(@ModelAttribute  operatorsVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		operatorsVO searchoperator = new operatorsVO();
		try {
			searchoperator = settingService.searhOperator(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("searchoperator", searchoperator);
		
		return resultMap;
	}


	
	@RequestMapping(value = "/accesslist", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> accesslist() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<accessorsVO> accessList = new ArrayList<accessorsVO>();

		try {
			accessList = settingService.accessList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
		}
		resultMap.put("accessList", accessList);

		return resultMap;
	}
	
	@RequestMapping(value = "/deleteaccess", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteaccess(@ModelAttribute  accessorsVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			settingService.deleteAccess(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}

		return resultMap;
	}
	
	@RequestMapping(value = "/searchaccess", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchaccess(@ModelAttribute  accessorsVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		accessorsVO searchaccess = new accessorsVO();
		
		try {
			searchaccess = settingService.searchAccess(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("searchaccess", searchaccess);
		
		return resultMap;
	}


}

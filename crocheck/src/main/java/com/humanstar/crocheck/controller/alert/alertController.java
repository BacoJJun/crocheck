package com.humanstar.crocheck.controller.alert;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.humanstar.crocheck.model.alert.dto.alertVO;
import com.humanstar.crocheck.service.alert.alertListServiceImpl;

@Controller
public class alertController {
	private static final Logger logger = LoggerFactory.getLogger(alertController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";
	
	@Inject
	alertListServiceImpl alertListService;
	
	@RequestMapping(value = "/updatealert", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updatealert(@ModelAttribute  alertVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			alertListService.alertUpdate(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}

		return resultMap;
	}
	
	@RequestMapping(value = "/alertList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> alertList() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		alertVO alertList = new alertVO();

		try {
			alertList = alertListService.alertList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("alertList", alertList);

		return resultMap;
	}
	
}

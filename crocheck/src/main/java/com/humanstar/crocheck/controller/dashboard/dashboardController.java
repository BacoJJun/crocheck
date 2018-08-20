package com.humanstar.crocheck.controller.dashboard;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.humanstar.crocheck.model.appliance.dto.applianceVO;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDepartureVO;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDomainVO;
import com.humanstar.crocheck.service.appliance.applianceServiceImpl;
import com.humanstar.crocheck.service.dashboard.alertLiveServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class dashboardController {

	private static final Logger logger = LoggerFactory.getLogger(dashboardController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";

	@Inject
	applianceServiceImpl applianceService;
	@Inject
	alertLiveServiceImpl alertLiveService;

	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws Exception
	 */

	@RequestMapping(value = "/SystemStatus", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> SystemStatus() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<applianceVO> systemStatus = new ArrayList<applianceVO>();

		try {
			systemStatus = applianceService.nowStatus();

		} catch (Exception e) {

			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}

		resultMap.put(RESULT, RESULT_SUCCESS);
		resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		resultMap.put("systemStatus", systemStatus);

		return resultMap;
	}

	@RequestMapping(value = "/alertLiveDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> AlertLiveDomain() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<alertLiveDomainVO> pharmingDomainList = new ArrayList<alertLiveDomainVO>();
		
		try {
			pharmingDomainList = alertLiveService.alertLiveDomain();

		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}
		resultMap.put(RESULT, RESULT_SUCCESS);
		resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		resultMap.put("pharmingDomainList", pharmingDomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/alertLiveDeparture", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> AlertLiveDeparture() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<alertLiveDepartureVO> pharmingDepartureList = new ArrayList<alertLiveDepartureVO>();
		
		try {
			pharmingDepartureList = alertLiveService.alertLiveDeparture();

		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}
		resultMap.put(RESULT, RESULT_SUCCESS);
		resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		resultMap.put("pharmingDepartureList", pharmingDepartureList);

		return resultMap;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) throws Exception {
		logger.info("crocheck dashboard test");
		return "index";
	}

}

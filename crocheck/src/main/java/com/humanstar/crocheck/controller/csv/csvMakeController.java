package com.humanstar.crocheck.controller.csv;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.humanstar.crocheck.service.csvmake.csvZoneMakeServiceImpl;

@Controller
public class csvMakeController {
	private static final Logger logger = LoggerFactory.getLogger(csvMakeController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";
	

	@Inject 
	csvZoneMakeServiceImpl csvZoneMakeService;
	
	@RequestMapping(value = "/zoneCsvMake", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> zoneCsvMake() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String file_name = "";

		try {
			file_name = csvZoneMakeService.csvZoneMake();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("file_name", file_name);

		return resultMap; 
	}
	
	
	@RequestMapping(value = "/zoneCsv", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> zoneCsv() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String csvZoneContent = "";

		try {
			csvZoneContent = csvZoneMakeService.csvZone();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("csvZoneContent", csvZoneContent);

		return resultMap; 
	}
	
	@RequestMapping(value = "/dhcpcsv", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpcsv() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String csvDhcpContent = "";

		try {
			csvDhcpContent = csvZoneMakeService.csvDhcp();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("csvDhcpContent", csvDhcpContent);

		return resultMap; 
	}
	
	@RequestMapping(value = "/dhcpsubcsv", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpsubcsv() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String csvDchpsubContent = "";

		try {
			csvDchpsubContent = csvZoneMakeService.csvDhcpSub();

			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("csvDchpsubContent", csvDchpsubContent);

		return resultMap; 
	}
	
	
	@RequestMapping(value = "/dhcprentcsv", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcprentcsv() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String csvDchpRentContent = "";

		try {
			csvDchpRentContent = csvZoneMakeService.csvDhcpRent();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("csvDchpRentContent", csvDchpRentContent);

		return resultMap; 
	}
	
	@RequestMapping(value = "/operatorcsv", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> operatorcsv() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String csvOperators = "";

		try {
			csvOperators = csvZoneMakeService.csvOperators();
			logger.info(csvOperators);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("csvOperators", csvOperators);

		return resultMap; 
	}
	
	@RequestMapping(value = "/accessorcsv", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> accessorcsv() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String csvAccessors = "";

		try {
			csvAccessors = csvZoneMakeService.csvAccessors();
			logger.info(csvAccessors);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("csvAccessors", csvAccessors);

		return resultMap; 
	}
}

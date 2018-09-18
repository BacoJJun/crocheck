package com.humanstar.crocheck.controller.engine;

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

import com.humanstar.crocheck.model.engine.dto.ntpVO;
import com.humanstar.crocheck.model.engine.dto.rolesDhcpVO;
import com.humanstar.crocheck.model.engine.dto.rolesVO;
import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;
import com.humanstar.crocheck.service.engine.rolesServiceImpl;

@Controller
public class engineController {
	private static final Logger logger = LoggerFactory.getLogger(engineController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";
	
	@Inject 
	rolesServiceImpl rolesService;
	
	@RequestMapping(value = "/basicrolse", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> basicrolse() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		rolesVO basicRole = new rolesVO();
		
		try {
			basicRole = rolesService.basicRoles();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("basicRole", basicRole);

		return resultMap; 
	}
	
	@RequestMapping(value = "/basicDhcpRoles", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> basicDhcpRoles() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		rolesDhcpVO basicDhcpRole = new rolesDhcpVO();
		
		try {
			basicDhcpRole =rolesService.basicDhcpRoles();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("basicDhcpRole", basicDhcpRole);

		return resultMap; 
	}
	
	@RequestMapping(value = "/ntplist", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> ntplist() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<ntpVO> ntplist  = new ArrayList<ntpVO>();
		
		try {
			ntplist = rolesService.ntpList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ntplist", ntplist);

		return resultMap; 
	}
	
	
	@RequestMapping(value = "/updateDnsRoles", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateDnsRoles(@ModelAttribute  rolesVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			rolesService.updateDnsRolse(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap;
	}
	
	@RequestMapping(value = "/updateNtpRoles", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateNtpRoles(@ModelAttribute  rolesVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			rolesService.updateNtpRolse(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap;
	}
	@RequestMapping(value = "/updatedhcp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updatedhcp(@ModelAttribute  rolesDhcpVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			rolesService.updateDhcp(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap;
	}
	
	@RequestMapping(value = "/insertntp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insertntp(@ModelAttribute  ntpVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			rolesService.insertNtp(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap;
	}
	
	@RequestMapping(value = "/deletentp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deletentp(@ModelAttribute  ntpVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			rolesService.deleteNtp(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap;
	}
	
	@RequestMapping(value = "/updateDhcpRoles", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateDhcpRoles(@ModelAttribute  rolesDhcpVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			rolesService.updateDhcpRolse(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap;
	}
	
}


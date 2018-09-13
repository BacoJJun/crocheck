package com.humanstar.crocheck.controller.policy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.humanstar.crocheck.model.change.dto.changeValueVO;
import com.humanstar.crocheck.model.policy.dto.ddosBlockStatusVO;
import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;
import com.humanstar.crocheck.model.policy.dto.dhcpRentVO;
import com.humanstar.crocheck.model.policy.dto.dhcpSubVO;
import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;
import com.humanstar.crocheck.service.change.changeValueServiceImpl;
import com.humanstar.crocheck.service.policy.ddosBlockServiceImpl;
import com.humanstar.crocheck.service.policy.dhcpPolicyServiceImpl;
import com.humanstar.crocheck.service.policy.dnspolicyServiceImpl;

@Controller
public class policyController {
	private static final Logger logger = LoggerFactory.getLogger(policyController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";
	
	@Inject
	dnspolicyServiceImpl dnspolicyService;
	@Inject 
	ddosBlockServiceImpl ddosBlockService;
	@Inject 
	dhcpPolicyServiceImpl dhcpPolicyService;
	@Inject
	changeValueServiceImpl changeValueService;
		
	@RequestMapping(value = "/dnsTableList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnsTableList() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dnspolicyVO> dnsTableList = new ArrayList<dnspolicyVO>();

		try {
			dnsTableList = dnspolicyService.dnsTableList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsTableList", dnsTableList);

		return resultMap; 
	}
	@RequestMapping(value = "/dnszonelist", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnszonelist() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dnspolicyVO> zonelist = new ArrayList<dnspolicyVO>();

		try {
			zonelist = dnspolicyService.zonelist();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("zonelist", zonelist);

		return resultMap; 
	}
	
	@RequestMapping(value = "/subDnsList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> subDnsList(@ModelAttribute  dnspolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dnspolicyVO> dnsTableList = new ArrayList<dnspolicyVO>();

		try {
			dnsTableList = dnspolicyService.subDnsList(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsTableList", dnsTableList);

		return resultMap;
	}
	@RequestMapping(value = "/searchDnsDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchDnsDomain(@ModelAttribute  dnspolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dnspolicyVO> dnsTableList = new ArrayList<dnspolicyVO>();

		try {
			dnsTableList = dnspolicyService.searchDnsDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsTableList", dnsTableList);

		return resultMap;
	}
	
	@RequestMapping(value = "/catchDnsDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> catchDnsDomain(@ModelAttribute  dnspolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dnspolicyVO> dnsTableList = new ArrayList<dnspolicyVO>();

		try {
			dnsTableList = dnspolicyService.catchDnsDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsTableList", dnsTableList);

		return resultMap;
	}
	
	@RequestMapping(value = "/ddosBlockStatus", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> ddosBlockStatus() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<ddosBlockStatusVO> ddosBlockList = new ArrayList<ddosBlockStatusVO>();

		try {
			ddosBlockList = ddosBlockService.ddosBlocklist();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosBlockList", ddosBlockList);

		return resultMap;
	}
	
	@RequestMapping(value = "/dhcpTableList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpTableList() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dhcpPolicyVO> dhcpTableList = new ArrayList<dhcpPolicyVO>();

		try {
			dhcpTableList = dhcpPolicyService.dhcpTableList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dhcpTableList", dhcpTableList);

		return resultMap; 
	}
	
	@RequestMapping(value = "/subdhcpList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> subdhcpList(@ModelAttribute  dhcpPolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dhcpSubVO> dhcpSubList = new ArrayList<dhcpSubVO>();

		try {
			dhcpSubList = dhcpPolicyService.dhcpSubList(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dhcpSubList", dhcpSubList);

		return resultMap;
	}
	@RequestMapping(value = "/rentdhcpList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> rentdhcpList(@ModelAttribute  dhcpPolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dhcpRentVO> dhcpRentList = new ArrayList<dhcpRentVO>();

		try {
			dhcpRentList = dhcpPolicyService.dhcpRentList(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dhcpRentList", dhcpRentList);

		return resultMap;
	}
	
	@RequestMapping(value = "/insertdns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insertdns(@ModelAttribute  dnspolicyVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		
		changeVO.setChange_type("dns");
		changeVO.setQuery_type("insert");
		changeVO.setTitle("insert : " + vo.getZone());
		changeVO.setComment("insert : " + vo.toString());
		changeVO.setChange_user("Administrator");
		changeVO.setUser_ip(request.getRemoteAddr());
		logger.info(request.getRemoteAddr());
		
				
		try {
			dnspolicyService.insertdns(vo);
			changeValueService.insertChangeValue(changeVO);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}

		return resultMap;
	}
	@RequestMapping(value = "/updatedns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updatedns(@ModelAttribute  dnspolicyVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		List<dnspolicyVO> dnsList = new ArrayList<dnspolicyVO>();
		
		changeVO.setChange_type("dns");
		changeVO.setQuery_type("update");
		changeVO.setTitle("update : " + vo.getZone());
		changeVO.setComment("after : " + vo.toString() + "before : " );
		changeVO.setChange_user("Administrator");
		changeVO.setUser_ip(request.getRemoteAddr());	
		
		try {
			dnspolicyService.updatedns(vo);
			changeValueService.insertChangeValue(changeVO);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}

		return resultMap;
	}
	@RequestMapping(value = "/deletedns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deletedns(@ModelAttribute  dnspolicyVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		List<dnspolicyVO> dnsList = new ArrayList<dnspolicyVO>();
		
		
		try {
			dnsList = dnspolicyService.zonelist();
			changeVO.setChange_type("dns");
			changeVO.setQuery_type("delete");
			changeVO.setTitle("delete : " + vo.getZone());
			String zonelist = "";
			for(int i =0;i<dnsList.size();i++) {
				zonelist += dnsList.toString();
			}
			changeVO.setComment("delete : " + zonelist);
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(request.getRemoteAddr());
			
			dnspolicyService.delete(vo);
			changeValueService.insertChangeValue(changeVO);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap;
	}
	@RequestMapping(value = "/insertsubdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insertsubdomain(@ModelAttribute  dnspolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			dnspolicyService.insertsubdomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}

		return resultMap;
	}
	@RequestMapping(value = "/updatesubdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updatesubdomain(@ModelAttribute  dnspolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			dnspolicyService.updatesubdomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}

		return resultMap;
	}
	@RequestMapping(value = "/deletesubdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deletesubdomain(@ModelAttribute  dnspolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			dnspolicyService.deletesubdomain(vo);
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

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
import com.humanstar.crocheck.model.policy.dto.dhcpCategoryVO;
import com.humanstar.crocheck.model.policy.dto.dhcpCountVO;
import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;
import com.humanstar.crocheck.model.policy.dto.dhcpRentVO;
import com.humanstar.crocheck.model.policy.dto.dhcpSubVO;
import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;
import com.humanstar.crocheck.service.change.changeValueServiceImpl;
import com.humanstar.crocheck.service.policy.ddosBlockServiceImpl;
import com.humanstar.crocheck.service.policy.dhcpCategoryServiceImpl;
import com.humanstar.crocheck.service.policy.dhcpCountServiceImpl;
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
	dhcpCategoryServiceImpl dhcpCategoryService;
	@Inject
	changeValueServiceImpl changeValueService;
	@Inject
	dhcpCountServiceImpl dhcpCountService;
	
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
	
	@RequestMapping(value = "/dhcpcategory", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpcategory() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dhcpCategoryVO> categoryList = new ArrayList<dhcpCategoryVO>();

		try {
			categoryList = dhcpCategoryService.categoryList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("categoryList", categoryList);

		return resultMap; 
	}
	@RequestMapping(value = "/dhcpcategorygroup", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpcategorygroup() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dhcpCategoryVO> categoryGroupList = new ArrayList<dhcpCategoryVO>();

		try {
			categoryGroupList = dhcpCategoryService.categoryGroupList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("categoryGroupList", categoryGroupList);

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
	
	@RequestMapping(value = "/dhcpcount", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpcount() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		dhcpCountVO dhcpCountValue = new dhcpCountVO();
		
		try {
			dhcpCountValue = dhcpCountService.dhcoCountValue();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dhcpCountValue", dhcpCountValue);

		return resultMap;
	}
	
	@RequestMapping(value = "/dhcpsubcount", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpsubcount(@ModelAttribute  dhcpPolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		dhcpCountVO dhcpCountValue = new dhcpCountVO();
		
		try {
			dhcpCountValue = dhcpCountService.dhcpsubCountValue(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dhcpCountValue", dhcpCountValue);

		return resultMap;
	}
	
	@RequestMapping(value = "/insertdns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insertdns(@ModelAttribute  dnspolicyVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		
		changeVO.setChange_type("dns");
		changeVO.setQuery_type("zone insert");
		changeVO.setTitle("insert : " + vo.getZone());
		changeVO.setComment("insert : " + vo.toString());
		changeVO.setChange_user("Administrator");
		changeVO.setUser_ip(" ");
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
	
		try {
			dnsList = dnspolicyService.zonesearchDns(vo);
			vo.setId(dnsList.get(0).getId());
			changeVO.setChange_type("dns");
			changeVO.setQuery_type("zone update");
			changeVO.setTitle("update : " + vo.getZone());
			changeVO.setComment("after : " + vo.toString() + "before : " + dnsList.get(0).toString());
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");	
			
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
			dnsList = dnspolicyService.zonesearchDns(vo);
			changeVO.setChange_type("dns");
			changeVO.setQuery_type("zone delete");
			changeVO.setTitle("delete : " + vo.getZone());
			String zonelist = "";
			for(int i =0;i<dnsList.size();i++) {
				zonelist += dnsList.toString();
			}
			changeVO.setComment("delete : " + zonelist);
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");
			
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
	public Map<String, Object> insertsubdomain(@ModelAttribute  dnspolicyVO vo,HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		
		changeVO.setChange_type("dns");
		changeVO.setQuery_type("sub_domain insert");
		changeVO.setTitle("insert : " + vo.getZone());
		changeVO.setComment("insert : " + vo.toString());
		changeVO.setChange_user("Administrator");
		changeVO.setUser_ip(request.getRemoteAddr());
		
		try {
			dnspolicyService.insertsubdomain(vo);
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
	@RequestMapping(value = "/updatesubdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updatesubdomain(@ModelAttribute  dnspolicyVO vo, HttpServletRequest request ) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		List<dnspolicyVO> dnsList = new ArrayList<dnspolicyVO>();
		
		try {
			dnsList = dnspolicyService.zonesearchDns(vo);
			vo.setId(dnsList.get(0).getId());
			changeVO.setChange_type("dns");
			changeVO.setQuery_type("sub_domain update");
			changeVO.setTitle("update : " + vo.getZone());
			changeVO.setComment("after : " + vo.toString() + "before : " + dnsList.get(0).toString());
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");	

			dnspolicyService.updatesubdomain(vo);
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
	@RequestMapping(value = "/deletesubdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deletesubdomain(@ModelAttribute  dnspolicyVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		List<dnspolicyVO> dnsList = new ArrayList<dnspolicyVO>();
		
		
		try {
			dnsList = dnspolicyService.idsearchDns(vo);
			changeVO.setChange_type("dns");
			changeVO.setQuery_type("sub_domain delete");
			changeVO.setTitle("delete : " + vo.getZone());
			changeVO.setComment("delete : " + dnsList.get(0).toString());
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");

			dnspolicyService.deletesubdomain(vo);
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
	@RequestMapping(value = "/dhcpinsert", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpinsert(@ModelAttribute  dhcpPolicyVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		
		try {
			changeVO.setChange_type("dhcp");
			changeVO.setQuery_type("dhcp insert");
			changeVO.setTitle("insert : " + vo.getStart_ip());
			changeVO.setComment("insert : " + vo.toString());
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");
			
			dhcpPolicyService.insertDhcp(vo);
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

	@RequestMapping(value = "/catchdhcp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> catchdhcp(@ModelAttribute  dhcpPolicyVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		dhcpPolicyVO selectdhcp = new dhcpPolicyVO();
		
		try {
			selectdhcp = dhcpPolicyService.catchDhcp(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("selectdhcp", selectdhcp);
		return resultMap;
	}
	
	
	@RequestMapping(value = "/dhcpupdate", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpupdate(@ModelAttribute  dhcpPolicyVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		dhcpPolicyVO beforeDhcp = new dhcpPolicyVO();
		changeValueVO changeVO = new changeValueVO();
		
		try {
			beforeDhcp = dhcpPolicyService.catchDhcp(vo);
			changeVO.setChange_type("dhcp");
			changeVO.setQuery_type("dhcp update");
			changeVO.setTitle("update : " + vo.getStart_ip());
			changeVO.setComment("after : " + vo.toString() + "before : " + beforeDhcp.toString());
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");
			dhcpPolicyService.updateDhcp(vo);
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
	
	@RequestMapping(value = "/dhcpdelete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpdelete(@ModelAttribute  dhcpPolicyVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		dhcpPolicyVO beforeDhcp = new dhcpPolicyVO();
		
		try {
			beforeDhcp = dhcpPolicyService.catchDhcp(vo);
			changeVO.setChange_type("dhcp");
			changeVO.setQuery_type("dhcp delete");
			changeVO.setTitle("delete : " + beforeDhcp.getStart_ip());
			changeVO.setComment("delete : " + beforeDhcp.toString());
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");
			dhcpPolicyService.deleteDhcp(vo);
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
	
	
	@RequestMapping(value = "/subdhcpinsert", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> subdhcpinsert(@ModelAttribute  dhcpSubVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		
		try {
			changeVO.setChange_type("dhcp");
			changeVO.setQuery_type("sub_dhcp insert");
			changeVO.setTitle("insert : " + vo.getStart_ip());
			changeVO.setComment("insert : " + vo.toString());
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");
			dhcpPolicyService.insertSubDhcp(vo);
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

	
	
	@RequestMapping(value = "/catchsubdhcp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> catchsubdhcp(@ModelAttribute  dhcpSubVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		dhcpSubVO selectsubdhcp = new dhcpSubVO();
		
		try {
			selectsubdhcp = dhcpPolicyService.catchsubDhcp(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("selectsubdhcp", selectsubdhcp);
		return resultMap;
	}
	
	@RequestMapping(value = "/subdhcpupdate", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> subdhcpupdate(@ModelAttribute  dhcpSubVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		dhcpSubVO beforesubDhcp = new dhcpSubVO();
		
		
		try {
			beforesubDhcp = dhcpPolicyService.catchsubDhcp(vo);
			changeVO.setChange_type("dhcp");
			changeVO.setQuery_type("sub_dhcp update");
			changeVO.setTitle("update : " + vo.getStart_ip());
			changeVO.setComment("after : " + vo.toString() + "before : " + beforesubDhcp.toString());
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");
			dhcpPolicyService.updateSubDhcp(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap;
	}
	
	@RequestMapping(value = "/subdhcpdelete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> subdhcpdelete(@ModelAttribute  dhcpSubVO vo, HttpServletRequest request) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		changeValueVO changeVO = new changeValueVO();
		dhcpSubVO beforesubDhcp = new dhcpSubVO();
		
		try {
			beforesubDhcp = dhcpPolicyService.catchsubDhcp(vo);
			changeVO.setChange_type("dhcp");
			changeVO.setQuery_type("sub_dhcp delete");
			changeVO.setTitle("delete : " + beforesubDhcp.getStart_ip());
			changeVO.setComment("delete : " + beforesubDhcp.toString());
			changeVO.setChange_user("Administrator");
			changeVO.setUser_ip(" ");
			dhcpPolicyService.deleteSubDhcp(vo);
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
}

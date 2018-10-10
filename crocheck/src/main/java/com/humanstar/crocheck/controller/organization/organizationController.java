package com.humanstar.crocheck.controller.organization;

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

import com.humanstar.crocheck.controller.policy.policyController;
import com.humanstar.crocheck.model.organization.dto.memberVO;
import com.humanstar.crocheck.model.organization.dto.postVO;
import com.humanstar.crocheck.service.organization.organizationServiceImpl;

@Controller
public class organizationController {
	private static final Logger logger = LoggerFactory.getLogger(policyController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";
	
	@Inject 
	organizationServiceImpl organizationService;
	
	@RequestMapping(value = "/memberslist", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> memberslist() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<memberVO> memberList = new ArrayList<memberVO>();

		try {
			memberList = organizationService.memberList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("memberList", memberList);

		return resultMap; 
	}
	
	@RequestMapping(value = "/postlist", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> postlist() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<postVO> postList = new ArrayList<postVO>();

		try {
			postList = organizationService.postList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("postList", postList);

		return resultMap; 
	}
	
	@RequestMapping(value = "/postmemberslist", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> postmemberslist(@ModelAttribute memberVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<memberVO> memberList = new ArrayList<memberVO>();

		try {
			memberList = organizationService.postMemberList(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("memberList", memberList);

		return resultMap; 
	}
	
	@RequestMapping(value = "/postsearchlist", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> postsearchlist(@ModelAttribute postVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		postVO postSearchList = new postVO();

		try {
			postSearchList = organizationService.postSearchList(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("postSearchList", postSearchList);

		return resultMap; 
	}
	
	@RequestMapping(value = "/insertmember", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insertmember(@ModelAttribute memberVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			organizationService.insertMember(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap; 
	}
	
	@RequestMapping(value = "/updatemember", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updatemember(@ModelAttribute memberVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			organizationService.updateMember(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap; 
	}
	
	@RequestMapping(value = "/deletemember", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deletemember(@ModelAttribute memberVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			organizationService.deleteMember(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		return resultMap; 
	}
	
	
	
	
	@RequestMapping(value = "/selectmember", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selectmember(@ModelAttribute memberVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		memberVO selectmember = new memberVO();

		try {
			selectmember = organizationService.selectMember(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("selectmember", selectmember);

		return resultMap; 
	}
	
	
}

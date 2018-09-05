package com.humanstar.crocheck.controller.status;

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

import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.model.status.dto.dnsListVO;
import com.humanstar.crocheck.service.status.dnsListServiceImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
public class statusController {

	private static final Logger logger = LoggerFactory.getLogger(statusController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";

	@Inject
	dnsListServiceImpl dnsListService;

	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws Exception
	 */

	@RequestMapping(value = "/dnsNowList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnsNowList() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dnsListVO> dnsnowlist = new ArrayList<dnsListVO>();

		try {
			dnsnowlist = dnsListService.dnsNowList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}
		resultMap.put("dnsnowlist", dnsnowlist);

		return resultMap;
	}
	
	@RequestMapping(value = "/dnsSearchList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnsSearchList(@ModelAttribute searchTypeVO vo) throws Exception {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<dnsListVO> dnssearchlist = new ArrayList<dnsListVO>();
		

		try {
			dnssearchlist = dnsListService.dnsSearchList(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());
		}
		resultMap.put("dnssearchlist", dnssearchlist);

		return resultMap;
	}
}

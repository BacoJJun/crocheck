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

import com.humanstar.crocheck.model.change.dto.changeValueVO;
import com.humanstar.crocheck.model.report.dto.reportApplianceVO;
import com.humanstar.crocheck.model.report.dto.reportDomainQueryVO;
import com.humanstar.crocheck.model.report.dto.reportPacketVO;
import com.humanstar.crocheck.model.report.dto.reportSrcQueryVO;
import com.humanstar.crocheck.model.searchtype.dto.searchTypeVO;
import com.humanstar.crocheck.service.change.changeValueServiceImpl;
import com.humanstar.crocheck.service.report.reportMainServiceImpl;

@Controller
public class reportController {
	private static final Logger logger = LoggerFactory.getLogger(reportController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";


	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws Exception
	 */
	@Inject
	reportMainServiceImpl reportMainService;
	@Inject
	changeValueServiceImpl changeValueService;

	@RequestMapping(value = "/reportBaseApp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseApp() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportApplianceVO> applist = new ArrayList<reportApplianceVO>();


		try {
			applist = reportMainService.reportMainApp();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("applist", applist);

		return resultMap;
	}
	@RequestMapping(value = "/reportBaseDnsPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseDnsPacket() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> dnsPacketList = new ArrayList<reportPacketVO>();


		try {
			dnsPacketList = reportMainService.reportMainDnsPacket();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsPacketList", dnsPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportBaseDDosPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseDDosPacket() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> ddosPacketList = new ArrayList<reportPacketVO>();


		try {
			ddosPacketList = reportMainService.reportMainDDosPacket();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosPacketList", ddosPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportBaseDnsDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseDnsDomain() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportDomainQueryVO> dnsDomainList = new ArrayList<reportDomainQueryVO>();


		try {
			dnsDomainList = reportMainService.reportMainDnsDomain();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsDomainList", dnsDomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportBaseDDosDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseDDosDomain() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportDomainQueryVO> ddosDomainList = new ArrayList<reportDomainQueryVO>();


		try {
			ddosDomainList = reportMainService.reportMainDDosDomain();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosDomainList", ddosDomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportBaseDnsSrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseDnsSrc() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportSrcQueryVO> dnsSrcList = new ArrayList<reportSrcQueryVO>();


		try {
			dnsSrcList = reportMainService.reportMainDnsSrc();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsSrcList", dnsSrcList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportBaseDDosSrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportBaseDDosSrc() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportSrcQueryVO> ddosSrcList = new ArrayList<reportSrcQueryVO>();


		try {
			ddosSrcList = reportMainService.reportMainDDosSrc();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosSrcList", ddosSrcList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportdayApp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportdayApp(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportApplianceVO> applist = new ArrayList<reportApplianceVO>();


		try {
			applist = reportMainService.dailyMainApp(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("applist", applist);

		return resultMap;
	}
	@RequestMapping(value = "/reportdayDnsPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportdayDnsPacket(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> dnsPacketList = new ArrayList<reportPacketVO>();


		try {
			dnsPacketList = reportMainService.dailyMainDnsPacket(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsPacketList", dnsPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportdayDDosPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportdayDDosPacket(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> ddosPacketList = new ArrayList<reportPacketVO>();


		try {
			ddosPacketList = reportMainService.dailyMainDDosPacket(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosPacketList", ddosPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportdayDnsDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportdayDnsDomain(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportDomainQueryVO> dnsDomainList = new ArrayList<reportDomainQueryVO>();


		try {
			dnsDomainList = reportMainService.dailyMainDnsDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsDomainList", dnsDomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportdayDDosDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportdayDosDomain(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportDomainQueryVO> ddosDomainList = new ArrayList<reportDomainQueryVO>();


		try {
			ddosDomainList = reportMainService.dailyMainDDosDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosDomainList", ddosDomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportdayDnsSrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportdayDnsSrc(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportSrcQueryVO> dnsSrcList = new ArrayList<reportSrcQueryVO>();


		try {
			dnsSrcList = reportMainService.dailyMainDnsSrc(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsSrcList", dnsSrcList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportdayDDosSrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportdayDDosSrc(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportSrcQueryVO> ddosSrcList = new ArrayList<reportSrcQueryVO>();


		try {
			ddosSrcList = reportMainService.dailyMainDDosSrc(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosSrcList", ddosSrcList);

		return resultMap;
	}

	@RequestMapping(value = "/reportweekApp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportweekApp(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportApplianceVO> applist = new ArrayList<reportApplianceVO>();


		try {
			applist = reportMainService.weeklyMainApp(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("applist", applist);

		return resultMap;
	}
	@RequestMapping(value = "/reportweekDnsPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportweekDnsPacket(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> dnsPacketList = new ArrayList<reportPacketVO>();


		try {
			dnsPacketList = reportMainService.weeklyMainDnsPacket(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsPacketList", dnsPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportweekDDosPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportweekDDosPacket(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> ddosPacketList = new ArrayList<reportPacketVO>();


		try {
			ddosPacketList = reportMainService.weeklyMainDDosPacket(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosPacketList", ddosPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportweekDnsDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportweekDnsDomain(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportDomainQueryVO> dnsDomainList = new ArrayList<reportDomainQueryVO>();

	
		try {
			dnsDomainList = reportMainService.weeklyMainDnsDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsDomainList", dnsDomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportweekDDosDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportweekDosDomain(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportDomainQueryVO> ddosDomainList = new ArrayList<reportDomainQueryVO>();


		try {
			ddosDomainList = reportMainService.weeklyMainDDosDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosDomainList", ddosDomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportweekDnsSrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportweekDnsSrc(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportSrcQueryVO> dnsSrcList = new ArrayList<reportSrcQueryVO>();


		try {
			dnsSrcList = reportMainService.weeklyMainDnsSrc(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsSrcList", dnsSrcList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportweekDDosSrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportweekDDosSrc(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportSrcQueryVO> ddosSrcList = new ArrayList<reportSrcQueryVO>();


		try {
			ddosSrcList = reportMainService.weeklyMainDDosSrc(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosSrcList", ddosSrcList);

		return resultMap;
	}

	@RequestMapping(value = "/reportmonthApp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportmonthApp(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportApplianceVO> applist = new ArrayList<reportApplianceVO>();


		try {
			applist = reportMainService.monthlyMainApp(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("applist", applist);

		return resultMap;
	}
	@RequestMapping(value = "/reportmonthDnsPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportmonthDnsPacket(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> dnsPacketList = new ArrayList<reportPacketVO>();


		try {
			dnsPacketList = reportMainService.monthlyMainDnsPacket(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsPacketList", dnsPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportmonthDDosPacket", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportmonthDDosPacket(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportPacketVO> ddosPacketList = new ArrayList<reportPacketVO>();


		try {
			ddosPacketList = reportMainService.monthlyMainDDosPacket(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosPacketList", ddosPacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportmonthDnsDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportmonthDnsDomain(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportDomainQueryVO> dnsDomainList = new ArrayList<reportDomainQueryVO>();


		try {
			dnsDomainList = reportMainService.monthlyMainDnsDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsDomainList", dnsDomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportmonthDDosDomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportmonthDosDomain(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportDomainQueryVO> ddosDomainList = new ArrayList<reportDomainQueryVO>();


		try {
			ddosDomainList = reportMainService.monthlyMainDDosDomain(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosDomainList", ddosDomainList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportmonthDnsSrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportmonthDnsSrc(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportSrcQueryVO> dnsSrcList = new ArrayList<reportSrcQueryVO>();


		try {
			dnsSrcList = reportMainService.monthlyMainDnsSrc(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("dnsSrcList", dnsSrcList);

		return resultMap;
	}
	
	@RequestMapping(value = "/reportmonthDDosSrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportmonthDDosSrc(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<reportSrcQueryVO> ddosSrcList = new ArrayList<reportSrcQueryVO>();


		try {
			ddosSrcList = reportMainService.monthlyMainDDosSrc(vo);
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("ddosSrcList", ddosSrcList);

		return resultMap;
	}
	
	@RequestMapping(value="/reportChangeValueList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> reportChangeValueList(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<changeValueVO> changeValueList = new ArrayList<changeValueVO>();
		
		try{
			changeValueList = changeValueService.changeValueList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		}catch(Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
		}
		resultMap.put("changeValueList", changeValueList);
		
		return resultMap;
	}

}

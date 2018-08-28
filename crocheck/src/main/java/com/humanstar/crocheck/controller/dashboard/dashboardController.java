package com.humanstar.crocheck.controller.dashboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.humanstar.crocheck.model.appliance.dto.applianceVO;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDepartureVO;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDnsDDosVO;
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDomainVO;
import com.humanstar.crocheck.model.dashboard.dto.applianceStatusVO;
import com.humanstar.crocheck.model.dashboard.dto.dayPharmingVO;
import com.humanstar.crocheck.model.dashboard.dto.dnsStatVO;
import com.humanstar.crocheck.model.dashboard.dto.networkStatusVO;
import com.humanstar.crocheck.model.dashboard.dto.nowPharmingVO;
import com.humanstar.crocheck.model.dashboard.dto.todayDnsVO;
import com.humanstar.crocheck.model.dashboard.dto.todayPacketVO;
import com.humanstar.crocheck.model.dashboard.dto.yesterdayPacketVO;
import com.humanstar.crocheck.service.appliance.applianceServiceImpl;
import com.humanstar.crocheck.service.dashboard.alertLiveDnsDDosServiceImpl;
import com.humanstar.crocheck.service.dashboard.alertLiveServiceImpl;
import com.humanstar.crocheck.service.dashboard.applianceStatusServiceImpl;
import com.humanstar.crocheck.service.dashboard.dnsStatServiceImpl;
import com.humanstar.crocheck.service.dashboard.networkStatusServiceImpl;
import com.humanstar.crocheck.service.dashboard.pharmingServiceImpl;
import com.humanstar.crocheck.service.dashboard.todayDnsServiceImpl;
import com.humanstar.crocheck.service.dashboard.todayPacketServiceImpl;
import com.humanstar.crocheck.service.dashboard.yesterdayPacketServiceImpl;

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
	@Inject
	pharmingServiceImpl pharmingService;
	@Inject
	todayPacketServiceImpl dayPacketService;
	@Inject
	yesterdayPacketServiceImpl yesterdayPacketService;
	@Inject
	applianceStatusServiceImpl applianceStatusService;
	@Inject
	networkStatusServiceImpl networkStatusService;
	@Inject
	alertLiveDnsDDosServiceImpl alertLiveDnsDDosService;
	@Inject
	todayDnsServiceImpl todayDnsService;
	@Inject
	dnsStatServiceImpl dnsStatService;
	
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
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {

			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}


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
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}

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
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}

		resultMap.put("pharmingDepartureList", pharmingDepartureList);

		return resultMap;
	}
	@RequestMapping(value = "/alertLiveDns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> AlertLiveDns() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<alertLiveDnsDDosVO> alertLiveDnsList = new ArrayList<alertLiveDnsDDosVO>();

		try {
			alertLiveDnsList = alertLiveDnsDDosService.alertLiveDnsList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}

		resultMap.put("alertLiveDnsList", alertLiveDnsList);

		return resultMap;
	}
	@RequestMapping(value = "/alertLiveDDos", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> AlertLiveDDos() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<alertLiveDnsDDosVO> alertLiveDDosList = new ArrayList<alertLiveDnsDDosVO>();

		try {
			alertLiveDDosList = alertLiveDnsDDosService.alertLiveDDosList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}

		resultMap.put("alertLiveDDosList", alertLiveDDosList);

		return resultMap;
	}
	@RequestMapping(value = "/nowPharmingList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> nowPharmingList() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<nowPharmingVO> nowPharmingList = new ArrayList<nowPharmingVO>();

		try {
			nowPharmingList = pharmingService.nowPharmingList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}

		resultMap.put("nowPharmingList", nowPharmingList);

		return resultMap;
	}

	@RequestMapping(value = "/dayPharmingList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dayPharmingList() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<dayPharmingVO> dayPharmingList = new ArrayList<dayPharmingVO>();

		try {
			dayPharmingList = pharmingService.dayPharmingList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");

		}

		resultMap.put("dayPharmingList", dayPharmingList);

		return resultMap;
	}

	@RequestMapping(value = "/yesterdayPacketList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> yesterdayPacketList() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<yesterdayPacketVO> yesterdaypacketList = new ArrayList<yesterdayPacketVO>();

		try {
			yesterdaypacketList = yesterdayPacketService.yesterdayPacketList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.debug(ERROR_MESSAGE);

		}

		resultMap.put("yesterdaypacketList", yesterdaypacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/dayPacketList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dayPacketList() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<todayPacketVO> daypacketList = new ArrayList<todayPacketVO>();

		try {
			daypacketList = dayPacketService.todayPacketList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.debug(ERROR_MESSAGE);

		}

		resultMap.put("daypacketList", daypacketList);

		return resultMap;
	}
	
	@RequestMapping(value = "/applianceStatus", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> applianceStatus() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<applianceStatusVO> applianceStatusList = new ArrayList<applianceStatusVO>();

		try {
			applianceStatusList = applianceStatusService.applianceStatusList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
			
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.debug(ERROR_MESSAGE);

		}

		resultMap.put("applianceStatus", applianceStatusList);

		return resultMap;
	}
	@RequestMapping(value = "/networkStatus", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> networkStatus() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<networkStatusVO> neworkStatus = new ArrayList<networkStatusVO>();

		try {
			neworkStatus = networkStatusService.networkStatusList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");

		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.debug(ERROR_MESSAGE);

		}

		resultMap.put("neworkStatus", neworkStatus);

		return resultMap;
	}
	
	@RequestMapping(value = "/todayDns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> todayDns() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<todayDnsVO> todayDnsList = new ArrayList<todayDnsVO>();

		try {
			todayDnsList = todayDnsService.todayDnsList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");

		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.debug(ERROR_MESSAGE);

		}

		resultMap.put("todayDnsList", todayDnsList);

		return resultMap;
	}
	@RequestMapping(value = "/yesterdayDns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> yesterdayDns() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<todayDnsVO> yesterDnsList = new ArrayList<todayDnsVO>();

		try {
			yesterDnsList = todayDnsService.yesterdayDnsList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");

		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.debug(ERROR_MESSAGE);

		}

		resultMap.put("yesterDnsList", yesterDnsList);

		return resultMap;
	}
	
	@RequestMapping(value = "/dnsStat", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnsStat() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<dnsStatVO> dnsStatusList = new ArrayList<dnsStatVO>();

		try {
			dnsStatusList =dnsStatService.dnsStatusList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");

		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());;

		}

		resultMap.put("dnsStatusList", dnsStatusList);

		return resultMap;
	}
	
	@RequestMapping(value = "/ddosStat", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> ddosStat() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> condition = new HashMap<String, Object>();
		List<dnsStatVO> ddosStatusList = new ArrayList<dnsStatVO>();

		try {
			ddosStatusList =dnsStatService.ddosStatusList();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");

		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());;
		}

		resultMap.put("ddosStatusList", ddosStatusList);

		return resultMap;
	}
}

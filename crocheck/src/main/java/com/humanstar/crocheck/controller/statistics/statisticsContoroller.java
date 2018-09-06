package com.humanstar.crocheck.controller.statistics;

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
import com.humanstar.crocheck.model.statistics.dto.domainQueryVO;
import com.humanstar.crocheck.model.statistics.dto.srcQueryVO;
import com.humanstar.crocheck.model.statistics.dto.statApplianceVO;
import com.humanstar.crocheck.model.statistics.dto.statPacketVO;
import com.humanstar.crocheck.model.status.dto.dnsListVO;
import com.humanstar.crocheck.service.statistics.statisticsServiceImpl;

@Controller
public class statisticsContoroller {
	private static final Logger logger = LoggerFactory.getLogger(statisticsContoroller.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";

	@Inject
	statisticsServiceImpl statisticsService;

	@RequestMapping(value = "/statLastApp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statLastData() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<statApplianceVO> lastApplist = new ArrayList<statApplianceVO>();

		try {
			lastApplist = statisticsService.lastApplianceStat();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastApplist", lastApplist);

		return resultMap;
	}

	@RequestMapping(value = "/searchApp", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchApp(@ModelAttribute searchTypeVO vo) throws Exception {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<statApplianceVO> lastApplist = new ArrayList<statApplianceVO>();

		try {
			if (vo.getType().equals(new String("min"))) {
				lastApplist = statisticsService.searchMinApplianceStat(vo);
			} else if (vo.getType().equals(new String("hour"))) {
				lastApplist = statisticsService.searchHourApplianceStat(vo);
			}
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastApplist", lastApplist);

		return resultMap;
	}

	@RequestMapping(value = "/statLastPacketDns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statLastPacketDns() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<statPacketVO> lastPacketDnsList = new ArrayList<statPacketVO>();

		try {
			lastPacketDnsList = statisticsService.lastDnsPacket();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.info(e.toString());

		}

		resultMap.put("lastPacketDnsList", lastPacketDnsList);

		return resultMap;
	}

	@RequestMapping(value = "/searchPacketDns", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchPacketDns(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<statPacketVO> lastPacketDnsList = new ArrayList<statPacketVO>();

		try {
			if (vo.getType().equals(new String("min"))) {
				lastPacketDnsList = statisticsService.searchMinDnsPacket(vo);
			} else if (vo.getType().equals(new String("hour"))) {
				lastPacketDnsList = statisticsService.searchHourDnsPacket(vo);
			}
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.info(e.toString());

		}

		resultMap.put("lastPacketDnsList", lastPacketDnsList);

		return resultMap;
	}

	@RequestMapping(value = "/statLastPacketDDos", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statLastPacketDDos() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<statPacketVO> lastPacketDDosList = new ArrayList<statPacketVO>();

		try {
			lastPacketDDosList = statisticsService.lastDDosPacket();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastPacketDDosList", lastPacketDDosList);

		return resultMap;
	}

	@RequestMapping(value = "/searchPacketDDos", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchPacketDDos(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<statPacketVO> lastPacketDDosList = new ArrayList<statPacketVO>();

		try {
			if (vo.getType().equals(new String("min"))) {
				lastPacketDDosList = statisticsService.searchMinDDosPacket(vo);
			} else if (vo.getType().equals(new String("hour"))) {
				lastPacketDDosList = statisticsService.searchHourDDosPacket(vo);
			}
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.info(e.toString());

		}

		resultMap.put("lastPacketDDosList", lastPacketDDosList);

		return resultMap;
	}

	@RequestMapping(value = "/statlastdnsdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statlastdnsdomain() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<domainQueryVO> lastdnsdomainList = new ArrayList<domainQueryVO>();

		try {
			lastdnsdomainList = statisticsService.lastDnsDomain();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastdnsdomainList", lastdnsdomainList);

		return resultMap;
	}

	@RequestMapping(value = "/statlastddosdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statlastddosdomain() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<domainQueryVO> lastddosdomainList = new ArrayList<domainQueryVO>();

		try {
			lastddosdomainList = statisticsService.lastDDosDomain();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastddosdomainList", lastddosdomainList);

		return resultMap;
	}

	@RequestMapping(value = "/searchdnsdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchdnsdomain(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<domainQueryVO> lastdnsdomainList = new ArrayList<domainQueryVO>();

		try {
			if (vo.getType().equals(new String("min"))) {
				lastdnsdomainList = statisticsService.searchMinDnsDomain(vo);
			} else if (vo.getType().equals(new String("hour"))) {
				lastdnsdomainList = statisticsService.searchHourDnsDomain(vo);
			}
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastdnsdomainList", lastdnsdomainList);

		return resultMap;
	}

	@RequestMapping(value = "/searchddosdomain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchddosdomain(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<domainQueryVO> lastddosdomainList = new ArrayList<domainQueryVO>();

		try {
			if (vo.getType().equals(new String("min"))) {
				lastddosdomainList = statisticsService.searchMinDDosDomain(vo);
			} else if (vo.getType().equals(new String("hour"))) {
				lastddosdomainList = statisticsService.searchHourDDosDomain(vo);
			}
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastddosdomainList", lastddosdomainList);

		return resultMap;
	}

	@RequestMapping(value = "/statlastdnssrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statlastdnssrc() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<srcQueryVO> lastdnssrcList = new ArrayList<srcQueryVO>();

		try {
			lastdnssrcList = statisticsService.lastDnsSrc();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastdnssrcList", lastdnssrcList);

		return resultMap;
	}

	@RequestMapping(value = "/searchdnssrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchdnssrc(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<srcQueryVO> lastdnssrcList = new ArrayList<srcQueryVO>();

		try {
			if (vo.getType().equals(new String("min"))) {
				lastdnssrcList = statisticsService.searchMinDnsSrc(vo);
			} else if (vo.getType().equals(new String("hour"))) {
				lastdnssrcList = statisticsService.searchHourDnsSrc(vo);
			}
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastdnssrcList", lastdnssrcList);

		return resultMap;
	}

	@RequestMapping(value = "/statlastddossrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> statlastddossrc() {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<srcQueryVO> lastddossrcList = new ArrayList<srcQueryVO>();

		try {
			lastddossrcList = statisticsService.lastDDosSrc();
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastddossrcList", lastddossrcList);

		return resultMap;
	}

	@RequestMapping(value = "/searchddossrc", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> searchddossrc(@ModelAttribute searchTypeVO vo) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<srcQueryVO> lastddossrcList = new ArrayList<srcQueryVO>();

		try {
			if (vo.getType().equals(new String("min"))) {
				lastddossrcList = statisticsService.searchMinDDosSrc(vo);
			} else if (vo.getType().equals(new String("hour"))) {
				lastddossrcList = statisticsService.searchHourDDosSrc(vo);
			}
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}
		resultMap.put("lastddossrcList", lastddossrcList);

		return resultMap;
	}
}

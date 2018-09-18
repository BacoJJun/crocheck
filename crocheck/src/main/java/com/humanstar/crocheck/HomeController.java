package com.humanstar.crocheck;

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
import com.humanstar.crocheck.model.dashboard.dto.alertLiveDomainVO;
import com.humanstar.crocheck.service.appliance.applianceService;
import com.humanstar.crocheck.service.dashboard.alertLiveServiceImpl;;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";
	
	@Inject
	alertLiveServiceImpl alertLiveService;
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		return "home";
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) throws Exception {
		return "index";
	}
	
	@RequestMapping(value = "/chart", method = RequestMethod.GET)
	public String chart(Locale locale, Model model) throws Exception {
		return "chart";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String dashboard(Locale locale, Model model) throws Exception {
		return "dashboard";
	}	
	@RequestMapping(value = "/dashboard2", method = RequestMethod.GET)
	public String dashboard2(Locale locale, Model model) throws Exception {
		return "dashboard_old";
	}	
	@RequestMapping(value = "/dashboard3", method = RequestMethod.GET)
	public String dashboard3(Locale locale, Model model) throws Exception {
		return "dashboard3";
	}	
	@RequestMapping(value = "/statistics", method = RequestMethod.GET)
	public String statistics(Locale locale, Model model) throws Exception {
		return "statistics";
	}
	@RequestMapping(value = "/compare", method = RequestMethod.GET)
	public String compare(Locale locale, Model model) throws Exception {
		return "compare";
	}
	@RequestMapping(value = "/dnsstatus", method = RequestMethod.GET)
	public String dnsstatus(Locale locale, Model model) throws Exception {
		return "dnsstatus";
	}
	
	@RequestMapping(value = "/dnspolicy", method = RequestMethod.GET)
	public String dnspolicy(Locale locale, Model model) throws Exception {
		return "dnspolicy";
	}
	
	@RequestMapping(value = "/dhcppolicy", method = RequestMethod.GET)
	public String dhcppolicy(Locale locale, Model model) throws Exception {
		return "dhcppolicy";
	}
	@RequestMapping(value = "/alertList", method = RequestMethod.GET)
	public String alertList(Locale locale, Model model) throws Exception {
		return "alertList";
	}
	@RequestMapping(value = "/engine", method = RequestMethod.GET)
	public String engine(Locale locale, Model model) throws Exception {
		return "engine";
	}
	
	@RequestMapping(value = "/organization", method = RequestMethod.GET)
	public String organization(Locale locale, Model model) throws Exception {
		return "organization";
	}
	
	@RequestMapping(value = "/status_report", method = RequestMethod.GET)
	public String status_report(Locale locale, Model model) throws Exception {
		return "status_report";
	}
	
	@RequestMapping(value = "/update_report", method = RequestMethod.GET)
	public String update_report(Locale locale, Model model) throws Exception {
		return "update_report";
	}
	
	@RequestMapping(value = "/alert_notice", method = RequestMethod.GET)
	public String alert_notice(Locale locale, Model model) throws Exception {
		return "alert_notice";
	}
	
	@RequestMapping(value = "/setting", method = RequestMethod.GET)
	public String setting(Locale locale, Model model) throws Exception {
		return "setting";
	}
	
	@RequestMapping(value = "/guide", method = RequestMethod.GET)
	public String guide(Locale locale, Model model) throws Exception {
		return "guide";
	}
}

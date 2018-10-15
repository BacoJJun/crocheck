package com.humanstar.crocheck;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView mainview(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("dashboard");
		mav.addObject("msg", "success");
		return mav;
	}	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView dashboard(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("dashboard");
		mav.addObject("msg", "success");
		return mav;
	}	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("home");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/chart", method = RequestMethod.GET)
	public ModelAndView chart(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("chart");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/dashboard2", method = RequestMethod.GET)
	public ModelAndView dashboard2(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("dashboard2");
		mav.addObject("msg", "success");
		return mav;
	}	
	@RequestMapping(value = "/dashboard3", method = RequestMethod.GET)
	public ModelAndView dashboard3(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("dashboard3");
		mav.addObject("msg", "success");
		return mav;
	}	
	@RequestMapping(value = "/statistics", method = RequestMethod.GET)
	public ModelAndView statistics(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("statistics");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/compare", method = RequestMethod.GET)
	public ModelAndView compare(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("compare");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/dnsstatus", method = RequestMethod.GET)
	public ModelAndView dnsstatus(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("dnsstatus");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/dnspolicy", method = RequestMethod.GET)
	public ModelAndView dnspolicy(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("dnspolicy");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/dhcppolicy", method = RequestMethod.GET)
	public ModelAndView dhcppolicy(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("dhcppolicy");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/alertList", method = RequestMethod.GET)
	public ModelAndView alertList(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("alertList");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/engine", method = RequestMethod.GET)
	public ModelAndView engine(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("engine");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/organization", method = RequestMethod.GET)
	public ModelAndView organization(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("organization");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/status_report", method = RequestMethod.GET)
	public ModelAndView status_report(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("status_report");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/update_report", method = RequestMethod.GET)
	public ModelAndView update_report(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("update_report");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/alert_notice", method = RequestMethod.GET)
	public ModelAndView alert_notice(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("alert_notice");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/setting", method = RequestMethod.GET)
	public ModelAndView setting(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("setting");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/guide", method = RequestMethod.GET)
	public ModelAndView guide(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("guide");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/ddosban", method = RequestMethod.GET)
	public ModelAndView ddosban(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("ddosban");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/temp", method = RequestMethod.GET)
	public ModelAndView temp(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("temp");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("login");
		mav.addObject("msg", "success");
		return mav;
	}
}

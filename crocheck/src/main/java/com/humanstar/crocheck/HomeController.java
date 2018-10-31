package com.humanstar.crocheck;

import java.io.File;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView mainview(HttpServletRequest request, Locale locale, Model model, HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();

		 session = request.getSession(true);
		
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("dashboard");
		mav.addObject("msg", "success");
		return mav;
	}	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView dashboard(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("dashboard");
		mav.addObject("msg", "success");
		return mav;
	}	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("home");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("index");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/chart", method = RequestMethod.GET)
	public ModelAndView chart(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("chart");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/dashboard2", method = RequestMethod.GET)
	public ModelAndView dashboard2(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("dashboard2");
		mav.addObject("msg", "success");
		return mav;
	}	
	@RequestMapping(value = "/dashboard3", method = RequestMethod.GET)
	public ModelAndView dashboard3(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("dashboard3");
		mav.addObject("msg", "success");
		return mav;
	}	
	@RequestMapping(value = "/statistics", method = RequestMethod.GET)
	public ModelAndView statistics(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("statistics");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/compare", method = RequestMethod.GET)
	public ModelAndView compare(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("compare");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/dnsstatus", method = RequestMethod.GET)
	public ModelAndView dnsstatus(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("dnsstatus");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/dnspolicy", method = RequestMethod.GET)
	public ModelAndView dnspolicy(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("dnspolicy");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/dhcppolicy", method = RequestMethod.GET)
	public ModelAndView dhcppolicy(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("dhcppolicy");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/alertList", method = RequestMethod.GET)
	public ModelAndView alertList(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("alertList");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/engine", method = RequestMethod.GET)
	public ModelAndView engine(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("engine");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/organization", method = RequestMethod.GET)
	public ModelAndView organization(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("organization");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/status_report", method = RequestMethod.GET)
	public ModelAndView status_report(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("status_report");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/update_report", method = RequestMethod.GET)
	public ModelAndView update_report(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("update_report");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/alert_notice", method = RequestMethod.GET)
	public ModelAndView alert_notice(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("alert_notice");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/setting", method = RequestMethod.GET)
	public ModelAndView setting(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("setting");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/guide", method = RequestMethod.GET)
	public ModelAndView guide(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("guide");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/ddosban", method = RequestMethod.GET)
	public ModelAndView ddosban(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session == null  ||session.getAttribute("userId") == null ||  !session.getAttribute("userId").equals("admin") ) {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		mav.setViewName("ddosban");
		mav.addObject("msg", "success");
		return mav;
	}
	@RequestMapping(value = "/temp", method = RequestMethod.GET)
	public ModelAndView temp(Locale locale, Model model, HttpServletRequest request) throws Exception {
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
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession session, Locale locale, Model model, HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		 session = request.getSession(true);
			
		if(session != null  |session.getAttribute("userId") == null ||  session.getAttribute("userId").equals("admin") ) {
			session.invalidate();
			mav.setViewName("login");
			mav.addObject("msg", "fail");
			return mav;
		}
		session.invalidate();
		mav.setViewName("login");
		mav.addObject("msg", "success");
		return mav;
	}

	  @RequestMapping(value = "/fileDown", method = {RequestMethod.GET, RequestMethod.POST})
	  public ModelAndView fileDown(@RequestParam("fileName") String fileName) {
		  ModelAndView mav = new ModelAndView();
		  
	    String fullPath = "/home/jun/git/crocheck/crocheck/src/main/webapp/WEB-INF/views/download/" + fileName ;
	    File downloadFile = new File(fullPath);
		  logger.info(fileName);
		  mav.setViewName("download");
		  mav.addObject("downloadFile", downloadFile);
	    return mav;
	  }
}

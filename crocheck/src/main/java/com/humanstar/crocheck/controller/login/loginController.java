package com.humanstar.crocheck.controller.login;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.humanstar.crocheck.model.user.dto.userVO;
import com.humanstar.crocheck.service.user.userServiceImpl;

@Controller
public class loginController {
	private static final Logger logger = LoggerFactory.getLogger(loginController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";
	
	@Inject
	userServiceImpl userService;
	
	@RequestMapping(value= "/logincheck")
	public ModelAndView logincheck(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("dashboard");
		mav.addObject("msg", "success");
		return mav;
	}
	
	@RequestMapping(value = "/loginuser", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> loginuser(@ModelAttribute  userVO vo) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		StringBuffer sb = new StringBuffer();
		userVO compareVO  = new userVO();
		String checkLogin = "false";
		
		try {
			try {
				compareVO = userService.selectMember(vo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			byte[] digest = MessageDigest.getInstance("MD5").digest(vo.getEncrypted_password().getBytes());
			 sb.setLength(0);
			  for( int i = 0; i < digest.length; i++ ) {
			   sb.append( Integer.toString( ( digest[i] & 0xf0) >> 4, 16 ) );
			   sb.append( Integer.toString( digest[i] & 0x0f, 16 ) );
			  }
			  vo.setEncrypted_password(sb.toString());
			  if(vo.getEncrypted_password().equals(compareVO.getEncrypted_password())) {
				  checkLogin = "true";
			  }
				resultMap.put(RESULT, RESULT_SUCCESS);
				resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (NoSuchAlgorithmException e1) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			e1.printStackTrace();
		}
		
		resultMap.put("base", checkLogin);
		resultMap.put("md5",vo.getEncrypted_password());
		return resultMap; 
	}
	
	@RequestMapping(value = "/updateuser", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateuser(@ModelAttribute  userVO vo) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		StringBuffer sb = new StringBuffer();
		
		try {
			byte[] digest = MessageDigest.getInstance("MD5").digest(vo.getEncrypted_password().getBytes());
			 sb.setLength(0);
			  for( int i = 0; i < digest.length; i++ ) {
			   sb.append( Integer.toString( ( digest[i] & 0xf0) >> 4, 16 ) );
			   sb.append( Integer.toString( digest[i] & 0x0f, 16 ) );
			  }
			  vo.setEncrypted_password(sb.toString());
			  try {
				userService.updateMember(vo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				resultMap.put(RESULT, RESULT_SUCCESS);
				resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			e1.printStackTrace();
		}

		return resultMap; 
	}
}

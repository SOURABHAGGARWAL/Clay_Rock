package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xebia.hrims.service.login.ILoginService;
import com.xebia.hrims.utils.Application;

@Controller
@RequestMapping("/")
public class HRIMSController {
	
	@Autowired
	private ILoginService loginService;
	
	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		if(Application.hasParam(request, "userID")){
			if(isValidUser(Application.getParam(request, "userID"), Application.getParam(request, "password"))){
				ModelAndView dashboard = new ModelAndView("user/dashboard");
				return dashboard;	
			} else{
				ModelAndView dashboard = new ModelAndView("login", "errormessage", "UserId Or Password Are Not Correct");
				return dashboard;
			}
		} else{
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping("logout")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView login = new ModelAndView("login");
		return login;
	}

	private boolean isValidUser(String userID, String password){
		return loginService.isValidUser(userID, password);
	}
	
}

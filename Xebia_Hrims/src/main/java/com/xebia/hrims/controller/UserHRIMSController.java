package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xebia.hrims.utils.Application;

@Controller
@RequestMapping("/user")
public class UserHRIMSController{

	@RequestMapping(value = "dashboard", method = RequestMethod.GET)
	public ModelAndView dashboard(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView dashboard = new ModelAndView("user/dashboard");
			return dashboard;
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
}

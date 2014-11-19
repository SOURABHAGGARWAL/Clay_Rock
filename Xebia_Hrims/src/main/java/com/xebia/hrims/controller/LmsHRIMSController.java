package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xebia.hrims.utils.Application;

@Controller
@RequestMapping("/lms")
public class LmsHRIMSController {

	@RequestMapping(value = "applyLeave")
	public ModelAndView applyLeave(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView applyLeave = new ModelAndView("leave/apply");
			return applyLeave;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "cancelLeave")
	public ModelAndView cancelLeave(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView cancelLeave = new ModelAndView("leave/cancel");
			return cancelLeave;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "myLeaveRequest")
	public ModelAndView myLeaveRequest(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView myLeaveRequest = new ModelAndView("leave/my_leave_request");
			return myLeaveRequest;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
}

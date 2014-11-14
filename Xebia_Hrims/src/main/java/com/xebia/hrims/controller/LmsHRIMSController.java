package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lms")
public class LmsHRIMSController {

	@RequestMapping(value = "applyLeave")
	public ModelAndView applyLeave(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("leave/apply");
		return dashboard;	
	}
	
	@RequestMapping(value = "cancelLeave")
	public ModelAndView cancelLeave(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("leave/cancel");
		return dashboard;	
	}
	
	@RequestMapping(value = "myLeaveRequest")
	public ModelAndView myLeaveRequest(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("leave/my_leave_request");
		return dashboard;	
	}
	
}

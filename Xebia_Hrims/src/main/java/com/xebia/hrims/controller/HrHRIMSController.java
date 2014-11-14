package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hr")
public class HrHRIMSController {

	@RequestMapping(value = "createNewEmployee")
	public ModelAndView createNewEmployee(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("hr/create_new_employee");
		return dashboard;	
	}
	
	@RequestMapping(value = "leaveRequests")
	public ModelAndView leaveRequests(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("hr/leave_requests");
		return dashboard;	
	}
	
	@RequestMapping(value = "uploadNewPolicies")
	public ModelAndView uploadNewPolicies(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("hr/upload_new_policies");
		return dashboard;	
	}
	
}

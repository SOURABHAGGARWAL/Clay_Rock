package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/projectManagement")
public class ProjectManagementHRIMSController {

	@RequestMapping(value = "createNewCustomer", method = RequestMethod.GET)
	public ModelAndView createNewCustomer(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("project_management/create_new_customer");
		return dashboard;	
	}
	
	@RequestMapping(value = "createNewProject", method = RequestMethod.GET)
	public ModelAndView createNewProject(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("project_management/create_new_project");
		return dashboard;	
	}
	
	@RequestMapping(value = "customerFeedback", method = RequestMethod.GET)
	public ModelAndView customerFeedback(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("project_management/customer_feedback");
		return dashboard;	
	}
	
	@RequestMapping(value = "resourceAllocation", method = RequestMethod.GET)
	public ModelAndView resourceAllocation(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("project_management/resource_allocation");
		return dashboard;	
	}
	
	@RequestMapping(value = "resourceOnBench", method = RequestMethod.GET)
	public ModelAndView resourceOnBench(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("project_management/resource_on_bench");
		return dashboard;	
	}
	
	@RequestMapping(value = "leaveRequests", method = RequestMethod.GET)
	public ModelAndView leaveRequests(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("project_management/leave_requests");
		return dashboard;	
	}
}

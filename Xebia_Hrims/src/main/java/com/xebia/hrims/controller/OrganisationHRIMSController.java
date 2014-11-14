package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/organisation")
public class OrganisationHRIMSController {

	@RequestMapping(value = "policies")
	public ModelAndView policies(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("organisation/policies");
		return dashboard;	
	}
	
}

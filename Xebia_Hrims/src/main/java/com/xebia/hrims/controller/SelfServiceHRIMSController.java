package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/selfService")
public class SelfServiceHRIMSController {

	@RequestMapping(value = "myOfferLetter")
	public ModelAndView myOfferLetter(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("self_service/my_offer_letter");
		return dashboard;	
	}
	
	@RequestMapping(value = "mySalarySlip")
	public ModelAndView mySalarySlip(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("self_service/my_salary_slip");
		return dashboard;	
	}
	
}

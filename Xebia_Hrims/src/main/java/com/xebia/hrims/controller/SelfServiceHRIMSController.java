package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xebia.hrims.utils.Application;

@Controller
@RequestMapping("/selfService")
public class SelfServiceHRIMSController {

	@RequestMapping(value = "myOfferLetter")
	public ModelAndView myOfferLetter(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView myOfferLetter = new ModelAndView("self_service/my_offer_letter");
			return myOfferLetter;	
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "mySalarySlip")
	public ModelAndView mySalarySlip(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView mySalarySlip = new ModelAndView("self_service/my_salary_slip");
			return mySalarySlip;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
}

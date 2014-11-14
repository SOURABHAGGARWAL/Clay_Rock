package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my-profile")
public class MyProfileHRIMSController {

	@RequestMapping(value = "details")
	public ModelAndView details(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("my_profile/details");
		return dashboard;	
	}
	
}

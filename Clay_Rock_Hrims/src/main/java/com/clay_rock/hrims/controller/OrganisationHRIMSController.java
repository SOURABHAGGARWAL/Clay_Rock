package com.clay_rock.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clay_rock.hrims.utils.Application;

@Controller
@RequestMapping("/organisation")
public class OrganisationHRIMSController {

	@RequestMapping(value = "policies")
	public ModelAndView policies(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView policies = new ModelAndView("organisation/policies");
			return policies;			
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
}

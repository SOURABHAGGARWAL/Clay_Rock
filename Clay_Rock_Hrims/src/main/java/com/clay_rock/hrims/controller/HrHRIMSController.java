package com.clay_rock.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.clay_rock.hrims.utils.Application;
import com.clay_rock.hrims.utils.ServiceResponse;

@Controller
@RequestMapping("/hr")
public class HrHRIMSController {

	@RequestMapping(value = "createNewEmployee")
	public ModelAndView createNewEmployee(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView createNewEmployee = new ModelAndView("hr/create_new_employee");
			return createNewEmployee;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "getAllEmployee")
	public @ResponseBody ServiceResponse getAllEmployee(HttpServletRequest request, HttpServletResponse response) {
/*		if(Application.isValidSession(request, response)){
			ModelAndView createNewEmployee = new ModelAndView("hr/create_new_employee");
			return createNewEmployee;		
		}else {*/
			ModelAndView login = new ModelAndView("login");
			return null;
		/*}*/
	}
	
	@RequestMapping(value = "leaveRequests")
	public ModelAndView leaveRequests(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView leaveRequests = new ModelAndView("hr/leave_requests");
			return leaveRequests;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "uploadNewPolicies")
	public ModelAndView uploadNewPolicies(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView uploadNewPolicies = new ModelAndView("hr/upload_new_policies");
			return uploadNewPolicies;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
}

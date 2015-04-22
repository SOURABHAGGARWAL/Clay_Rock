package com.clay_rock.hrims.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clay_rock.hrims.model.leave.Leave;
import com.clay_rock.hrims.model.leave.Type;
import com.clay_rock.hrims.model.login.Login;
import com.clay_rock.hrims.service.leave.ILeaveService;
import com.clay_rock.hrims.utils.Application;

@Controller
@RequestMapping("/projectManagement")
public class ProjectManagementHRIMSController {
	
	@Autowired
	private ILeaveService leaveService;

	@RequestMapping(value = "createNewCustomer", method = RequestMethod.GET)
	public ModelAndView createNewCustomer(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView createNewCustomer = new ModelAndView("project_management/create_new_customer");
			return createNewCustomer;	
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "createNewProject", method = RequestMethod.GET)
	public ModelAndView createNewProject(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView createNewProject = new ModelAndView("project_management/create_new_project");
			return createNewProject;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "customerFeedback", method = RequestMethod.GET)
	public ModelAndView customerFeedback(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView customerFeedback = new ModelAndView("project_management/customer_feedback");
			return customerFeedback;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "resourceAllocation", method = RequestMethod.GET)
	public ModelAndView resourceAllocation(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView resourceAllocation = new ModelAndView("project_management/resource_allocation");
			return resourceAllocation;			
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "resourceOnBench", method = RequestMethod.GET)
	public ModelAndView resourceOnBench(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView resourceOnBench = new ModelAndView("project_management/resource_on_bench");
			return resourceOnBench;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "leaveRequests", method = RequestMethod.GET)
	public ModelAndView leaveRequests(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			
			Login login = Application.getLoginFromSession(request, response);
			
			List<Type> typeOfLeaves = leaveService.getAllTypeOfLeaves();
			
			List<Leave> listOfleavesForApproval = leaveService.getEmployeeLeaveForApproval(login.getEmp_id());
			
			ModelAndView leaveRequests = new ModelAndView("project_management/leave_requests");
			leaveRequests.addObject("listOfleavesForApproval", listOfleavesForApproval);
			leaveRequests.addObject("typeOfLeaves", typeOfLeaves);
			return leaveRequests;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
}

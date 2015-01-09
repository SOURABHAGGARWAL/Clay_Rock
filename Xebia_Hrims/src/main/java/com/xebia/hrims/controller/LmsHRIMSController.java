package com.xebia.hrims.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xebia.hrims.model.leave.Leave;
import com.xebia.hrims.model.login.Login;
import com.xebia.hrims.utils.Application;

@Controller
@RequestMapping("/lms")
public class LmsHRIMSController {

	@RequestMapping(value = "applyLeave")
	public ModelAndView applyLeave(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			Login login = Application.getLoginFromSession(request, response);
				login.getEmp_id();
			ModelAndView applyLeave = new ModelAndView("leave/apply");
			return applyLeave;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "applyLeaveSubmit")
	public ModelAndView applyLeaveSubmit(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			
			Login login = Application.getLoginFromSession(request, response);
			
			Leave leave= new Leave();
			
			if(Application.getFormattedDateFromString(request.getParameter("startDate"))!=null){
				leave.setStartDate(Application.getFormattedDateFromString(request.getParameter("startDate")));
			}
			if(Application.getFormattedDateFromString(request.getParameter("endDate"))!=null){
				leave.setEndDate(Application.getFormattedDateFromString(request.getParameter("endDate")));
			}
			if(!StringUtils.isEmpty(request.getParameter("reasonOfLeaves"))){
				leave.setReasonOfLeaves(request.getParameter("reasonOfLeaves"));
			}
			if(Application.getIntegerFromString(request.getParameter("typeOfLeave"))!=null){
				leave.setTypeOfLeave(Application.getIntegerFromString(request.getParameter("typeOfLeave")));
			}
			if(Application.getIntegerFromString(request.getParameter("typeOfLeave"))!=null){
				leave.setTypeOfLeave(Application.getIntegerFromString(request.getParameter("typeOfLeave")));
			}
			if(!StringUtils.isEmpty(request.getParameter("handoverTo"))){
				leave.setHandoverTo(request.getParameter("handoverTo"));
			}
			leave.setStatusOfLeave(2);
			leave.setNotifyTo(login.getManager());
			leave.setEmp_id(login.getEmp_id());
			
			Map<String, String> validateLeave = validateLeave(leave);
			
			if(validateLeave.get("valid").equalsIgnoreCase("true")){
				ModelAndView applyLeave = new ModelAndView("leave/apply", "message", "Your leave is successfully applied!!!!");
				return applyLeave;	
			}else{
				ModelAndView applyLeave = new ModelAndView("leave/apply", "message", validateLeave.get("message"));
				return applyLeave;	
			}
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "cancelLeave")
	public ModelAndView cancelLeave(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView cancelLeave = new ModelAndView("leave/cancel");
			return cancelLeave;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "myLeaveRequest")
	public ModelAndView myLeaveRequest(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView myLeaveRequest = new ModelAndView("leave/my_leave_request");
			return myLeaveRequest;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	private Map<String,String> validateLeave(Leave leave){
		Map<String, String> result = new HashMap<String, String>();
		if(leave!=null){
			if(StringUtils.isEmpty(leave.getStartDate())){
				result.put("valid", "false");
				result.put("message", "Please Select Start date!!!!!");
				return result;
			}
			if(StringUtils.isEmpty(leave.getEndDate())){
				result.put("valid", "false");
				result.put("message", "Please Select End date!!!!!");
				return result;
			}
			if(leave.getEndDate().compareTo(leave.getStartDate()) == -1){
				result.put("valid", "false");
				result.put("message", "End Date Should be equal to or more than start date!!!!!");
				return result;
			}
			if(StringUtils.isEmpty(leave.getTypeOfLeave())){
				result.put("valid", "false");
				result.put("message", "Please enter valid type of leave!!!!!");
				return result;
			}
			result.put("valid", "true");
			result.put("message", "Valid leave!!!!!");
			return result;
		}else{
			result.put("valid", "false");
			result.put("message", "Null leave object!!!!!");
			return result;
		}
	}
	
}

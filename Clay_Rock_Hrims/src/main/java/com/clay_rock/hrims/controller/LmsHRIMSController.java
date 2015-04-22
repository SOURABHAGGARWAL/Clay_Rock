package com.clay_rock.hrims.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clay_rock.hrims.model.employee.ContactDetails;
import com.clay_rock.hrims.model.employee.EmployeeLeaveDetails;
import com.clay_rock.hrims.model.leave.Leave;
import com.clay_rock.hrims.model.leave.Type;
import com.clay_rock.hrims.model.leave.status;
import com.clay_rock.hrims.model.login.Login;
import com.clay_rock.hrims.service.employee.IEmployeeLeaveService;
import com.clay_rock.hrims.service.leave.ILeaveService;
import com.clay_rock.hrims.utils.Application;
import com.clay_rock.hrims.utils.mail.SendMail;

@Controller
@RequestMapping("/lms")
public class LmsHRIMSController {
	
	@Autowired
	private ILeaveService leaveService;
	
	@Autowired
	private IEmployeeLeaveService employeeLeaveService;

	@RequestMapping(value = "applyLeave")
	public ModelAndView applyLeave(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			
			Login login = Application.getLoginFromSession(request, response);
			
			List<Type> typeOfLeaves = leaveService.getAllTypeOfLeaves();
			
			List<status> leaveStatusList = leaveService.getLeaveStatusList();
			
			List<Leave> employeeLeaves = leaveService.getEmployeeLeave(login.getEmp_id());
			
			ModelAndView applyLeave = new ModelAndView("leave/apply", "typeOfLeaves", typeOfLeaves);
			applyLeave.addObject("employeeLeaves", employeeLeaves);
			applyLeave.addObject("leaveStatusList", leaveStatusList);
			
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
			
			Leave leave = new Leave();
			
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
			if(!StringUtils.isEmpty(request.getParameter("handoverTo"))){
				leave.setHandoverTo(request.getParameter("handoverTo"));
			}
			leave.setStatusOfLeave(2);
			leave.setNotifyTo(login.getManager());
			leave.setEmp_id(login.getEmp_id());
			
			Map<String, String> validateLeave = validateLeave(leave);
			
			List<Type> typeOfLeaves = leaveService.getAllTypeOfLeaves();
			
			List<Leave> employeeLeaves = leaveService.getEmployeeLeave(login.getEmp_id());
			
			if(validateLeave.get("valid").equalsIgnoreCase("true")){
					long days = Math.abs(leave.getEndDate().getTime() - leave.getStartDate().getTime());
					long diffDays = days / (24 * 60 * 60 * 1000);
					diffDays = diffDays+1;
					leave.setNumberOfLeaves(diffDays+"");
					if(leaveService.applyLeave(leave)){
						ModelAndView applyLeave = new ModelAndView("leave/apply", "message", "Your leave is successfully applied!!!!");
						applyLeave.addObject("typeOfLeaves", typeOfLeaves);
						applyLeave.addObject("employeeLeaves", employeeLeaves);
						try{
							List<ContactDetails> contactDetails = employeeLeaveService.getEmployeeContactDetails(login.getEmp_id());
							List<ContactDetails> contactDetailsManager = employeeLeaveService.getEmployeeContactDetails(login.getManager());
							if(contactDetails.size()>=1){
								SendMail.sendMail(contactDetails.get(0).getPersonalEmailId(), "New Leave Request is send", "New leave Request is there!!!");
							}
							if(contactDetailsManager.size()>=1){
								SendMail.sendMail(contactDetailsManager.get(0).getPersonalEmailId(), "New Leave Request is send from " +login.getEmp_id(), "New leave Request is there!!!");
							}
						}catch(Exception e){
							System.out.println("Error sending email!!!!");
						}
						SendMail.sendMail("1990sourabhaggarwal@gmail.com", "New Leave Request is send from " +login.getEmp_id(), "New leave Request is there!!!");
						return applyLeave;	
					} else{
						ModelAndView applyLeave = new ModelAndView("leave/apply", "message", "Error while applying leave contact admin!!!!");
						applyLeave.addObject("typeOfLeaves", typeOfLeaves);
						applyLeave.addObject("employeeLeaves", employeeLeaves);
						return applyLeave;							
					}
			}else{
				ModelAndView applyLeave = new ModelAndView("leave/apply", "message", validateLeave.get("message"));
				applyLeave.addObject("typeOfLeaves", typeOfLeaves);
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
			Login login = Application.getLoginFromSession(request, response);
			
			List<Type> typeOfLeaves = leaveService.getAllTypeOfLeaves();
			
			List<status> leaveStatusList = leaveService.getLeaveStatusList();
			
			List<Leave> employeeLeaves = leaveService.getEmployeeLeave(login.getEmp_id());
			
			ModelAndView cancelLeave = new ModelAndView("leave/cancel", "typeOfLeaves", typeOfLeaves);
			cancelLeave.addObject("employeeLeaves", employeeLeaves);
			cancelLeave.addObject("leaveStatusList", leaveStatusList);
			
			return cancelLeave;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "myLeaveRecord")
	public ModelAndView myLeaveRequest(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			
			Login login = Application.getLoginFromSession(request, response);
			
			List<Type> typeOfLeaves = leaveService.getAllTypeOfLeaves();
			
			List<Leave> leavePendingForApproval = leaveService.getLeavePendingForApproval(login.getEmp_id());
			
			List<EmployeeLeaveDetails> employeeLeavesDetail = employeeLeaveService.getEmployeeLeaveDetails(login.getEmp_id());
			
			ModelAndView myLeaveRecordResponse = new ModelAndView("leave/my_leave_record", "typeOfLeaves", typeOfLeaves);
				myLeaveRecordResponse.addObject("employeeLeavesDetail", employeeLeavesDetail);
				myLeaveRecordResponse.addObject("leavePendingForApproval", leavePendingForApproval);
				myLeaveRecordResponse.addObject("leavePendingForApprovalNumber", leavePendingForApproval.size());
			return myLeaveRecordResponse;		
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

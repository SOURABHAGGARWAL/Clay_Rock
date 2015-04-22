package com.clay_rock.hrims.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clay_rock.hrims.model.employee.PersonalDetails;
import com.clay_rock.hrims.model.login.Login;
import com.clay_rock.hrims.service.employee.IEmployeeLeaveService;
import com.clay_rock.hrims.service.leave.ILeaveService;
import com.clay_rock.hrims.utils.Application;

@Controller
@RequestMapping("/my-profile")
public class MyProfileHRIMSController {

	@Autowired
	private ILeaveService leaveService;
	
	@Autowired
	private IEmployeeLeaveService employeeLeaveService;
	
	@RequestMapping(value = "details")
	public ModelAndView details(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			Login login = Application.getLoginFromSession(request, response);
			List<PersonalDetails> personalDetails = employeeLeaveService.getEmployeePersonalDetails(login.getEmp_id());
			if(personalDetails.size() >=1){
				PersonalDetails personalDetail = personalDetails.get(0);
				ModelAndView details = new ModelAndView("my_profile/details", "personalDetail", personalDetail);
				return details;	
			}
			ModelAndView details = new ModelAndView("my_profile/personal_details");
			return details;			
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
}

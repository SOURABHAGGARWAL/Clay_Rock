package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xebia.hrims.utils.Application;

@Controller
@RequestMapping("/attendance")
public class AttendanceHRIMSController {

	@RequestMapping(value = "myAttendance")
	public ModelAndView myAttendance(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView myAttendance = new ModelAndView("attendance/my_attendance");
			return myAttendance;		
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "attendanceRegulaization")
	public ModelAndView attendanceRegulaization(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView attendanceRegulaization = new ModelAndView("attendance/attendance_regulaization");
			return attendanceRegulaization;	
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
}

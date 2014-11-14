package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/attendance")
public class AttendanceHRIMSController {

	@RequestMapping(value = "myAttendance")
	public ModelAndView myAttendance(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("attendance/my_attendance");
		return dashboard;	
	}
	
	@RequestMapping(value = "attendanceRegulaization")
	public ModelAndView attendanceRegulaization(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("attendance/attendance_regulaization");
		return dashboard;	
	}
	
}

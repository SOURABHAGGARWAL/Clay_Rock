package com.xebia.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminHRIMSController {

	@RequestMapping(value = "uploadAttendence")
	public ModelAndView uploadAttendence(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("admin/upload_attendence");
		return dashboard;	
	}
	
	@RequestMapping(value = "backupDatabase")
	public ModelAndView backupDatabase(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("admin/backup_database");
		return dashboard;	
	}
	
	@RequestMapping(value = "backupData")
	public ModelAndView backupData(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("admin/backup_data");
		return dashboard;	
	}
	
	@RequestMapping(value = "siteAtMaintenance")
	public ModelAndView siteAtMaintenance(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView dashboard = new ModelAndView("admin/site_at_maintenance");
		return dashboard;	
	}
	
}

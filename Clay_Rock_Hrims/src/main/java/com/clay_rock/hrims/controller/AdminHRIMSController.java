package com.clay_rock.hrims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clay_rock.hrims.utils.Application;

@Controller
@RequestMapping("/admin")
public class AdminHRIMSController {

	@RequestMapping(value = "uploadAttendence")
	public ModelAndView uploadAttendence(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView uploadAttendence = new ModelAndView("admin/upload_attendence");
			return uploadAttendence;	
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "backupDatabase")
	public ModelAndView backupDatabase(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView backupDatabase = new ModelAndView("admin/backup_database");
			return backupDatabase;
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "backupData")
	public ModelAndView backupData(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView backupData = new ModelAndView("admin/backup_data");
			return backupData;	
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
	@RequestMapping(value = "siteAtMaintenance")
	public ModelAndView siteAtMaintenance(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
			ModelAndView siteAtMaintenance = new ModelAndView("admin/site_at_maintenance");
			return siteAtMaintenance;	
		}else {
			ModelAndView login = new ModelAndView("login");
			return login;
		}
	}
	
}

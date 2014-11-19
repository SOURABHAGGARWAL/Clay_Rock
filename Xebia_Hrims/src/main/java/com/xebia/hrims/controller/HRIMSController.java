package com.xebia.hrims.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xebia.hrims.model.login.Login;
import com.xebia.hrims.service.login.ILoginService;
import com.xebia.hrims.utils.Application;

@Controller
@RequestMapping("/")
public class HRIMSController {
	
	@Autowired
	private ILoginService loginService;
	
	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		if(Application.hasParam(request, "userID")){
			Login login = isValidUser(Application.getParam(request, "userID"), Application.getParam(request, "password"));
			if(login != null){
				login.setPassword("");
				Application.setSession(request, response, login);
				ModelAndView dashboard = new ModelAndView("user/dashboard");
				return dashboard;	
			} else{
				ModelAndView loginView = new ModelAndView("login", "errormessage", "UserId Or Password Are Not Correct");
				return loginView;
			}
		} else{
			ModelAndView loginView = new ModelAndView("login");
			return loginView;
		}
	}
	
	@RequestMapping("logout")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		if(Application.isValidSession(request, response)){
	        Cookie[] cookies = request.getCookies();
	        if(cookies != null){
		        for(Cookie cookie : cookies){
		            if(cookie.getName().equals("JSESSIONID")){
		                break;
		            }
		        }
	        }
	        HttpSession session = request.getSession(false);
	        session.removeAttribute("login");
	        if(session != null){
	            session.invalidate();
	        }
			ModelAndView login = new ModelAndView("login", "errormessage", "Successfully Logout!!");
			return login;
		} else {
			ModelAndView login = new ModelAndView("login", "errormessage", "Session Expired.");
			return login;
		}
	}

	private Login isValidUser(String userID, String password){
		return loginService.isValidUser(userID, password);
	}
	
}

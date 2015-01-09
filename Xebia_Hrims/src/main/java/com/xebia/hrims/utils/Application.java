package com.xebia.hrims.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xebia.hrims.model.login.Login;

public class Application {
	
	
	public static final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	
	/**
	 * @param request
	 * @param paramName
	 * @return
	 */
	public static boolean hasParam(HttpServletRequest request, String paramName){
		Enumeration<String> requestParameters = request.getParameterNames();
		while(requestParameters.hasMoreElements()){
			String param = (String) requestParameters.nextElement();
			if(paramName.trim().equalsIgnoreCase(param.trim())){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @param request
	 * @param paramName
	 * @return
	 */
	public static String getParam(HttpServletRequest request, String paramName){
		if(hasParam(request, paramName)){
			String param = request.getParameter(paramName.trim());
			return param;
		} else{
			return "";
		}
	}
	
	/**
	 * @param request
	 * @return
	 */
	public static List<String> getParamNames(HttpServletRequest request){
		List<String> paramList = new ArrayList<String>();
		Enumeration<String> requestParameters = request.getParameterNames();
		while(requestParameters.hasMoreElements()){
			String param = (String) requestParameters.nextElement();
			paramList.add(param.trim());
		}
		return paramList;
	}
	
	public static boolean isValidSession(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession(true);
		if(session == null){
			return false;
		}else{
			if(session.getAttribute("login") == null){
				return false;
			}else {
				return true;
			}
		}
	}
	
	public static Login getLoginFromSession(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession(true);
		if(session == null){
			return new Login();
		}else{
			if(session.getAttribute("login") == null){
				return new Login();
			}else {
				Login login = (Login) session.getAttribute("login");
				return login;
			}
		}
	}
	
	public static void setSession(HttpServletRequest request, HttpServletResponse response, Login login){
	    HttpSession session = request.getSession();
	    session.setAttribute("login", login);
	    //setting session to expiry in 30 mins
	    session.setMaxInactiveInterval(30*60);
	    Cookie cookie = new Cookie("userID", login.getEmp_id());
	    cookie.setMaxAge(30*60);
	    response.addCookie(cookie);
	}
	
	
	public static Date getFormattedDateFromString(String dateInString){
		try {
			Date date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Integer getIntegerFromString(String intString){
		try {
			Integer integer = Integer.parseInt(intString);
			return integer;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

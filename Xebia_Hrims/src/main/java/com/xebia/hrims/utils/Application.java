package com.xebia.hrims.utils;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class Application {
	
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
	
}

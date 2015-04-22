package com.clay_rock.hrims.utils;

import java.io.Serializable;
import java.util.List;

public class ServiceResponse implements Serializable{
	
	private static final long serialVersionUID = 9122348036493422092L;
	
	private int responseCode;
	private String responseMessage;
	private List<Object> responseObject;
	
	
	@SuppressWarnings("unused")
	private ServiceResponse(){
	}
	
	public ServiceResponse(int responseCode, String responseMessage, List<Object> responseObject){
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.responseObject = responseObject;
	}
	
	public int getResponseCode() {
		return responseCode;
	}
	
	public String getResponseMessage() {
		return responseMessage;
	}

	public List<Object> getResponseObject() {
		return responseObject;
	}
	
}

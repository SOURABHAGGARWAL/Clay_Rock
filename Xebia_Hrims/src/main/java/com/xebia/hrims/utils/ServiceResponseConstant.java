package com.xebia.hrims.utils;

public enum ServiceResponseConstant {
	
	SUCCESS(0, "SUCCESS"),
	FAILURE(1, "FAILURE"),
	NO_RESULT_FOUND(2, "NO RESULT FOUND"),
	API_ERROR(3, "API ERROR"),
	API_EXCEPION(4, "API EXCEPION"),
	SUCCESS_LOGIN(5, "SUCCESSFULLY LOGIN"),
	SUCCESS_LOGOUT(6, "SUCCESSFULLY LOGOUT"),
	FAILURE_LOGIN(7, "FAIL TO LOGIN"),
	FAILURE_LOGOUT(8, "FAIL TO LOGOUT");
	
	private int code;
	private String message;
	
	ServiceResponseConstant(int code, String message){
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}

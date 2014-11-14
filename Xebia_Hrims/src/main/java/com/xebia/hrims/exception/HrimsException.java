package com.xebia.hrims.exception;

public class HrimsException extends Exception{

	private static final long serialVersionUID = 1L;

    public HrimsException() {
    	super();
    }
    
    public HrimsException(String message) {
    	super(message);
    }
    
    public HrimsException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public HrimsException(Throwable cause) {
        super(cause);
    }

}

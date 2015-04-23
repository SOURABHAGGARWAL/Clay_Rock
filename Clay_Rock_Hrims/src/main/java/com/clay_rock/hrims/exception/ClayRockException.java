package com.clay_rock.hrims.exception;

public class ClayRockException extends Exception{

	private static final long serialVersionUID = 5266396438768386793L;

	public ClayRockException() {
    	super();
    }
    
    public ClayRockException(String message) {
    	super(message);
    }
    
    public ClayRockException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ClayRockException(Throwable cause) {
        super(cause);
    }

}

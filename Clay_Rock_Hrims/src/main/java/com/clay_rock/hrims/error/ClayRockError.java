package com.clay_rock.hrims.error;

public class ClayRockError extends Error{

	private static final long serialVersionUID = 724229556309748508L;

	public ClayRockError() {
    	super();
    }
    
    public ClayRockError(String message) {
    	super(message);
    }
    
    public ClayRockError(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ClayRockError(Throwable cause) {
        super(cause);
    }

}

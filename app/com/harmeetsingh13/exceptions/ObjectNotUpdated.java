/**
 * 
 */
package com.harmeetsingh13.exceptions;

/**
 * @author Harmeet Singh(Taara)
 *
 */

@SuppressWarnings("serial")
public class ObjectNotUpdated extends Exception{

	private String errorCode = "Unknown_Exception";
	
	public ObjectNotUpdated(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
	
	@Override
	public String toString() {
		return errorCode + " - "+getMessage();
	}
}

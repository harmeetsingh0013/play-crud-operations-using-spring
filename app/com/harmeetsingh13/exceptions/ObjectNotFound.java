/**
 * 
 */
package com.harmeetsingh13.exceptions;


/**
 * @author Harmeet Singh(Taara)
 *
 */
public class ObjectNotFound extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errorCode = "Unknown_Error_Code";
	
	public ObjectNotFound(String message, String errorCode) {
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

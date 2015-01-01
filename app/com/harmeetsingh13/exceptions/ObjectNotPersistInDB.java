/**
 * 
 */
package com.harmeetsingh13.exceptions;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class ObjectNotPersistInDB extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorCode = "Unknown_Exception";
	
	public ObjectNotPersistInDB(String message, String errorCode) {
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

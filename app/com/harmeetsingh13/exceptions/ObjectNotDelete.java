/**
 * 
 */
package com.harmeetsingh13.exceptions;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@SuppressWarnings("serial")
public class ObjectNotDelete extends Exception{

	private String errorCode;

	public ObjectNotDelete(String message, String errorCode) {
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

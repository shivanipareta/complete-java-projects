package com.yash.paymentmodule.exception;

public class DuplicateIdException extends Exception {
	public DuplicateIdException() {
		super();
	}
	public DuplicateIdException(String errMsg) {
		super(errMsg);
	}
}

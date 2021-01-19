package com.yash.paymentmodule.exception;

public class NoRecordException extends Exception {
	public NoRecordException() {
		super();
	}
	public NoRecordException(String errMsg) {
		super(errMsg);
	}
}

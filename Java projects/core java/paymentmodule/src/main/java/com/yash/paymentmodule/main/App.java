package com.yash.paymentmodule.main;

import com.yash.paymentmodule.exception.DuplicateIdException;
import com.yash.paymentmodule.exception.NoRecordException;
import com.yash.paymentmodule.exception.PaymentException;
import com.yash.paymentmodule.util.MenuUtil;

public class App 
{
	public static void main( String[] args ) throws PaymentException, DuplicateIdException, NoRecordException
	{
		MenuUtil menu=new MenuUtil();
		menu.start();
	}
}

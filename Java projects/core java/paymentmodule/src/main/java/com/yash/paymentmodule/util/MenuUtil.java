package com.yash.paymentmodule.util;
import java.util.Scanner;

import com.yash.paymentmodule.exception.DuplicateIdException;
import com.yash.paymentmodule.exception.NoChoiceException;
import com.yash.paymentmodule.exception.NoRecordException;
import com.yash.paymentmodule.exception.PaymentException;
import com.yash.paymentmodule.helper.Helper;
/**
 * This is an utility class to provide options that user want to do
 * @author admin
 *
 */
public class MenuUtil {
	public void start() throws PaymentException, DuplicateIdException, NoRecordException {
		Scanner sc=new Scanner(System.in);
		int flag = 0;
		System.out.println("\n\n--------------WELCOME IN PAYMENT WINDOW---------------\n\n\n");
		do{
			System.out.println("\n\t\tWhat do you want to do?\n\t\tEnter number for that operation.\n"
					+ "\n\t\t1.Enter payment\n\t\t2.Update payment\n\t\t3.Delete payment\n\t\t4.Show all payments");
			System.out.print("\t\t");
			int choice=sc.nextInt();

			switch (choice) {
			case 1:
				Helper.case1();
				break;
			case 2:
				Helper.case2();
				break;

			case 3:
				Helper.case3();
				break;

			case 4:
				Helper.case4();
				break;

			default:
				throw new PaymentException("\n\t\tYou entered wrong choice");
			}
			System.out.println("\n\t\tDo you want to continue ?"
					+ "\n\t\tEnter 1 for yes\n\t\tEnter 0 for no");
			System.out.print("\t\t");
			flag=sc.nextInt();
			if(flag!=1 &&flag!=0)
				throw new PaymentException("\n\t\tYou entered wrong choice");
			else if(flag==0) {
				System.out.println("\t\tTHANK YOU!!! ");
			return;} 
		}while(flag==1);

	}


}

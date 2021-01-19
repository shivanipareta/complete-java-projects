package com.yash.paymentmodule.model;

import java.sql.Date;
import java.time.LocalDate;

import com.yash.paymentmodule.exception.PaymentException;
/**
 * This Payment class is used to create all fields and getter setter for the fields
 * @author admin
 *
 */
public class Payment {
	/**
	 * This field represent id of payment
	 */
	private Long id;
	/**
	 * This field represent amount of payment
	 */
	private Double payment;
	/**
	 * This field represent discount amount for payment
	 * never be negative
	 * In case if user enter negative payment, he should throw with PaymentException
	 */
	private Double discount;
	/**
	 * This field represent Date of payment
	 */
	private LocalDate created_At;
	/**
	 * This field represent Updated date of payment
	 */
	private LocalDate updated_At;
	/**
	 * This field represent id of user for which payment is happening 
	 */
	private Long userId;
	/**
	 * This field represent id of plan which user chose
	 */
	private Long planId;



	public Payment(long id, double payment, double discount, LocalDate created_At,
			LocalDate updated_At, long d,long e) throws PaymentException {
		super();
		this.payment = payment;
		if(payment<=0) {
			throw new PaymentException("Payment amount is invalid");
		}
		this.payment = payment;
		if(discount<0) {
			throw new PaymentException("Discount amount is invalid");
		}
		this.discount = discount;
		this.created_At = created_At;
		this.updated_At = updated_At;
		this.userId = d;
		/*	if(planId<0) {
			throw new PaymentException("Plan Id is invalid");
		}
		 */
		this.planId = e;
	}

	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public LocalDate getCreated_At() {
		return created_At;
	}
	public void setCreated_At() {
		this.created_At = LocalDate.now();
	}
	public LocalDate getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(LocalDate updated_At) {
		this.created_At = LocalDate.now();
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	@Override
	public String toString() {
		return "[payment=" + payment + ", discount=" + discount + ", created_At=" + created_At + ", updated_At="
				+ updated_At + ", userId=" + userId + ", planId=" + planId+"]";
	}
}

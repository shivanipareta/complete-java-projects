package com.yash.paymentmodule.service;

import java.util.List;

import com.yash.paymentmodule.model.Payment;
/**
 * This is a service class to provide CRUD operation
 * @author admin
 *
 */
public interface PaymentsService {
	public void addPayments(Payment payments);
	public List<Payment> listPayments();
	public Payment findPaymentsById(Long id);
	public void update(Payment payments);

}

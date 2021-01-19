package com.yash.paymentmodule.serviceimpl;

import java.util.List;

import com.yash.paymentmodule.dao.PaymentDAO;
import com.yash.paymentmodule.daoimpl.PaymentDAOImpl;
import com.yash.paymentmodule.model.Payment;
import com.yash.paymentmodule.service.PaymentsService;
/**
 * This is a Service Implementation class of payments
 * @author admin
 *
 */
public class PaymentsServiceImpl implements PaymentsService {
	//private PaymentDAO paymentDAO;

	public PaymentsServiceImpl() {
	//	paymentDAO=new PaymentDAOImpl();
	}
	@Override
	public void addPayments(Payment payments) {
		//paymentDAO.save(payments);

	}

	@Override
	public List<Payment> listPayments() {
		return null;
		//return paymentDAO.findAll();
	}

	@Override
	public Payment findPaymentsById(Long id) {
		return null;
	}

	@Override
	public void update(Payment payments) {
	//	paymentDAO.update(payments);
	}

}

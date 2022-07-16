package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Payment;
import com.maiora.lms.api.model.PaymentModel;

public interface PaymentDao {

	public List<Payment> readAllPayment(int from, int pagesize, String filtertext);

	public Payment addPayment(Payment paymentModel);

	public Payment updateTheExistingAssignment(Payment paymentModel);

	public List<Payment> getAllData();

	public PaymentModel addPaymentIntegration(PaymentModel paymentModel);

	public List<PaymentModel> getAllPaymentData();

	public PaymentModel getAllPaymentDataById(int paymentid);

}

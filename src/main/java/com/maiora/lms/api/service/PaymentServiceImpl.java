package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.PaymentDao;
import com.maiora.lms.api.model.Payment;
import com.maiora.lms.api.model.PaymentModel;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDao paymentdao;

	@Override
	public List<Payment> readAllPayment(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return paymentdao.readAllPayment(from,  pagesize,  filtertext);
	}

	@Override
	public Payment addPayment(Payment paymentModel) {
		// TODO Auto-generated method stub
		return paymentdao.addPayment(paymentModel);
	}

	@Override
	public Payment updateTheExistingAssignment(Payment paymentModel) {
		// TODO Auto-generated method stub
		return paymentdao.updateTheExistingAssignment(paymentModel);
	}

	@Override
	public List<Payment> getAllData() {
		// TODO Auto-generated method stub
		return paymentdao.getAllData();
	}

	@Override
	public PaymentModel addPaymentIntegration(PaymentModel paymentModel) {
		// TODO Auto-generated method stub
				return paymentdao.addPaymentIntegration(paymentModel);
	}

	@Override
	public List<PaymentModel> getAllPayData() {
		// TODO Auto-generated method stub
		return paymentdao.getAllPaymentData();
	}

	@Override
	public PaymentModel getAllPayDataById(int paymentid) {
		// TODO Auto-generated method stub
		return paymentdao.getAllPaymentDataById(paymentid);
	}
	
}

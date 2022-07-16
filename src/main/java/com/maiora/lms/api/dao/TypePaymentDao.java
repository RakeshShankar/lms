package com.maiora.lms.api.dao;

import com.maiora.lms.api.model.Payment;
import com.maiora.lms.api.model.TypesPayment;

public interface TypePaymentDao {
	
	public int updateThePaymentId(int paymentid, int typespaymentid);
	public int updateThePaymentIdParts(int paymentid, int partspaymentid);

}

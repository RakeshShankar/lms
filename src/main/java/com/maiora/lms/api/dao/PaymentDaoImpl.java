package com.maiora.lms.api.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.Assignments;
import com.maiora.lms.api.model.CourseSave;
import com.maiora.lms.api.model.Notification;
import com.maiora.lms.api.model.Payment;
import com.maiora.lms.api.model.PaymentModel;

@Component
@Repository
@Transactional
public class PaymentDaoImpl implements PaymentDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Payment> readAllPayment(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Payment> cq = criteriaBuilder.createQuery(Payment.class);
		Root<Payment> root=cq.from(Payment.class);
		   //Select all records
		   CriteriaQuery<Payment> select = cq.select(root);
		   TypedQuery<Payment> typedQuery = session.createQuery(select);
		   List<Payment> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Payment addPayment(Payment paymentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(paymentModel);
		return paymentModel;
	}
	/***
	Update Model
	 */
	private Payment findthedetails(Payment assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Payment _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Payment> cq = builder.createQuery(Payment.class);
		Root<Payment> root=cq.from(Payment.class);
		cq.where(builder.equal(root.get("payment_id"),assignmentModel.getPayment_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	
	@Override
	public Payment updateTheExistingAssignment(Payment paymentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Payment _addressModel = findthedetails(paymentModel);
		if(_addressModel!= null) {
	        	session.merge(paymentModel);	
	        }else {
	        	return null;
	        	
	        }
		return paymentModel;
	}

	@Override
	public List<Payment> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Payment> cq = criteriaBuilder.createQuery(Payment.class);
		Root<Payment> root=cq.from(Payment.class);
		   //Select all records
		   CriteriaQuery<Payment> select = cq.select(root);
		   TypedQuery<Payment> typedQuery = session.createQuery(select);
		   List<Payment> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public PaymentModel addPaymentIntegration(PaymentModel paymentModel) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(paymentModel);
		return paymentModel;
	}

	@Override
	public List<PaymentModel> getAllPaymentData() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<PaymentModel> cq = criteriaBuilder.createQuery(PaymentModel.class);
		Root<PaymentModel> root=cq.from(PaymentModel.class);
		   //Select all records
		   CriteriaQuery<PaymentModel> select = cq.select(root);
		   TypedQuery<PaymentModel> typedQuery = session.createQuery(select);
		   List<PaymentModel> Allpayment = typedQuery.getResultList();
		return Allpayment;
	}

	@Override
	public PaymentModel getAllPaymentDataById(int paymentid) {
		PaymentModel payments = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<PaymentModel> cq = builder.createQuery(PaymentModel.class);
		Root<PaymentModel> root=cq.from(PaymentModel.class);
		cq.where(builder.equal(root.get("paymentid"),paymentid));
		payments = entityManager.createQuery(cq).getSingleResult();
	return payments;
	}

}

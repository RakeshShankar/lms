package com.maiora.lms.api.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.TypesPayment;

@Repository
@Transactional
public class TypePaymentDaoImpl implements TypePaymentDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public int updateThePaymentId(int paymentid, int typespaymentid) {
		Session session = entityManager.unwrap(Session.class);
		//entityManager.getTransaction().begin();
		Query query=session.createQuery("update TypesPayment set paymentid=:id where typespaymentid=:tid");
		query.setParameter("id", paymentid);
		query.setParameter("tid", typespaymentid);
		int result=query.executeUpdate();
		//entityManager.getTransaction().commit();
		
		return result;
	}
	
	@Override
	public int updateThePaymentIdParts(int paymentid, int partspaymentid) {
		Session session = entityManager.unwrap(Session.class);
		//entityManager.getTransaction().begin();
		
		//entityManager.getTransaction().commit();
		Query query1=session.createQuery("update PartsPayment set paymentid=:id where partspaymentid=:tid");
		query1.setParameter("id", paymentid);
		query1.setParameter("tid", partspaymentid);
		int result=query1.executeUpdate();
		
		return result;
	}

}

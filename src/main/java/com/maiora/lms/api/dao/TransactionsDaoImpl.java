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

import com.maiora.lms.api.model.Test;
import com.maiora.lms.api.model.Transactions;

@Component
@Repository
@Transactional
public class TransactionsDaoImpl implements TransactionsDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Transactions> readAllTransactions(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Transactions> cq = criteriaBuilder.createQuery(Transactions.class);
		Root<Transactions> root=cq.from(Transactions.class);
		   //Select all records
		   CriteriaQuery<Transactions> select = cq.select(root);
		   TypedQuery<Transactions> typedQuery = session.createQuery(select);
		   List<Transactions> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Transactions updateTheExistingTransactions(Transactions transactionsModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(transactionsModel);
		return transactionsModel;
	}

	/***
	Update Model
	 */
	private Transactions findthedetails(Transactions assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Transactions _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Transactions> cq = builder.createQuery(Transactions.class);
		Root<Transactions> root=cq.from(Transactions.class);
		cq.where(builder.equal(root.get("transaction_id"),assignmentModel.getTransaction_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	
	@Override
	public Transactions addTransactions(Transactions transactionsModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Transactions _addressModel = findthedetails(transactionsModel);
		if(_addressModel!= null) {
	        	session.merge(transactionsModel);	
	        }else {
	        	return null;
	        	
	        }
		return transactionsModel;
	}

	@Override
	public List<Transactions> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Transactions> cq = criteriaBuilder.createQuery(Transactions.class);
		Root<Transactions> root=cq.from(Transactions.class);
		   //Select all records
		   CriteriaQuery<Transactions> select = cq.select(root);
		   TypedQuery<Transactions> typedQuery = session.createQuery(select);
		   List<Transactions> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

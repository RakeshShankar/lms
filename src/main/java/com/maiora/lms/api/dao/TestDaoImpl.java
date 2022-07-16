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
import com.maiora.lms.api.model.SubChapters;
import com.maiora.lms.api.model.Test;

@Component
@Repository
@Transactional
public class TestDaoImpl implements TestDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Test> readAllTest(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Test> cq = criteriaBuilder.createQuery(Test.class);
		Root<Test> root=cq.from(Test.class);
		   //Select all records
		   CriteriaQuery<Test> select = cq.select(root);
		   TypedQuery<Test> typedQuery = session.createQuery(select);
		   List<Test> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Test addTest(Test testModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(testModel);
		return testModel;
	}
	
	/***
	Update Model
	 */
	private Test findthedetails(Test assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Test _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Test> cq = builder.createQuery(Test.class);
		Root<Test> root=cq.from(Test.class);
		cq.where(builder.equal(root.get("test_id"),assignmentModel.getTest_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	

	@Override
	public Test updateTheExistingTest(Test testModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Test _addressModel = findthedetails(testModel);
		if(_addressModel!= null) {
	        	session.merge(testModel);	
	        }else {
	        	return null;
	        	
	        }
		return testModel;
	}

	@Override
	public List<Test> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Test> cq = criteriaBuilder.createQuery(Test.class);
		Root<Test> root=cq.from(Test.class);
		   //Select all records
		   CriteriaQuery<Test> select = cq.select(root);
		   TypedQuery<Test> typedQuery = session.createQuery(select);
		   List<Test> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

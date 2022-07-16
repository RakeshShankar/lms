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
import com.maiora.lms.api.model.UserTest;
import com.maiora.lms.api.model.Users;

@Component
@Repository
@Transactional
public class UserTestDaoImpl implements UserTestDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<UserTest> readAllUserTest(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<UserTest> cq = criteriaBuilder.createQuery(UserTest.class);
		Root<UserTest> root=cq.from(UserTest.class);
		   //Select all records
		   CriteriaQuery<UserTest> select = cq.select(root);
		   TypedQuery<UserTest> typedQuery = session.createQuery(select);
		   List<UserTest> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public UserTest addUserTest(UserTest userTestModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserTest updateTheExistingUserTest(UserTest userTestModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserTest> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<UserTest> cq = criteriaBuilder.createQuery(UserTest.class);
		Root<UserTest> root=cq.from(UserTest.class);
		   //Select all records
		   CriteriaQuery<UserTest> select = cq.select(root);
		   TypedQuery<UserTest> typedQuery = session.createQuery(select);
		   List<UserTest> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

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
import com.maiora.lms.api.model.UserCourseandStatus;
import com.maiora.lms.api.model.Users;

@Component
@Repository
@Transactional
public class UsersDaoImpl implements UsersDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Users> readAllUsers(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Users> cq = criteriaBuilder.createQuery(Users.class);
		Root<Users> root=cq.from(Users.class);
		   //Select all records
		   CriteriaQuery<Users> select = cq.select(root);
		   TypedQuery<Users> typedQuery = session.createQuery(select);
		   List<Users> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}


	@Override
	public Users addUsers(Users usersModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(usersModel);
		return usersModel;
	}

	/***
	Update Model
	 */
	private Users findthedetails(Users assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Users _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Users> cq = builder.createQuery(Users.class);
		Root<Users> root=cq.from(Users.class);
		cq.where(builder.equal(root.get("id"),assignmentModel.getId()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	@Override
	public Users updateTheExistingUsers(Users usersModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Users _addressModel = findthedetails(usersModel);
		if(_addressModel!= null) {
	        	session.merge(usersModel);	
	        }else {
	        	return null;
	        	
	        }
		return usersModel;
	}


	@Override
	public List<Users> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Users> cq = criteriaBuilder.createQuery(Users.class);
		Root<Users> root=cq.from(Users.class);
		   //Select all records
		   CriteriaQuery<Users> select = cq.select(root);
		   TypedQuery<Users> typedQuery = session.createQuery(select);
		   List<Users> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

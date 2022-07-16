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
import com.maiora.lms.api.model.universities;

@Component
@Repository
@Transactional
public class UserCourseandStatusDaoImpl implements UserCourseandStatusDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<UserCourseandStatus> readAllUserCourseStatus(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<UserCourseandStatus> cq = criteriaBuilder.createQuery(UserCourseandStatus.class);
		Root<UserCourseandStatus> root=cq.from(UserCourseandStatus.class);
		   //Select all records
		   CriteriaQuery<UserCourseandStatus> select = cq.select(root);
		   TypedQuery<UserCourseandStatus> typedQuery = session.createQuery(select);
		   List<UserCourseandStatus> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public UserCourseandStatus addUserCourseStatus(UserCourseandStatus userCouseStatusModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(userCouseStatusModel);
		return userCouseStatusModel;
	}
	
	/***
	Update Model
	 */
	private UserCourseandStatus findthedetails(UserCourseandStatus assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		UserCourseandStatus _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<UserCourseandStatus> cq = builder.createQuery(UserCourseandStatus.class);
		Root<UserCourseandStatus> root=cq.from(UserCourseandStatus.class);
		cq.where(builder.equal(root.get("user_course_status_id"),assignmentModel.getUser_course_status_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}

	@Override
	public UserCourseandStatus updateTheExistingUserCourseStatus(UserCourseandStatus userCouseStatusModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		UserCourseandStatus _addressModel = findthedetails(userCouseStatusModel);
		if(_addressModel!= null) {
	        	session.merge(userCouseStatusModel);	
	        }else {
	        	return null;
	        	
	        }
		return userCouseStatusModel;
	}

	@Override
	public List<UserCourseandStatus> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<UserCourseandStatus> cq = criteriaBuilder.createQuery(UserCourseandStatus.class);
		Root<UserCourseandStatus> root=cq.from(UserCourseandStatus.class);
		   //Select all records
		   CriteriaQuery<UserCourseandStatus> select = cq.select(root);
		   TypedQuery<UserCourseandStatus> typedQuery = session.createQuery(select);
		   List<UserCourseandStatus> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

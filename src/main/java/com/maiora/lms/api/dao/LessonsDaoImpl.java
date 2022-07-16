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
import com.maiora.lms.api.model.EnquiryDetails;
import com.maiora.lms.api.model.Lessons;

@Component
@Repository
@Transactional
public class LessonsDaoImpl implements LessonsDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Lessons> readAllLessons(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Lessons> cq = criteriaBuilder.createQuery(Lessons.class);
		Root<Lessons> root=cq.from(Lessons.class);
		   //Select all records
		   CriteriaQuery<Lessons> select = cq.select(root);
		   TypedQuery<Lessons> typedQuery = session.createQuery(select);
		   List<Lessons> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Lessons addLessons(Lessons lessonsModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(lessonsModel);
		return lessonsModel;
	}

	/***
	Update Model
	 */
	private Lessons findthedetails(Lessons assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Lessons _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Lessons> cq = builder.createQuery(Lessons.class);
		Root<Lessons> root=cq.from(Lessons.class);
		cq.where(builder.equal(root.get("lession_id"),assignmentModel.getLession_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	
	@Override
	public Lessons updateTheExistingLessons(Lessons lessonsModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Lessons _addressModel = findthedetails(lessonsModel);
		if(_addressModel!= null) {
	        	session.merge(lessonsModel);	
	        }else {
	        	return null;
	        	
	        }
		return lessonsModel;
	}

	@Override
	public List<Lessons> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Lessons> cq = criteriaBuilder.createQuery(Lessons.class);
		Root<Lessons> root=cq.from(Lessons.class);
		   //Select all records
		   CriteriaQuery<Lessons> select = cq.select(root);
		   TypedQuery<Lessons> typedQuery = session.createQuery(select);
		   List<Lessons> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

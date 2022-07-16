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

@Component
@Repository
@Transactional
public class AssignmentsDaoImpl implements AssignmentsDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Assignments> readAllAssignments(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Assignments> cq = criteriaBuilder.createQuery(Assignments.class);
		Root<Assignments> root=cq.from(Assignments.class);
		   //Select all records
		   CriteriaQuery<Assignments> select = cq.select(root);
		   TypedQuery<Assignments> typedQuery = session.createQuery(select);
		   List<Assignments> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Assignments addAssignments(Assignments assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(assignmentModel);
		return assignmentModel;
	}

	/***
	Update Model
	 */
	private Assignments findthedetails(Assignments assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Assignments _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Assignments> cq = builder.createQuery(Assignments.class);
		Root<Assignments> root=cq.from(Assignments.class);
		cq.where(builder.equal(root.get("assignment_id"),assignmentModel.getAssignment_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	@Override
	public Assignments updateTheExistingAssignment(Assignments assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Assignments _addressModel = findthedetails(assignmentModel);
		if(_addressModel!= null) {
	        	session.merge(assignmentModel);	
	        }else {
	        	return null;
	        	
	        }
		return assignmentModel;
	}

	@Override
	public List<Assignments> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Assignments> cq = criteriaBuilder.createQuery(Assignments.class);
		Root<Assignments> root=cq.from(Assignments.class);
		   //Select all records
		   CriteriaQuery<Assignments> select = cq.select(root);
		   TypedQuery<Assignments> typedQuery = session.createQuery(select);
		   List<Assignments> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

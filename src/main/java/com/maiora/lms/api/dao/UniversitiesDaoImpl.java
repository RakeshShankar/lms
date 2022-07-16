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
import com.maiora.lms.api.model.Transactions;
import com.maiora.lms.api.model.universities;

@Component
@Repository
@Transactional
public class UniversitiesDaoImpl implements UniversitiesDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<universities> readAlluniversitiesService(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<universities> cq = criteriaBuilder.createQuery(universities.class);
		Root<universities> root=cq.from(universities.class);
		   //Select all records
		   CriteriaQuery<universities> select = cq.select(root);
		   TypedQuery<universities> typedQuery = session.createQuery(select);
		   List<universities> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}
	@Override
	public universities addUniversity(universities universityModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(universityModel);
		return universityModel;
	}

	/***
	Update Model
	 */
	private universities findthedetails(universities assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		universities _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<universities> cq = builder.createQuery(universities.class);
		Root<universities> root=cq.from(universities.class);
		cq.where(builder.equal(root.get("university_id"),assignmentModel.getUniversity_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	
	@Override
	public universities updateTheExistingUniversity(universities universityModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		universities _addressModel = findthedetails(universityModel);
		if(_addressModel!= null) {
	        	session.merge(universityModel);	
	        }else {
	        	return null;
	        	
	        }
		return universityModel;
	}
	@Override
	public List<universities> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<universities> cq = criteriaBuilder.createQuery(universities.class);
		Root<universities> root=cq.from(universities.class);
		   //Select all records
		   CriteriaQuery<universities> select = cq.select(root);
		   TypedQuery<universities> typedQuery = session.createQuery(select);
		   List<universities> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

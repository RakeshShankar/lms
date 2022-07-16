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
import com.maiora.lms.api.model.courses;

@Component
@Repository
@Transactional
public class EnquiryDetailsDaoImpl implements EnquiryDetailsDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<EnquiryDetails> readAllEnquiryDetails(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<EnquiryDetails> cq = criteriaBuilder.createQuery(EnquiryDetails.class);
		Root<EnquiryDetails> root=cq.from(EnquiryDetails.class);
		   //Select all records
		   CriteriaQuery<EnquiryDetails> select = cq.select(root);
		   TypedQuery<EnquiryDetails> typedQuery = session.createQuery(select);
		   List<EnquiryDetails> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public EnquiryDetails addEnquiryDetails(EnquiryDetails enquiryDetailModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(enquiryDetailModel);
		return enquiryDetailModel;
	}

	/***
	Update Model
	 */
	private EnquiryDetails findthedetails(EnquiryDetails assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		EnquiryDetails _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<EnquiryDetails> cq = builder.createQuery(EnquiryDetails.class);
		Root<EnquiryDetails> root=cq.from(EnquiryDetails.class);
		cq.where(builder.equal(root.get("enquiry_details_id"),assignmentModel.getEnquiry_details_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	@Override
	public EnquiryDetails updateTheExistingEnquiryDetails(EnquiryDetails enquiryDetailModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		EnquiryDetails _addressModel = findthedetails(enquiryDetailModel);
		if(_addressModel!= null) {
	        	session.merge(enquiryDetailModel);	
	        }else {
	        	return null;
	        	
	        }
		return enquiryDetailModel;
	}

	@Override
	public List<EnquiryDetails> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<EnquiryDetails> cq = criteriaBuilder.createQuery(EnquiryDetails.class);
		Root<EnquiryDetails> root=cq.from(EnquiryDetails.class);
		   //Select all records
		   CriteriaQuery<EnquiryDetails> select = cq.select(root);
		   TypedQuery<EnquiryDetails> typedQuery = session.createQuery(select);
		   List<EnquiryDetails> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

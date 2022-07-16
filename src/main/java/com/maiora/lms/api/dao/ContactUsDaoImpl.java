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
import com.maiora.lms.api.model.Chapters;
import com.maiora.lms.api.model.ContactUs;

@Component
@Repository
@Transactional
public class ContactUsDaoImpl implements ContactUsDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<ContactUs> readAllContactUs(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ContactUs> cq = criteriaBuilder.createQuery(ContactUs.class);
		Root<ContactUs> root=cq.from(ContactUs.class);
		   //Select all records
		   CriteriaQuery<ContactUs> select = cq.select(root);
		   TypedQuery<ContactUs> typedQuery = session.createQuery(select);
		   List<ContactUs> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public ContactUs addContactUs(ContactUs contactUsModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(contactUsModel);
		return contactUsModel;
	}

	/***
	Update Model
	 */
	private ContactUs findthedetails(ContactUs assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		ContactUs _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<ContactUs> cq = builder.createQuery(ContactUs.class);
		Root<ContactUs> root=cq.from(ContactUs.class);
		cq.where(builder.equal(root.get("contact_us_id"),assignmentModel.getContact_us_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	@Override
	public ContactUs updateTheExistingContactUs(ContactUs contactUsModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		ContactUs _addressModel = findthedetails(contactUsModel);
		if(_addressModel!= null) {
	        	session.merge(contactUsModel);	
	        }else {
	        	return null;
	        	
	        }
		return contactUsModel;
	}

	@Override
	public List<ContactUs> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ContactUs> cq = criteriaBuilder.createQuery(ContactUs.class);
		Root<ContactUs> root=cq.from(ContactUs.class);
		   //Select all records
		   CriteriaQuery<ContactUs> select = cq.select(root);
		   TypedQuery<ContactUs> typedQuery = session.createQuery(select);
		   List<ContactUs> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

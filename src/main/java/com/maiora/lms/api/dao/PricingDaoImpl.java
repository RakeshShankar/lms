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
import com.maiora.lms.api.model.Payment;
import com.maiora.lms.api.model.Pricing;

@Component
@Repository
@Transactional
public class PricingDaoImpl implements PricingDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Pricing> readAllPricing(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Pricing> cq = criteriaBuilder.createQuery(Pricing.class);
		Root<Pricing> root=cq.from(Pricing.class);
		   //Select all records
		   CriteriaQuery<Pricing> select = cq.select(root);
		   TypedQuery<Pricing> typedQuery = session.createQuery(select);
		   List<Pricing> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Pricing addPricing(Pricing pricingModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(pricingModel);
		return pricingModel;
	}
	
	/***
	Update Model
	 */
	private Pricing findthedetails(Pricing assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Pricing _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Pricing> cq = builder.createQuery(Pricing.class);
		Root<Pricing> root=cq.from(Pricing.class);
		cq.where(builder.equal(root.get("pricings_id"),assignmentModel.getPricings_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}

	@Override
	public Pricing updateTheExistingPricing(Pricing pricingModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Pricing _addressModel = findthedetails(pricingModel);
		if(_addressModel!= null) {
	        	session.merge(pricingModel);	
	        }else {
	        	return null;
	        	
	        }
		return pricingModel;
	}

	@Override
	public List<Pricing> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Pricing> cq = criteriaBuilder.createQuery(Pricing.class);
		Root<Pricing> root=cq.from(Pricing.class);
		   //Select all records
		   CriteriaQuery<Pricing> select = cq.select(root);
		   TypedQuery<Pricing> typedQuery = session.createQuery(select);
		   List<Pricing> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

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
import com.maiora.lms.api.model.ContactUs;
import com.maiora.lms.api.model.Country;

@Component
@Repository
@Transactional
public class CountryDaoImpl implements CountryDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Country> readAllCountry(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Country> cq = criteriaBuilder.createQuery(Country.class);
		Root<Country> root=cq.from(Country.class);
		   //Select all records
		   CriteriaQuery<Country> select = cq.select(root);
		   TypedQuery<Country> typedQuery = session.createQuery(select);
		   List<Country> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Country addCountry(Country countryModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(countryModel);
		return countryModel;
	}
	
	/***
	Update Model
	 */
	private Country findthedetails(Country assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Country _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Country> cq = builder.createQuery(Country.class);
		Root<Country> root=cq.from(Country.class);
		cq.where(builder.equal(root.get("country_id"),assignmentModel.getCountry_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}

	@Override
	public Country updateTheExistingCountry(Country countryModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Country _addressModel = findthedetails(countryModel);
		if(_addressModel!= null) {
	        	session.merge(countryModel);	
	        }else {
	        	return null;
	        	
	        }
		return countryModel;
	}

	@Override
	public List<Country> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Country> cq = criteriaBuilder.createQuery(Country.class);
		Root<Country> root=cq.from(Country.class);
		   //Select all records
		   CriteriaQuery<Country> select = cq.select(root);
		   TypedQuery<Country> typedQuery = session.createQuery(select);
		   List<Country> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

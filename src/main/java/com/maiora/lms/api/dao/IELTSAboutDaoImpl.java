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

import com.maiora.lms.api.model.ContactUs;
import com.maiora.lms.api.model.IELTSAbout;
import com.maiora.lms.api.model.IELTSTest;

@Component
@Repository
@Transactional
public class IELTSAboutDaoImpl implements IELTSAboutDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public IELTSAbout addAboutInfo(IELTSAbout ieltsAbout) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		System.out.println("Inside DB");
		session.persist(ieltsAbout);
		System.out.println("Saving to DB");
		return ieltsAbout;
	}
	
	
	@Override
	public List<IELTSAbout> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<IELTSAbout> cq = criteriaBuilder.createQuery(IELTSAbout.class);
		Root<IELTSAbout> root=cq.from(IELTSAbout.class);
		   //Select all records
		   CriteriaQuery<IELTSAbout> select = cq.select(root);
		   TypedQuery<IELTSAbout> typedQuery = session.createQuery(select);
		   List<IELTSAbout> AllAbout = typedQuery.getResultList();
		return AllAbout;
	}


	@Override
	public IELTSTest CreatEtest(IELTSTest iELTSAbout) {
		Session session = entityManager.unwrap(Session.class);
		System.out.println("Inside DB");
		session.persist(iELTSAbout);
		System.out.println("Saving to DB");
		return iELTSAbout;
	}


}

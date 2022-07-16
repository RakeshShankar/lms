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

@Component
@Repository
@Transactional
public class ChaptersDaoImpl implements ChaptersDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Chapters> readAllChapters(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Chapters> cq = criteriaBuilder.createQuery(Chapters.class);
		Root<Chapters> root=cq.from(Chapters.class);
		   //Select all records
		   CriteriaQuery<Chapters> select = cq.select(root);
		   TypedQuery<Chapters> typedQuery = session.createQuery(select);
		   List<Chapters> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Chapters addChapters(Chapters chaptersModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(chaptersModel);
		return chaptersModel;
	}


	/***
	Update Model
	 */
	private Chapters findthedetails(Chapters assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Chapters _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Chapters> cq = builder.createQuery(Chapters.class);
		Root<Chapters> root=cq.from(Chapters.class);
		cq.where(builder.equal(root.get("chapter_id"),assignmentModel.getChapter_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	
	@Override
	public Chapters updateTheExistingChapters(Chapters chaptersModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Chapters _addressModel = findthedetails(chaptersModel);
		if(_addressModel!= null) {
	        	session.merge(chaptersModel);	
	        }else {
	        	return null;
	        	
	        }
		return chaptersModel;
	}

	@Override
	public List<Chapters> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Chapters> cq = criteriaBuilder.createQuery(Chapters.class);
		Root<Chapters> root=cq.from(Chapters.class);
		   //Select all records
		   CriteriaQuery<Chapters> select = cq.select(root);
		   TypedQuery<Chapters> typedQuery = session.createQuery(select);
		   List<Chapters> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

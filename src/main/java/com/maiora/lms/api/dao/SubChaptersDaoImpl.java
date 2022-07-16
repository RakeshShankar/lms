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
import com.maiora.lms.api.model.SubChapters;

@Component
@Repository
@Transactional
public class SubChaptersDaoImpl implements SubChaptersDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<SubChapters> readAllSubChapters(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<SubChapters> cq = criteriaBuilder.createQuery(SubChapters.class);
		Root<SubChapters> root=cq.from(SubChapters.class);
		   //Select all records
		   CriteriaQuery<SubChapters> select = cq.select(root);
		   TypedQuery<SubChapters> typedQuery = session.createQuery(select);
		   List<SubChapters> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public SubChapters addSubChapters(SubChapters subChapterModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(subChapterModel);
		return subChapterModel;
	}

	/***
	Update Model
	 */
	private SubChapters findthedetails(SubChapters assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		SubChapters _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<SubChapters> cq = builder.createQuery(SubChapters.class);
		Root<SubChapters> root=cq.from(SubChapters.class);
		cq.where(builder.equal(root.get("sub_chapter_id"),assignmentModel.getSub_chapter_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	
	@Override
	public SubChapters updateTheExistingSubChapters(SubChapters subChapterModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		SubChapters _addressModel = findthedetails(subChapterModel);
		if(_addressModel!= null) {
	        	session.merge(subChapterModel);	
	        }else {
	        	return null;
	        	
	        }
		return subChapterModel;
	}

	@Override
	public List<SubChapters> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<SubChapters> cq = criteriaBuilder.createQuery(SubChapters.class);
		Root<SubChapters> root=cq.from(SubChapters.class);
		   //Select all records
		   CriteriaQuery<SubChapters> select = cq.select(root);
		   TypedQuery<SubChapters> typedQuery = session.createQuery(select);
		   List<SubChapters> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}
	

}

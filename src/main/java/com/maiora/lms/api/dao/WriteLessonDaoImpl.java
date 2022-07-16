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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.maiora.lms.api.model.ExcercisesWrite;
import com.maiora.lms.api.model.WriteLessonOne;
@Component
@Repository
@Transactional
public class WriteLessonDaoImpl implements WriteLessonDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public WriteLessonOne addUserTest(WriteLessonOne writeLessonOne) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(writeLessonOne);
		return writeLessonOne;
	}

	@Override
	public List<WriteLessonOne> getAllLessonOne() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<WriteLessonOne> cq = criteriaBuilder.createQuery(WriteLessonOne.class);
		Root<WriteLessonOne> root=cq.from(WriteLessonOne.class);
		   //Select all records
		   CriteriaQuery<WriteLessonOne> select = cq.select(root);
		   TypedQuery<WriteLessonOne> typedQuery = session.createQuery(select);
		   List<WriteLessonOne> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public WriteLessonOne getAllLessonOneById(int index) {
		WriteLessonOne lessons = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<WriteLessonOne> cq = builder.createQuery(WriteLessonOne.class);
		Root<WriteLessonOne> root=cq.from(WriteLessonOne.class);
		cq.where(builder.equal(root.get("index"),index));
		lessons = entityManager.createQuery(cq).getSingleResult();
	return lessons;
	}


}

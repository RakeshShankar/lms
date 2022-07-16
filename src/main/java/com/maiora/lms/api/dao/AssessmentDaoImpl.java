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

import com.maiora.lms.api.model.AllLessonsTest;
import com.maiora.lms.api.model.Assessment;

@Component
@Repository
@Transactional
public class AssessmentDaoImpl implements AssessmentDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public AllLessonsTest saveAssesment(AllLessonsTest allLessonsTest) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(allLessonsTest);
		return allLessonsTest;
	}

	@Override
	public Assessment saveAssesmentTwo(Assessment assessment) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(assessment);
		return assessment;
	}

	@Override
	public List<AllLessonsTest> getAssessments() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<AllLessonsTest> cq = criteriaBuilder.createQuery(AllLessonsTest.class);
		Root<AllLessonsTest> root = cq.from(AllLessonsTest.class);
		// Select all records
		CriteriaQuery<AllLessonsTest> select = cq.select(root);
		TypedQuery<AllLessonsTest> typedQuery = session.createQuery(select);
		List<AllLessonsTest> res = typedQuery.getResultList();
		return res;
	}

	@Override
	public List<Assessment> getAssessmentsTwo() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Assessment> cq = criteriaBuilder.createQuery(Assessment.class);
		Root<Assessment> root = cq.from(Assessment.class);
		// Select all records
		CriteriaQuery<Assessment> select = cq.select(root);
		TypedQuery<Assessment> typedQuery = session.createQuery(select);
		List<Assessment> res = typedQuery.getResultList();
		return res;
	}

}

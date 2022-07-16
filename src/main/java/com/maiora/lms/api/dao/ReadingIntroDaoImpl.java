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

import com.maiora.lms.api.model.ReadExecOne;
import com.maiora.lms.api.model.ReadExecThree;
import com.maiora.lms.api.model.ReadExecTwo;
import com.maiora.lms.api.model.ReadIntroModel;
import com.maiora.lms.api.model.ReadLesson;
import com.maiora.lms.api.model.ReadTest;

@Component
@Repository
@Transactional
public class ReadingIntroDaoImpl implements ReadingIntroDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public ReadIntroModel saveReadIntro(ReadIntroModel readIntroModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(readIntroModel);
		return readIntroModel;
	}

	@Override
	public List<ReadIntroModel> getReadIntro() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ReadIntroModel> cq = criteriaBuilder.createQuery(ReadIntroModel.class);
		Root<ReadIntroModel> root = cq.from(ReadIntroModel.class);
		// Select all records
		CriteriaQuery<ReadIntroModel> select = cq.select(root);
		TypedQuery<ReadIntroModel> typedQuery = session.createQuery(select);
		List<ReadIntroModel> alldata = typedQuery.getResultList();
		return alldata;
	}

	@Override
	public ReadLesson saveReadLesson(ReadLesson readLesson) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(readLesson);
		return readLesson;
	}

	@Override
	public ReadExecOne saveReadExer(ReadExecOne readExecOne) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(readExecOne);
		return readExecOne;
	}

	@Override
	public List<ReadExecOne> getReadExer() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ReadExecOne> cq = criteriaBuilder.createQuery(ReadExecOne.class);
		Root<ReadExecOne> root = cq.from(ReadExecOne.class);
		// Select all records
		CriteriaQuery<ReadExecOne> select = cq.select(root);
		TypedQuery<ReadExecOne> typedQuery = session.createQuery(select);
		List<ReadExecOne> alldata = typedQuery.getResultList();
		return alldata;
	}

	@Override
	public ReadExecTwo saveReadExer(ReadExecTwo readExectwo) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(readExectwo);
		return readExectwo;
	}

	@Override
	public List<ReadExecTwo> getReadExerTwo() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ReadExecTwo> cq = criteriaBuilder.createQuery(ReadExecTwo.class);
		Root<ReadExecTwo> root = cq.from(ReadExecTwo.class);
		// Select all records
		CriteriaQuery<ReadExecTwo> select = cq.select(root);
		TypedQuery<ReadExecTwo> typedQuery = session.createQuery(select);
		List<ReadExecTwo> alldata = typedQuery.getResultList();
		return alldata;
	}

	@Override
	public ReadExecThree saveReadExerThree(ReadExecThree readExecThree) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(readExecThree);
		return readExecThree;
	}

	@Override
	public List<ReadExecThree> getReadExerThree() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ReadExecThree> cq = criteriaBuilder.createQuery(ReadExecThree.class);
		Root<ReadExecThree> root = cq.from(ReadExecThree.class);
		// Select all records
		CriteriaQuery<ReadExecThree> select = cq.select(root);
		TypedQuery<ReadExecThree> typedQuery = session.createQuery(select);
		List<ReadExecThree> alldata = typedQuery.getResultList();
		return alldata;
	}

	@Override
	public List<ReadLesson> getReadLessonData() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ReadLesson> cq = criteriaBuilder.createQuery(ReadLesson.class);
		Root<ReadLesson> root = cq.from(ReadLesson.class);
		// Select all records
		CriteriaQuery<ReadLesson> select = cq.select(root);
		TypedQuery<ReadLesson> typedQuery = session.createQuery(select);
		List<ReadLesson> alldata = typedQuery.getResultList();
		return alldata;
	}

	@Override
	public ReadIntroModel getReadLessonDataById(int readintromodelid) {
		ReadIntroModel intro = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ReadIntroModel> cq = builder.createQuery(ReadIntroModel.class);
		Root<ReadIntroModel> root = cq.from(ReadIntroModel.class);
		cq.where(builder.equal(root.get("readintromodelid"), readintromodelid));
		intro = entityManager.createQuery(cq).getSingleResult();
		return intro;
	}

	@Override
	public ReadLesson getAllLessonDataById(int index) {
		ReadLesson intro = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ReadLesson> cq = builder.createQuery(ReadLesson.class);
		Root<ReadLesson> root = cq.from(ReadLesson.class);
		cq.where(builder.equal(root.get("index"), index));
		intro = entityManager.createQuery(cq).getSingleResult();
		return intro;
	}

	@Override
	public ReadExecOne getAllExerById(int id) {
		ReadExecOne exer = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ReadExecOne> cq = builder.createQuery(ReadExecOne.class);
		Root<ReadExecOne> root = cq.from(ReadExecOne.class);
		cq.where(builder.equal(root.get("id"), id));
		exer = entityManager.createQuery(cq).getSingleResult();
		return exer;
	}

	@Override
	public ReadExecTwo getAllExerTwoById(int id) {
		ReadExecTwo exer = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ReadExecTwo> cq = builder.createQuery(ReadExecTwo.class);
		Root<ReadExecTwo> root = cq.from(ReadExecTwo.class);
		cq.where(builder.equal(root.get("id"), id));
		exer = entityManager.createQuery(cq).getSingleResult();
		return exer;
	}

	@Override
	public ReadExecThree getAllExerThreeeById(int id) {
		ReadExecThree exer = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ReadExecThree> cq = builder.createQuery(ReadExecThree.class);
		Root<ReadExecThree> root = cq.from(ReadExecThree.class);
		cq.where(builder.equal(root.get("id"), id));
		exer = entityManager.createQuery(cq).getSingleResult();
		return exer;
	}

	@Override
	public ReadTest saveReadTest(ReadTest readTest) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(readTest);
		return readTest;
	}

	@Override
	public List<ReadTest> getReadTestData() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ReadTest> cq = criteriaBuilder.createQuery(ReadTest.class);
		Root<ReadTest> root = cq.from(ReadTest.class);
		// Select all records
		CriteriaQuery<ReadTest> select = cq.select(root);
		TypedQuery<ReadTest> typedQuery = session.createQuery(select);
		List<ReadTest> alldata = typedQuery.getResultList();
		return alldata;
	}

	@Override
	public ReadTest getTestById(int id) {
		ReadTest exer = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ReadTest> cq = builder.createQuery(ReadTest.class);
		Root<ReadTest> root = cq.from(ReadTest.class);
		cq.where(builder.equal(root.get("id"), id));
		exer = entityManager.createQuery(cq).getSingleResult();
		return exer;
	}

}

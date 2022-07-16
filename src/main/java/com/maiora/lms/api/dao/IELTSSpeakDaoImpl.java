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

import com.maiora.lms.api.model.SpeakTesting;
import com.maiora.lms.api.model.TutorEvaluate;
import com.maiora.lms.api.model.IntroductionSpeeking;
import com.maiora.lms.api.model.SpeakExe;
import com.maiora.lms.api.model.SpeakExer;
import com.maiora.lms.api.model.SpeakExercise;
import com.maiora.lms.api.model.SpeakIntroduction;
import com.maiora.lms.api.model.SpeakLesson;
import com.maiora.lms.api.model.SpeakTest;
import com.maiora.lms.api.model.SpeakTestIntro;

@Component
@Repository
@Transactional
public class IELTSSpeakDaoImpl implements IELTSSpeakDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public SpeakTest createSpeakTest(SpeakTest speakTest) {
		System.out.println("Inside DAO" +  speakTest.toString());
		Session session = entityManager.unwrap(Session.class);
		session.persist(speakTest);
		return speakTest;
	}

	@Override
	public List<SpeakTest> getSpeakTest() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<SpeakTest> cq = criteriaBuilder.createQuery(SpeakTest.class);
		Root<SpeakTest> root = cq.from(SpeakTest.class);
		CriteriaQuery<SpeakTest> select = cq.select(root);
		TypedQuery<SpeakTest> typedQuery = session.createQuery(select);
		List<SpeakTest> allTest = typedQuery.getResultList();
		return allTest;
	}

	@Override
	public SpeakLesson createSpeakLesson(SpeakLesson speakLesson) {
		System.out.println("Inside DAO");
		Session session = entityManager.unwrap(Session.class);
		session.persist(speakLesson);
		return speakLesson;
	}

	@Override
	public SpeakExercise createSpeakExericse(SpeakExercise speakExercise) {
		System.out.println("Inside DAO");
		Session session = entityManager.unwrap(Session.class);
		session.persist(speakExercise);
		return speakExercise;
	}

	@Override
	public IntroductionSpeeking createSpeakIntroduction(IntroductionSpeeking speakIntroduction) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(speakIntroduction);
		return speakIntroduction;
	}

	@Override
	public List<IntroductionSpeeking> getSpeakIntroduction() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<IntroductionSpeeking> cq = criteriaBuilder.createQuery(IntroductionSpeeking.class);
		Root<IntroductionSpeeking> root = cq.from(IntroductionSpeeking.class);
		CriteriaQuery<IntroductionSpeeking> select = cq.select(root);
		TypedQuery<IntroductionSpeeking> typedQuery = session.createQuery(select);
		List<IntroductionSpeeking> allTest = typedQuery.getResultList();
		return allTest;
	}

	@Override
	public SpeakTestIntro createSpeakIntroduction(SpeakTestIntro speakTestIntro) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(speakTestIntro);
		return speakTestIntro;
	}

	@Override
	public List<SpeakTestIntro> getSpeakTestIntrod() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<SpeakTestIntro> cq = criteriaBuilder.createQuery(SpeakTestIntro.class);
		Root<SpeakTestIntro> root = cq.from(SpeakTestIntro.class);
		CriteriaQuery<SpeakTestIntro> select = cq.select(root);
		TypedQuery<SpeakTestIntro> typedQuery = session.createQuery(select);
		List<SpeakTestIntro> allTest = typedQuery.getResultList();
		return allTest;
	}

	@Override
	public SpeakExe createSpeakExe(SpeakExe speakExe) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(speakExe);
		return speakExe;
	}

	@Override
	public List<SpeakExe> getSpeakExe() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<SpeakExe> cq = criteriaBuilder.createQuery(SpeakExe.class);
		Root<SpeakExe> root = cq.from(SpeakExe.class);
		CriteriaQuery<SpeakExe> select = cq.select(root);
		TypedQuery<SpeakExe> typedQuery = session.createQuery(select);
		List<SpeakExe> allTest = typedQuery.getResultList();
		return allTest;
	}

	@Override
	public SpeakTestIntro getSpeakTestIntrodById(int id) {
		SpeakTestIntro tests = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<SpeakTestIntro> cq = builder.createQuery(SpeakTestIntro.class);
		Root<SpeakTestIntro> root=cq.from(SpeakTestIntro.class);
		cq.where(builder.equal(root.get("id"),id));
		tests = entityManager.createQuery(cq).getSingleResult();
	return tests;
	}

	@Override
	public IntroductionSpeeking getSpeakTestIntroductionById(int speakid) {
		IntroductionSpeeking intros = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<IntroductionSpeeking> cq = builder.createQuery(IntroductionSpeeking.class);
		Root<IntroductionSpeeking> root=cq.from(IntroductionSpeeking.class);
		cq.where(builder.equal(root.get("speakid"),speakid));
		intros = entityManager.createQuery(cq).getSingleResult();
	return intros;
	}

	@Override
	public List<SpeakLesson> getSpeakLes() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<SpeakLesson> cq = criteriaBuilder.createQuery(SpeakLesson.class);
		Root<SpeakLesson> root = cq.from(SpeakLesson.class);
		CriteriaQuery<SpeakLesson> select = cq.select(root);
		TypedQuery<SpeakLesson> typedQuery = session.createQuery(select);
		List<SpeakLesson> data = typedQuery.getResultList();
		return data;
	}

	@Override
	public SpeakLesson getSpeakLessonById(int index) {
		SpeakLesson intros = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<SpeakLesson> cq = builder.createQuery(SpeakLesson.class);
		Root<SpeakLesson> root=cq.from(SpeakLesson.class);
		cq.where(builder.equal(root.get("index"),index));
		intros = entityManager.createQuery(cq).getSingleResult();
	return intros;
	}

	@Override
	public SpeakExer createSpeakExer(SpeakExer speakExer) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(speakExer);
		return speakExer;
	}

	@Override
	public SpeakTesting createSpeakExer(SpeakTesting speakTesting) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(speakTesting);
		return speakTesting;
	}

	@Override
	public List<SpeakTesting> getSpeakTesting() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<SpeakTesting> cq = criteriaBuilder.createQuery(SpeakTesting.class);
		Root<SpeakTesting> root = cq.from(SpeakTesting.class);
		CriteriaQuery<SpeakTesting> select = cq.select(root);
		TypedQuery<SpeakTesting> typedQuery = session.createQuery(select);
		List<SpeakTesting> allTest = typedQuery.getResultList();
		return allTest;
	}

	@Override
	public TutorEvaluate createSpeakTest(TutorEvaluate tutorEvaluate) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(tutorEvaluate);
		return tutorEvaluate;
	}

	@Override
	public List<TutorEvaluate> getTutorEvaluate() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<TutorEvaluate> cq = criteriaBuilder.createQuery(TutorEvaluate.class);
		Root<TutorEvaluate> root = cq.from(TutorEvaluate.class);
		CriteriaQuery<TutorEvaluate> select = cq.select(root);
		TypedQuery<TutorEvaluate> typedQuery = session.createQuery(select);
		List<TutorEvaluate> allTest = typedQuery.getResultList();
		return allTest;
	}

	

}

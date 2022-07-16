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

import com.maiora.lms.api.model.CourseDetails;
import com.maiora.lms.api.model.ExerciseLesson;
import com.maiora.lms.api.model.IELTSReadTest;
import com.maiora.lms.api.model.IELTSReadingLesson;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.LessonIntro;
import com.maiora.lms.api.model.ListenExercise;
import com.maiora.lms.api.model.ListenIntroduction;
import com.maiora.lms.api.model.ListenLesson;
import com.maiora.lms.api.model.ListenTest;
import com.maiora.lms.api.model.ListeningLesson;
import com.maiora.lms.api.model.TestLesson;

@Component
@Repository
@Transactional
public class IELTSIntroDAOImpl implements IELTSIntroDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Introduction> getAllIELTSCourses() {
		System.out.println("inside dao");
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Introduction> cq = criteriaBuilder.createQuery(Introduction.class);
		Root<Introduction> root = cq.from(Introduction.class);
		CriteriaQuery<Introduction> select = cq.select(root);
		TypedQuery<Introduction> typedQuery = session.createQuery(select);
		List<Introduction> allcourses = typedQuery.getResultList();
		for (Introduction introduction : allcourses) {
			System.out.println(introduction);
		}
		System.out.println("fetch from DB");
		return allcourses;
	}

	@Override
	public List<IELTSReadingLesson> getAllReadingLessons() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<IELTSReadingLesson> cq = criteriaBuilder.createQuery(IELTSReadingLesson.class);
		Root<IELTSReadingLesson> root = cq.from(IELTSReadingLesson.class);
		CriteriaQuery<IELTSReadingLesson> select = cq.select(root);
		TypedQuery<IELTSReadingLesson> typedQuery = session.createQuery(select);
		List<IELTSReadingLesson> allreadinglessons = typedQuery.getResultList();
		return allreadinglessons;
	}

	@Override
	public Introduction saveReadIntro(Introduction intro) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(intro);
		return intro;
	}

	@Override
	public IELTSReadingLesson saveReadLesson(IELTSReadingLesson readLesson) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(readLesson);
		System.out.println(readLesson);
		return readLesson;
	}

	@Override
	public IELTSReadTest saveReadTest(IELTSReadTest ieltsReadTest) {
		System.out.println("inside dao");
		Session session = entityManager.unwrap(Session.class);
		session.persist(ieltsReadTest);
		System.out.println(ieltsReadTest.toString());
		return ieltsReadTest;
	}

	@Override
	public List<IELTSReadTest> getAllReadingTest() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<IELTSReadTest> cq = criteriaBuilder.createQuery(IELTSReadTest.class);
		Root<IELTSReadTest> root = cq.from(IELTSReadTest.class);
		CriteriaQuery<IELTSReadTest> select = cq.select(root);
		TypedQuery<IELTSReadTest> typedQuery = session.createQuery(select);
		List<IELTSReadTest> allreadingtest = typedQuery.getResultList();
		return allreadingtest;
	}

	@Override
	public CourseDetails saveCourses(CourseDetails coursedetails) {
		System.out.println("inside dao");
		Session session = entityManager.unwrap(Session.class);
		session.persist(coursedetails);
		System.out.println(coursedetails.toString());
		return coursedetails;
	}

	@Override
	public LessonIntro saveLessons(LessonIntro lessonIntro) {
		System.out.println("inside dao" + lessonIntro.toString());
		Session session = entityManager.unwrap(Session.class);
		session.persist(lessonIntro);
		return lessonIntro;
	}

	@Override
	public ListenIntroduction saveListenIntrod(ListenIntroduction listenIntroduction) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(listenIntroduction);
		return listenIntroduction;
	}

	@Override
	public List<ListenIntroduction> getListenIntrod() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ListenIntroduction> cq = criteriaBuilder.createQuery(ListenIntroduction.class);
		Root<ListenIntroduction> root = cq.from(ListenIntroduction.class);
		CriteriaQuery<ListenIntroduction> select = cq.select(root);
		TypedQuery<ListenIntroduction> typedQuery = session.createQuery(select);
		List<ListenIntroduction> allreadingtest = typedQuery.getResultList();
		return allreadingtest;
	}

	@Override
	public ListeningLesson saveListeningOne(ListeningLesson listeningLesson) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(listeningLesson);
		return listeningLesson;
	}

	@Override
	public List<ListeningLesson> getListeningOne() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ListeningLesson> cq = criteriaBuilder.createQuery(ListeningLesson.class);
		Root<ListeningLesson> root = cq.from(ListeningLesson.class);
		CriteriaQuery<ListeningLesson> select = cq.select(root);
		TypedQuery<ListeningLesson> typedQuery = session.createQuery(select);
		List<ListeningLesson> allreadingtest = typedQuery.getResultList();
		return allreadingtest;
	}

	@Override
	public ListeningLesson getListeningOneById(int index) {
		ListeningLesson lessons = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ListeningLesson> cq = builder.createQuery(ListeningLesson.class);
		Root<ListeningLesson> root=cq.from(ListeningLesson.class);
		cq.where(builder.equal(root.get("index"),index));
		lessons = entityManager.createQuery(cq).getSingleResult();
	return lessons;
	}

	@Override
	public ListenLesson saveReadIntrod(ListenLesson listenLesson) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(listenLesson);
		return listenLesson;
	}

	@Override
	public List<ListenLesson> getAllListenings() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ListenLesson> cq = criteriaBuilder.createQuery(ListenLesson.class);
		Root<ListenLesson> root = cq.from(ListenLesson.class);
		CriteriaQuery<ListenLesson> select = cq.select(root);
		TypedQuery<ListenLesson> typedQuery = session.createQuery(select);
		List<ListenLesson> allreadingtest = typedQuery.getResultList();
		return allreadingtest;
	}

	@Override
	public ListenLesson getListeningById(int id) {
		ListenLesson lessons = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ListenLesson> cq = builder.createQuery(ListenLesson.class);
		Root<ListenLesson> root=cq.from(ListenLesson.class);
		cq.where(builder.equal(root.get("id"),id));
		lessons = entityManager.createQuery(cq).getSingleResult();
	return lessons;
	}

	@Override
	public ListenTest saveReadTest(ListenTest listenTest) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(listenTest);
		return listenTest;
	}

	@Override
	public List<ListenTest> getAllListeningTests() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ListenTest> cq = criteriaBuilder.createQuery(ListenTest.class);
		Root<ListenTest> root = cq.from(ListenTest.class);
		CriteriaQuery<ListenTest> select = cq.select(root);
		TypedQuery<ListenTest> typedQuery = session.createQuery(select);
		List<ListenTest> results = typedQuery.getResultList();
		return results;
	}

	@Override
	public ExerciseLesson saveExerciseLesson(ExerciseLesson exerciseLesson) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(exerciseLesson);
		return exerciseLesson;
	}

	@Override
	public ListenExercise saveListenExerciseLesson(ListenExercise listenExercise) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(listenExercise);
		return listenExercise;
	}

	@Override
	public TestLesson saveTestLesson(TestLesson testLesson) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(testLesson);
		return testLesson;
	}

}

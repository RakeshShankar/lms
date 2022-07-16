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

import com.maiora.lms.api.model.ExerciseWrite;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.LessonWrite;
import com.maiora.lms.api.model.WriteExerciseLesson;
@Component
@Repository
@Transactional
public class IELTSWriteDaoImpl implements IELTSWriteDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Introduction> getAllWriting() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Introduction> cq = criteriaBuilder.createQuery(Introduction.class);
		Root<Introduction> root=cq.from(Introduction.class);
		   //Select all records
		   CriteriaQuery<Introduction> select = cq.select(root);
		   TypedQuery<Introduction> typedQuery = session.createQuery(select);
		   List<Introduction> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public Introduction saveCourseWriting(Introduction intro) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(intro);
		return intro;
	}

	@Override
	public LessonWrite saveWriteLesson(LessonWrite lessonwrite) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(lessonwrite);
		return lessonwrite;
	}

	@Override
	public ExerciseWrite saveWriteExercise(ExerciseWrite exercisewrite) {
		System.out.println("DB"+exercisewrite );
		Session session = entityManager.unwrap(Session.class);
		session.persist(exercisewrite);
		return exercisewrite;
	}

	@Override
	public List<ExerciseWrite> getAllWritingExercises() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ExerciseWrite> cq = criteriaBuilder.createQuery(ExerciseWrite.class);
		Root<ExerciseWrite> root=cq.from(ExerciseWrite.class);
		   //Select all records
		   CriteriaQuery<ExerciseWrite> select = cq.select(root);
		   TypedQuery<ExerciseWrite> typedQuery = session.createQuery(select);
		   List<ExerciseWrite> exercises = typedQuery.getResultList();
		return exercises;
	}

	@Override
	public WriteExerciseLesson saveExerciseLesson(WriteExerciseLesson writeExerciseLesson) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(writeExerciseLesson);
		return writeExerciseLesson;
	}

	
}

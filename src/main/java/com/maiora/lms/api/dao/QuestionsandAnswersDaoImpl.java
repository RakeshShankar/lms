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
import com.maiora.lms.api.model.Pricing;
import com.maiora.lms.api.model.QuestionsAndAnswers;

@Component
@Repository
@Transactional
public class QuestionsandAnswersDaoImpl implements QuestionsandAnswersDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<QuestionsAndAnswers> readAllQuestionsAndAnswers(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<QuestionsAndAnswers> cq = criteriaBuilder.createQuery(QuestionsAndAnswers.class);
		Root<QuestionsAndAnswers> root=cq.from(QuestionsAndAnswers.class);
		   //Select all records
		   CriteriaQuery<QuestionsAndAnswers> select = cq.select(root);
		   TypedQuery<QuestionsAndAnswers> typedQuery = session.createQuery(select);
		   List<QuestionsAndAnswers> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public QuestionsAndAnswers addQuestionsAndAnswers(QuestionsAndAnswers questionAndAnswrModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(questionAndAnswrModel);
		return questionAndAnswrModel;
	}

	/***
	Update Model
	 */
	private QuestionsAndAnswers findthedetails(QuestionsAndAnswers assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		QuestionsAndAnswers _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<QuestionsAndAnswers> cq = builder.createQuery(QuestionsAndAnswers.class);
		Root<QuestionsAndAnswers> root=cq.from(QuestionsAndAnswers.class);
		cq.where(builder.equal(root.get("question_answer_id"),assignmentModel.getQuestion_answer_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	
	@Override
	public QuestionsAndAnswers updateTheExistingQuestionsAndAnswers(QuestionsAndAnswers questionAndAnswrModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		QuestionsAndAnswers _addressModel = findthedetails(questionAndAnswrModel);
		if(_addressModel!= null) {
	        	session.merge(questionAndAnswrModel);	
	        }else {
	        	return null;
	        	
	        }
		return questionAndAnswrModel;
	}

	@Override
	public List<QuestionsAndAnswers> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<QuestionsAndAnswers> cq = criteriaBuilder.createQuery(QuestionsAndAnswers.class);
		Root<QuestionsAndAnswers> root=cq.from(QuestionsAndAnswers.class);
		   //Select all records
		   CriteriaQuery<QuestionsAndAnswers> select = cq.select(root);
		   TypedQuery<QuestionsAndAnswers> typedQuery = session.createQuery(select);
		   List<QuestionsAndAnswers> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

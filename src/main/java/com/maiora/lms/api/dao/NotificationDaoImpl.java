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
import com.maiora.lms.api.model.Lessons;
import com.maiora.lms.api.model.Notification;

@Component
@Repository
@Transactional
public class NotificationDaoImpl implements NotificationDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Notification> readAllNotification(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Notification> cq = criteriaBuilder.createQuery(Notification.class);
		Root<Notification> root=cq.from(Notification.class);
		   //Select all records
		   CriteriaQuery<Notification> select = cq.select(root);
		   TypedQuery<Notification> typedQuery = session.createQuery(select);
		   List<Notification> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Notification addNotification(Notification notifyModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(notifyModel);
		return notifyModel;
	}

	/***
	Update Model
	 */
	private Notification findthedetails(Notification assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Notification _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Notification> cq = builder.createQuery(Notification.class);
		Root<Notification> root=cq.from(Notification.class);
		cq.where(builder.equal(root.get("notification_id"),assignmentModel.getNotification_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	
	@Override
	public Notification updateTheExistingNotification(Notification notifyModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Notification _addressModel = findthedetails(notifyModel);
		if(_addressModel!= null) {
	        	session.merge(notifyModel);	
	        }else {
	        	return null;
	        	
	        }
		return notifyModel;
	}

	@Override
	public List<Notification> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Notification> cq = criteriaBuilder.createQuery(Notification.class);
		Root<Notification> root=cq.from(Notification.class);
		   //Select all records
		   CriteriaQuery<Notification> select = cq.select(root);
		   TypedQuery<Notification> typedQuery = session.createQuery(select);
		   List<Notification> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

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

import com.maiora.lms.api.model.CourseSave;
import com.maiora.lms.api.model.PaymentModel;
import com.maiora.lms.api.model.courses;

@Component
@Repository
@Transactional
public class CoursesDaoImpl implements CoursesDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<courses> readAllcourses(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<courses> cq = criteriaBuilder.createQuery(courses.class);
		Root<courses> root=cq.from(courses.class);
		   //Select all records
		   CriteriaQuery<courses> select = cq.select(root);
		   TypedQuery<courses> typedQuery = session.createQuery(select);
		   List<courses> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public courses addcourses(courses coursesModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(coursesModel);
		return coursesModel;
	}

	/***
	Update Model
	 */
	private courses findthedetails(courses assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		courses _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<courses> cq = builder.createQuery(courses.class);
		Root<courses> root=cq.from(courses.class);
		cq.where(builder.equal(root.get("course_id"),assignmentModel.getCourse_id()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}
	@Override
	public courses updateTheExistingcourses(courses coursesModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		courses _addressModel = findthedetails(coursesModel);
		if(_addressModel!= null) {
	        	session.merge(coursesModel);	
	        }else {
	        	return null;
	        	
	        }
		return coursesModel;
	}

	@Override
	public List<courses> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<courses> cq = criteriaBuilder.createQuery(courses.class);
		Root<courses> root=cq.from(courses.class);
		   //Select all records
		   CriteriaQuery<courses> select = cq.select(root);
		   TypedQuery<courses> typedQuery = session.createQuery(select);
		   List<courses> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public CourseSave addNewCourses(CourseSave courseSave) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(courseSave);
		return courseSave;
	}

	@Override
	public PaymentModel addNewourses(PaymentModel paymentModel) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(paymentModel);
		return paymentModel;
	}

	@Override
	public List<CourseSave> getAllCouData() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<CourseSave> cq = criteriaBuilder.createQuery(CourseSave.class);
		Root<CourseSave> root=cq.from(CourseSave.class);
		   //Select all records
		   CriteriaQuery<CourseSave> select = cq.select(root);
		   TypedQuery<CourseSave> typedQuery = session.createQuery(select);
		   List<CourseSave> datas = typedQuery.getResultList();
		return datas;
	}

	@Override
	public List<PaymentModel> getAllCoursesData() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<PaymentModel> cq = criteriaBuilder.createQuery(PaymentModel.class);
		Root<PaymentModel> root=cq.from(PaymentModel.class);
		   //Select all records
		   CriteriaQuery<PaymentModel> select = cq.select(root);
		   TypedQuery<PaymentModel> typedQuery = session.createQuery(select);
		   List<PaymentModel> datas = typedQuery.getResultList();
		return datas;
	}

	@Override
	public CourseSave findCourseById(int courseid) {
		CourseSave courses = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<CourseSave> cq = builder.createQuery(CourseSave.class);
		Root<CourseSave> root=cq.from(CourseSave.class);
		cq.where(builder.equal(root.get("courseid"),courseid));
		courses = entityManager.createQuery(cq).getSingleResult();
	return courses;
	}

	@Override
	public PaymentModel findCoursesById(int paymentid) {
		PaymentModel payments = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<PaymentModel> cq = builder.createQuery(PaymentModel.class);
		Root<PaymentModel> root=cq.from(PaymentModel.class);
		cq.where(builder.equal(root.get("paymentid"),paymentid));
		payments = entityManager.createQuery(cq).getSingleResult();
	return payments;
	}

	
	
	

}

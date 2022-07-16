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
import com.maiora.lms.api.model.QuestionsAndAnswers;
import com.maiora.lms.api.model.Role;

@Component
@Repository
@Transactional
public class RolesDaoImpl implements RolesDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Role> readAllAssignments(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Role> cq = criteriaBuilder.createQuery(Role.class);
		Root<Role> root=cq.from(Role.class);
		   //Select all records
		   CriteriaQuery<Role> select = cq.select(root);
		   TypedQuery<Role> typedQuery = session.createQuery(select);
		   List<Role> AllAdd = typedQuery.getResultList();
		return AllAdd;
	}

	@Override
	public Role addAssignments(Role RoleModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.persist(RoleModel);
		return RoleModel;
	}
	
	/***
	Update Model
	 */
	private Role findthedetails(Role assignmentModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Role _addressModel = null;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Role> cq = builder.createQuery(Role.class);
		Root<Role> root=cq.from(Role.class);
		cq.where(builder.equal(root.get("Id"),assignmentModel.getId()));
		_addressModel = session.createQuery(cq).getSingleResult();
		return _addressModel;
	}

	@Override
	public Role updateTheExistingAssignment(Role RoleModel) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Role _addressModel = findthedetails(RoleModel);
		if(_addressModel!= null) {
	        	session.merge(RoleModel);	
	        }else {
	        	return null;
	        	
	        }
		return RoleModel;
	}

	@Override
	public List<Role> getAllData() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Role> cq = criteriaBuilder.createQuery(Role.class);
		Root<Role> root=cq.from(Role.class);
		   //Select all records
		   CriteriaQuery<Role> select = cq.select(root);
		   TypedQuery<Role> typedQuery = session.createQuery(select);
		   List<Role> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

}

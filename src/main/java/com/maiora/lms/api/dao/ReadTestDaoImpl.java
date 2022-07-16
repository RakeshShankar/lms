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

import com.maiora.lms.api.model.TestTwoExerModel;
import com.maiora.lms.api.model.WriteTestModel;
import com.maiora.lms.api.model.ListenExerOne;
import com.maiora.lms.api.model.ListenExerThree;
import com.maiora.lms.api.model.TestOneExerModel;
import com.maiora.lms.api.model.TestThreeExerModel;
@Component
@Repository
@Transactional
public class ReadTestDaoImpl implements ReadTestDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public TestOneExerModel addTestExer(TestOneExerModel testOneExerModel) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(testOneExerModel);
		return testOneExerModel;
	}

	@Override
	public List<TestOneExerModel> getAllTestExerData() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<TestOneExerModel> cq = criteriaBuilder.createQuery(TestOneExerModel.class);
		Root<TestOneExerModel> root=cq.from(TestOneExerModel.class);
		   //Select all records
		   CriteriaQuery<TestOneExerModel> select = cq.select(root);
		   TypedQuery<TestOneExerModel> typedQuery = session.createQuery(select);
		   List<TestOneExerModel> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public TestTwoExerModel addTestExerTwo(TestTwoExerModel testTwoExerModel) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(testTwoExerModel);
		return testTwoExerModel;
	}

	@Override
	public List<TestTwoExerModel> getAllTestExerDataTwo() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<TestTwoExerModel> cq = criteriaBuilder.createQuery(TestTwoExerModel.class);
		Root<TestTwoExerModel> root=cq.from(TestTwoExerModel.class);
		   //Select all records
		   CriteriaQuery<TestTwoExerModel> select = cq.select(root);
		   TypedQuery<TestTwoExerModel> typedQuery = session.createQuery(select);
		   List<TestTwoExerModel> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public TestThreeExerModel addTestExerThree(TestThreeExerModel testThreeExerModel) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(testThreeExerModel);
		return testThreeExerModel;
	}

	@Override
	public List<TestThreeExerModel> getAllTestExerDataThree() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<TestThreeExerModel> cq = criteriaBuilder.createQuery(TestThreeExerModel.class);
		Root<TestThreeExerModel> root=cq.from(TestThreeExerModel.class);
		   //Select all records
		   CriteriaQuery<TestThreeExerModel> select = cq.select(root);
		   TypedQuery<TestThreeExerModel> typedQuery = session.createQuery(select);
		   List<TestThreeExerModel> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public WriteTestModel createWritingTest(WriteTestModel writeTestModel) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(writeTestModel);
		return writeTestModel;
	}

	@Override
	public List<WriteTestModel> getWritingTest() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<WriteTestModel> cq = criteriaBuilder.createQuery(WriteTestModel.class);
		Root<WriteTestModel> root=cq.from(WriteTestModel.class);
		   //Select all records
		   CriteriaQuery<WriteTestModel> select = cq.select(root);
		   TypedQuery<WriteTestModel> typedQuery = session.createQuery(select);
		   List<WriteTestModel> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public ListenExerOne createWritingTestOne(ListenExerOne listenExerOne) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(listenExerOne);
		return listenExerOne;
	}

	@Override
	public List<ListenExerOne> getWritingTestOne() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ListenExerOne> cq = criteriaBuilder.createQuery(ListenExerOne.class);
		Root<ListenExerOne> root=cq.from(ListenExerOne.class);
		   //Select all records
		   CriteriaQuery<ListenExerOne> select = cq.select(root);
		   TypedQuery<ListenExerOne> typedQuery = session.createQuery(select);
		   List<ListenExerOne> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public ListenExerThree createWritingTestThree(ListenExerThree listenExerThree) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(listenExerThree);
		return listenExerThree;
	}

	@Override
	public List<ListenExerThree> getWritingTestThree() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ListenExerThree> cq = criteriaBuilder.createQuery(ListenExerThree.class);
		Root<ListenExerThree> root=cq.from(ListenExerThree.class);
		   //Select all records
		   CriteriaQuery<ListenExerThree> select = cq.select(root);
		   TypedQuery<ListenExerThree> typedQuery = session.createQuery(select);
		   List<ListenExerThree> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public ListenExerOne createWritingTestFive(ListenExerOne listenExerOne) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(listenExerOne);
		return listenExerOne;
	}

	@Override
	public List<ListenExerOne> getWritingTestFive() {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<ListenExerOne> cq = criteriaBuilder.createQuery(ListenExerOne.class);
		Root<ListenExerOne> root=cq.from(ListenExerOne.class);
		   //Select all records
		   CriteriaQuery<ListenExerOne> select = cq.select(root);
		   TypedQuery<ListenExerOne> typedQuery = session.createQuery(select);
		   List<ListenExerOne> AllSeller = typedQuery.getResultList();
		return AllSeller;
	}

	@Override
	public TestOneExerModel getWritingTesById(int id) {
		TestOneExerModel tests = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<TestOneExerModel> cq = builder.createQuery(TestOneExerModel.class);
		Root<TestOneExerModel> root=cq.from(TestOneExerModel.class);
		cq.where(builder.equal(root.get("id"),id));
		tests = entityManager.createQuery(cq).getSingleResult();
	return tests;
	}

	@Override
	public TestTwoExerModel getWritingTesTwoById(int exerid) {
		TestTwoExerModel tests = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<TestTwoExerModel> cq = builder.createQuery(TestTwoExerModel.class);
		Root<TestTwoExerModel> root=cq.from(TestTwoExerModel.class);
		cq.where(builder.equal(root.get("exerid"),exerid));
		tests = entityManager.createQuery(cq).getSingleResult();
	return tests;
	}

	@Override
	public TestThreeExerModel getWritingTesThreeById(int exerid) {
		TestThreeExerModel tests = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<TestThreeExerModel> cq = builder.createQuery(TestThreeExerModel.class);
		Root<TestThreeExerModel> root=cq.from(TestThreeExerModel.class);
		cq.where(builder.equal(root.get("exerid"),exerid));
		tests = entityManager.createQuery(cq).getSingleResult();
	return tests;
	}

	@Override
	public WriteTestModel getWritingTestById(int id) {
		WriteTestModel tests = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<WriteTestModel> cq = builder.createQuery(WriteTestModel.class);
		Root<WriteTestModel> root=cq.from(WriteTestModel.class);
		cq.where(builder.equal(root.get("id"),id));
		tests = entityManager.createQuery(cq).getSingleResult();
	return tests;
	}

	@Override
	public ListenExerOne getAllListenExerOneById(int id) {
		ListenExerOne exer = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ListenExerOne> cq = builder.createQuery(ListenExerOne.class);
		Root<ListenExerOne> root=cq.from(ListenExerOne.class);
		cq.where(builder.equal(root.get("id"),id));
		exer = entityManager.createQuery(cq).getSingleResult();
	return exer;
	
	}

	@Override
	public ListenExerThree getAllListenExerThreeById(int id) {
		ListenExerThree exer = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ListenExerThree> cq = builder.createQuery(ListenExerThree.class);
		Root<ListenExerThree> root=cq.from(ListenExerThree.class);
		cq.where(builder.equal(root.get("id"),id));
		exer = entityManager.createQuery(cq).getSingleResult();
	return exer;
	}

	@Override
	public ListenExerOne getAllListenExerFiveById(int id) {
		ListenExerOne exer = null;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ListenExerOne> cq = builder.createQuery(ListenExerOne.class);
		Root<ListenExerOne> root=cq.from(ListenExerOne.class);
		cq.where(builder.equal(root.get("id"),id));
		exer = entityManager.createQuery(cq).getSingleResult();
	return exer;
	}

}

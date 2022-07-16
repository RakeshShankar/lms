package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.model.TestTwoExerModel;
import com.maiora.lms.api.model.WriteTestModel;
import com.maiora.lms.api.dao.ReadTestDao;
import com.maiora.lms.api.model.ListenExerOne;
import com.maiora.lms.api.model.ListenExerThree;
import com.maiora.lms.api.model.TestOneExerModel;
import com.maiora.lms.api.model.TestThreeExerModel;
@Service
public class ReadTestServiceImpl implements ReadTestService {
	
	@Autowired
	private ReadTestDao readTestDao;
	
	@Override
	public TestOneExerModel addTestExerOne(TestOneExerModel testOneExerModel) {
		// TODO Auto-generated method stub
		return readTestDao.addTestExer(testOneExerModel);
	}

	@Override
	public List<TestOneExerModel> getAllExerOneData() {
		// TODO Auto-generated method stub
		return readTestDao.getAllTestExerData();
	}

	@Override
	public TestTwoExerModel addTestExerTwo(TestTwoExerModel testTwoExerModel) {
		// TODO Auto-generated method stub
		return readTestDao.addTestExerTwo(testTwoExerModel);
	}

	@Override
	public List<TestTwoExerModel> getAllExerTwoData() {
		// TODO Auto-generated method stub
		return readTestDao.getAllTestExerDataTwo();
	}

	@Override
	public TestThreeExerModel addTestExerThree(TestThreeExerModel testThreeExerModel) {
		// TODO Auto-generated method stub
		return readTestDao.addTestExerThree(testThreeExerModel);
	}

	@Override
	public List<TestThreeExerModel> getAllExerThreeData() {
		// TODO Auto-generated method stub
		return readTestDao.getAllTestExerDataThree();
	}

	@Override
	public WriteTestModel createWritingTest(WriteTestModel writeTestModel) {
		// TODO Auto-generated method stub
		return readTestDao.createWritingTest(writeTestModel);
	}

	@Override
	public List<WriteTestModel> getWritingTest() {
		// TODO Auto-generated method stub
		return readTestDao.getWritingTest();
	}

	@Override
	public ListenExerOne addListenExerOne(ListenExerOne listenExerOne) {
		// TODO Auto-generated method stub
		return readTestDao.createWritingTestOne(listenExerOne);
	}

	@Override
	public List<ListenExerOne> getAllListenExerOne() {
		// TODO Auto-generated method stub
		return readTestDao.getWritingTestOne();
	}

	@Override
	public ListenExerThree addListenExerThree(ListenExerThree listenExerThree) {
		// TODO Auto-generated method stub
		return readTestDao.createWritingTestThree(listenExerThree);
	}

	@Override
	public List<ListenExerThree> getAllListenExerThree() {
		// TODO Auto-generated method stub
		return readTestDao.getWritingTestThree();
	}

	@Override
	public ListenExerOne addListenExerFive(ListenExerOne listenExerOne) {
		// TODO Auto-generated method stub
		return readTestDao.createWritingTestFive(listenExerOne);
	}

	@Override
	public List<ListenExerOne> getAllListenExerFive() {
		// TODO Auto-generated method stub
		return readTestDao.getWritingTestFive();
	}

	@Override
	public TestOneExerModel getAllExerOneDataById(int id) {
		// TODO Auto-generated method stub
		return readTestDao.getWritingTesById(id);
	}

	@Override
	public TestTwoExerModel getAllExerTwoDataById(int exerid) {
		// TODO Auto-generated method stub
		return readTestDao.getWritingTesTwoById(exerid);
	}

	@Override
	public TestThreeExerModel getAllExerThreeDataById(int exerid) {
		// TODO Auto-generated method stub
		return readTestDao.getWritingTesThreeById(exerid);
	}

	@Override
	public WriteTestModel getWritingTestById(int id) {
		// TODO Auto-generated method stub
		return readTestDao.getWritingTestById(id);
	}

	@Override
	public ListenExerOne getAllListenExerOneById(int id) {
		// TODO Auto-generated method stub
		return readTestDao.getAllListenExerOneById(id);
	}

	@Override
	public ListenExerThree getAllListenExerThreeById(int id) {
		// TODO Auto-generated method stub
		return readTestDao.getAllListenExerThreeById(id);
	}

	@Override
	public ListenExerOne getAllListenExerFiveById(int id) {
		// TODO Auto-generated method stub
		return readTestDao.getAllListenExerFiveById(id);
	}

	

}

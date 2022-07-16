package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.TestDao;
import com.maiora.lms.api.model.Test;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;

	@Override
	public List<Test> readAllTest(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return testDao.readAllTest(from,  pagesize,  filtertext);
	}

	@Override
	public Test addTest(Test testModel) {
		// TODO Auto-generated method stub
		return testDao.addTest(testModel);
	}

	@Override
	public Test updateTheExistingTest(Test testModel) {
		// TODO Auto-generated method stub
		return testDao.updateTheExistingTest(testModel);
	}

	@Override
	public List<Test> getAllData() {
		// TODO Auto-generated method stub
		return testDao.getAllData();
	}
	
}

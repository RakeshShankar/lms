package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.UserTestDao;
import com.maiora.lms.api.model.UserTest;

@Service
public class UserTestServiceImpl implements UserTestService{

	@Autowired
	private UserTestDao userTestDao;

	@Override 
	public List<UserTest> readAllUserTest(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return userTestDao.readAllUserTest(from, pagesize,  filtertext);
	}

	@Override
	public UserTest addUserTest(UserTest userTestModel) {
		// TODO Auto-generated method stub
		return userTestDao.addUserTest(userTestModel);
	}

	@Override
	public UserTest updateTheExistingUserTest(UserTest userTestModel) {
		// TODO Auto-generated method stub
		return userTestDao.updateTheExistingUserTest(userTestModel);
	}

	@Override
	public List<UserTest> getAllData() {
		// TODO Auto-generated method stub
		return userTestDao.getAllData();
	}
}

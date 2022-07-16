package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.UserTest;

public interface UserTestDao {

	public List<UserTest> readAllUserTest(int from, int pagesize, String filtertext);

	public UserTest addUserTest(UserTest userTestModel);

	public UserTest updateTheExistingUserTest(UserTest userTestModel);

	public List<UserTest> getAllData();


}

package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Test;

public interface TestDao {

	public List<Test> readAllTest(int from, int pagesize, String filtertext);

	public Test addTest(Test testModel);

	public Test updateTheExistingTest(Test testModel);

	public List<Test> getAllData();

}

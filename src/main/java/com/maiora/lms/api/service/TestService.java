package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.Test;

public interface TestService {

	public List<Test> readAllTest(int from, int pagesize, String filtertext);

	public Test addTest(Test testModel);

	public Test updateTheExistingTest(Test testModel);

	public List<Test> getAllData();

}

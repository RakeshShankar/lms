package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.TestTwoExerModel;
import com.maiora.lms.api.model.WriteTestModel;
import com.maiora.lms.api.model.ListenExerOne;
import com.maiora.lms.api.model.ListenExerThree;
import com.maiora.lms.api.model.TestOneExerModel;
import com.maiora.lms.api.model.TestThreeExerModel;

public interface ReadTestService {

	TestOneExerModel addTestExerOne(TestOneExerModel testOneExerModel);

	List<TestOneExerModel> getAllExerOneData();

	TestTwoExerModel addTestExerTwo(TestTwoExerModel testTwoExerModel);

	List<TestTwoExerModel> getAllExerTwoData();

	TestThreeExerModel addTestExerThree(TestThreeExerModel testThreeExerModel);

	List<TestThreeExerModel> getAllExerThreeData();

	WriteTestModel createWritingTest(WriteTestModel writeTestModel);

	List<WriteTestModel> getWritingTest();

	ListenExerOne addListenExerOne(ListenExerOne listenExerOne);

	List<ListenExerOne> getAllListenExerOne();

	ListenExerThree addListenExerThree(ListenExerThree listenExerThree);

	List<ListenExerThree> getAllListenExerThree();

	ListenExerOne addListenExerFive(ListenExerOne listenExerOne);

	List<ListenExerOne> getAllListenExerFive();

	TestOneExerModel getAllExerOneDataById(int id);

	TestTwoExerModel getAllExerTwoDataById(int exerid);

	TestThreeExerModel getAllExerThreeDataById(int exerid);

	WriteTestModel getWritingTestById(int id);

	ListenExerOne getAllListenExerOneById(int id);

	ListenExerThree getAllListenExerThreeById(int id);

	ListenExerOne getAllListenExerFiveById(int id);

}

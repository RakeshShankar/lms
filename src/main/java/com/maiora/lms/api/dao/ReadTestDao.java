package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.TestTwoExerModel;
import com.maiora.lms.api.model.WriteTestModel;
import com.maiora.lms.api.model.ListenExerOne;
import com.maiora.lms.api.model.ListenExerThree;
import com.maiora.lms.api.model.TestOneExerModel;
import com.maiora.lms.api.model.TestThreeExerModel;

public interface ReadTestDao {

	TestOneExerModel addTestExer(TestOneExerModel testOneExerModel);

	List<TestOneExerModel> getAllTestExerData();

	TestTwoExerModel addTestExerTwo(TestTwoExerModel testTwoExerModel);

	List<TestTwoExerModel> getAllTestExerDataTwo();

	TestThreeExerModel addTestExerThree(TestThreeExerModel testThreeExerModel);

	List<TestThreeExerModel> getAllTestExerDataThree();

	WriteTestModel createWritingTest(WriteTestModel writeTestModel);

	List<WriteTestModel> getWritingTest();

	ListenExerOne createWritingTestOne(ListenExerOne listenExerOne);

	List<ListenExerOne> getWritingTestOne();

	ListenExerThree createWritingTestThree(ListenExerThree listenExerThree);

	List<ListenExerThree> getWritingTestThree();

	ListenExerOne createWritingTestFive(ListenExerOne listenExerOne);

	List<ListenExerOne> getWritingTestFive();

	TestOneExerModel getWritingTesById(int id);

	TestTwoExerModel getWritingTesTwoById(int exerid);

	TestThreeExerModel getWritingTesThreeById(int exerid);

	WriteTestModel getWritingTestById(int id);

	ListenExerOne getAllListenExerOneById(int id);

	ListenExerThree getAllListenExerThreeById(int id);

	ListenExerOne getAllListenExerFiveById(int id);

}

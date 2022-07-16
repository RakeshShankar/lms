package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.ReadExecOne;
import com.maiora.lms.api.model.ReadExecThree;
import com.maiora.lms.api.model.ReadExecTwo;
import com.maiora.lms.api.model.ReadIntroModel;
import com.maiora.lms.api.model.ReadLesson;
import com.maiora.lms.api.model.ReadTest;

public interface ReadingIntroDao {

	ReadIntroModel saveReadIntro(ReadIntroModel readIntroModel);

	List<ReadIntroModel> getReadIntro();

	ReadLesson saveReadLesson(ReadLesson readLesson);

	ReadExecOne saveReadExer(ReadExecOne readExecOne);

	List<ReadExecOne> getReadExer();

	ReadExecTwo saveReadExer(ReadExecTwo readExectwo);

	List<ReadExecTwo> getReadExerTwo();

	ReadExecThree saveReadExerThree(ReadExecThree readExecThree);

	List<ReadExecThree> getReadExerThree();

	List<ReadLesson> getReadLessonData();

	ReadIntroModel getReadLessonDataById(int readintromodelid);

	ReadLesson getAllLessonDataById(int index);

	ReadExecOne getAllExerById(int id);

	ReadExecTwo getAllExerTwoById(int id);

	ReadExecThree getAllExerThreeeById(int id);

	ReadTest saveReadTest(ReadTest readTest);

	List<ReadTest> getReadTestData();

	ReadTest getTestById(int id);

}

package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.LesExcercises;
import com.maiora.lms.api.model.ReadExecOne;
import com.maiora.lms.api.model.ReadExecThree;
import com.maiora.lms.api.model.ReadExecTwo;
import com.maiora.lms.api.model.ReadIntroModel;
import com.maiora.lms.api.model.ReadLesson;
import com.maiora.lms.api.model.ReadTest;

public interface ReadingIntroService {

	ReadIntroModel saveIntroduction(ReadIntroModel readIntroModel);

	List<ReadIntroModel> getAllData();

	ReadLesson saveReadLesson(ReadLesson readLesson);

	ReadExecOne saveReadExercise(ReadExecOne readExecOne);

	List<ReadExecOne> getAllExerData();

	ReadExecTwo saveReadExercise(ReadExecTwo readExectwo);

	List<ReadExecTwo> getAllExerDataTwo();

	ReadExecThree saveReadExerciseThree(ReadExecThree readExecThree);

	List<ReadExecThree> getAllExerDataThree();

	List<ReadLesson> getAllLessonData();

	ReadIntroModel getAllDataById(int readintromodelid);

	ReadLesson getAllLessonDataById(int index);

	ReadExecOne getAllExerDataById(int id);

	ReadExecTwo getAllExerDataTwoById(int id);

	ReadExecThree getAllExerDataThreeById(int id);

	ReadTest saveReadTest(ReadTest readTest);

	List<ReadTest> getAllTests();

	ReadTest getTestById(int id);

	ReadTest getTestByLessonId(int id);

	ReadTest getTestByLessonandTestId(int id, int lessonid);

	LesExcercises getExercisebyLessonidandExerciseid(int lessonid, int excerciseid);

}

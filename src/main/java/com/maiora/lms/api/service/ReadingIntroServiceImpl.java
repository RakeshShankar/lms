package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.ReadingIntroDao;
import com.maiora.lms.api.model.LesExcercises;
import com.maiora.lms.api.model.ReadExecOne;
import com.maiora.lms.api.model.ReadExecThree;
import com.maiora.lms.api.model.ReadExecTwo;
import com.maiora.lms.api.model.ReadIntroModel;
import com.maiora.lms.api.model.ReadLesson;
import com.maiora.lms.api.model.ReadTest;
import com.maiora.lms.api.repository.ExerciseReadingRepository;
import com.maiora.lms.api.repository.TestRepository;

@Service
public class ReadingIntroServiceImpl implements ReadingIntroService{
	
	@Autowired
	private ReadingIntroDao readingIntroDao;
	
	@Autowired
	TestRepository testRepository;
	
	@Autowired
	ExerciseReadingRepository exerciseReadingRepository;

	@Override
	public ReadIntroModel saveIntroduction(ReadIntroModel readIntroModel) {
		// TODO Auto-generated method stub
		return readingIntroDao.saveReadIntro(readIntroModel);
	}

	@Override
	public List<ReadIntroModel> getAllData() {
		// TODO Auto-generated method stub
		return readingIntroDao.getReadIntro();
	}

	@Override
	public ReadLesson saveReadLesson(ReadLesson readLesson) {
		// TODO Auto-generated method stub
		return readingIntroDao.saveReadLesson(readLesson);
	}

	@Override
	public ReadExecOne saveReadExercise(ReadExecOne readExecOne) {
		// TODO Auto-generated method stub
		return readingIntroDao.saveReadExer(readExecOne);
	}

	@Override
	public List<ReadExecOne> getAllExerData() {
		// TODO Auto-generated method stub
		return readingIntroDao.getReadExer();
	}

	@Override
	public ReadExecTwo saveReadExercise(ReadExecTwo readExectwo) {
		// TODO Auto-generated method stub
		return readingIntroDao.saveReadExer(readExectwo);
	}

	@Override
	public List<ReadExecTwo> getAllExerDataTwo() {
		// TODO Auto-generated method stub
		return readingIntroDao.getReadExerTwo();
	}

	@Override
	public ReadExecThree saveReadExerciseThree(ReadExecThree readExecThree) {
		// TODO Auto-generated method stub
		return readingIntroDao.saveReadExerThree(readExecThree);
	}

	@Override
	public List<ReadExecThree> getAllExerDataThree() {
		// TODO Auto-generated method stub
		return readingIntroDao.getReadExerThree();
	}

	@Override
	public List<ReadLesson> getAllLessonData() {
		// TODO Auto-generated method stub
		return readingIntroDao.getReadLessonData();
	}

	@Override
	public ReadIntroModel getAllDataById(int readintromodelid) {
		// TODO Auto-generated method stub
		return readingIntroDao.getReadLessonDataById(readintromodelid);
	}

	@Override
	public ReadLesson getAllLessonDataById(int index) {
		// TODO Auto-generated method stub
		return readingIntroDao.getAllLessonDataById(index);
	}

	@Override
	public ReadExecOne getAllExerDataById(int id) {
		// TODO Auto-generated method stub
		return readingIntroDao.getAllExerById(id);
	}

	@Override
	public ReadExecTwo getAllExerDataTwoById(int id) {
		// TODO Auto-generated method stub
		return readingIntroDao.getAllExerTwoById(id);
	}

	@Override
	public ReadExecThree getAllExerDataThreeById(int id) {
		// TODO Auto-generated method stub
		return readingIntroDao.getAllExerThreeeById(id);
	}

	@Override
	public ReadTest saveReadTest(ReadTest readTest) {
		// TODO Auto-generated method stub
		return readingIntroDao.saveReadTest(readTest);
	}

	@Override
	public List<ReadTest> getAllTests() {
		// TODO Auto-generated method stub
		return readingIntroDao.getReadTestData();
	}

	@Override
	public ReadTest getTestById(int id) {
		// TODO Auto-generated method stub
		return readingIntroDao.getTestById(id);
	}

	@Override
	public ReadTest getTestByLessonId(int id) {
		// TODO Auto-generated method stub
		return testRepository.getTestByLessonId(id);
	}

	@Override
	public ReadTest getTestByLessonandTestId(int id, int lessonid) {
		return testRepository.getTestByLessonandTestId(id,lessonid);

	}

	@Override
	public LesExcercises getExercisebyLessonidandExerciseid(int lessonid, int excerciseid) {
		return exerciseReadingRepository.getExercisebyLessonidandExerciseid(lessonid,excerciseid);
	}



}

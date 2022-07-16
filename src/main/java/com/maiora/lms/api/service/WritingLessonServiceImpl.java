package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.WriteLessonDao;
import com.maiora.lms.api.model.ExcercisesWrite;
import com.maiora.lms.api.model.WriteLessonOne;
import com.maiora.lms.api.model.WriteTestModel;
import com.maiora.lms.api.repository.ExerciseRepository;
import com.maiora.lms.api.repository.WriteTestRepository;

@Service
public class WritingLessonServiceImpl implements WritingLessonService {

	@Autowired
	private WriteLessonDao writeLessonDao;
	
	@Autowired
	ExerciseRepository exerciseRepository;
	
	@Autowired
	WriteTestRepository writeTestRepository;

	@Override
	public WriteLessonOne saveLesson(WriteLessonOne writeLessonOne) {
		// TODO Auto-generated method stub
		return writeLessonDao.addUserTest(writeLessonOne);
	}

	@Override
	public List<WriteLessonOne> getLessonData() {
		// TODO Auto-generated method stub
		return writeLessonDao.getAllLessonOne();
	}

	@Override
	public WriteLessonOne getLessonDataById(int index) {
		// TODO Auto-generated method stub
		return writeLessonDao.getAllLessonOneById(index);
	}

	@Override
	public ExcercisesWrite getWritingExercisebylessonidandexerciseid(int lessonid, int excerciseid) {
		// TODO Auto-generated method stub
		return exerciseRepository.getWritingExercisebylessonidandexerciseid(lessonid,excerciseid);
	}

	@Override
	public WriteTestModel getWritingTestbylessonidandtestid(int lessonid, int testid) {
		// TODO Auto-generated method stub
		return writeTestRepository.getWritingTestbylessonidandtestid(lessonid,testid);
	}
}

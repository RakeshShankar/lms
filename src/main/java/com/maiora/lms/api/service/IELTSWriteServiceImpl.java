package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.IELTSWriteDao;
import com.maiora.lms.api.model.ExerciseWrite;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.LessonWrite;
import com.maiora.lms.api.model.WriteExerciseLesson;
import com.maiora.lms.api.repository.WriteLessonExerciseRepository;

@Service
public class IELTSWriteServiceImpl implements IELTSWriteService {

	@Autowired
	IELTSWriteDao ieltsWriteDao;
	
	@Autowired
	WriteLessonExerciseRepository writeLessonExerciseRepository;

	@Override
	public List<Introduction> getAllWritingCourses() {
		return ieltsWriteDao.getAllWriting();

	}

	@Override
	public Introduction addCourseWriting(Introduction introduction) {
		return ieltsWriteDao.saveCourseWriting(introduction);
	}

	@Override
	public LessonWrite addLessonWrite(LessonWrite lessonwrite) {
		return ieltsWriteDao.saveWriteLesson(lessonwrite);
	}

	@Override
	public ExerciseWrite addWriteExercise(ExerciseWrite exercisewrite) {
		return ieltsWriteDao.saveWriteExercise(exercisewrite);
	}

	@Override
	public List<ExerciseWrite> getAllWritingExercises() {
		return ieltsWriteDao.getAllWritingExercises();
	}

	@Override
	public WriteExerciseLesson saveExerciseLesson(WriteExerciseLesson writeExerciseLesson) {
		// TODO Auto-generated method stub
		return ieltsWriteDao.saveExerciseLesson(writeExerciseLesson);
	}

	@Override
	public WriteExerciseLesson getWriteExercisebylessonidandexerciseid(int lessonid, int excerciseid) {
		// TODO Auto-generated method stub
		return writeLessonExerciseRepository.getWriteExercisebylessonidandexerciseid(lessonid,excerciseid);
	}

}

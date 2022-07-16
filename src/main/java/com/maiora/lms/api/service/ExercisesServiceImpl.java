package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.model.WriteLessonOne;
import com.maiora.lms.api.repository.ExerciseRepository;
import com.maiora.lms.api.repository.LessonRepository;
@Service
public class ExercisesServiceImpl implements ExercisesService{

	@Autowired
	LessonRepository lessonRepository;
	
	@Autowired
	ExerciseRepository exerciseRepository;
	
	@Override
	public List<WriteLessonOne> getLessonsByExerciseId(int id) {
		// TODO Auto-generated method stub
		return lessonRepository.getLessonsByExerciseId(id);
	}

	@Override
	public List<WriteLessonOne> getExcerciseByLessonIdandExcerciseId(int id, int idd) {
		// TODO Auto-generated method stub
		return exerciseRepository.getExcerciseByLessonIdandExcerciseId(id,idd);
	}

}

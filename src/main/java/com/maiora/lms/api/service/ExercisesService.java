package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.WriteLessonOne;

public interface ExercisesService {

	public List<WriteLessonOne> getLessonsByExerciseId(int id);

	public List<WriteLessonOne> getExcerciseByLessonIdandExcerciseId(int id, int idd);

}

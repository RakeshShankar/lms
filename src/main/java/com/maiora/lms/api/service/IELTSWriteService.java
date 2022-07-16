package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.ExerciseWrite;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.LessonWrite;
import com.maiora.lms.api.model.WriteExerciseLesson;

public interface IELTSWriteService {

	public List<Introduction> getAllWritingCourses();

	public Introduction addCourseWriting(Introduction introduction);

	public LessonWrite addLessonWrite(LessonWrite lessonwrite);

	public ExerciseWrite addWriteExercise(ExerciseWrite exercisewrite);

	public List<ExerciseWrite> getAllWritingExercises();

	WriteExerciseLesson saveExerciseLesson(WriteExerciseLesson writeExerciseLesson);

	public WriteExerciseLesson getWriteExercisebylessonidandexerciseid(int lessonid, int excerciseid);

}

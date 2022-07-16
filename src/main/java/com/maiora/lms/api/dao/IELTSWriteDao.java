package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.ExerciseWrite;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.LessonWrite;
import com.maiora.lms.api.model.WriteExerciseLesson;

public interface IELTSWriteDao {

	List<Introduction> getAllWriting();

	Introduction saveCourseWriting(Introduction intro);

	LessonWrite saveWriteLesson(LessonWrite lessonwrite);

	ExerciseWrite saveWriteExercise(ExerciseWrite exercisewrite);

	List<ExerciseWrite> getAllWritingExercises();

	WriteExerciseLesson saveExerciseLesson(WriteExerciseLesson writeExerciseLesson);

}

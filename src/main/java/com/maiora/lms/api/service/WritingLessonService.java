package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.ExcercisesWrite;
import com.maiora.lms.api.model.WriteLessonOne;
import com.maiora.lms.api.model.WriteTestModel;

public interface WritingLessonService {

	public WriteLessonOne saveLesson(WriteLessonOne writeLessonOne);

	public List<WriteLessonOne> getLessonData();

	public WriteLessonOne getLessonDataById(int index);

	public ExcercisesWrite getWritingExercisebylessonidandexerciseid(int lessonid, int excerciseid);

	public WriteTestModel getWritingTestbylessonidandtestid(int lessonid, int testid);

}

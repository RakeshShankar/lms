package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.CourseDetails;
import com.maiora.lms.api.model.ExerciseLesson;
import com.maiora.lms.api.model.IELTSReadTest;
import com.maiora.lms.api.model.IELTSReadingLesson;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.LessonIntro;
import com.maiora.lms.api.model.ListenExercise;
import com.maiora.lms.api.model.ListenIntroduction;
import com.maiora.lms.api.model.ListenLesson;
import com.maiora.lms.api.model.ListenTest;
import com.maiora.lms.api.model.ListeningLesson;
import com.maiora.lms.api.model.TestLesson;

public interface IELTSIntroDAO{
	
	public List<Introduction> getAllIELTSCourses();
	
	public List<IELTSReadingLesson> getAllReadingLessons();

	Introduction saveReadIntro(Introduction intro);

	IELTSReadingLesson saveReadLesson(IELTSReadingLesson readLesson);

	public IELTSReadTest saveReadTest(IELTSReadTest ieltsReadTest);

	public List<IELTSReadTest> getAllReadingTest();

	public CourseDetails saveCourses(CourseDetails coursedetails);

	public LessonIntro saveLessons(LessonIntro lessonIntro);

	public ListenIntroduction saveListenIntrod(ListenIntroduction listenIntroduction);

	public List<ListenIntroduction> getListenIntrod();

	public ListeningLesson saveListeningOne(ListeningLesson listeningLesson);

	public List<ListeningLesson> getListeningOne();

	ListeningLesson getListeningOneById(int index);

	public ListenLesson saveReadIntrod(ListenLesson listenLesson);

	public List<ListenLesson> getAllListenings();

	public ListenLesson getListeningById(int id);

	public ListenTest saveReadTest(ListenTest listenTest);

	public List<ListenTest> getAllListeningTests();

	public ExerciseLesson saveExerciseLesson(ExerciseLesson exerciseLesson);

	public ListenExercise saveListenExerciseLesson(ListenExercise listenExercise);

	public TestLesson saveTestLesson(TestLesson testLesson);

	
 
}

package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.CourseDetails;
import com.maiora.lms.api.model.ExcercisesListen;
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

public interface IELTSIntroService {

	public List<Introduction> getAllIELTSCourses();

	public List<IELTSReadingLesson> getAllReadingLessons();

	Introduction createReadCourse(Introduction intro);

	IELTSReadingLesson saveReadLesson(IELTSReadingLesson intro);

	public IELTSReadTest saveReadTest(IELTSReadTest ieltsReadTest);

	List<IELTSReadTest> getAllReadingTest();

	public CourseDetails addCourses(CourseDetails coursedetails);

	public LessonIntro addLessons(LessonIntro lessonIntro);

	public ListenIntroduction addlistenIntroduction(ListenIntroduction listenIntroduction);

	public List<ListenIntroduction> getlistenIntroduction();

	public ListeningLesson saveListeningLesson(ListeningLesson listeningLesson);

	public ListeningLesson getAllListeningLessonById(int index);

	List<ListeningLesson> getAllListeningLesson();

	public ListenLesson saveListenIntroLesson(ListenLesson listenLesson);

	public List<ListenLesson> getAllListening();

	public ListenLesson getAllListeningLessonsById(int id);

	public ExcercisesListen getListeningExercisebylessonidandexerciseid(int lessonid, int excerciseid);

	public ListenTest saveListenTest(ListenTest listenTest);

	public List<ListenTest> getAllListeningTests();

	public ListenTest getListeningTestbylessonidandtestid(int lessonid, int testid);

	public ExerciseLesson saveExerciseLesson(ExerciseLesson exerciseLesson);

	public ExerciseLesson getReadExercisebylessonidandexerciseid(int lessonid, int excerciseid);

	public ListenExercise saveListenExerciseLesson(ListenExercise listenExercise);

	public ListenExercise getExercisebylessonidandexerciseid(int lessonid, int excerciseid);

	public TestLesson saveTestLesson(TestLesson testLesson);

}

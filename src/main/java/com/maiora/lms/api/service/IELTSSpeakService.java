package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.SpeakTesting;
import com.maiora.lms.api.model.TutorEvaluate;
import com.maiora.lms.api.model.ExcercisesSpeak;
import com.maiora.lms.api.model.IntroductionSpeeking;
import com.maiora.lms.api.model.SpeakExe;
import com.maiora.lms.api.model.SpeakExer;
import com.maiora.lms.api.model.SpeakExercise;
import com.maiora.lms.api.model.SpeakLesson;
import com.maiora.lms.api.model.SpeakTest;
import com.maiora.lms.api.model.SpeakTestIntro;

public interface IELTSSpeakService {

	SpeakTest createSpeakTest(SpeakTest speakTest);

	List<SpeakTest> getSpeakTest();

	SpeakLesson createSpeakLesson(SpeakLesson speakLesson);
	
	List<SpeakLesson> getSpeakLesson();

	SpeakExercise createSpeakExericse(SpeakExercise speakExercise);

	IntroductionSpeeking addSpeakIntroduction(IntroductionSpeeking speakIntroduction);

	List<IntroductionSpeeking> getSpeakIntroduction();

	SpeakTestIntro addSpeakTestIntro(SpeakTestIntro speakTestIntro);

	List<SpeakTestIntro> getSpeakTestIntrod();

	SpeakExe addSpeakExe(SpeakExe speakExe);

	List<SpeakExe> getSpeakExe();

	SpeakTestIntro getSpeakTestIntrodById(int id);

	IntroductionSpeeking getSpeakIntroductionById(int speakid);

	SpeakLesson getSpeakLessonById(int index);

	SpeakExer addSpeakExer(SpeakExer speakExer);

	ExcercisesSpeak getSpeakingExercisebylessonidandexerciseid(int lessonid, int excerciseid);

	SpeakTestIntro getSpeakingTestbylessonidandtestid(int lessonid, int testid);

	SpeakTesting saveSpeakTest(SpeakTesting speakTesting);

	List<SpeakTesting> getSpeakTesting();

	TutorEvaluate createTutorEvaluate(TutorEvaluate tutorEvaluate);

	List<TutorEvaluate> getTutorEvaluate();

	

}

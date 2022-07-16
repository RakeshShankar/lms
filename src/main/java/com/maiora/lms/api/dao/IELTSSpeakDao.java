package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.SpeakTesting;
import com.maiora.lms.api.model.TutorEvaluate;
import com.maiora.lms.api.model.IntroductionSpeeking;
import com.maiora.lms.api.model.SpeakExe;
import com.maiora.lms.api.model.SpeakExer;
import com.maiora.lms.api.model.SpeakExercise;
import com.maiora.lms.api.model.SpeakLesson;
import com.maiora.lms.api.model.SpeakTest;
import com.maiora.lms.api.model.SpeakTestIntro;

public interface IELTSSpeakDao {

	SpeakTest createSpeakTest(SpeakTest speakTest);

	SpeakLesson createSpeakLesson(SpeakLesson speakLesson);

	List<SpeakTest> getSpeakTest();

	SpeakExercise createSpeakExericse(SpeakExercise speakExercise);

	IntroductionSpeeking createSpeakIntroduction(IntroductionSpeeking speakIntroduction);

	List<IntroductionSpeeking> getSpeakIntroduction();

	SpeakTestIntro createSpeakIntroduction(SpeakTestIntro speakTestIntro);

	List<SpeakTestIntro> getSpeakTestIntrod();

	SpeakExe createSpeakExe(SpeakExe speakExe);

	List<SpeakExe> getSpeakExe();

	SpeakTestIntro getSpeakTestIntrodById(int id);

	IntroductionSpeeking getSpeakTestIntroductionById(int speakid);

	List<SpeakLesson> getSpeakLes();

	SpeakLesson getSpeakLessonById(int index);

	SpeakExer createSpeakExer(SpeakExer speakExer);

	SpeakTesting createSpeakExer(SpeakTesting speakTesting);

	List<SpeakTesting> getSpeakTesting();

	TutorEvaluate createSpeakTest(TutorEvaluate tutorEvaluate);

	List<TutorEvaluate> getTutorEvaluate();

	

}

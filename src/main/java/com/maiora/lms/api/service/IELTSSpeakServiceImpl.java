package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.model.SpeakTesting;
import com.maiora.lms.api.model.TutorEvaluate;
import com.maiora.lms.api.dao.IELTSSpeakDao;
import com.maiora.lms.api.model.ExcercisesSpeak;
import com.maiora.lms.api.model.IntroductionSpeeking;
import com.maiora.lms.api.model.SpeakExe;
import com.maiora.lms.api.model.SpeakExer;
import com.maiora.lms.api.model.SpeakExercise;
import com.maiora.lms.api.model.SpeakLesson;
import com.maiora.lms.api.model.SpeakTest;
import com.maiora.lms.api.model.SpeakTestIntro;
import com.maiora.lms.api.repository.ExerciseSpeakingRepository;
import com.maiora.lms.api.repository.SpeakingTestRepository;

@Service
public class IELTSSpeakServiceImpl implements IELTSSpeakService {
	@Autowired
	private IELTSSpeakDao ieltsSpeakDao;
	
	@Autowired
	ExerciseSpeakingRepository exerciseSpeakingRepository;
	
	@Autowired
	SpeakingTestRepository speakingTestRepository;

	@Override
	public SpeakTest createSpeakTest(SpeakTest speakTest) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.createSpeakTest(speakTest);
	}

	@Override
	public List<SpeakTest> getSpeakTest() {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getSpeakTest();
	}

	@Override
	public SpeakLesson createSpeakLesson(SpeakLesson speakLesson) {
		// TODO Auto-generated method stub
				return ieltsSpeakDao.createSpeakLesson(speakLesson);
	}

	@Override
	public SpeakExercise createSpeakExericse(SpeakExercise speakExercise) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.createSpeakExericse(speakExercise);
	}

	@Override
	public IntroductionSpeeking addSpeakIntroduction(IntroductionSpeeking speakIntroduction) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.createSpeakIntroduction(speakIntroduction);
	}

	@Override
	public List<IntroductionSpeeking> getSpeakIntroduction() {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getSpeakIntroduction();
	}

	@Override
	public SpeakTestIntro addSpeakTestIntro(SpeakTestIntro speakTestIntro) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.createSpeakIntroduction(speakTestIntro);
	}

	@Override
	public List<SpeakTestIntro> getSpeakTestIntrod() {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getSpeakTestIntrod();
	}

	@Override
	public SpeakExe addSpeakExe(SpeakExe speakExe) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.createSpeakExe(speakExe);
	}

	@Override
	public List<SpeakExe> getSpeakExe() {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getSpeakExe();
	}

	@Override
	public SpeakTestIntro getSpeakTestIntrodById(int id) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getSpeakTestIntrodById(id);
	}

	@Override
	public IntroductionSpeeking getSpeakIntroductionById(int speakid) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getSpeakTestIntroductionById(speakid);
	}

	@Override
	public List<SpeakLesson> getSpeakLesson() {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getSpeakLes();
	}

	@Override
	public SpeakLesson getSpeakLessonById(int index) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getSpeakLessonById(index);
	}

	@Override
	public SpeakExer addSpeakExer(SpeakExer speakExer) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.createSpeakExer(speakExer);
	}

	@Override
	public ExcercisesSpeak getSpeakingExercisebylessonidandexerciseid(int lessonid, int excerciseid) {
		return exerciseSpeakingRepository.getSpeakingExercisebylessonidandexerciseid(lessonid,excerciseid);
	}

	@Override
	public SpeakTestIntro getSpeakingTestbylessonidandtestid(int lessonid, int testid) {
		return speakingTestRepository.getSpeakingTestbylessonidandtestid(lessonid,testid);
	}

	@Override
	public SpeakTesting saveSpeakTest(SpeakTesting speakTesting) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.createSpeakExer(speakTesting);
	}

	@Override
	public List<SpeakTesting> getSpeakTesting() {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getSpeakTesting();
	}

	@Override
	public TutorEvaluate createTutorEvaluate(TutorEvaluate tutorEvaluate) {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.createSpeakTest(tutorEvaluate);
	}

	@Override
	public List<TutorEvaluate> getTutorEvaluate() {
		// TODO Auto-generated method stub
		return ieltsSpeakDao.getTutorEvaluate();
	}

	

}

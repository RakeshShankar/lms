package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.IELTSIntroDAO;
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
import com.maiora.lms.api.repository.ExerciseLessonRepository;
import com.maiora.lms.api.repository.ExerciseListenRepository;
import com.maiora.lms.api.repository.ListenExerciseRepository;
import com.maiora.lms.api.repository.ListenTestRepository;

@Service
public class IELTSIntroServiceImpl implements IELTSIntroService {

	@Autowired
	private IELTSIntroDAO ieltsIntroDao;

	@Autowired
	ExerciseListenRepository exerciseListenRepository;
	
	@Autowired
	ExerciseLessonRepository exerciseLessonRepository;
	
	@Autowired
	ListenTestRepository listenTestRepository; 
	
	@Autowired
	ListenExerciseRepository listenExerciseRepository;

	@Override
	public List<Introduction> getAllIELTSCourses() {
		return ieltsIntroDao.getAllIELTSCourses();
	}

	@Override
	public Introduction createReadCourse(Introduction intro) {

		return ieltsIntroDao.saveReadIntro(intro);
	}

	@Override
	public List<IELTSReadingLesson> getAllReadingLessons() {

		return ieltsIntroDao.getAllReadingLessons();
	}

	@Override
	public List<IELTSReadTest> getAllReadingTest() {

		return ieltsIntroDao.getAllReadingTest();
	}

	@Override
	public IELTSReadingLesson saveReadLesson(IELTSReadingLesson intro) {

		return ieltsIntroDao.saveReadLesson(intro);
	}

	@Override
	public IELTSReadTest saveReadTest(IELTSReadTest ieltsReadTest) {
		System.out.println("inside service");
		return ieltsIntroDao.saveReadTest(ieltsReadTest);
	}

	@Override
	public CourseDetails addCourses(CourseDetails coursedetails) {
		// TODO Auto-generated method stub
		return ieltsIntroDao.saveCourses(coursedetails);
	}

	@Override
	public LessonIntro addLessons(LessonIntro lessonIntro) {

		return ieltsIntroDao.saveLessons(lessonIntro);
	}

	@Override
	public ListenIntroduction addlistenIntroduction(ListenIntroduction listenIntroduction) {
		// TODO Auto-generated method stub
		return ieltsIntroDao.saveListenIntrod(listenIntroduction);
	}

	@Override
	public List<ListenIntroduction> getlistenIntroduction() {
		// TODO Auto-generated method stub
		return ieltsIntroDao.getListenIntrod();
	}

	@Override
	public ListeningLesson saveListeningLesson(ListeningLesson listeningLesson) {
		// TODO Auto-generated method stub
		return ieltsIntroDao.saveListeningOne(listeningLesson);
	}

	@Override
	public List<ListeningLesson> getAllListeningLesson() {
		// TODO Auto-generated method stub
		return ieltsIntroDao.getListeningOne();
	}

	@Override
	public ListeningLesson getAllListeningLessonById(int index) {
		// TODO Auto-generated method stub
		return ieltsIntroDao.getListeningOneById(index);
	}

	@Override
	public ListenLesson saveListenIntroLesson(ListenLesson listenLesson) {
		// TODO Auto-generated method stub
		return ieltsIntroDao.saveReadIntrod(listenLesson);
	}

	@Override
	public List<ListenLesson> getAllListening() {
		// TODO Auto-generated method stub
		return ieltsIntroDao.getAllListenings();
	}

	@Override
	public ListenLesson getAllListeningLessonsById(int id) {
		// TODO Auto-generated method stub
		return ieltsIntroDao.getListeningById(id);
	}

	@Override
	public ExcercisesListen getListeningExercisebylessonidandexerciseid(int lessonid, int excerciseid) {
		// TODO Auto-generated method stub
		return exerciseListenRepository.getListeningExercisebylessonidandexerciseid(lessonid, excerciseid);
	}

	@Override
	public ListenTest saveListenTest(ListenTest listenTest) {
		return ieltsIntroDao.saveReadTest(listenTest);
	}

	@Override
	public List<ListenTest> getAllListeningTests() {
		return ieltsIntroDao.getAllListeningTests();
	}

	@Override
	public ListenTest getListeningTestbylessonidandtestid(int lessonid, int testid) {
		return listenTestRepository.getListeningTestbylessonidandtestid(lessonid,testid);
	}

	@Override
	public ExerciseLesson saveExerciseLesson(ExerciseLesson exerciseLesson) {
		// TODO Auto-generated method stub
		return ieltsIntroDao.saveExerciseLesson(exerciseLesson);
	}

	@Override
	public ExerciseLesson getReadExercisebylessonidandexerciseid(int lessonid, int excerciseid) {
		return exerciseLessonRepository.getReadExercisebylessonidandexerciseid(lessonid,excerciseid);
	}

	@Override
	public ListenExercise saveListenExerciseLesson(ListenExercise listenExercise) {
		// TODO Auto-generated method stub
		return ieltsIntroDao.saveListenExerciseLesson(listenExercise);
	}

	@Override
	public ListenExercise getExercisebylessonidandexerciseid(int lessonid, int excerciseid) {
		return listenExerciseRepository.getExercisebylessonidandexerciseid(lessonid,excerciseid);
	}

	@Override
	public TestLesson saveTestLesson(TestLesson testLesson) {
		// TODO Auto-generated method stub
		return ieltsIntroDao.saveTestLesson(testLesson);
	}

}

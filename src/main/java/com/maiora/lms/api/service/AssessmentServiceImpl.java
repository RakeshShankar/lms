package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.AssessmentDao;
import com.maiora.lms.api.model.AllLessonsTest;
import com.maiora.lms.api.model.Assessment;
@Service
public class AssessmentServiceImpl implements AssessmentService{
	
	@Autowired
	private AssessmentDao assessmentDao;

	@Override
	public AllLessonsTest saveAssessment(AllLessonsTest allLessonsTest) {
		// TODO Auto-generated method stub
		return assessmentDao.saveAssesment(allLessonsTest);
	}

	@Override
	public Assessment saveAssessmentTwo(Assessment assessment) {
		// TODO Auto-generated method stub
		return assessmentDao.saveAssesmentTwo(assessment);
	}

	@Override
	public List<AllLessonsTest> getAllAssessments() {
		// TODO Auto-generated method stub
		return assessmentDao.getAssessments();
	}

	@Override
	public List<Assessment> getAllAssessmentTwo() {
		// TODO Auto-generated method stub
		return assessmentDao.getAssessmentsTwo();
	}



}

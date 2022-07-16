package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.AllLessonsTest;
import com.maiora.lms.api.model.Assessment;

public interface AssessmentService {

	AllLessonsTest saveAssessment(AllLessonsTest allLessonsTest);
	
	List<AllLessonsTest> getAllAssessments();

	Assessment saveAssessmentTwo(Assessment assessment);

	List<Assessment> getAllAssessmentTwo();

	

}

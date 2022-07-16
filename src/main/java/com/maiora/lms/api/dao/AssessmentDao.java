package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.AllLessonsTest;
import com.maiora.lms.api.model.Assessment;

public interface AssessmentDao {

	AllLessonsTest saveAssesment(AllLessonsTest allLessonsTest);

	List<AllLessonsTest> getAssessments();

	Assessment saveAssesmentTwo(Assessment assessment);

	List<Assessment> getAssessmentsTwo();

}

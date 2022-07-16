package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.CourseSave;
import com.maiora.lms.api.model.PaymentModel;
import com.maiora.lms.api.model.courses;

public interface CoursesService {

	public List<courses> readAllcourses(int from, int pagesize, String filtertext);

	public courses addcourses(courses coursesModel);

	public courses updateTheExistingcourses(courses coursesModel);

	public List<courses> getAllData();

	public CourseSave addNewCourses(CourseSave courseSave);

	public PaymentModel addCourse(PaymentModel paymentModel);

	public List<CourseSave> getAllCouData();

	public List<PaymentModel> getAllCoursesData();

	public CourseSave findCourseById(int courseid);

	public PaymentModel getAllCoursesById(int paymentid);

}

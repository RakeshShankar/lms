package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.CourseSave;
import com.maiora.lms.api.model.PaymentModel;
import com.maiora.lms.api.model.courses;

public interface CoursesDao {

	public List<courses> readAllcourses(int from, int pagesize, String filtertext);

	public courses addcourses(courses coursesModel);

	public courses updateTheExistingcourses(courses coursesModel);

	public List<courses> getAllData();

	public CourseSave addNewCourses(CourseSave courseSave);

	public PaymentModel addNewourses(PaymentModel paymentModel);

	public List<CourseSave> getAllCouData();

	public List<PaymentModel> getAllCoursesData();

	public CourseSave findCourseById(int courseid);

	public PaymentModel findCoursesById(int paymentid);

}

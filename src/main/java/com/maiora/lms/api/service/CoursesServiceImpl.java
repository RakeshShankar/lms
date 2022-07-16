package com.maiora.lms.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.CoursesDao;
import com.maiora.lms.api.dao.PaymentDao;
import com.maiora.lms.api.dao.TypePaymentDao;
import com.maiora.lms.api.model.CourseSave;
import com.maiora.lms.api.model.PartsPayment;
import com.maiora.lms.api.model.PaymentModel;
import com.maiora.lms.api.model.TypesPayment;
import com.maiora.lms.api.model.courses;

@Service
public class CoursesServiceImpl implements CoursesService {

	@Autowired
	private CoursesDao courseDao;

	@Autowired
	private TypePaymentDao typePaymentDao;

	@Override
	public List<courses> readAllcourses(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return courseDao.readAllcourses(from, pagesize, filtertext);
	}

	@Override
	public courses addcourses(courses coursesModel) {
		// TODO Auto-generated method stub
		return courseDao.addcourses(coursesModel);
	}

	@Override
	public courses updateTheExistingcourses(courses coursesModel) {
		// TODO Auto-generated method stub
		return courseDao.updateTheExistingcourses(coursesModel);
	}

	@Override
	public List<courses> getAllData() {
		// TODO Auto-generated method stub
		return courseDao.getAllData();
	}

	@Override
	public CourseSave addNewCourses(CourseSave courseSave) {
		// TODO Auto-generated method stub
		return courseDao.addNewCourses(courseSave);
	}

	@Override
	public PaymentModel addCourse(PaymentModel paymentModel) {
		// TODO Auto-generated method stub
		PaymentModel createdModel = courseDao.addNewourses(paymentModel);
		System.out.println("Payment Id" + createdModel.getPaymentid());
		List<TypesPayment> payments = createdModel.getTypes();
		for (int i = 0; i < payments.size(); i++) {
			typePaymentDao.updateThePaymentId(createdModel.getPaymentid(), payments.get(i).getTypespaymentid());
		}
		List<PartsPayment> partsPayments = createdModel.getParts();
		for (int i = 0; i < partsPayments.size(); i++) {
			typePaymentDao.updateThePaymentIdParts(createdModel.getPaymentid(),
					partsPayments.get(i).getPartspaymentid());
		}
   //      List<PaymentModel> paymentModelupdated=courseDao.getAllCoursesData().stream()
     //   		 .filter(p->p.getPaymentid() ==createdModel.getPaymentid() ).collect(Collectors.toList());
		return createdModel;
	}

	@Override
	public List<CourseSave> getAllCouData() {
		// TODO Auto-generated method stub
		return courseDao.getAllCouData();
	}

	@Override
	public List<PaymentModel> getAllCoursesData() {
		// TODO Auto-generated method stub
		return courseDao.getAllCoursesData();
	}

	@Override
	public CourseSave findCourseById(int courseid) {
		// TODO Auto-generated method stub
		return courseDao.findCourseById(courseid);
	}

	@Override
	public PaymentModel getAllCoursesById(int paymentid) {
		// TODO Auto-generated method stub
		return courseDao.findCoursesById(paymentid);
	}
}

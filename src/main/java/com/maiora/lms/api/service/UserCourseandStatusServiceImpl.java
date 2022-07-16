package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.UserCourseandStatusDao;
import com.maiora.lms.api.model.UserCourseandStatus;

@Service
public class UserCourseandStatusServiceImpl implements UserCourseandStatusService{

	@Autowired
	private UserCourseandStatusDao usercourseDao;

	@Override
	public List<UserCourseandStatus> readAllUserCourseStatus(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return usercourseDao.readAllUserCourseStatus(from,pagesize,filtertext);
	}

	@Override
	public UserCourseandStatus addUserCourseStatus(UserCourseandStatus userCouseStatusModel) {
		// TODO Auto-generated method stub
		return usercourseDao.addUserCourseStatus(userCouseStatusModel);
	}

	@Override
	public UserCourseandStatus updateTheExistingUserCourseStatus(UserCourseandStatus userCouseStatusModel) {
		// TODO Auto-generated method stub
		return usercourseDao.updateTheExistingUserCourseStatus(userCouseStatusModel);
	}

	@Override
	public List<UserCourseandStatus> getAllData() {
		// TODO Auto-generated method stub
		return usercourseDao.getAllData();
	}
}

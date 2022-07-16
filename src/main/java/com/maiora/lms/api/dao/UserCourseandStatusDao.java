package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.UserCourseandStatus;

public interface UserCourseandStatusDao {

	public List<UserCourseandStatus> readAllUserCourseStatus(int from, int pagesize, String filtertext);

	public UserCourseandStatus addUserCourseStatus(UserCourseandStatus userCouseStatusModel);

	public UserCourseandStatus updateTheExistingUserCourseStatus(UserCourseandStatus userCouseStatusModel);

	public List<UserCourseandStatus> getAllData();

}

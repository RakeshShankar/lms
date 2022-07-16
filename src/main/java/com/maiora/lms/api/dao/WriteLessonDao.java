package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.WriteLessonOne;

public interface WriteLessonDao {

	public WriteLessonOne addUserTest(WriteLessonOne writeLessonOne);

	public List<WriteLessonOne> getAllLessonOne();

	public WriteLessonOne getAllLessonOneById(int index);

}

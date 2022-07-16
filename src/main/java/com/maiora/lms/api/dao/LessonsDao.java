package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Lessons;

public interface LessonsDao {

	public List<Lessons> readAllLessons(int from, int pagesize, String filtertext);

	public Lessons addLessons(Lessons lessonsModel);

	public Lessons updateTheExistingLessons(Lessons lessonsModel);

	public List<Lessons> getAllData();

}

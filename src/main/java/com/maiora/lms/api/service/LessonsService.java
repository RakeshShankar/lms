package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.Lessons;

public interface LessonsService {

	public List<Lessons> readAllLessons(int from, int pagesize, String filtertext);

	public Lessons addLessons(Lessons lessonsModel);

	public Lessons updateTheExistingLessons(Lessons lessonsModel);

	public List<Lessons> getAllData();

}

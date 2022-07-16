package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.LessonsDao;
import com.maiora.lms.api.model.Lessons;

@Service
public class LessonsServiceImpl implements LessonsService{

	@Autowired
	private LessonsDao lessonDao;

	@Override
	public List<Lessons> readAllLessons(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return lessonDao.readAllLessons(from,  pagesize,  filtertext);
	}

	@Override
	public Lessons addLessons(Lessons lessonsModel) {
		// TODO Auto-generated method stub
		return lessonDao.addLessons(lessonsModel);
	}

	@Override
	public Lessons updateTheExistingLessons(Lessons lessonsModel) {
		// TODO Auto-generated method stub
		return lessonDao.updateTheExistingLessons(lessonsModel);
	}

	@Override
	public List<Lessons> getAllData() {
		// TODO Auto-generated method stub
		return lessonDao.getAllData();
	}
}
